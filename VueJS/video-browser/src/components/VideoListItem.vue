<template>
    <li @click="onVideoClick" class="list-group-item media">
       <img class="mr-3" v-bind:src="thumbnailUrl"/>
       <div class="media-body">
           {{video.snippet.title}}
        </div>
    </li>
</template>


<script>
export default {
    name:'VideoListItem',
    computed:{
        thumbnailUrl(){
            return this.video.snippet.thumbnails.default.url;
        }
    },
    props:['video'],
    methods:{
        onVideoClick(){
            this.$emit('videoClick', this.video);
        }
    }
}
</script>


<style scoped>
    li{
        display: flex;
        cursor: pointer;
    }

    li:hover{
        background-color: #eee;
    }
</style>