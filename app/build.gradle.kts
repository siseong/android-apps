plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = Apps.compileSdk
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = "com.github.siseong.art"
        minSdk = Apps.minSdk
        targetSdk = Apps.targetSdk
        versionCode = Apps.versionCode
        versionName = Apps.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            isMinifyEnabled = false
            isDebuggable = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    buildFeatures {
        dataBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Deps.javaxInject)

    implementation(Deps.kotlinStdLib)
    implementation(Deps.kotlinxCoroutinesCore)

    implementation(Deps.androidMaterial)

    implementation(Deps.androidxCoreKtx)
    implementation(Deps.androidxAppCompat)

    implementation(Deps.androidxActivityKtx)
    implementation(Deps.androidxFragmentKtx)

    implementation(Deps.androidxLifeCycleViewModelKtx)
    implementation(Deps.androidxLifeCycleRunTimeKtx)
    implementation(Deps.androidxLifeCycleLiveDataKtx)
    implementation(Deps.androidxLifeCycleLiveDateCore)

    implementation(Deps.androidxNavigationFragmentKtx)
    implementation(Deps.androidxNavigationUi)
    // implementation(Deps.androidxNavigationCompose) // Uncomment after minSdk 31

    testImplementation(Deps.junit)
}