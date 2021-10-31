package com.github.siseong.apps.instagram.presentation.ui.home.news

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.mvrx.compose.collectAsState
import com.airbnb.mvrx.compose.mavericksViewModel
import com.github.siseong.apps.instagram.R
import com.github.siseong.apps.instagram.domain.entity.common.Comment
import com.github.siseong.apps.instagram.domain.entity.common.Image
import com.github.siseong.apps.instagram.domain.entity.common.MediumSource
import com.github.siseong.apps.instagram.domain.entity.common.Profile
import com.github.siseong.apps.instagram.domain.entity.post.Post
import com.github.siseong.apps.instagram.domain.entity.profile.Author
import com.github.siseong.apps.instagram.presentation.ui.home.HomeStoryDivider
import com.github.siseong.apps.instagram.presentation.ui.home.highlight.HomeStories
import java.util.concurrent.TimeUnit

@Composable
fun HomeNews() {

    val newsViewModel: NewsViewModel = mavericksViewModel()
    val news = newsViewModel.collectAsState { it.posts }

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(10.dp),
        modifier = Modifier
            .fillMaxSize()
    ) {
        item{
            HomeStories()
            HomeStoryDivider()
        }
        items(3) { index ->
            New(
                Post(
                    author = Author(
                        name = "Instagram",
                        photo = Image(MediumSource.Local(R.drawable.instagram))
                    ),
                    media = listOf(Image(MediumSource.Local(R.drawable.instagram))),
                    comments = listOf(
                        Comment(
                            profile = Profile(
                                "Instagram",
                                "instagram",
                                listOf(Image(MediumSource.Local(R.drawable.instagram))),
                                "url",
                                "bio"
                            ),
                            R.string.instaram_description,
                            false
                        )
                    ),
                    "aaaa",
                    true,
                    1,
                    false,
                    System.currentTimeMillis() - TimeUnit.HOURS.toMillis(1L)
                )
            )
        }
    }
}

@Composable
fun New(
    post: Post
) {
    Column {
        NewsHeader(post.author)
        NewsBody(post.media)
        NewsFooter(post.comments)
    }
}
