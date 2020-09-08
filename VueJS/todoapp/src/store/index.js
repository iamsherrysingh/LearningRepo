import Vuex from 'vuex'
import Vue from 'vue'
import todo from './modules/todo'

Vue.use(Vuex)

export default new Vuex.Store({
    modules:{
        todo
    }
})