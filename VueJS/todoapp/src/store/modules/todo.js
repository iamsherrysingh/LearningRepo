const state={
    toDoList: [
        {name: 'Eggs from Pharmaprix', active: true},
        {name: 'Desi Cookies from Beausoir', active: false},
        {name: 'Veggies from Marche Newon', active: true},
        {name: 'Nuts from Walmart', active: true},
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