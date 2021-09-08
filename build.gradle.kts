buildscript {
    repositories {
        jcenter()
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradlePlugin}")
        classpath("com.google.dagger:hilt-android-gradle-plugin:${Versions.androidHilt}")
    }
}

allprojects {
    repositories {
        jcenter()
        google()
        jcenter()
    }
}

tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}