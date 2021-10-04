package com.github.siseong.apps.list.presentation.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.ui.res.stringResource
import com.github.siseong.apps.R
import com.github.siseong.apps.instagram.presentation.ui.InstagramActivity
import com.github.siseong.apps.list.domain.entity.App
import com.github.siseong.apps.list.domain.entity.ImageSource
import com.github.siseong.apps.list.presentation.ui.theme.AppsTheme
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalFoundationApi
@AndroidEntryPoint
class AppsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppsTheme {
                val apps = listOf(
                    App(
                        stringResource(R.string.instaram),
                        stringResource(R.string.instaram_description),
                        ImageSource.LocalImage(R.drawable.instagram)
                    ) { startActivity(Intent(this, InstagramActivity::class.java)) },
                    App(
                        stringResource(R.string.kakao_webtoon),
                        stringResource(R.string.kakao_webtoon_description),
                        ImageSource.LocalImage(R.drawable.kakao_webtoon)
                    ),
                    App(
                        stringResource(R.string.zoom),
                        stringResource(R.string.zoom_description),
                        ImageSource.LocalImage(R.drawable.zoom)
                    ),
                    App(
                        stringResource(R.string.linkdin),
                        stringResource(R.string.linkedin_description),
                        ImageSource.LocalImage(R.drawable.linkedin)
                    ),
                    App(
                        stringResource(R.string.google_map),
                        stringResource(R.string.google_map_description),
                        ImageSource.LocalImage(R.drawable.googlemap)
                    ),
                    App(
                        stringResource(R.string.telegram),
                        stringResource(R.string.telegram_description),
                        ImageSource.LocalImage(R.drawable.telegram)
                    ),
                    App(
                        stringResource(R.string.netflix),
                        stringResource(R.string.netflix_description),
                        ImageSource.LocalImage(R.drawable.netflix)
                    ),
                    App(
                        stringResource(R.string.google_calendar),
                        stringResource(R.string.google_calendar_description),
                        ImageSource.LocalImage(R.drawable.google_calendar)
                    ),
                    App(
                        stringResource(R.string.youtube),
                        stringResource(R.string.youtube_description),
                        ImageSource.LocalImage(R.drawable.youtube)
                    ),
                    App(
                        stringResource(R.string.chrome),
                        stringResource(R.string.chrome_description),
                        ImageSource.LocalImage(R.drawable.chrome)
                    ),
                    App(
                        stringResource(R.string.tiktok),
                        stringResource(R.string.tiktok_description),
                        ImageSource.LocalImage(R.drawable.tiktok)
                    ),
                    App(
                        stringResource(R.string.amazon),
                        stringResource(R.string.amazon_description),
                        ImageSource.LocalImage(R.drawable.amazon)
                    ),
                    App(
                        stringResource(R.string.spotify),
                        stringResource(R.string.spotify_description),
                        ImageSource.LocalImage(R.drawable.spotify)
                    ),
                    App(
                        stringResource(R.string.snapchat),
                        stringResource(R.string.snachat_description),
                        ImageSource.LocalImage(R.drawable.snapchat)
                    ),
                    App(
                        stringResource(R.string.artwork),
                        stringResource(R.string.artwork_description),
                        ImageSource.LocalImage(R.drawable.artwork)
                    ),
                )

                AppsPreview(apps)
            }
        }
    }
}

