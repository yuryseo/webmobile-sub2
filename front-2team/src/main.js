import Vue from 'vue';
import Router from 'vue-router';
import App from './App.vue';
import routes from './routes/routes';
import store from './vuex/store';

Vue.config.productionTip = false;

Vue.use(Router);

const router = new Router({
  mode: 'history',
  routes,
});

new Vue({
  router,
  store,
  render: h => h(App),
}).$mount('#app');
