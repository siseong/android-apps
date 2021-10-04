package com.github.siseong.apps.instagram.presentation.ui.home.news

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.github.siseong.apps.R


@Composable
fun NewsBody() {
    Column {
        Image(
            painter = painterResource(R.drawable.instagram),
            contentDescription = "NewImage",
            contentScale = ContentScale.FillHeight,
            modifier = Modifier
                .fillMaxWidth()
                .height(360.dp)
        )
        Box(
            modifier = Modifier.padding(horizontal = 7.dp)
                .height(45.dp)
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.align(Alignment.CenterStart)
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_instagram_like),
                    contentDescription = "like new",
                    modifier = Modifier
                        .padding(horizontal = 8.dp, vertical = 3.dp)
                        .size(25.dp)
                )
                Image(
                    painterResource(R.drawable.ic_instagram_comment),
                    contentDescription = "comment new",
                    modifier = Modifier
                        .padding(horizontal = 8.dp, vertical = 3.dp)
                        .size(25.dp)
                )
                Image(
                    painterResource(R.drawable.ic_instagram_message),
                    contentDescription = "message new",
                    modifier = Modifier
                        .padding(horizontal = 8.dp, vertical = 3.dp)
                        .size(25.dp)
                )
            }
            Image(
                painterResource(R.drawable.ic_instagram_horizontal_more),
                contentDescription = "more new",
                modifier = Modifier
                    .padding(horizontal = 8.dp, vertical = 3.dp)
                    .size(25.dp)
                    .align(Alignment.Center)
            )
            Image(
                painterResource(R.drawable.ic_instagram_bookmark),
                contentDescription = "bookmark new",
                modifier = Modifier
                    .padding(horizontal = 8.dp, vertical = 3.dp)
                    .size(30.dp)
                    .align(Alignment.CenterEnd)
            )
        }

    }

    // Images()
    // ImageTail()
}
