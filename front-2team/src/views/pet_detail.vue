<template>
    <div>
        <Navi/>
        <Petdetail/>
    </div>
</template>

<script>
import Navi from '../components/mainpage/navi.vue';
import Petdetail from '../components/pet_detail/pet_detail.vue';

export default {
  components: {
    Navi,
    Petdetail,
  },
};
</script>
