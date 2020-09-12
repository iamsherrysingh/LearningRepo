import api from "../../api/imgur"
import { router } from '../../main'

const state={
    images : []
};


const getters= {
    allImages: function(state){
        return state.images
    }
};


const actions={
   async fetchImages( { rootState , commit } ){  
        const token = rootState.auth.token
        const response = await api.fetchImages(token)
        commit('setImages', response.data.data)
    },
    async uploadImages({ rootState } , images){
        const token = rootState.auth.token;

        const promise = await api.upload(images, token)

        router.push("/")
    },
};


const mutations={
    setImages: function(state, images){
        state.images = images
    }
};


export default{
    state,
    getters,
    actions,
    mutations
}