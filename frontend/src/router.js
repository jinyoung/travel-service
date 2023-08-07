
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import RecommendationAndBookingTravelManager from "./components/listers/RecommendationAndBookingTravelCards"
import RecommendationAndBookingTravelDetail from "./components/listers/RecommendationAndBookingTravelDetail"

import CustomerSupportSupportManager from "./components/listers/CustomerSupportSupportCards"
import CustomerSupportSupportDetail from "./components/listers/CustomerSupportSupportDetail"

import PartnershipManagementPartnershipManager from "./components/listers/PartnershipManagementPartnershipCards"
import PartnershipManagementPartnershipDetail from "./components/listers/PartnershipManagementPartnershipDetail"

import CollaborationManagementCollaborationManager from "./components/listers/CollaborationManagementCollaborationCards"
import CollaborationManagementCollaborationDetail from "./components/listers/CollaborationManagementCollaborationDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/recommendationAndBookings/travels',
                name: 'RecommendationAndBookingTravelManager',
                component: RecommendationAndBookingTravelManager
            },
            {
                path: '/recommendationAndBookings/travels/:id',
                name: 'RecommendationAndBookingTravelDetail',
                component: RecommendationAndBookingTravelDetail
            },

            {
                path: '/customerSupports/supports',
                name: 'CustomerSupportSupportManager',
                component: CustomerSupportSupportManager
            },
            {
                path: '/customerSupports/supports/:id',
                name: 'CustomerSupportSupportDetail',
                component: CustomerSupportSupportDetail
            },

            {
                path: '/partnershipManagements/partnerships',
                name: 'PartnershipManagementPartnershipManager',
                component: PartnershipManagementPartnershipManager
            },
            {
                path: '/partnershipManagements/partnerships/:id',
                name: 'PartnershipManagementPartnershipDetail',
                component: PartnershipManagementPartnershipDetail
            },

            {
                path: '/collaborationManagements/collaborations',
                name: 'CollaborationManagementCollaborationManager',
                component: CollaborationManagementCollaborationManager
            },
            {
                path: '/collaborationManagements/collaborations/:id',
                name: 'CollaborationManagementCollaborationDetail',
                component: CollaborationManagementCollaborationDetail
            },



    ]
})
