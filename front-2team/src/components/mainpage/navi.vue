<template>
    <div>
        <nav>
            <router-link v-bind:to="{name:'Mainpage'}">
                <img src="../../assets/mainpage/logo.png" width="170" height="80">
            </router-link>
            <div class="search-box">
                <input class="search-txt" type="text" name="" placeholder="Type to search">
                <a href="#" class="search-btn">
                    <i class="fas fa-search"></i>
                </a>
            </div>
            <div class="menus">
                <ul>
                    <li><a href="#/postupload"><i class="fas fa-plus"></i>Upload</a></li>
                    <li><a href="#/notice"><i class="fas fa-paw"></i>Alarm</a></li>
                    <li>
                        <router-link v-bind:to="{name:'Petdetail'}">
                            <img src="../../images/mainpage/seolyugithub.png" width="80" height="80">MyPage
                        </router-link>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
</template>

<script>
    import './navi.css';

    export default {
        data: () => ({}),
    };
</script>