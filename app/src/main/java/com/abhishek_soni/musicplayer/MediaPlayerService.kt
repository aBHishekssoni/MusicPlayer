//package com.abhishek_soni.musicplayer
//
//import android.os.Bundle
//import android.service.media.MediaBrowserService
//import android.support.v4.media.MediaBrowserCompat
//import android.support.v4.media.session.MediaSessionCompat
//import androidx.media.MediaBrowserServiceCompat
//import androidx.media3.common.util.UnstableApi
//import androidx.media3.datasource.cache.CacheDataSource
//import androidx.media3.exoplayer.ExoPlayer
//import dagger.hilt.android.AndroidEntryPoint
//import kotlinx.coroutines.CoroutineScope
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.SupervisorJob
//import javax.inject.Inject
//
//
//@UnstableApi
//@AndroidEntryPoint
//class MediaPlayerService:MediaBrowserServiceCompat() {
//
//    @Inject
//    lateinit var dataSourceFactory: CacheDataSource.Factory
//
//    @Inject
//    lateinit var exoPlayer: ExoPlayer
//
//    @Inject
//    lateinit var mediaSource: MediaSource
//
//    private val serviceJob = SupervisorJob()
//    private val serviceScope = CoroutineScope(Dispatchers.Main + serviceJob)
//
//    private lateinit var mediaSession: MediaSessionCompat
//
//    private lateinit var mediaSessionConnector: MediaSessionConnector
//
//    override fun onGetRoot(
//        clientPackageName: String,
//        clientUid: Int,
//        rootHints: Bundle?
//    ): BrowserRoot {
//        return BrowserRoot(Constants.MEDIA_ROOT_ID,null)
//    }
//
//    override fun onLoadChildren(
//        parentId: String,
//        result: Result<MutableList<MediaBrowserCompat.MediaItem>>
//    ) {
//        TODO("Not yet implemented")
//    }
//}
//
//
