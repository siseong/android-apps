buildscript {
    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradlePlugin}")
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Versions.androidHilt}")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        google()
    }
}

tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}