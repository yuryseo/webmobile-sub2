import axios from 'axios';

export default axios.create({
  baseURL: 'http://70.12.247.104:9090',
  headers: {
    'Content-type': 'application/json',
  },
});
