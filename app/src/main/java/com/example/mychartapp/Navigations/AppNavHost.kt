package com.example.firebaseauth.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mychartapp.Navigations.ROUTE_BOTTOM
import com.example.mychartapp.Navigations.ROUTE_CHART
import com.example.mychartapp.Navigations.ROUTE_HOME
import com.example.mychartapp.Navigations.ROUTE_START
import com.example.mychartapp.Screens.HomeScreen
import com.example.mychartapp.Screens.StartScreen


@Composable
fun BottomNavigationscreen(navController: NavHostController) {
    TODO("Not yet implemented")
}

@Composable
fun AppNavHost(modifier: Modifier.Companion =Modifier, navController: NavHostController = rememberNavController(), startDestination:String= ROUTE_HOME) {

    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_CHART){
            ChartScreen(navController)
        }

        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_START) {
            StartScreen(navController)
        }
        composable(ROUTE_BOTTOM) {
            BottomNavigationscreen(navController)
        }


    }
}

@Composable
fun ChartScreen(navController: NavHostController) {

}

@Preview
@Composable
fun appnavhost() {
    AppNavHost(rememberNavController())

}

fun AppNavHost(modifier: NavHostController) {
    TODO("Not yet implemented")
}


