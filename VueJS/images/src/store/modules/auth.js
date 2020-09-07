import api from "../../api/imgur"
import qs from 'qs';
import { router } from '../../main'

const state={
    token: window.localStorage.getItem('imgur_token')
};


const getters= {
    isLoggedIn: function(state){
        if(state.token == null)
            return false;
        else 
            return true;
    }
};


const actions={
    login: function(){
        api.login();
        console.log()
    },
    finalizeLogin({commit}, hash){
        const queryAttributes= qs.parse(hash.replace ("#", ""))

        commit('setToken', queryAttributes.access_token)
        window.localStorage.setItem('imgur_token', queryAttributes.access_token)
        
        router.push("/")
    },
    logout: function({commit}) {
        commit('setToken', null);
        window.localStorage.removeItem('imgur_token')
    }
};


const mutations={
    setToken: function(state, token){
        state.token= token;
    }
};


export default{
    state: state,
    getters: getters,
    actions: actions,
    mutations: mutations
}