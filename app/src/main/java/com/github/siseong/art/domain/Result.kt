package com.github.siseong.art.domain

sealed class Result<out T> {
    data class Success<out T>(val data: T) : Result<T>()
    data class Error<out T>(val throwable: Throwable): Result<T>()
}