export default {
  LOGIN(state, { accessToken }) {
    state.accessToken = accessToken;
    localStorage.accessToken = accessToken;
  },
  LOGOUT(state) {
    state.accessToken = null;
    delete localStorage.accessToken;
  },
};
