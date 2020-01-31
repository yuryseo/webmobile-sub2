<template>
    <div>
        <Navi/>
        <Petdetail/>
        <!-- <ButtonComponent text="승인" :isBackground="true"/>
        <ButtonComponent text="거절" :isBackground="false"/> -->
    </div>
</template>

<script>
import Navi from '../components/mainpage/navi.vue';
import Petdetail from '../components/pet_detail/pet_detail.vue';
// import ButtonComponent from '../components/pet_detail/Button.vue';

export default {
  components: {
    Navi,
    Petdetail,
  },
};
</script>
