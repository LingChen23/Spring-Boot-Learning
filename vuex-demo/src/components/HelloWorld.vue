<template>
  <div class="hello">
<!--    {{this.$store.state.count}}-->
      {{count}}
      <button @click="add">+1</button>

      <ul>
          <li v-for="todo in doneTools" :key="todo.id">{{todo.text}}</li>
      </ul>
  </div>
</template>

<script>
import {mapState, mapGetters} from "vuex";

//映射 this.count 为 store.state.count
// 'count': state => state.count

export default {
  name: 'HelloWorld',
    computed: {
      ...mapState([
          'count', 'todos'
      ]),

      ...mapGetters([
          "doneTools"
      ])
    },
    methods:{
      add(){
          this.$store.commit("increment",
              3);
      }
    }

}
</script>


<style scoped>

</style>
