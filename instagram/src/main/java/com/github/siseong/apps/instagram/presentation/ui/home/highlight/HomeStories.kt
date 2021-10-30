package com.github.siseong.apps.instagram.presentation.ui.home.highlight

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.airbnb.mvrx.compose.collectAsState
import com.airbnb.mvrx.compose.mavericksViewModel
import com.github.siseong.apps.instagram.R
import com.github.siseong.apps.instagram.domain.entity.story.Story

@Composable
fun HomeStories() {
    val viewModel: HomeStoriesViewModel = mavericksViewModel()

    val myStory = viewModel.collectAsState { it.myStory }
    val friendStories = viewModel.collectAsState { it.friendStories }

    LazyRow(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.height(110.dp)
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
        modifier = Modifier.padding(horizontal = 6.dp)
    ) {
        Box(
            modifier = Modifier.size(70.dp)
        ) {
            Image(
                painter = story.thumbnailImage.source.toPainter(),
                contentScale = ContentScale.Crop,
                contentDescription = "thumbnail",
                modifier = Modifier
                    .size(65.dp)
                    .clip(CircleShape)
                    .align(Alignment.Center)
            )
            Box(
                modifier = Modifier
                    .size(20.dp)
                    .align(Alignment.BottomEnd)
                    .clip(CircleShape)
                    .background(MaterialTheme.colors.background)
            ) {
                Box(
                    modifier = Modifier.size(15.dp)
                        .clip(CircleShape)
                        .background(Color.White)
                        .align(Alignment.Center)
                )
                Image(
                    painter = painterResource(R.drawable.ic_instagram_profile_add),
                    contentDescription = "add profile",
                )
            }
        }

        Text(
            text = story.title,
            color = MaterialTheme.colors.onBackground,
            fontSize = 12.sp,
            modifier = Modifier.padding(top = 5.dp)
        )
    }
}

@Composable
fun FriendStory(
    story: Story
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(horizontal = 6.dp)
    ) {
        Box(
            modifier = Modifier
                .size(70.dp)
        ) {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .fillMaxSize()
                    .border(
                        2.dp,
                        Brush.verticalGradient(
                            colors = listOf(
                                Color(0xFFFF6581),
                                Color(0xFFDDCB71)
                            )
                        ),
                        CircleShape
                    )
                    .align(Alignment.Center)
            )

            Image(
                painter = story.thumbnailImage.source.toPainter(),
                contentScale = ContentScale.Crop,
                contentDescription = "thumbnail",
                modifier = Modifier
                    .clip(CircleShape)
                    .size(60.dp)
                    .border(0.3.dp, MaterialTheme.colors.onBackground, CircleShape)
                    .align(Alignment.Center)
            )
        }

        Text(
            text = story.author.name,
            color = MaterialTheme.colors.onBackground,
            fontSize = 12.sp,
            modifier = Modifier.padding(top = 5.dp)
        )
    }
}