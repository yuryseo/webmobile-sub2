<template>
  <div id="wrap">
    <div class="post_upload">
      <section class="post photo_upload">
          드래그 하거나 클릭하여 업로드
      </section>

      <section class="post text_upload">
        <header class="post_title">
          제목
        </header>

        <div class="posting">
          <section class="post_content">내용</section>
          <section class="hashtags">#강아지 #산책</section>
        </div>

        <div class="public">
          공개범위설정
        </div>

        <div class="save">
          <img class="save_button" src="../../assets/post_upload/paw_pink.png" alt="">
        </div>
      </section>
    </div>
  </div>
</template>

<script>
  import './post_upload.css';

  export default {
    data: () => ({}),
  };
</script>