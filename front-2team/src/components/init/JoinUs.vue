<template>
    <form @submit.prevent="onSubmit(email, interest,  nickname, password, phone)" method="post">
        <br/>
        <label>Join Us</label>
        <pre>{{user}}</pre>
        <br/>
        <input type="email" id="email" name="email" value="e-mail">
        <input hidden id="interest" name="interest" value="interest">
        <input hidden id="phone" name = "phone" value="phone">
        <input hidden id="unum" name="unum" value="unum">
        <br/>
        <button>인증메일 받기</button>
        <br/>
        <input type="text" id="echeck" name="echeck" value="인증번호 입력">
        <br/>
        <input type="text" id="nickname" name="nickname" value="nickname">
        <br/>
        <label>비밀번호 입력</label>
        <br/>
        <input type="password" id="password">
        <br/>
        <input type="password" id="cpassword">
        <br/>
        <input type="submit" value="Login" />
    </form>
</template>

<script>
/*
"email": "string",
    "interest": "string",
    "nickname": "string",
    "password": "string",
    "phone": "string",
    "unum": "string"
*/
import axios from "axios"
export default {
    data() {
        return {
            email: "",
            interest: "",
            nickname: "",
            password: "",
            cpassword: "",
            phone: "",
            unum: ""
        }
    },
    methods: {
        onSubmit() {
            axios.post('http://70.12.247.104:9090/user').then(
        ({ data }) => (
          (this.email = data.email), (this.interest = data.interest), (this.nickname = data.nickname), (this.password = data.password), (this.phone = data.phone)
        )
      )
        }
    }
}
</script>