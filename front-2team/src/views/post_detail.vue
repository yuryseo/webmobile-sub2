<template>
    <div>
        <Navi/>
        <Postdetail/>
    </div>
</template>

<script>
import Navi from '../components/mainpage/navi.vue';
import Postdetail from '../components/post_detail/post_detail.vue';

export default {
  components: {
    Navi,
    Postdetail,
  },
};
</script>
