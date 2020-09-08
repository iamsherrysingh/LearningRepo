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

    toggleToDoItem(state, itemName){
        state.toDoList.forEach(item => {
            if(item.name == itemName)
                if(item.active == true)
                    item.active = false
                else
                   item.active = true
        })
    }

}


const actions={
    toggleToDoItem( { state, commit } , itemName){
        //Modify list in DB
        commit('toggleToDoItem', itemName)
    }

}


export default{
    state,
    getters,
    mutations,
    actions
}