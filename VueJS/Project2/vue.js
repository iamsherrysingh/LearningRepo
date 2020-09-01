// Make the template show a ':(' if it isn't Friday
// If it is Friday, then make it show a ':)'
const vm = new Vue({
    el: '#root',
    methods:{

    },
    computed:{
        mood: function(){
            if (new Date().getDate() == 5)
                return ':)'
            else
                return ':('
        }
    },
    template: `
     <div class="date">
       {{mood}}
     </div>
    `
 });