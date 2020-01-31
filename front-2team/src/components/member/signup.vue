<template>
   <div class="JoinUsTab">
        <input type="radio" name="tabs" id="tab2"/>
        <label for="tab2">Join Us</label>
        <div id="tab-content2" class="tab-content">
            <input type="text" v-model="email" placeholder="e-mail ID입력">
            <!-- <input hidden id="interest" v-model="interest" placeholder="관심동물 입력">
            <input hidden id="phone" v-model="phone" placeholder="휴대폰 번호 입력">
            <input hidden id="unum" v-model="unum"> <br/><br/> -->
            <!-- <input type="text" v-model="nickname" placeholder="닉네임 입력"> <br/><br/> -->
            <input type="password" v-model="password" placeholder="비밀번호 입력"> <br/><br/>
            <input type="password"  placeholder="비밀번호 한번 더 입력"> <br/><br/>
            <button v-on:click="signup">회원가입</button>
        </div>
    </div>
</template>
​
<script>
import axios from 'axios';
export default {
    data() {
        return {
            email: "",
            interest: "",
            nickname: "",
            password: "",
            phone: "",
            unum: ""
        };
    },
    methods: {
        signup() {
            const email = this.email;
            const interest = this.interest;
            const nickname = this.nickname;
            const password = this.password;
            const phone = this.phone;
            const unum = this.unum;
            //현재 수정중
            axios.post('http://70.12.247.104:9090/user', {email, interest, nickname, password, phone, unum} )
                .then(res => {
                    if(res.status === 200) {
                        this.$router.go({name: 'Mainpage'});
                    }
                })
                .catch(err => {
                    alert("서버 에러")
                }) 
        }
    }
};
</script>
​
<!-- 회원가입 CSS import 방식 변경-->
<style scoped src='./member.css'/> 
