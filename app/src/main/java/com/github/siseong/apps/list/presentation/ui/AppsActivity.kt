package com.github.siseong.apps.list.presentation.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.github.siseong.apps.R
import com.github.siseong.apps.list.domain.entity.App
import com.github.siseong.apps.list.domain.entity.ImageSource
import com.github.siseong.apps.list.presentation.ui.theme.AppsTheme
import com.github.siseong.apps.instagram.presentation.ui.InstagramActivity
import dagger.hilt.android.AndroidEntryPoint

@ExperimentalFoundationApi
@AndroidEntryPoint
class AppsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppsTheme {
                AppsPreview(apps)
            }
        }
    }

    val apps = listOf(
        App(
            "Instagram",
            "A simple, fun & creative way to capture, edit & share photos, videos & messages with friends & family.",
            ImageSource.LocalImage(R.drawable.instagram)
        ) { startActivity(Intent(this, InstagramActivity::class.java)) },
        App(
            "KaKao Webtoon",
            "Meet the webtoon.",
            ImageSource.LocalImage(R.drawable.kakao_webtoon)
        ),
        App(
            "Zoom",
            "Zoom's secure, reliable video platform powers all of your communication needs, including meetings, chat, phone, webinars, and online events.",
            ImageSource.LocalImage(R.drawable.zoom)
        ),
        App(
            "Linkedin",
            "Manage your professional identity.",
            ImageSource.LocalImage(R.drawable.linkedin)
        ),
        App(
            "GoogleMap",
            "Get real-time navigation and more in the Maps app.",
            ImageSource.LocalImage(R.drawable.googlemap)
        ),
        App(
            "Telegram",
            "Telegram is a cloud-based mobile and desktop messaging app.",
            ImageSource.LocalImage(R.drawable.telegram)
        ),
        App(
            "Netflix",
            "Watch Netflix movies & TV shows online or stream right to your smart TV, game console, PC, Mac, mobile, tablet and more.",
            ImageSource.LocalImage(R.drawable.netflix)
        ),
        App(
            "Google Calendar",
            "Helps you spend less time managing your schedule and more time enjoying it.",
            ImageSource.LocalImage(R.drawable.google_calendar)
        ),
        App(
            "YouTube",
            "Enjoy the videos and music you love, upload original content, and share it all with friends, family, and the world on YouTube.",
            ImageSource.LocalImage(R.drawable.youtube)
        ),
        App(
            "Chrome",
            "Chrome is a fast, secure, free web browser.",
            ImageSource.LocalImage(R.drawable.chrome)
        ),
        App(
            "TikTok",
            "On a device or on the web, viewers can watch and discover millions of personalized short videos.",
            ImageSource.LocalImage(R.drawable.tiktok)
        ),
        App(
            "Amazon",
            "Spend less. Smile more.",
            ImageSource.LocalImage(R.drawable.amazon)
        ),
        App(
            "Spotify",
            "Enjoy ad-free music listening, offline playback, and more.",
            ImageSource.LocalImage(R.drawable.spotify)
        ),
        App(
            "SnapChat",
            "Easily talk with friends, view Live Stories from around the world, and explore news in Discover.",
            ImageSource.LocalImage(R.drawable.snapchat)
        ),
        App(
            "ArtWork",
            "Illustrations, photographs, or other nontextual material prepared for inclusion in a publication.",
            ImageSource.LocalImage(R.drawable.artwork)
        ),
    )
}

