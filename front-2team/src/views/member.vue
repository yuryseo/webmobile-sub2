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

export default {

  components: {
    login,
    signup
  }
  
};

</script>
