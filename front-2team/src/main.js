import Vue from 'vue';
import App from './components/detail/pet_detail.vue';

Vue.config.productionTip = false;

new Vue({
  render: h => h(App),
}).$mount('#app');
