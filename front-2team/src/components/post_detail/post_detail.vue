<template>
  <div id="wrap">
    <div class="post_box">
      <section class="post photo_box">
        <img class="post_photo" src="../../assets/post_detail/chiva.png" alt="">
      </section>
      <section class="post text_box">

        <header class="profile">
          <div class="profile_photo"><img class="profile_photo_circle" src="../../assets/post_detail/seolyugithub.png"
              alt=""></div>
          <div class="profile_name">사용자 이름</div>
        </header>

        <div class="posting">
          <section class="post_content">오늘 산책했다</section>
          <section class="hashtags">#강아지 #산책</section>
        </div>

        <div class="like_comment">
          <div class="like">
            <img class="like_button" src="../../assets/post_detail/paw_trans.png" alt="">
          </div>
          <div class="comment">
            <img class="comment_button" src="../../assets/post_detail/comment.png" alt="">
            <!-- <div class="commentnum">댓글 3개</div> -->
          </div>
          <div class="likenum">좋아요 3개</div>
        </div>

        <div class="post_time">포스팅시각</div>

        <div class="comment_box">
          <div class="user_info">
            <div class="user_photos">댓글러프사</div>
            <div class="user_names">댓글러이름</div>
          </div>
          <div class="user_comments">댓글내용</div>
        </div>

        <div class="comment_write_box">
          <div class="comment_write">
            <div class="comment_writing">댓글 달기</div>
          </div>
          <i class="far fa-smile fa-2x"></i>
        </div>
      </section>
    </div>
  </div>
</template>

<script>
export default {
  data: () => ({}),
};
</script>
<style scoped src='./post_detail.css'>
</style>