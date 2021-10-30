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
import com.github.siseong.apps.instagram.domain.entity.post.Post
import com.github.siseong.apps.instagram.presentation.ui.home.HomeStoryDivider
import com.github.siseong.apps.instagram.presentation.ui.home.highlight.HomeStories

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
        items(news.value.size) { index ->
            New(news.value[index])
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
