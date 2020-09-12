<template>
    <div>
        <input 
            
            type="text" placeholder="new to do item"
        />
    </div>
</template>


<script>
import {mapActions} from 'vuex'

export default {
    name:'InputItem',
    methods: mapActions(['addItem'])
    
}
</script>


<style scoped>
</style>