<template>
    <form @submit.prevent="onSubmit(email, password)">
        <div>
            <input type="text" v-model="email" placeholder="Email Address" />
            <input type="submit" value="Login" />
        </div>
        <div>
            <input type="password" v-model="password" placeholder="Password" />
            <button @click="toggle">Join Us</button>
            <label hidden>{{flag}}</label>
        </div>
    </form>
</template>


<script>
export default {
  data() {
    return {
      email: '',
      password: '',
      flag: false,
    };
  },
  methods: {
    toggle() {
      this.$emit('change');
    },
    onSubmit(email, password) {
      this.$store
        .dispatch('LOGIN', { email, password })
        .then(() => this.redirect())
        .catch(({ message }) => (this.msg = message));
    },
    redirect() {
      const { search } = window.location;
      if (search === '') {
        this.$router.push('/');
      } else {
        const tokens = search.replace(/^\?/, '').split('&');
        const { returnPath } = tokens.reduce((qs, tkn) => {
          const pair = tkn.split('=');
          qs[pair[0]] = decodeURIComponent(pair[1]);
          return qs;
        }, {});
        this.$router.push(returnPath);
      }
    },
  },
};
</script>
