package com.abhishek_soni.musicplayer

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.OptIn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import com.abhishek_soni.musicapp.ui.theme.MusicAppTheme
import com.abhishek_soni.musicplayer.ui.theme.MusicPlayerTheme
import com.kawaki.musicplayer.navigation.MusicNavigation
import com.kawaki.musicplayer.notification.ACTIONS
import com.kawaki.musicplayer.notification.AudioService
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@ExperimentalMaterial3Api
@UnstableApi
class MainActivity : ComponentActivity() {
    @OptIn(androidx.media3.common.util.UnstableApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            enableEdgeToEdge(
                statusBarStyle = SystemBarStyle.auto(
                    lightScrim = Color.White.toArgb(),
                    darkScrim = Color.Black.toArgb()
                ),
                navigationBarStyle = SystemBarStyle.auto(
                    lightScrim = Color.White.toArgb(),
                    darkScrim = Color.Black.toArgb()
                )
            )
            MusicAppTheme {
                MusicPlayerApp()
            }
            Intent(applicationContext, AudioService::class.java).also {
                it.action = ACTIONS.START.toString()
                startService(it)
            }
        }
    }
}

annotation class UnstableApi

@OptIn(androidx.media3.common.util.UnstableApi::class)
@ExperimentalMaterial3Api
@UnstableApi
@Composable
fun MusicPlayerApp() {
    MusicNavigation()
}

//@ExperimentalMaterial3Api
//@UnstableApi
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    MusicTheme {
//        MusicPlayerApp()
//    }
//}
//
