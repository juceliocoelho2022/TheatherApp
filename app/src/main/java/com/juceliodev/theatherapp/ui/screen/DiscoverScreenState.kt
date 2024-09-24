package com.juceliodev.theatherapp.ui.screen

import com.juceliodev.theatherapp.data.FeatureMoviesData
import com.juceliodev.theatherapp.data.FeaturedMovieState
import com.juceliodev.theatherapp.data.MovieThumbnailState
import com.juceliodev.theatherapp.data.RecentlyWatchedMoviesData
import com.juceliodev.theatherapp.data.StreamingMoviesData
import com.juceliodev.theatherapp.data.UpcomingMoviesData


data class DiscoverScreenState(
    val featuredMovies: List<FeaturedMovieState> = FeatureMoviesData,
    val upcomingMovies: List<MovieThumbnailState> = UpcomingMoviesData,
    val recentlyWatchedMovies: List<MovieThumbnailState> = RecentlyWatchedMoviesData,
    val streamingMovies: List<MovieThumbnailState> = StreamingMoviesData
)
