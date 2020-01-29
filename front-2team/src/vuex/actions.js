import axios from 'axios'
const resourceHost = "http://70.12.247.104:9090"
export default {
    LOGIN({ commit }, { email, password }) {
        return axios
          .post(`${resourceHost}/userlogin`, { email, password })
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
};
