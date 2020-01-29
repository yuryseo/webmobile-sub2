import Constant from './Constant';

export default {
  [Constant.PETONE_TODO]: (store, payload) => {
    state.petlist = payload.petlist;
  },
};
