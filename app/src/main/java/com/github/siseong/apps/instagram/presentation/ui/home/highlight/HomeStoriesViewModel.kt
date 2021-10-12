package com.github.siseong.apps.instagram.presentation.ui.home.highlight

import com.airbnb.mvrx.MavericksViewModel
import com.airbnb.mvrx.MavericksViewModelFactory
import com.airbnb.mvrx.ViewModelContext
import com.github.siseong.apps.R
import com.github.siseong.apps.instagram.domain.entity.common.Image
import com.github.siseong.apps.instagram.domain.entity.common.MediumSource
import com.github.siseong.apps.instagram.domain.entity.common.Video
import com.github.siseong.apps.instagram.domain.entity.home.HomeStoriesState
import com.github.siseong.apps.instagram.domain.entity.profile.Author
import com.github.siseong.apps.instagram.domain.entity.story.Story

class HomeStoriesViewModel(
    initialState: HomeStoriesState
) : MavericksViewModel<HomeStoriesState>(initialState) {

    companion object : MavericksViewModelFactory<HomeStoriesViewModel, HomeStoriesState> {

        override fun initialState(viewModelContext: ViewModelContext): HomeStoriesState {
            return HomeStoriesState(
                myStory = Story(
                    title = "Your Story",
                    author = Author(
                        "siseong",
                        Image(MediumSource.Local(R.drawable.ic_profile_checked))
                    ),
                    thumbnailImage = Image(MediumSource.Local(R.drawable.instagram)),
                    video = Video(
                        MediumSource.Remote(""),
                        timeLengthSec = 60
                    )
                ),
                friendStories = listOf(
                    Story(
                        title = "title1",
                        author = Author(
                            "WebToon",
                            Image(MediumSource.Local(R.drawable.ic_profile_checked))
                        ),
                        thumbnailImage = Image(MediumSource.Local(R.drawable.kakao_webtoon)),
                        video = Video(
                            MediumSource.Remote(""),
                            timeLengthSec = 60
                        )
                    ),
                    Story(
                        title = "title1",
                        author = Author(
                            "Netflix",
                            Image(MediumSource.Local(R.drawable.ic_profile_checked))
                        ),
                        thumbnailImage = Image(MediumSource.Local(R.drawable.netflix)),
                        video = Video(
                            MediumSource.Remote(""),
                            timeLengthSec = 60
                        )
                    ),
                    Story(
                        title = "title1",
                        author = Author(
                            "Zoom",
                            Image(MediumSource.Local(R.drawable.ic_profile_checked))
                        ),
                        thumbnailImage = Image(MediumSource.Local(R.drawable.zoom)),
                        video = Video(
                            MediumSource.Remote(""),
                            timeLengthSec = 60
                        )
                    ),
                    Story(
                        title = "title1",
                        author = Author(
                            "Amazon",
                            Image(MediumSource.Local(R.drawable.ic_profile_checked))
                        ),
                        thumbnailImage = Image(MediumSource.Local(R.drawable.amazon)),
                        video = Video(
                            MediumSource.Remote(""),
                            timeLengthSec = 60
                        )
                    ),
                    Story(
                        title = "title1",
                        author = Author(
                            "Spotify",
                            Image(MediumSource.Local(R.drawable.ic_profile_checked))
                        ),
                        thumbnailImage = Image(MediumSource.Local(R.drawable.spotify)),
                        video = Video(
                            MediumSource.Remote(""),
                            timeLengthSec = 60
                        )
                    ),
                    Story(
                        title = "title1",
                        author = Author(
                            "TikTok",
                            Image(MediumSource.Local(R.drawable.ic_profile_checked))
                        ),
                        thumbnailImage = Image(MediumSource.Local(R.drawable.tiktok)),
                        video = Video(
                            MediumSource.Remote(""),
                            timeLengthSec = 60
                        )
                    ),
                    Story(
                        title = "title1",
                        author = Author(
                            "YouTube",
                            Image(MediumSource.Local(R.drawable.ic_profile_checked))
                        ),
                        thumbnailImage = Image(MediumSource.Local(R.drawable.youtube)),
                        video = Video(
                            MediumSource.Remote(""),
                            timeLengthSec = 60
                        )
                    ),
                    Story(
                        title = "title1",
                        author = Author(
                            "Chrome",
                            Image(MediumSource.Local(R.drawable.ic_profile_checked))
                        ),
                        thumbnailImage = Image(MediumSource.Local(R.drawable.chrome)),
                        video = Video(
                            MediumSource.Remote(""),
                            timeLengthSec = 60
                        )
                    ),
                    Story(
                        title = "title1",
                        author = Author(
                            "GoogleMap",
                            Image(MediumSource.Local(R.drawable.ic_profile_checked))
                        ),
                        thumbnailImage = Image(MediumSource.Local(R.drawable.googlemap)),
                        video = Video(
                            MediumSource.Remote(""),
                            timeLengthSec = 60
                        )
                    ),
                    Story(
                        title = "title1",
                        author = Author(
                            "Telegram",
                            Image(MediumSource.Local(R.drawable.ic_profile_checked))
                        ),
                        thumbnailImage = Image(MediumSource.Local(R.drawable.telegram)),
                        video = Video(
                            MediumSource.Remote(""),
                            timeLengthSec = 60
                        )
                    ),
                    Story(
                        title = "title1",
                        author = Author(
                            "Snapchat",
                            Image(MediumSource.Local(R.drawable.ic_profile_checked))
                        ),
                        thumbnailImage = Image(MediumSource.Local(R.drawable.snapchat)),
                        video = Video(
                            MediumSource.Remote(""),
                            timeLengthSec = 60
                        )
                    ),
                    Story(
                        title = "title1",
                        author = Author(
                            "LinkedIn",
                            Image(MediumSource.Local(R.drawable.ic_profile_checked))
                        ),
                        thumbnailImage = Image(MediumSource.Local(R.drawable.linkedin)),
                        video = Video(
                            MediumSource.Remote(""),
                            timeLengthSec = 60
                        )
                    ),
                )
            )
        }

        override fun create(
            viewModelContext: ViewModelContext,
            state: HomeStoriesState
        ): HomeStoriesViewModel {
            return HomeStoriesViewModel(state)
        }
    }
}