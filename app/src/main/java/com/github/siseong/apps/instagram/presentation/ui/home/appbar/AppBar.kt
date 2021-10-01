package com.github.siseong.apps.instagram.presentation.ui.home.appbar

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.siseong.apps.R

@Composable
fun TopAppBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.instagram_logo),
            contentDescription = "Instagram logo",
            modifier = Modifier.padding(top = 15.dp, bottom = 9.dp, start = 15.dp)
        )
        Row(
            horizontalArrangement = Arrangement.End,
            modifier = Modifier.weight(1f)
                .fillMaxHeight()
        ) {
            MenuItem(R.drawable.ic_instagram_add, "add") { }
            MenuItem(R.drawable.ic_instagram_activity, "activity") {}
            MenuItem(R.drawable.ic_instagram_message, "message") {}
        }
    }
}


@Preview
@Composable
fun MenuItem(
    @DrawableRes resId: Int = R.drawable.ic_instagram_add,
    contentDescription: String = "",
    isNew: Boolean = false,
    newCount: Int = 1,
    onClick: () -> Unit = {}
) {
    Image(
        painter = painterResource(resId),
        contentDescription = contentDescription,
        modifier = Modifier
            .clickable { onClick() }
            .size(width = 50.dp, height = 60.dp)
            .padding(12.dp)
    )
}