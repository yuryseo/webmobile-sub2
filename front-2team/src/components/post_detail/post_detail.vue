<template>
<article class="post_box">
    <div id="photo_box">
        <img src="../../images/post_detail/chiva.png" alt="">
    </div>
    <div class="text_box">
      <div class="profile">사용자 이름</div>
      <div class="post_content">포스트 내용</div>
      <div class="hashtags">해시태그</div>
      <button class="like">like</button>
      <div class="likenum">좋아요수</div>
      <button class="comment">댓글버튼</button>
      <di class="commentnum">댓글수</di>
      <div class="post_time">포스팅시각</div>
      <div class="comments">댓글</div>
    </div>
</article>
</template>

<script>

import './post_detail.css';

export default {
  data: () => ({
  }),
};

</script>
