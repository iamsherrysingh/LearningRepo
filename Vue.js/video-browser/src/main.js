import Vue from 'vue';
import App from './App';

new Vue({
    // render: function(createElement){
    //     return createElement(App);
    // }
    el:'#app',
    render: h => h(App)
});