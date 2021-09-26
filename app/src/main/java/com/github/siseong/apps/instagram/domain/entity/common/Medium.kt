package com.github.siseong.apps.instagram.domain.entity.common

abstract class Medium(val source: MediumSource)

abstract class Image(source: MediumSource) : Medium(source)
abstract class Video(source: MediumSource, timeLength: Int) : Medium(source)

interface MediumSource