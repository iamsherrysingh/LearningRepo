<template>
  <div id="app">
    <div>
      <AppHeader></AppHeader>
      <div>
        <List>
          <div><ListItem> </ListItem></div>
        </List>
      </div>

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
  }
}
</script>

<style>

</style>
