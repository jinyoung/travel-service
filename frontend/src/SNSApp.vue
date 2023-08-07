

<template>
    <v-app id="inspire">
        <div>
            <v-app-bar color="primary" app clipped-left flat>
                <v-toolbar-title>
                    <span class="second-word font uppercase"
                        style="font-weight:700;"
                    >
                        <v-app-bar-nav-icon
                            @click="openSideBar()"
                            style="z-index:1;
                            height:56px;
                            width:30px;
                            margin-right:10px;
                            font-weight:300;
                            font-size:55px;"
                        >
                            <div style="line-height:100%;">≡</div>
                        </v-app-bar-nav-icon>
                    </span>
                </v-toolbar-title>
                <span v-if="urlPath!=null" 
                    class="mdi mdi-home" 
                    key="" 
                    to="/" 
                    @click="goHome()"
                    style="margin-left:10px; font-size:20px; cursor:pointer;"
		        ></span> 
                <v-spacer></v-spacer>

            </v-app-bar>

            <v-navigation-drawer app clipped flat v-model="sideBar">
                <v-list>
                    <v-list-item
                        class="px-2"
                        key="travels"
                        to="/recommendationAndBookings/travels"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        여행
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="supports"
                        to="/customerSupports/supports"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        지원
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="partnerships"
                        to="/partnershipManagements/partnerships"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        제휴
                    </v-list-item>


                    <v-list-item
                        class="px-2"
                        key="collaborations"
                        to="/collaborationManagements/collaborations"
                        @click="changeUrl()"
                        color="primary"
                        style="font-weight:700;"
                    >
                        협력
                    </v-list-item>


                </v-list>
            </v-navigation-drawer>
        </div>

        <v-main>
            <v-container style="padding:0px;" v-if="urlPath" fluid>
                <router-view></router-view>
            </v-container>
            <v-container style="padding:0px;" v-else fluid>
                <div style="width:100%; margin:0px 0px 20px 0px; position: relative;">
                    <v-img style="width:100%; height:300px;"
                        src="https://oaidalleapiprodscus.blob.core.windows.net/private/org-IsZwoYj8yobpFySuytSuI26N/user-ha9EUDa76s1yoHT6JzgqOaFI/img-btQVwOJT9qmav0xicOekmSqp.png?st=2023-08-07T01%3A05%3A05Z&se=2023-08-07T03%3A05%3A05Z&sp=r&sv=2021-08-06&sr=b&rscd=inline&rsct=image/png&skoid=6aaadede-4fb3-4698-a8f6-684d7786b067&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2023-08-06T18%3A16%3A27Z&ske=2023-08-07T18%3A16%3A27Z&sks=b&skv=2021-08-06&sig=YTjr2wHk0BxcLe8FgQy%2BfFnRwNi3M6RpiizdZ13ZgWE%3D"
                    ></v-img>
                    <div class="App-main-text-overlap">여행지 추천 및 예약 서비스</div>
                    <div class="App-sub-text-overlap">&quot;무한한 가능성을 제공하는 놀라운 서비스! 우리는 미래의 일상을 위한 혁신적인 기술과 함께합니다. 사용자 중심의 경험으로 당신의 삶을 바꾸어드립니다. 가입하세요,  나만의 새로운 세계를 경험하세요.&quot;</div>
                </div>
                <v-row>
                    <v-col cols="4" class="d-flex justify-center" v-for="(aggregate, index) in aggregate" :key="index">
                        <div 
                            class="flip-card"
                            @mouseover="flipCard(index)"
                            @mouseleave="unflipCard(index)"
                            :class="{ 'is-flipped': flipped[index] }"
                        >
                            <div class="flip-card-inner">
                                <div class="flip-card-front">
                                    <v-card
                                        class="mx-auto"
                                        style="width:300px; min-height: 310px; margin-bottom:20px; text-align: center; border-radius: 10px;"
                                        outlined
                                    >
                                        <v-list-item style="padding:15px; margin:0px;">
                                            <v-img style="width:100%; height:120px; border-radius: 10px;" :src="aggregate.ImageUrl"></v-img>
                                        </v-list-item>
                                        <div style="text-align: left; padding:10px 15px 15px 15px; margin-top:-10px;">
                                            <h2>{{ aggregate.title }}</h2>
                                            <div>{{ aggregate.description }}</div>
                                        </div>
                                    </v-card>
                                </div>
                                <div class="flip-card-back">
                                    <v-card
                                        color="primary"
                                        class="mx-auto"
                                        style="width:300px; min-height: 310px; margin-bottom:20px; text-align: center; border-radius: 10px;"
                                        outlined
                                        :key="aggregate.key"
                                        :to="aggregate.route"
                                        @click="changeUrl()"
                                    >
                                        <v-list-item style="padding:15px; margin:0px;">
                                            <v-img style="width:100%; height:120px; border-radius: 10px;" :src="aggregate.ImageUrl"></v-img>
                                        </v-list-item>
                                        <h2 style="color:white;">{{ aggregate.title }} 관리</h2>
                                    </v-card>
                                </div>
                            </div>
                        </div>
                    </v-col>
                </v-row>
            </v-container>
        </v-main>
    </v-app>
