import Vue from 'vue';
import Vuex from 'vuex';
import getters from './getters';
import actions from './actions';
import mutations from './mutations';
import axios from "axios"

Vue.use(Vuex);

const resourceHost = "http://70.12.247.104:9090"


const enhanceAccessToeken = () => {
  const { accessToken } = localStorage;
  if (!accessToken) return;
  axios.defaults.headers.common["Authorization"] = `Bearer ${accessToken}`;
};
enhanceAccessToeken();

const state = {
   isUser: false,
 };

export default new Vuex.Store({
  state:{
    accessToken: null
  },
  mutations,
  getters,
  actions,
});
