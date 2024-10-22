//package com.abhishek_soni.musicplayer
//
//import android.content.Context
//import android.media.AudioAttributes
//import androidx.annotation.OptIn
//import androidx.media3.common.C
//import androidx.media3.common.util.UnstableApi
//import androidx.media3.database.StandaloneDatabaseProvider
//import androidx.media3.datasource.DefaultDataSource
//import androidx.media3.datasource.cache.CacheDataSource
//import androidx.media3.datasource.cache.LeastRecentlyUsedCacheEvictor
//import androidx.media3.datasource.cache.NoOpCacheEvictor
//import androidx.media3.datasource.cache.SimpleCache
//import androidx.media3.exoplayer.ExoPlayer
//import dagger.Module
//import dagger.Provides
//import dagger.hilt.InstallIn
//import dagger.hilt.android.components.ServiceComponent
//import dagger.hilt.android.qualifiers.ApplicationContext
//import dagger.hilt.android.scopes.ServiceScoped
//import dagger.hilt.components.SingletonComponent
//import java.io.File
//
//@Module
//@InstallIn(ServiceComponent::class)
//object ServiceModule {
//
//
//    @Provides
//    @ServiceScoped
//    fun provideAudioAttributes(): AudioAttributes =
//        AudioAttributes.Builder()
//            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
//            .setUsage(AudioAttributes.USAGE_MEDIA)
//            .build()
//
//    @Provides
//    @ServiceScoped
//    fun provideExoPlayer(
//        @ApplicationContext context: Context,
//        audioAttributes: AudioAttributes
//    ):ExoPlayer = ExoPlayer.Builder(context)
//        .build()
//        .apply{
//            setAudioAttributes(audioAttributes,true)
//            setHandleAudioBecomingNoisy(true)
//        }
//
//    @Provides
//    @ServiceScoped
//    fun provideDataSourceFactory(
//        @ApplicationContext context: Context
//    ) = DefaultDataSource.Factory(context)
//
//    @Provides
//    @ServiceScoped
//    @OptIn(UnstableApi::class)
//    fun provideCacheDataSourceFactory(
//        @ApplicationContext context: Context,
//        dataSource: DefaultDataSource.Factory
//    ) : CacheDataSource.Factory{
//        val cacheDir = File(context.cacheDir,"media")
//        val databaseProvider = StandaloneDatabaseProvider(context)
//        val cache = SimpleCache(cacheDir,NoOpCacheEvictor(),databaseProvider)
//        return CacheDataSource.Factory().apply {
//            setCache(cache)
//            setUpstreamDataSourceFactory(dataSource)
//        }
//    }
//
////2...8.16
//}