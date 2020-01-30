<template>
    <div class="LoginTab">
        <input type="radio" name="tabs" id="tab1" checked/>
        <label for="tab1">Login</label>
        <div id="tab-content1" class="tab-content">
            <form class="form-input" @submit="userlogin">
                <input type="text" v-model="email" placeholder="Email ID 입력" /> <br/><br/>
                <input type="password" v-model="password" placeholder="비밀번호 입력" /> <br/><br/>
                <input type="submit" value="Login" class="button" />
                <br/>
            </form>
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
        const email = this.email;
        const password = this.password;

        if (!email || !password) {
            return false;
        }

        axios.post('http://70.12.247.104:9090/userlogin', { email, password })
            .then(res => {
                if (res.status === 200) {
                    alert(res.data);
                    // document.cookie = `accessToken=${res.data.data.accessToken}`;
                    // axios.defaults.headers.common['x-access-token'] = res.data.data.accessToken;
                    this.$router.push({ path: '/main' } ) ;
                } else {
                    alert("로그인 실패")
                }
            })
            .catch(err => {
                alert('로그인 실패');
            })
    }
  }
};
</script>


<style scoped src='@/components/member/member.css'>
</style>