package com.raazi.wishlist

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun Navigation(viewModel: WishViewModel = viewModel(), navController: NavHostController = rememberNavController()){
NavHost(
    navController = navController,
    startDestination =  Screen.HomeScrren.route
){
    composable(Screen.HomeScrren.route){
        HomeView(viewModel = viewModel, navController = navController)
    }
    composable(Screen.AddScreen.route){
        AddEditDetailView(id = 0L, viewModel = viewModel, navController = navController)
    }
}
}
