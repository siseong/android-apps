package com.github.siseong.apps.instagram.presentation.ui.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.mvrx.compose.collectAsState
import com.airbnb.mvrx.compose.mavericksViewModel
import com.github.siseong.apps.R
import com.github.siseong.apps.instagram.domain.entity.story.Story
import com.github.siseong.apps.instagram.presentation.ui.home.highlight.HomeStoriesViewModel

@Composable
fun HomeStories() {
    val viewModel: HomeStoriesViewModel = mavericksViewModel()

    val myStory = viewModel.collectAsState { it.myStory }
    val friendStories = viewModel.collectAsState { it.friendStories }

    LazyRow(
        modifier = Modifier.height(120.dp)
            .padding(horizontal = 5.dp)
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
        modifier = Modifier.padding(horizontal = 5.dp)
    ) {
        Card(
            shape = CircleShape,
            border = BorderStroke(2.dp, MaterialTheme.colors.onBackground),
            modifier = Modifier.size(60.dp),
            ) {
            Image(
                painter = story.thumbnailImage.source.toPainter(),
                contentScale = ContentScale.Crop,
                contentDescription = "thumbnail"
            )
        }
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
        modifier = Modifier.padding(horizontal = 5.dp)
    ) {
        Card(
            shape = CircleShape,
            border = BorderStroke(0.2.dp, MaterialTheme.colors.onBackground),
            modifier = Modifier.size(60.dp),
        ) {
            Image(
                painter = story.thumbnailImage.source.toPainter(),
                contentScale = ContentScale.Crop,
                contentDescription = "thumbnail"
            )
        }
        Text(
            text = story.author.name,
            color = MaterialTheme.colors.onBackground,
            fontSize = 12.sp,
            modifier = Modifier.padding(vertical = 5.dp)
        )
    }
}