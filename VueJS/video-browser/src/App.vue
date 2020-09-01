<template>
    <div class="container" id="app">
        <SearchBar @termChange= "onTermChange"></SearchBar>
        <div class="row">
            <VideoDetail v-bind:video="selectedVideo"></VideoDetail>
            <VideoList
                @videoClick="onVideoClick"
                v-bind:videos="videos"> </VideoList>   
        </div>
        
    </div>
</template>


<script>
import axios from 'axios'
import SearchBar from './components/searchBar';
import VideoList from './components/VideoList'
import VideoDetail from './components/VideoDetail'
const API_KEY_SHERRY= "AIzaSyB-ehtLc-PehhL6Rw-O7SPJ6Nk5ZbzVwxg";
const API_KEY_DAD2= "AIzaSyDc8RdWlaCCQX1sLBZpsV19hjOWnlaORSI";

export default {
    name:"App",
    data:function(){
        return {
            videos: [],
            selectedVideo: null,
        }
    },
    components:{
        SearchBar,
        VideoList,
        VideoDetail
    },
    methods:{
        onTermChange: function(searchTerm){
            axios.get('https://www.googleapis.com/youtube/v3/search', {
                params: {
                    key: API_KEY_DAD2,
                    type: 'video',
                    part: 'snippet',
                    q: searchTerm
                } 
            }).then(response=> {
                                this.videos= response.data.items;
                               }
                    )

        },
        onVideoClick(video){
            this.selectedVideo= video;
        }
    }
}
</script>


<style>

</style>