package com.github.siseong.apps.instagram.presentation.ui.home.news

import android.text.format.DateFormat
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.siseong.apps.R
import java.text.NumberFormat
import java.util.*
import java.util.concurrent.TimeUnit

@Composable
fun NewsFooter() {
    Column(
        modifier = Modifier.padding(horizontal = 13.dp)
    ) {
        NewsLike()
        NewsComments()
        NewsDate(System.currentTimeMillis() - TimeUnit.HOURS.toMillis(3))
    }
}

@Composable
fun NewsLike() {
    Text(
        text = String.format(
            stringResource(R.string.instagram_count_like),
            NumberFormat.getNumberInstance(Locale.US).format(5466)
        ),
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colors.onBackground
    )
}

@Composable
fun NewsComments() {
    Column {
        NewsComment()
        NewsComment()
    }
}

@Composable
fun NewsComment() {
    Text(
        buildAnnotatedString {
            withStyle(
                style = ParagraphStyle(
                    lineHeight = 18.sp,
                )
            ) {
                withStyle(
                    style = SpanStyle(
                        color = MaterialTheme.colors.onBackground,
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.sp,
                    )
                ) {
                    append(stringResource(R.string.instaram) + " ")
                }
                withStyle(
                    style = SpanStyle(
                        color = MaterialTheme.colors.secondaryVariant,
                        fontSize = 13.sp,

                        )
                ) {
                    append("@" + stringResource(R.string.netflix))
                    append(" ")
                }
                withStyle(
                    style = SpanStyle(
                        color = MaterialTheme.colors.onBackground,
                        fontSize = 13.sp,

                        )
                ) {
                    append(stringResource(R.string.netflix_description))
                    append(" ")
                }
            }
        }
    )
}

@Composable
fun NewsDate(
    postTime: Long,
) {
    Text(
        text = getDate(postTime),
        color = MaterialTheme.colors.secondary,
        fontSize = 10.sp
    )
}

private fun getDate(postTime: Long): String {
    val timeDiff = System.currentTimeMillis() - postTime

    return when {
        timeDiff <= 0 -> "ERROR"
        timeDiff <= TimeUnit.HOURS.toMillis(1) -> "now"
        timeDiff <= TimeUnit.HOURS.toMillis(2) -> "1 hour ago"
        timeDiff <= TimeUnit.DAYS.toMillis(1) -> "${timeDiff / TimeUnit.HOURS.toMillis(1)} hours ago"
        timeDiff <= TimeUnit.DAYS.toMillis(2) -> "1 day ago"
        timeDiff <= TimeUnit.DAYS.toMillis(7) -> "${timeDiff / TimeUnit.HOURS.toMillis(1)} days ago"
        else -> {
            DateFormat.format("yyyy MMMM dd", Date(postTime)).toString()
        }
    }
}