<template>
    <div>
         <div v-for="item in getToDoList" 
              v-bind:key="item">

            <div v-on:click="toggleToDoItem(item.name)">
                <div v-if="item.active">
                    {{ item.name }} {{ item.active }} 
                </div>

                <div v-else class='text-muted'>
                    <del>{{ item.name }} {{ item.active }} </del>
                </div>
            </div>

        </div>
    </div>
</template>


<script>
import { mapActions, mapGetters } from 'vuex'
export default {
    name:'List',
    methods: mapActions(['toggleToDoItem']),
    computed: { ...mapGetters(['getToDoList']) },
}

</script>


<style scoped>
/* p{
    text-decoration: line-through;
} */

</style>