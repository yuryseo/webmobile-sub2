<template>
    <div class="LoginTab">
        <input type="radio" name="tabs" id="tab1" checked/>
        <label for="tab1">Login</label>
        <div id="tab-content1" class="tab-content">
            <!-- <form class="form-input">
                <input type="text" v-model="email" placeholder="Email ID 입력" /> <br/><br/>
                <input type="password" v-model="password" placeholder="비밀번호 입력" /> <br/><br/>
                <input type="button" @Click="userlogin()" value="Login" class="button" />
                <br/>
            </form> -->
            <!-- <input type="button" @Click="userlogin()" value="Login" class="button" /> -->
            <button v-on:click="userlogin">로그인</button>
        </div>
    </div>
</template>


<script>
import axios from 'axios';
export default {
  data() {
    return {
        email: "",
        password: "",

    };
  },
  methods: {
    userlogin () {
        alert("click");
        const email = this.email;
        const password = this.password;
        this.$router.push({name: 'Mainpage'}) ;

        if (!email || !password) {
            return false;
        }
        console.log("왜안돼")
        this.$router.push({name: 'Mainpage'}) ;

/*
        axios.post('http://70.12.247.104:9090/userlogin', { email, password })
            .then(function (response) {
                console.log(response);
                if (res.status === 200) {
                    alert(res.data)
                    // document.cookie = `accessToken=${res.data.data.accessToken}`;
                    // axios.defaults.headers.common['x-access-token'] = res.data.data.accessToken;
                    
                }
            })
            .catch(function (error) {
                console.log(error);
                alert('로그인 실패')
            });


            // .then(res => {
            //     if (res.status === 200) {
            //         alert(res.data)
            //         // document.cookie = `accessToken=${res.data.data.accessToken}`;
            //         // axios.defaults.headers.common['x-access-token'] = res.data.data.accessToken;
            //         this.$route.push({name: 'Mainpage'}) ;
            //     }
            // })
            // .catch(err => {
            //     alert('로그인 실패')
            // }) */
    } 
  } 
};
</script>


<style scoped src='@/components/member/member.css'>
</style>