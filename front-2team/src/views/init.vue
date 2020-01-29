<template>
    <ModalLogin/>
</template>

<script>

import ModalLogin from '../components/init/ModalLogin.vue';
import JoinUs from '../components/init/JoinUs.vue';
import store from '../vuex/store'
import axios from 'axios'
export default {
  data() {
      return{
        page : true,
      }
  },
  computed: {
      isAuthenticated() {
          return store.getters.isAuthenticated;
      }
  },
  components: {
    ModalLogin,
    JoinUs,
  },
  methods: {
    show() {
      this.$modal.show('modal-login');
    },
    hide() {
      this.$modal.hide('modal-login');
    },
    toggle() {
      this.page = false;
    },
  },
};

</script>
