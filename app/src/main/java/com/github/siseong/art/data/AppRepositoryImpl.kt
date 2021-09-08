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
                        "Share Everyday Moments",
                        ImageSource.LocalImage(R.drawable.instagram)
                    ),
                    App(
                        "KaKao Webtoon",
                        "Meet the webtoon",
                        ImageSource.LocalImage(R.drawable.kakao_webtoon)
                    )
                )
            )
        }
    }
}