<template>
    <div class="parent_box">
        <div class="left_box">
            <img v-bind:src="img_path" id="profile" width="200" height="200">
        </div>

        <div class="right_box">
            <div class="pet_name">
                애완동물 이름
            </div>
            <button class="change_user_profile">
                프로필 변경
            </button>
            <button class="setting">
                설정
            </button>
            <div class="followerNum">
                팔로워 수
            </div>
            <div class="followNum">
                팔로우 수
            </div>
            <div class="uploadNum">
                게시물 수
            </div>
        </div> 

        <div class="intro_header" font-family="나눔고딕" style="margin-left:350px; margin-top:80px; font-size: larger;">
            자기소개
        </div>

        <div class="intro_content" font-family="나눔고딕" style="margin-left:350px; margin-top:30px; font-size: larger;">
        안녕하세요 반갑습니다 ^_^
        </div>
    </div>
</template>

<script>
    import '../../assets/css/pet_detail.css';

    export default {
        components:{
            img_path: '../../assets/image/profile_test.jpg'
        }
    }
</script>