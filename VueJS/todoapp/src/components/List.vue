<template>
    <div>
         <p class='text-muted'
            v-on:click="s" v-for="item in getToDoList" 
            v-bind:key="item">{{ item.name }} {{ item.active }} </p>
    </div>
</template>


<script>
import { mapActions, mapGetters } from 'vuex'
export default {
    name:'List',
    computed: { ...mapGetters(['getToDoList']) },
    methods:{
        s(){
            console.log("tapped")
        }
    }
}

</script>


<style scoped>
p{
    text-decoration: line-through;
}

</style>