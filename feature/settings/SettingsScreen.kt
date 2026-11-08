package com.example.onedayplan.feature.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.onedayplan.core.common.AsyncResult

@Composable
fun SettingsRoute(
    modifier: Modifier = Modifier,
    viewModel: SettingsViewModel = hiltViewModel()
) {
    val isDarkModeState by viewModel.isDarkMode.collectAsStateWithLifecycle()
    SettingsScreen(
        isDarkModeState = isDarkModeState,
        onToggleDarkMode = viewModel::toggleDarkMode,
        modifier = modifier
    )
}

@Composable
fun SettingsScreen(
    isDarkModeState: AsyncResult<Boolean>,
    onToggleDarkMode: (Boolean) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        when (isDarkModeState) {
            is AsyncResult.Loading -> {
                CircularProgressIndicator()
            }
            is AsyncResult.Error -> {
                Text(
                    text = "Error loading settings.",
                    color = MaterialTheme.colorScheme.error
                )
            }
            is AsyncResult.Success -> {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Settings",
                        style = MaterialTheme.typography.headlineMedium
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "Dark Mode",
                            style = MaterialTheme.typography.bodyLarge,
                            modifier = Modifier.padding(end = 8.dp)
                        )
                        Switch(
                            checked = isDarkModeState.data,
                            onCheckedChange = onToggleDarkMode
                        )
                    }
                }
            }
        }
    }
}
