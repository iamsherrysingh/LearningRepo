const state={
    toDoList: [
        {name: 'Item 1', active: true},
        {name: 'Item 2', active: false},
        {name: 'Item 3', active: true},
        {name: 'Item 4', active: true},
    ]
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

    
    
}


const actions={


}


export default{
    state,
    getters,
    mutations,
    actions
}