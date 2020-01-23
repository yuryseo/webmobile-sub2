import user_detail from './components/detail/user_detail.vue'
import pet_detail from './components/detail/pet_detail.vue'

export default [
    {
        path: '/user_detail',
        name: 'user_detail',
        component: user_detail
    },
    {
        path: '/user_detail/pet_detail',
        name: 'pet_detail',
        component: pet_detail
    }
]