</template>

<script>

export default {
    name: "App",
    data: () => ({
        useComponent: "",
        drawer: true,
        components: [],
        sideBar: true,
        urlPath: null,
        flipped: [],
        ImageUrl: 'https://oaidalleapiprodscus.blob.core.windows.net/private/org-IsZwoYj8yobpFySuytSuI26N/user-ha9EUDa76s1yoHT6JzgqOaFI/img-btQVwOJT9qmav0xicOekmSqp.png?st=2023-08-07T01%3A05%3A05Z&se=2023-08-07T03%3A05%3A05Z&sp=r&sv=2021-08-06&sr=b&rscd=inline&rsct=image/png&skoid=6aaadede-4fb3-4698-a8f6-684d7786b067&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2023-08-06T18%3A16%3A27Z&ske=2023-08-07T18%3A16%3A27Z&sks=b&skv=2021-08-06&sig=YTjr2wHk0BxcLe8FgQy%2BfFnRwNi3M6RpiizdZ13ZgWE%3D',
        aggregate: [
            { 
                title: '여행', 
                description: '여행 정보 및 예약에 관련된 기능과 데이터를 관리', 
                key: 'travels', 
                route: '/recommendationAndBookings/travels',
                ImageUrl: '',
            },
            { 
                title: '지원', 
                description: '고객 문의 및 지원에 관련된 기능과 데이터를 관리', 
                key: 'supports', 
                route: '/customerSupports/supports',
                ImageUrl: '',
            },
            { 
                title: '제휴', 
                description: '호텔, 항공사, 기차 등과의 제휴 관리와 파트너십 데이터를 관리', 
                key: 'partnerships', 
                route: '/partnershipManagements/partnerships',
                ImageUrl: '',
            },
            { 
                title: '협력', 
                description: '관광정보 제공 업체와의 협력 관리와 데이터를 관리', 
                key: 'collaborations', 
                route: '/collaborationManagements/collaborations',
                ImageUrl: '',
            },
            
        ],
    }),
    
    async created() {
      var path = document.location.href.split("#/")
      this.urlPath = path[1];

    },
    watch: {
        cards(newCards) {
            this.flipped = new Array(newCards.length).fill(false);
        },
    },

    mounted() {
        var me = this;
        me.components = this.$ManagerLists;
    },

    methods: {
        openSideBar(){
            this.sideBar = !this.sideBar
        },
        changeUrl() {
            var path = document.location.href.split("#/")
            this.urlPath = path[1];
            this.flipped.fill(false);
        },
        goHome() {
            this.urlPath = null;
        },
        flipCard(index) {
            this.$set(this.flipped, index, true);
        },
        unflipCard(index) {
            this.$set(this.flipped, index, false);
        },
    }
};
</script>
<style>
</style>
