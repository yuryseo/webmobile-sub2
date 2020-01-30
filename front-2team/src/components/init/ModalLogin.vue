<template>
<div class="contents">
<div class="tabs" role="tablist">
    <div class="LoginTab">
        <input type="radio" name="tabs" id="tab1" checked/>
        <label for="tab1">Login</label>
        <div id="tab-content1" class="tab-content">
            <form @submit.prevent="onSubmit(email, password)">
                <input type="text" v-model="email" placeholder="Email Address" />
                <br/>
                <input type="password" v-model="password" placeholder="Password" />
                <br/>
                <input type="submit" value="Login" />
                <br/>
            </form>
        </div>
    </div>
  
    <div class="JoinUsTab">
        <input type="radio" name="tabs" id="tab2"/>
        <label for="tab2">Join Us</label>
        <div id="tab-content2" class="tab-content">
            <form @submit="formSubmit">
                <input type="email" id="email" name="email" value="e-mail" v-model="name" placeholder="e-mail 입력">
                <input hidden id="interest" name="interest" value="interest" v-model="interest" placeholder="관심동물 입력">
                <input hidden id="phone" name = "phone" value="phone" v-model="phone" placeholder="휴대폰 번호 입력">
                <input hidden id="unum" name="unum" value="unum" v-model="unum">
                <br/>
                <button>인증메일 받기</button>
                <br/>
                <input type="text" id="echeck" name="echeck" value="인증번호 입력" v-model="echeck" placeholder="이메일 인증번호 입력">
                <br/>
                <input type="text" id="nickname" name="nickname" value="nickname" v-model="nickname" placeholder="닉네임 입력">
                <br/>
                <input type="password" id="password" v-model="password" placeholder="비밀번호 입력">
                <br/>
                <input type="password" id="cpassword" placeholder="비밀번호 한번 더 입력">
                <br/>
                <input type="submit" value="회원가입" />
            </form>
        </div>
    </div>
</div>
</div>
</template>


<script>

export default {
  data() {
    return {
        email: "",
        password: "",
        msg: "",
        flag: false,
    };
  },
  methods: {
    toggle() {
      this.$emit("change");
    },
    onSubmit(email, password) {
      this.$store
        .dispatch("LOGIN", { email, password })
        .then(() => this.redirect())
        .catch(({ message }) => (this.msg = message));
        console.log("성공")
    },
    redirect() {
      const { search } = window.location;
      if (search === "") {
        this.$router.push("/").catch(err=>{});
      } else {
        const tokens = search.replace(/^\?/, "").split("&");
        const { returnPath } = tokens.reduce((qs, tkn) => {
          const pair = tkn.split("=");
          qs[pair[0]] = decodeURIComponent(pair[1]);
          return qs;
        }, {});
        this.$router.push(returnPath).catch(err=>{});
      }
    }
  },
};
</script>

<style scoped>
    .contents { /* 화면 중앙 정렬*/
        position:absolute;
        top:0;right:0;bottom:20%;left:0;
        display:flex;
        align-items:center;
        justify-content:center;
        display:-webkit-flex;
        -webkit-align-item:center;
        -webkit-justify-content:center;
    }

    .tabs { /* 탭 초기 세팅 */
        float: none;
        list-style: none;
        position: absolute;
        vertical-align: middle;
        text-align: left;
    }

    .tabs div { /* 탭 내용 감싸기 */
        float: left;
        display: block;
    }

    .tabs input[type="radio"] { /* 라디오 버튼을 탭 모양으로! */
        position: absolute;
        top: 20px; /* 라디오 버튼 가리기용*/
    }

    .tabs label { /* 탭 제목 */
        display: block;
        padding: 15px 20px; /* 높이 너비 */
        border-radius: 20% 20% 0 0;
        font-size: 15px;
        font-weight: normal;
        background: #e275b8;
        cursor: pointer;
        position: relative;
        top: 2px;
    }

    .tabs label:hover {
        background: #cf68b0; /* 탭 부분 마우스올렸을 때 색상바꿈 */
    }

    .tabs .tab-content { /* 활성화 된 탭 부분 */
        display: none;
        width: 100%;
        font-size: 15px;
        padding: 20%;
        position: absolute;
        left: 0;
        background: #c54092; 
    }

    .tabs [id^="tab"]:checked + label { /* 클릭된 탭 부분 색상 */
        background: #c54092; 
    }

    .tabs [id^="tab"]:checked ~ [id^="tab-content"] { /* 클릭되지 않은 부분 비활성화 */
        display: block;
    }
    
</style>