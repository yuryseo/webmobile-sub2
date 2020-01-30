<template>
    <div class="container">
        <div class="box" v-for="postlist in postlists.data" :key="postlist.privacy">
            <!-- <div class="inner_box" v-if="postlist.privacy === 'all' "> -->
                <h2>{{postlist.title}}</h2>
                <router-link v-bind:to="{name:'Petdetail'}">
                    <img src="../../assets/mainpage/img1.png">
                </router-link>
                <h2></h2>
                <p>{{postlist.contents}}</p>
                <div class="inner_box_bottom">
                    <span class="date">{{postlist.date}}</span>
                    <span class="likes">{{postlist.likes}}</span>
                    <span class="comments">{{postlist.comments}}</span>
                </div>
            <!-- </div> -->

        </div>
    </div>
</template>

<script>

import './content.css';

export default {
  created() {
    this.$store.dispatch('mainPostFeed');
  },
  computed: {
    postlists() {
      return this.$store.state.postlist;
    },
    everypostlist() {
      return this.$store.getters.EveryPostList;
    },
  },
};

</script>
