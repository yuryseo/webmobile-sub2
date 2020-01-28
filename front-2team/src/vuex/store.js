import Vue from 'vue';
import Vuex from 'vuex';
import getters from './getters';
import actions from './actions';
import mutations from './mutations';
import Constant from './Constant';

Vue.use(Vuex);

const state = {
  isUser: false,
  userlist: [],
  petlist: []
};


export default new Vuex.Store({
  state,
  mutations,
  getters,
  actions,
});
