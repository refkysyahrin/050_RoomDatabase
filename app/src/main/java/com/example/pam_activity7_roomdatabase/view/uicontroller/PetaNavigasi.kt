package com.example.pam_activity7_roomdatabase.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pam_activity7_roomdatabase.view.EntrySiswaScreen
import com.example.pam_activity7_roomdatabase.view.HomeScreen
import com.example.pam_activity7_roomdatabase.view.route.DestinasiEntry
import com.example.pam_activity7_roomdatabase.view.route.DestinasiHome

@Composable
fun SiswaApp(
    modifier: Modifier = Modifier,
) {
    val navController: NavHostController = rememberNavController()
    HostNavigasi(navController = navController)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ) {
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route) },
            )
        }
        composable(DestinasiEntry.route) {
            EntrySiswaScreen(
                navigateBack = { navController.popBackStack() }
            )
        }
    }
}