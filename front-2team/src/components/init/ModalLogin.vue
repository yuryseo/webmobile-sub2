<template>
<div>
  <ul class="tabs" role="tablist">
    <li>
        <input type="radio" name="tabs" id="tab1" checked />
        <label for="tab1" 
               role="tab" 
               aria-selected="true" 
               aria-controls="panel1" 
               tabindex="0">Login</label>
        <div id="tab-content1" 
             class="tab-content" 
             role="tabpanel" 
             aria-labelledby="description" 
             aria-hidden="false">
             <form @submit.prevent="onSubmit(email, password)">
        <div>
            <input type="text" v-model="email" placeholder="Email Address" />
            <input type="submit" value="Login" />
        </div>
        <div>
            <input type="password" v-model="password" placeholder="Password" />
        </div>
    </form>
        </div>
    </li>
  
    <li>
        <input type="radio" name="tabs" id="tab2" />
        <label for="tab2"
               role="tab" 
               aria-selected="false" 
               aria-controls="panel2" 
               tabindex="0">Join Us</label>
        <div id="tab-content2" 
             class="tab-content"
             role="tabpanel" 
             aria-labelledby="specification" 
             aria-hidden="true">
             <form @submit="formSubmit">
        <br/>
        <input type="email" id="email" name="email" value="e-mail" v-model="name">
        <input hidden id="interest" name="interest" value="interest" v-model="interest">
        <input hidden id="phone" name = "phone" value="phone" v-model="phone">
        <input hidden id="unum" name="unum" value="unum" v-model="unum">
        <br/>
        <button>인증메일 받기</button>
        <br/>
        <input type="text" id="echeck" name="echeck" value="인증번호 입력" v-model="echeck">
        <br/>
        <input type="text" id="nickname" name="nickname" value="nickname" v-model="nickname">
        <br/>
        <input type="password" id="password" v-model="password">
        <br/>
        <input type="password" id="cpassword">
        <br/>
        <input type="submit" value="Login" />
    </form>
          </div>
    </li>
</ul>
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
 @import url("https://fonts.googleapis.com/css?family=Lato");
 * {
	 margin: 0;
	 padding: 0;
	 box-sizing: border-box;
}
 body {
	 padding: 20px;
	 text-align: left;
	 font-family: Lato;
	 color: #fff;
	 background: #9b59b6;
}
 h1 {
	 font-weight: normal;
	 font-size: 40px;
	 font-weight: normal;
	 text-transform: uppercase;
	 float: left;
	 margin: 20px 0 100px 10px;
}
 h1 span {
	 font-size: 13px;
	 display: block;
	 padding-left: 4px;
}
 .tabs {
	 width: 650px;
	 float: none;
	 list-style: none;
	 position: relative;
	 margin: 80px 0 0 10px;
	 text-align: left;
}
 .tabs li {
	 float: left;
	 display: block;
}
 .tabs input[type="radio"] {
	 position: absolute;
	 top: 0;
	 left: -9999px;
}
 .tabs label {
	 display: block;
	 padding: 14px 21px;
	 border-radius: 2px 2px 0 0;
	 font-size: 20px;
	 font-weight: normal;
	 text-transform: uppercase;
	 background: #db81b9;
	 cursor: pointer;
	 position: relative;
	 top: 2px;
	 transition: all 0.2s ease-in-out;
}
 .tabs label:hover {
	 background: #a34186;
}
 .tabs .tab-content {
	 z-index: 2;
	 display: none;
	 overflow: hidden;
	 width: 100%;
	 font-size: 17px;
	 line-height: 25px;
	 padding: 25px;
	 position: absolute;
	 top: 53px;
	 left: 0;
	 background: #c54092;
}
 .tabs [id^="tab"]:checked + label {
	 top: 0;
	 padding-top: 17px;
	 background: #c54092;
}
 .tabs [id^="tab"]:checked ~ [id^="tab-content"] {
	 display: block;
}
 p.link {
	 clear: both;
	 margin: 380px 0 0 15px;
}
 p.link a {
	 text-transform: uppercase;
	 text-decoration: none;
	 display: inline-block;
	 color: #fff;
	 padding: 5px 10px;
	 margin: 0 5px;
	 background-color: #612e76;
	 transition: all 0.2s ease-in;
}
 p.link a:hover {
	 background-color: #522764;
}
</style>