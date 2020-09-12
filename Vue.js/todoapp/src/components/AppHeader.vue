<template>
    <div>
        <nav class="navbar navbar-light bg-light ">
            <a class="navbar-brand navbar-center" href="#"><strong>To Do List</strong></a>
        </nav>
    </div>
</template>

<script>
export default {
    name:'AppHeader',
}
</script>


<style scoped>
.bg-light{
    background-color: rgb(255, 208, 0) !important;
    text-align: center !important;
}

.navbar-center {
  margin-left: auto;
  margin-right: auto;
}

strong{
    font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
    font-size: 220%;
}
</style>