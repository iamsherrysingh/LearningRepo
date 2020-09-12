<template>
  <div id="app" class="white-text">
    <div>
      <AppHeader></AppHeader>
      <div>
        <List> </List>
      </div>
      <div>
        <InputItem/>
      </div>


    </div>
  </div>
</template>


<script>
import AppHeader from './components/AppHeader'
import List from './components/List'
import InputItem from './components/InputItem'
export default {
  name: 'App',
  components: {
    AppHeader,
    List,
    InputItem
  },
}
</script>


<style>
</style>