<template>
    <div>
        <h1>{{title}}</h1>
        <span>{{rating}}</span>
        <button @click="fun">点击收藏</button>
    </div>
</template>

<script>
//导出
export default {
    name: "Movie",
    props:["title","rating"],
    data: function () {
        return{

        }
    },
    created:function(){
        console.log("Movie组件被创建了")
    },
    methods:{
        fun(){
            alert("收藏成功")
        }
    }

}
</script>


<style scoped>

</style>