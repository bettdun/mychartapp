package com.example.mychartapp.Navigations

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mychartapp.Screens.ChatScreen
import com.example.mychartapp.Screens.HomeScreen
import com.example.mychartapp.Screens.StartScreen


@Composable
fun MainNavigation() {

    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = START_SCREEN){
        composable(START_SCREEN){
            StartScreen(navHostController)
        }
        composable(HOME_SCREEN){
            HomeScreen(navHostController)
        }
        composable(CHAT_SCREEN){
            ChatScreen(navHostController)
        }
    }

}



const val START_SCREEN  = "Start screen"
const val HOME_SCREEN = "Home screen"
const val CHAT_SCREEN = "Char screen"