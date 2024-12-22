<!-- 드디어 첫 작품 -->
<template>
    <div id="content">
        <h1>My First Art</h1>
        <h2>{{ food }}</h2>
        <button @click="updateFood">메뉴교체</button>
    </div>
</template>

<script>
import { ref } from "vue";

export default {
    setup(){
        const food = ref("돈까스");

        const updateFood = () => {
            food.value = "호텔뷔페";
        }

        return {
            food,
            updateFood
        }
    }
}

</script>

<style>

</style>