<template>  
    <div class="contents">
        <div class="tabs" role="tablist">
            <login/>
            <signup/>
        </div>
    </div>
</template>

<script>

import login from '@/components/member/login.vue';
import signup from '@/components/member/signup.vue';
import store from '../vuex/store'
import axios from 'axios'
export default {
  computed: {
      isAuthenticated() {
          return store.getters.isAuthenticated;
      }
  },
  components: {
    login,
    signup
  }
};

</script>
