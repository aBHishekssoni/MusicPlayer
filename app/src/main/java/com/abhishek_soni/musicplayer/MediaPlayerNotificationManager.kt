//package com.abhishek_soni.musicplayer
//
//import android.app.PendingIntent
//import android.content.Context
//import android.graphics.Bitmap
//import android.support.v4.media.session.MediaControllerCompat
//import android.support.v4.media.session.MediaSessionCompat
//import androidx.annotation.OptIn
//import androidx.media3.common.Player
//import androidx.media3.common.util.UnstableApi
//import androidx.media3.ui.PlayerNotificationManager
//
//@UnstableApi
//internal class MediaPlayerNotificationManager @OptIn(UnstableApi::class) constructor
//    (
//    context: Context,
//    sessionToken: MediaSessionCompat.Token,
//    notificationListener: PlayerNotificationManager.NotificationListener
//){
//        private var notificationManager:PlayerNotificationManager
//            get() {
//                TODO()
//            }
//    init {
//        val mediaController = MediaControllerCompat(context, sessionToken)
//        val builder = PlayerNotificationManager.Builder(context,
//            Constants.PLAYBACK_NOTIFICATION_ID.toInt(),
//            Constants.PLAYBACK_NOTIFICATION_CHANNEL_ID
//        )
//    with(builder){
//        setMediaDescriptionAdapter(DescriptionAdaptor(mediaController))
//        setNotificationListener(notificationListener)
//        setChannelNameResourceId(R.string.notification_channel)
//        setChannelDescriptionResourceId(R.string.notification_channel_description)
//    }
//    notificationManager = builder.build()
//    with(notificationManager){
//        setMediaSessionToken(sessionToken)
//        setSmallIcon(R.drawable.baseline_music_note_24)
//        setUseRewindAction(false)
//        setUseFastForwardAction(false)
//    }
//
//    fun hideNotification(){
//        notificationManager.setPlayer(null)
//    }
//    fun showNotification(){
//        notificationManager.setPlayer(player)
//    }
//
//    inner class DescriptionAdaptor(private val controller: MediaControllerCompat):
//            PlayerNotificationManager.MediaDescriptionAdapter{
//        override fun getCurrentContentTitle(player: Player): CharSequence =
//            controller.metadata.description.title.toString()
//
//
//        override fun createCurrentContentIntent(player: Player): PendingIntent? =
//            controller.sessionActivity
//
//        override fun getCurrentContentText(player: Player): CharSequence? =
//            controller.metadata.description.subtitle
//
//        override fun getCurrentLargeIcon(
//            player: Player,
//            callback: PlayerNotificationManager.BitmapCallback
//        ): Bitmap? {
//            return null
//        }
//
//    }
//
//    }
//}
//
