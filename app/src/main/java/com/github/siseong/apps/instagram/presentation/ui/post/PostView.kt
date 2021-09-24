package com.github.siseong.apps.instagram.presentation.ui.post

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.mvrx.compose.collectAsState
import com.airbnb.mvrx.compose.mavericksViewModel
import com.github.siseong.apps.R

@Composable
fun Post() {
    val viewModel: PostViewModel = mavericksViewModel()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.height(60.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(R.drawable.instagram_logo),
                contentDescription = "Instagram logo",
                modifier = Modifier.padding(horizontal = 15.dp, vertical = 15.dp)
            )
            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier.weight(1f)
                    .fillMaxHeight()
            ) {
                MenuItem(R.drawable.ic_instagram_add, "add", {})
                MenuItem(R.drawable.ic_instagram_activity, "activity", {})
                MenuItem(R.drawable.ic_instagram_message, "message", {})
            }
        }
        Box(
            modifier = Modifier.weight(1f)
        ) {
            PostBody(viewModel.collectAsState { it.count.toString() }.value)
        }
    }
}

@Preview
@Composable
fun MenuItem(
    @DrawableRes resId: Int = R.drawable.ic_instagram_add,
    contentDescription: String = "",
    onClick: () -> Unit = {}
) {
    Image(
        painter = painterResource(resId),
        contentDescription = contentDescription,
        modifier = Modifier
            .clickable { onClick() }
            .size(width = 50.dp, height = 60.dp)
            .padding(horizontal = 12.dp, vertical = 15.dp)
    )
}