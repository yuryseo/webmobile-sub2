<template>
    <!-- <div id="main"> -->
    <div>
    <Navi/>
    <Tab2/>
    <Content/>
    </div>
</template>

<script>

import Navi from '../components/mainpage/navi.vue';
import Tab2 from '../components/mainpage/tab2.vue';
import Content from '../components/mainpage/content.vue';

export default {
  components: {
    Content,
    Tab2,
    Navi,
  },
  data: () => ({
  }),
};
</script>
