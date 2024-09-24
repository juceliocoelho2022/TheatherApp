package com.juceliodev.theatherapp.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.juceliodev.theatherapp.ui.components.section.ComingSoonSection
import com.juceliodev.theatherapp.ui.components.section.FeaturedMoviesSection
import com.juceliodev.theatherapp.ui.components.section.HorizontalSection

@Composable
fun DiscoverScreen(
    modifier: Modifier = Modifier,
    screenState: DiscoverScreenState
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .verticalScroll(scrollState)
            .padding(vertical = 24.dp),
        verticalArrangement = Arrangement.spacedBy(32.dp)
    ) {
        FeaturedMoviesSection(
            data = screenState.featuredMovies
        )
        ComingSoonSection(
            data = screenState.upcomingMovies,
            modifier = Modifier.padding(horizontal = 18.dp)
        )
        HorizontalSection(
            data = screenState.recentlyWatchedMovies,
            name = "Assistido recentemente"
        )
        HorizontalSection(
            data = screenState.streamingMovies,
            name = "Transmissão sob demanda"
        )
    }
}