package com.juceliodev.theatherapp.ui.components.section

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.juceliodev.theatherapp.data.MovieThumbnailState
import com.juceliodev.theatherapp.ui.components.MovieThumbnail
import com.juceliodev.theatherapp.ui.components.SectionHeader

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ComingSoonSection(
    modifier: Modifier = Modifier,
    data: List<MovieThumbnailState>
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SectionHeader(
            text = "Em breve"
        )
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(18.dp),
            horizontalArrangement = Arrangement.spacedBy(18.dp),
            maxItemsInEachRow = 2
        ) {
            data.onEach { thumbnail ->
                MovieThumbnail(
                    img = thumbnail.img,
                    modifier = Modifier.weight(weight = 1f)
                )
            }
        }
    }

}