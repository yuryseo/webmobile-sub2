
import Mainpage from '../views/mainpage.vue';
import petdetail from '../views/pet_detail.vue';
import postdetail from '../views/post_detail.vue';

export default [
  {
    path: '/',
    name: 'Mainpage',
    component: Mainpage,
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
  {
    path: '/postdetail',
    name: 'Postdetail',
    component: postdetail,
  },
];
