import Vue from 'vue';
import Vuex from 'vuex';
import axios from './axios-common';

Vue.use(Vuex);

// const state = {
//   isUser: false,
//   userlist: [],
//   petlist: []
// };


const store = new Vuex.Store({
  state: {
    petlist: {},
  },
  mutations: {
    getPetOneDetail(state, payload) {
      state.petlist = payload.petlist;
    },
  },
  actions: {
    petOneDetail: () => {
      axios
        .get('/petone/1')
        .then((response) => {
          store.commit('getPetOneDetail', { petlist: response.data });
        })
        .catch(() => {
        });
    },
  },
});


export default store;
