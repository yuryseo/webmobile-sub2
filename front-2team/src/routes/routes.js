import Vue from 'vue'
import Router from "vue-router";
import member from '../views/member.vue';
import Mainpage from '../views/mainpage.vue';
import petdetail from '../views/pet_detail.vue';

Vue.use(Router);


export default [
  {
    path: '/',
    name: 'member',
    component: member,
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
