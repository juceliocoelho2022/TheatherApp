package com.juceliodev.theatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.juceliodev.theatherapp.ui.screen.DiscoverScreen
import com.juceliodev.theatherapp.ui.screen.DiscoverScreenState
import com.juceliodev.theatherapp.ui.theme.MovieTheaterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            MovieTheaterTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    DiscoverScreen(
                        modifier = Modifier.padding(innerPadding),
                        screenState = DiscoverScreenState()
                    )
                }
            }
        }
    }
}
