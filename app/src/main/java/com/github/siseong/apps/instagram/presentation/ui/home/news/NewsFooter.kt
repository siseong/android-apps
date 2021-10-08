package com.github.siseong.apps.instagram.presentation.ui.home.news

import android.text.format.DateFormat
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
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
        verticalArrangement = Arrangement.spacedBy(3.dp),
        modifier = Modifier.padding(horizontal = 13.dp)
    ) {
        NewsLike()
        NewsComments()
        AddComment()
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

const val heart = 0x2764.toChar()

@Composable
fun AddComment() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
            .height(40.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.instagram),
            contentDescription = "profile",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(25.dp)
                .clip(CircleShape)
        )
        Text(
            text = stringResource(R.string.instagram_add_comment),
            color = MaterialTheme.colors.secondary,
            fontSize = 14.sp,
            modifier = Modifier.weight(1f)
                .padding(start = 10.dp)
        )
        Text(
            text = heart.toString()
        )
    }
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