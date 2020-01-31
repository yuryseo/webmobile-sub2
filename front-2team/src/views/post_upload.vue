<template>
    <div>
        <Navi/>
        <Postupload/>
    </div>
</template>

<script>
import Navi from '../components/mainpage/navi.vue';
import Postupload from '../components/post_upload/post_upload.vue';

export default {
  components: {
    Navi,
    Postupload,
  },
};
</script>
