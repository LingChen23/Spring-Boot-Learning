<template>
  <div id="app">
    <img alt="Vue logo" :src="img">
  </div>
</template>

<script>
import axios from "axios"

export default {
    name: 'App',
    data:function () {
        return{
            img:""
        }
    },
    mounted:function () {
        axios.get("/product/search").then(res => {
            console.log(res)
            this.img = res.data.data.img
        })
    },
    components: {

  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
