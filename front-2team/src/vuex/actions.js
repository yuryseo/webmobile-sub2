import axios from './axios-common'
import Constant from './Constant';

export default {
    [Constant.PETONE_TODO]: (store,payload) => {
        axios
        .get("/petone/"+payload.petnum)
        .then(response => {
            alert(response.data.name + "\n" + response.data.firstday + "\n" +response.data.age + "\n" + response.data.animal + "\n" + response.data.breed + "\n" + response.data.gender)    
        })
        .catch(exp => alert("getpetlist 처리에 실패하였습니다." + exp));
    }
};
