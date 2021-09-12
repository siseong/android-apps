package com.github.siseong.art.presentation.ui.apps

import androidx.annotation.DrawableRes
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.siseong.art.domain.entity.App
import com.github.siseong.art.domain.entity.ImageSource

@ExperimentalFoundationApi
@Preview
@Composable
fun AppsPreview(
    viewModel: AppsViewModel = viewModel()
) {
    val appList by viewModel.apps.collectAsState(initial = listOf())
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)
            .padding(horizontal = 1.dp, vertical = 5.dp)
    ) {
        items(appList.size) { index ->
            AppPreview(app = appList[index])
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AppPreview(
    app: App
) {
    Box(
        contentAlignment = Alignment.BottomCenter
    ) {
        AppImage(imageSource = app.imageSource, description = app.description)
        AppTitle(app.title)
    }
}

@Composable
fun AppImage(
    imageSource: ImageSource,
    description: String
) {
    when (imageSource) {
        is ImageSource.LocalImage -> AppLocalImage(
            resId = imageSource.resId,
            description = description
        )
        is ImageSource.RemoteImage -> TODO("Not yet implemented")
    }
}

@Composable
fun AppLocalImage(
    @DrawableRes resId: Int,
    description: String
) = Image(
    painter = painterResource(id = resId),
    contentDescription = description,
    contentScale = ContentScale.Crop,
    modifier = Modifier
        .fillMaxWidth()
        .height(150.dp)
)

@Composable
fun AppTitle(
    title: String
) {
    Text(
        text = title,
        color = MaterialTheme.colors.onPrimary,
        style = LocalTextStyle.current.copy(
            shadow = Shadow(
                color = MaterialTheme.colors.primary,
                offset = Offset(0f, 0f),
                blurRadius = 8f
            ),
            fontWeight = FontWeight.Bold
        ),
        modifier = Modifier.padding(bottom = 1.dp)
    )
}