
import Vue from 'vue';
import Router from 'vue-router';
import VModal from 'vue-js-modal';
import App from './App.vue';
import routes from './routes/routes';
import store from './vuex/store';
import axios from 'axios'
import VueAxios from 'vue-axios'

Vue.config.productionTip = false;

Vue.use(Router);
Vue.use(VModal);
Vue.use(VueAxios, axios);
const router = new Router({
  routes,
});

new Vue({
  router,
  store,
  render: h => h(App),
}).$mount('#app');
