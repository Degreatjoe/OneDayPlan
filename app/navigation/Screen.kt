package com.example.onedayplan.app.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    data object Today : Screen("today", "Today", Icons.Default.DateRange)
    data object Review : Screen("review", "Review", Icons.Default.Edit)
    data object Settings : Screen("settings", "Settings", Icons.Default.Settings)
}

val topLevelScreens = listOf(
    Screen.Today,
    Screen.Review,
    Screen.Settings
)
