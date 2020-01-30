<template>
   <div class="JoinUsTab">
        <input type="radio" name="tabs" id="tab2"/>
        <label for="tab2">Join Us</label>
        <div id="tab-content2" class="tab-content">
            <form @submit="formSubmit">
                <input type="email" id="email" name="email" value="e-mail" v-model="name" placeholder="e-mail ID입력">
                <input hidden id="interest" name="interest" value="interest" v-model="interest" placeholder="관심동물 입력">
                <input hidden id="phone" name = "phone" value="phone" v-model="phone" placeholder="휴대폰 번호 입력">
                <input hidden id="unum" name="unum" value="unum" v-model="unum"> <br/><br/>
                <input type="text" id="nickname" name="nickname" value="nickname" v-model="nickname" placeholder="닉네임 입력"> <br/><br/>
                <input type="password" id="password" v-model="password" placeholder="비밀번호 입력"> <br/><br/>
                <input type="password" id="cpassword" placeholder="비밀번호 한번 더 입력"> <br/><br/>
                <input type="submit" value="회원가입" />
            </form>
        </div>
    </div>
</template>

<script>
import '@/components/member/member.css';
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
    }
}
</script>