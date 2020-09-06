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
    }

};


const mutations={
    setToken: function(state, token){
        state.token= token;
    }
};