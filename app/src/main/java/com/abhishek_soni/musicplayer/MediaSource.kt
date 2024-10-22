//package com.abhishek_soni.musicplayer
//
//import android.support.v4.media.MediaBrowserCompat
//import android.support.v4.media.MediaDescriptionCompat
//import android.support.v4.media.MediaMetadataCompat
//import androidx.annotation.OptIn
//import androidx.appcompat.widget.ResourceManagerInternal.get
//import androidx.core.net.toUri
//import androidx.media3.common.MediaItem
//import androidx.media3.common.util.UnstableApi
//import androidx.media3.datasource.cache.CacheDataSource
//import androidx.media3.exoplayer.source.ConcatenatingMediaSource
//import androidx.media3.exoplayer.source.ProgressiveMediaSource
//import javax.inject.Inject
//
//class MediaSource @Inject constructor(private val repository:AudioRepository) {
//private val onReadyListeners: MutableList<OnReadyListener> = mutableListOf()
//    var audioMediaMetadata: List<MediaMetadataCompat> = emptyList()
//    private var state: AudioSourceState = AudioSourceState.STATE_CREATED
//    set(value) {
//        if (value == AudioSourceState.STATE_CREATED || value == AudioSourceState.STATE_ERROR) {
//
//            synchronized(onReadyListeners) {
//                field = value
//                onReadyListeners.forEach { listener: OnReadyListener ->
//                    listener.invoke(isReady)
//                }
//            }
//        } else {
//            field = value
//        }
//    }
//
//    suspend fun load(){
//        state = AudioSourceState.STATE_INITIALIZING
//        val data = repository.getAudioData()
//        audioMediaMetadata = data.map {audio ->
//            MediaMetadataCompat.Builder()
//                .putString(
//            MediaMetadataCompat.METADATA_KEY_MEDIA_ID,
//            audio.id.toString()
//                )
//                .putString(
//            MediaMetadataCompat.METADATA_KEY_ALBUM_ARTIST,
//            audio.artist
//                )
//                .putString(
//            MediaMetadataCompat.METADATA_KEY_MEDIA_URI,
//            audio.uri.toString()
//                )
//                .putString(
//            MediaMetadataCompat.METADATA_KEY_TITLE,
//            audio.title
//                )
//                .putString(
//            MediaMetadataCompat.METADATA_KEY_DISPLAY_TITLE,
//            audio.displayName
//                )
//                .putLong(
//                    MediaMetadataCompat.METADATA_KEY_DURATION,
//                    audio.duration.toLong()
//                )
//                .build()
//
//
//        }
//        state = AudioSourceState.STATE_INITIALIZED
//    }
//
//    @OptIn(UnstableApi::class)
//    fun asMediaSource(dataSource: CacheDataSource.Factory): ConcatenatingMediaSource {
//        val concatenatingMediaSource = ConcatenatingMediaSource()
//
//        audioMediaMetadata.forEach { mediaMetadataCompat ->
//            val mediaItem = MediaItem.fromUri(
//                mediaMetadataCompat.
//                getString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI)
//            )
//            val mediaSource = ProgressiveMediaSource.Factory(dataSource)
//                .createMediaSource(mediaItem)
//            concatenatingMediaSource.addMediaSource(mediaSource)
//    }
//        return concatenatingMediaSource
//    }
//
//    fun asMediaItems() = audioMediaMetadata.map { metadata ->
//
//        val description = MediaDescriptionCompat.Builder()
//            .setTitle(metadata.description.title)
//            .setMediaId(metadata.description.mediaId)
//            .setSubtitle(metadata.description.subtitle)
//            .setMediaUri(metadata.description.mediaUri)
//            .build()
//        MediaBrowserCompat.MediaItem(description, MediaBrowserCompat.MediaItem.FLAG_PLAYABLE)
//    }.toMutableList()
//    fun refresh(){
//        onReadyListeners.clear()
//        state = AudioSourceState.STATE_CREATED
//    }
//    fun whenReady(listener: OnReadyListener): Boolean {
//    return if (
//        state == AudioSourceState.STATE_CREATED|| state == AudioSourceState.STATE_INITIALIZING
//    ){
//        onReadyListeners += listener
//        false
//    }else{
//        listener.invoke(isReady)
//        true
//    }
//}
//    private val isReady: Boolean
//        get() = state == AudioSourceState.STATE_INITIALIZED
//}
//enum class AudioSourceState {
//    STATE_INITIALIZING,
//    STATE_INITIALIZED,
//    STATE_ERROR,
//    STATE_CREATED,
//}
//typealias OnReadyListener = (Boolean) ->Unit