package com.github.siseong.apps.instagram.presentation.ui.home.news

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

@Composable
fun News() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        New()
    }
}

@Composable
fun New() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        NewsHeader()
        NewsBody()
        NewsComments()
    }
}

@Composable
fun NewsComments() {
    Column(
        modifier = Modifier.padding(horizontal = 15.dp)
    ) {
        NewsLike()
        NewsComment()
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