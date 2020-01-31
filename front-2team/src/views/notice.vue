<template>
    <div>
        <Navi/>
        <Notice/>
    </div>
</template>

<script>
import Navi from '../components/mainpage/navi.vue';
import Notice from '../components/notice/notice.vue';

export default {
  components: {
    Navi,
    Notice,
  },
};
</script>
