<template>
    <div id="main">
    <Navi/>
    <Content/>
    </div>
</template>

<script>

import Navi from '../components/mainpage/navi.vue';
import Content from '../components/mainpage/content.vue';

export default {
  components: {
    Content,
    Navi,
  },
  data: () => ({
  }),
};
</script>
