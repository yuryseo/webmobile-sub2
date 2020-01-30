export default {
<<<<<<< HEAD
    LOGIN({ commit }, { email, password }) {
        return axios
          .post(`${resourceHost}/login`, { email, password })
          .then(({ data }) => {
            commit("LOGIN", data);
            axios.defaults.headers.common[
              "Authorization"
            ] = `Bearer ${data.accessToken}`;
          });
      },
      LOGOUT({ commit }) {
        axios.defaults.headers.common["Authorization"] = undefined;
        commit("LOGOUT");
      }
=======
 
>>>>>>> refs/remotes/origin/front_detail
};
