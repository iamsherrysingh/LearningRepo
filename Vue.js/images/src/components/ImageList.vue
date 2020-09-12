<template>

    <div>
        <div v-if="isLoggedIn">
            <img class="image-container"
                v-for="image in allImages" 
                v-bind:key="image.link" 
                v-bind:src= "image.link"/>
        </div>
        <h2 v-else>Log in to get started!</h2>
    </div>
</template>


<script>
import { mapActions , mapGetters } from 'vuex'

export default {
    name : 'ImageList',
    computed : mapGetters (['allImages'  , 'isLoggedIn']),
    methods : mapActions(['fetchImages']),
    created(){
        this.fetchImages()
    }
}
</script>


<style scoped>
.image-container{
    column-count: 3;
    column-gap: 0;
}

img{
    max-width: 50%;
    padding: 5px
}
</style>