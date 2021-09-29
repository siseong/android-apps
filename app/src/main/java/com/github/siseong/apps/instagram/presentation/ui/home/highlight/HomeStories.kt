package com.github.siseong.apps.instagram.presentation.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.mvrx.compose.collectAsState
import com.airbnb.mvrx.compose.mavericksViewModel
import com.github.siseong.apps.instagram.domain.entity.story.Story
import com.github.siseong.apps.instagram.presentation.ui.home.highlight.HomeStoriesViewModel

@Composable
fun HomeStories() {
    val viewModel: HomeStoriesViewModel = mavericksViewModel()

    val myStory = viewModel.collectAsState { it.myStory }
    val friendStories = viewModel.collectAsState { it.friendStories }

    LazyRow(
        modifier = Modifier.height(120.dp)
    ) {
        items(1 + friendStories.value.size) { index ->
            when (index) {
                0 -> MyStory(myStory.value)
                else -> FriendStory(friendStories.value[index - 1])
            }
        }
    }
}

@Composable
fun MyStory(
    story: Story
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 10.dp)
    ) {
        Image(
            painter = story.thumbnailImage.source.toPainter(),
            contentScale = ContentScale.Crop,
            contentDescription = "thumbnail",
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
                .border(
                    2.dp,
                    Brush.verticalGradient(colors = listOf(Color(0xFFFF6581), Color(0xFFDDCB71))),
                    CircleShape
                )
        )
        Text(
            text = story.title,
            color = MaterialTheme.colors.onBackground,
            fontSize = 12.sp,
            modifier = Modifier.padding(vertical = 5.dp)
        )
    }
}

@Composable
fun FriendStory(
    story: Story
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 10.dp)
    ) {
        Image(
            painter = story.thumbnailImage.source.toPainter(),
            contentScale = ContentScale.Crop,
            contentDescription = "thumbnail",
            modifier = Modifier
                .size(70.dp)
                .clip(CircleShape)
                .border(1.dp, MaterialTheme.colors.onBackground, CircleShape)
        )
        Text(
            text = story.author.name,
            color = MaterialTheme.colors.onBackground,
            fontSize = 12.sp,
            modifier = Modifier.padding(vertical = 5.dp)
        )
    }
}