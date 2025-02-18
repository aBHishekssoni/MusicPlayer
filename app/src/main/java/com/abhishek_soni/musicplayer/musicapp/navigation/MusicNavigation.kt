package com.kawaki.musicplayer.navigation

import android.window.SplashScreen
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.media3.common.util.UnstableApi
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.abhishek_soni.musicplayer.ui.screen.RequestPermissionScreen
import com.abhishek_soni.musicplayer.ui.screen.SplashScreen_
//import com.kawaki.musicplayer.ui.screens.RequestPermissionScreen
//import com.kawaki.musicplayer.ui.screens.SplashScreen
import com.kawaki.musicplayer.ui.screens.home.HomeScreen

@UnstableApi
@ExperimentalMaterial3Api
@Composable
fun MusicNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavScreens.SPLASHSCREEN.name
    ) {
        composable(NavScreens.SPLASHSCREEN.name) {
            SplashScreen_(navController = navController)
        }
        composable(NavScreens.REQUESTPERMISSIONSCREEN.name) {
            RequestPermissionScreen(navController = navController)
        }
        composable(NavScreens.HOMESCREEN.name) {
            HomeScreen()
        }
    }
}