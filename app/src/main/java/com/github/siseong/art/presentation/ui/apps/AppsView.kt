package com.github.siseong.art.presentation.ui.apps

import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkOut
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.github.siseong.art.domain.entity.App
import com.github.siseong.art.domain.entity.ImageSource
import com.github.siseong.art.presentation.ui.apps.theme.appPreviewShapes
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.launch

@OptIn(ExperimentalAnimationApi::class)
@ExperimentalFoundationApi
@Preview
@Composable
fun AppsPreview(
    viewModel: AppsViewModel = viewModel()
) {
    val appList by viewModel.apps.collectAsState(initial = listOf())
    val state: LazyListState = rememberLazyListState()
    val appPreviewScope = rememberCoroutineScope()
    var visibleApps by remember { mutableStateOf(listOf<Int>()) }
    val column by remember {
        derivedStateOf {
            when (state.layoutInfo.totalItemsCount) {
                0 -> 0
                else -> {
                    appList.size / state.layoutInfo.totalItemsCount + if (appList.size % state.layoutInfo.totalItemsCount > 0) 1 else 0
                }
            }
        }
    }

    Log.d("TAG", visibleApps.toString())

    LazyVerticalGrid(
        cells = GridCells.Adaptive(minSize = 150.dp),
        state = state,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(MaterialTheme.colors.background)
            .padding(horizontal = 1.dp, vertical = 5.dp)
    ) {

        appPreviewScope.launch(Dispatchers.IO) {

            val initJob = launch(Dispatchers.IO) {
                delay(100)
                visibleApps = appList.indices.toList()
            }

            state.interactionSource.interactions
                .filter { it is DragInteraction.Stop }
                .collect { _ ->
                    if (initJob.isActive) initJob.cancel()
                    state.layoutInfo.visibleItemsInfo.fold(mutableListOf<Int>()) { result, info ->
                        result.also {
                            it.addAll((info.index * column until (info.index + 1) * column))
                        }
                    }.let { newList ->
                        if (visibleApps != newList) {
                            visibleApps = newList
                        }
                    }
                    Log.d("TAG", visibleApps.toString())
                }
        }

        itemsIndexed(appList) { index, app ->
            Box(
                modifier = Modifier
                    .height(170.dp)
                    .padding(2.dp)
                    .clip(appPreviewShapes.large)
            ) {
                AnimatedVisibility(
                    visible = visibleApps.contains(index),
                    enter = fadeIn(
                        animationSpec = tween(durationMillis = 100, delayMillis = 100)
                    ) + expandIn(),
                    exit = fadeOut(
                        animationSpec = tween(durationMillis = 100, delayMillis = 100)
                    ) + shrinkOut(),
                    modifier = Modifier.fillMaxSize()
                ) {
                    AppPreview(app = app)
                }
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AppPreview(
    app: App,
) {
    Box(
        contentAlignment = Alignment.BottomCenter,
        modifier = Modifier
            .fillMaxSize()
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
        .fillMaxSize()
)

@Composable
fun AppTitle(
    title: String
) {
    Text(
        text = title,
        color = Color.White,
        style = LocalTextStyle.current.copy(
            shadow = Shadow(
                color = Color.Black,
                offset = Offset(0f, 0f),
                blurRadius = 8f
            ),
            fontWeight = FontWeight.Bold
        ),
        modifier = Modifier.padding(bottom = 1.dp)
    )
}