<template>
  <div>
    <h2>Login</h2>
    <app-my-modal
      title="This is modal"
      :visible.sync="visible"
      @submit.prevent="onSubmit(email, password)"
    >
      <input type="text" v-model="email" placeholder="Email Address" />
      <input type="password" v-model="password" placeholder="Password" />
      <input type="submit" value="Login" />
    </app-my-modal>
    <p>
      <i>{{ msg }}</i>
    </p>
  </div>
</template>

<script>
import Modal from "./Modal";

export default {
  data() {
    return {
      email: "",
      password: "",
      msg: "",
      visible: false
    };
  },
  components: {
    appMyModal: Modal
  },
  methods: {
    onSubmit(email, password) {
      this.$store
        .dispatch("LOGIN", { email, password })
        .then(() => this.redirect())
        .catch(({ message }) => (this.msg = message));
    },
    redirect() {
      const { search } = window.location;
      if (search === "") {
        this.$router.push("/");
      } else {
        const tokens = search.replace(/^\?/, "").split("&");
        const { returnPath } = tokens.reduce((qs, tkn) => {
          const pair = tkn.split("=");
          qs[pair[0]] = decodeURIComponent(pair[1]);
          return qs;
        }, {});
        this.$router.push(returnPath);
      }
    },
    handleClickButton() {
      this.visible = !this.visible;
    }
  }
};
</script>
