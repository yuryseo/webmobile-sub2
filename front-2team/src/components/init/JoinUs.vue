<template>
    <form @submit="formSubmit">
        <br/>
        <label>Join Us</label>
        <pre>{{user}}</pre>
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
        <label>비밀번호 입력</label>
        <br/>
        <input type="password" id="password" v-model="password">
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
import axios from 'axios';

export default {
  data() {
    return {
      email: '',
      interest: '',
      nickname: '',
      password: '',
      cpassword: '',
      phone: '',
      unum: '',
    };
  },
  methods: {
    formSubmit(e) {
      e.preventDefault();
      const currentObj = this;
      this.axios.post('http://70.12.247.104:9090/user', {
        email: this.email,
        interest: this.interest,
        nickname: this.nickname,
        password: this.password,
        phone: this.phone,
        unum: this.unum,
      })
        .then((response) => {
          currentObj.output = response.data;
        })
        .catch((error) => {
          currentObj.output = error;
        });
    },
  },
};
</script>
