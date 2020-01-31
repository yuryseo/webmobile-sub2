<template>
    <div>
        <a href="/#login" @click.prevent="show">Login</a>
        <modal name="modal-login">
            <modal-login v-if="page" @change="toggle"/>
            <join-us v-else/>
        </modal>
    </div>
</template>

<script>

import axios from 'axios';
import ModalLogin from '../components/init/ModalLogin.vue';
import JoinUs from '../components/init/JoinUs.vue';
import store from '../vuex/store';

export default {
  data() {
    return {
      page: true,
    };
  },
  computed: {
    isAuthenticated() {
      return store.getters.isAuthenticated;
    },
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
