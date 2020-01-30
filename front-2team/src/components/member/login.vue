<template>
    <div class="LoginTab">
        <input type="radio" name="tabs" id="tab1" checked/>
        <label for="tab1">Login</label>
        <div id="tab-content1" class="tab-content">
            <form class="form-input" @submit.prevent="onSubmit(email, password)">
                <input type="text" v-model="email" placeholder="Email ID 입력" /> <br/><br/>
                <input type="password" v-model="password" placeholder="비밀번호 입력" /> <br/><br/>
                <input type="submit" value="Login" class="button" />
                <br/>
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
        password: "",
    };
  }
};
</script>