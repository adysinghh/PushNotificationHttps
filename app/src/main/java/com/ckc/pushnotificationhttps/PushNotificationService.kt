package com.ckc.pushnotificationhttps

import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class PushNotificationService: FirebaseMessagingService(){

    override fun onNewToken(token: String)
    {
        super.onNewToken(token)
        //Update Server
    }

    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        //Response to received messages
    }


}