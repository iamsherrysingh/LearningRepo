<template>
    <div>
         <div class='text-justify'
              v-for="item in getToDoList" 
              v-bind:key="item">

            <div v-on:click="toggleToDoItem(item.name)">
                <div v-if="item.active">
                    {{ item.name }}
                </div>

                <div v-else class='text-muted'>
                    <del>{{ item.name }}</del>
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
.text-justify{
    margin-left: 30px;
    margin-top:20px
}


</style>