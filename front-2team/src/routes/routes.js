import Vue from 'vue'
import Router from "vue-router";
import init from '../views/init.vue';
import Mainpage from '../views/mainpage.vue';
import petdetail from '../views/pet_detail.vue';

Vue.use(Router);


export default [
  {
    path: '/',
    name: 'init',
    component: init,
  },
  {
    path: '/main',
    name: 'Mainpage',
    component: Mainpage,
  },
  {
    path: '/petdetail',
    name: 'Petdetail',
    component: petdetail,
  },
];
