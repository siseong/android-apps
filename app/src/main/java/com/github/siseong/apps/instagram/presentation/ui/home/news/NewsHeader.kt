package com.github.siseong.apps.instagram.presentation.ui.home.news

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
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
import com.github.siseong.apps.R

@Composable
fun NewsHeader() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
            .height(50.dp)
            .padding(horizontal = 15.dp)
    ) {
        Box(
            modifier = Modifier
                .size(30.dp)
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
                painter = painterResource(R.drawable.instagram),
                contentDescription = "profileImage",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(30.dp)
                    .border(0.3.dp, MaterialTheme.colors.onBackground, CircleShape)
                    .align(Alignment.Center)
            )
        }
        Text(
            text = "Author",
            color = MaterialTheme.colors.onBackground,
            modifier = Modifier.weight(1f)
                .padding(start = 10.dp)
        )
        Image(
            painter = painterResource(R.drawable.ic_more),
            contentDescription = "moreOption"
        )
    }
}
