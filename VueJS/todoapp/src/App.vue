<template>
  <div id="app" class="white-text">
    <div>
      <AppHeader></AppHeader>
      <div>
        <List> </List>
      </div>
      <!-- <div><ListItem> </ListItem></div>
      <div><ListItem> </ListItem></div>
      <div><ListItem> </ListItem></div> -->

    </div>
  </div>
</template>


<script>
import AppHeader from './components/AppHeader'
import List from './components/List'
import ListItem from './components/ListItem'
export default {
  name: 'App',
  components: {
    AppHeader,
    List,
    ListItem
  },
}
</script>


<style>
</style>