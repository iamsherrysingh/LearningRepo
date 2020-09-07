import api from "../../api/imgur"
import qs from 'qs';

const state={
    token: null

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
    logout: ({commit, }) => {
        commit('setToken', null);
    }, 
    login: function(){
        api.login();
        console.log()
    },
    finalizeLogin({commit}, hash){
        const queryAttributes= qs.parse(hash.replace ("#", ""))
        commit('setToken', queryAttributes.access_token)

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