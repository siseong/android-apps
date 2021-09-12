package com.github.siseong.art.data

import com.github.siseong.art.R
import com.github.siseong.art.domain.entity.App
import com.github.siseong.art.domain.entity.ImageSource
import com.github.siseong.art.domain.repository.AppRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor() : AppRepository {
    override fun getAppsFlow(): Flow<List<App>> {
        // TODO(Below is flow Example)
        return flow {
            emit(
                listOf(
                    App(
                        "Instagram",
                        "A simple, fun & creative way to capture, edit & share photos, videos & messages with friends & family.",
                        ImageSource.LocalImage(R.drawable.instagram)
                    ),
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
                )
            )
        }
    }
}