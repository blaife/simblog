<template>
    <div class="m-content">
        <h3>欢迎来到blaife的博客</h3>
        <div class="block">
            <el-avatar shape="circle" :size="50" :src="user.avatar">{{user.username}}</el-avatar>
            <div>{{user.username}}的个人博客</div>
        </div>

        <div class="maction">
            <span><el-link href="/blogs" type="info">主页</el-link></span>
            <el-divider direction="vertical"></el-divider>
            <span><el-link href="/blog/add" type="success">发表文章</el-link></span>
            <el-divider direction="vertical"></el-divider>
            <span v-show="!hasLogin"><el-link href="/login" type="primary">登录</el-link></span>
            <span v-show="hasLogin"><el-link @click="logout" type="danger">退出</el-link></span>
        </div>
    </div>
</template>

<script>
    export default {
        name: "Header",
        data() {
            return {
                user: {
                    username: '请先登录',
                    avatar: 'https://fuss10.elemecdn.com/e/5d/4a731a90594a4af544c0c25941171jpeg.jpeg'
                },
                hasLogin: false
            }
        },
        methods: {
            logout() {
                const _this = this;
                _this.$axios.get("/logout", {
                    headers: {
                        "Authorization": _this.$store.getters.getToken
                    }
                }).then(res => {
                    _this.$store.commit("REMOVE_INFO");
                    _this.$router.push("/login")
                })
            }
        },
        created() {
            if(this.$store.getters.getUser) {
                this.user.username = this.$store.getters.getUser.username;
                this.user.avatar = this.$store.getters.getUser.avatar;
                this.hasLogin = true;
            }
        }
    }
</script>

<style scoped>
    .m-content {
        max-width: 960px;
        margin: 0 auto;
        text-align: center;
    }

    .maction {
        margin: 10px;

    }
</style>