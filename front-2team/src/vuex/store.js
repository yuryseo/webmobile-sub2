import Vue from 'vue';
import Vuex from 'vuex';
import axios from './axios-common';

Vue.use(Vuex);

const store = new Vuex.Store({
  state: {
    petlist: {},
    postlist: {},
  },
  getters: {
    EveryPostList: state => state.postlist,
  },
  mutations: {
    getPetOneDetail(state, payload) {
      state.petlist = payload.petlist;
    },
    mainPostFeed(state, payload) {
      state.postlist = payload.postlist;
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
    mainPostFeed: () => {
      axios
        .get('/post/selectall')
        .then((response) => {
          store.commit('mainPostFeed', { postlist: response.data });
        })
        .catch(() => {
        });
    },
  },
});


export default store;
