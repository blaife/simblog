import axios from 'axios'
import ElementUI from 'element-ui'
import router from './router'
import store from './store'

axios.defaults.baseURL="http://localhost:8081";

// 前置拦截
axios.interceptors.request.use(config => {
    return config;
});

// 后置拦截
axios.interceptors.response.use(response => {
    let res = response.data;
    if (res.code === 200) {
        return response;
    } else {
        ElementUI.Message.error(response.data.msg, {duration: 3 * 1000});
        return Promise.reject(response.data.msg);
    }
},error => {
    if (error.response.status === 401) {
        store.commit("REMOVE_INFO");
        router.push("/login");
    }
    ElementUI.Message.error(error.response.data.msg, {duration: 3 * 1000});
    return Promise.reject(error.response.data.msg);
});