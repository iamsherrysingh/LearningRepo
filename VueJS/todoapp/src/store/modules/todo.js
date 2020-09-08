const state={
    toDoList: {
        'Item 1': false,
        'Item 2': false,
        'Item 3': true,
        'Item 4': false
    }
}


const getters={
    getToDoList: function(state){
        return state.toDoList
    }
}


const mutations={
    setToDoList: function(state, toDoList){
        state.toDoList= toDoList
    },

    markItemDone(state, item){
        state.item= true
    },

    addItem(state, item){
        state.item= false
    }
    
}


const actions={

}


export default{
    state,
    getters,
    mutations,
    actions
}