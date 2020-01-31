<template>
  <div id="wrap">
    <div class="post_upload">
      <section class="post photo_upload">
        <v-file-input label="File input" filled prepend-icon="mdi-camera"></v-file-input>
      </section>

      <section class="post text_upload">
        <header class="post_title">
          <v-col cols="12" sm="12">
            <v-text-field label="제목" single-line solo></v-text-field>
          </v-col>
        </header>

        <div class="posting">
          <section class="post_content">
            <v-col cols="12" md="12">
              <v-textarea solo name="input-7-4" label="내용"></v-textarea>
            </v-col>
          </section>
          <section class="hashtags">
            <v-col cols="12" sm="12">
              <v-text-field label="해시태그" single-line solo></v-text-field>
            </v-col>
          </section>
        </div>

        <div class="public">
          <v-radio-group v-model="row" row>
            <v-radio label="전체공개" value="radio-1"></v-radio>
            <v-radio label="친구공개" value="radio-2"></v-radio>
            <v-radio label="비공개" value="radio-3"></v-radio>
          </v-radio-group>
        </div>

        <div class="save">
          <img class="save_button" src="../../assets/post_upload/paw_pink.png" alt="">
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
<style scoped src='./post_upload.css'/>