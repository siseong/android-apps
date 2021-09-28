object Apps {
    const val compileSdk = 31
    const val minSdk = 30
    const val targetSdk = 31
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Versions {
    const val androidGradle = "7.0.0"

    const val kotlinGradlePlugin = "1.5.21"
    const val kotlinxCoroutinesCore = "1.5.1"

    const val androidMaterial = "1.3.0"
    const val androidCoreKtx = "1.5.0-rc01"
    const val androidxAppcompat = "1.2.0"

    const val androidxActivityKtx = "1.3.1"
    const val androidxFragmentKtx = "1.3.6"

    const val androidxLifeCycle = "2.2.0"

    const val androidxNavVersion = "2.3.5"

    const val androidHilt = "2.38.1"
    const val androidxHilt = "1.0.0"
    const val androidxHiltLifecycle = "1.0.0-alpha03"

    const val androidxActivityCompose = "1.3.1"
    const val androidxCompose = "1.0.1"
    const val androidxComposeLifecycleViewModel = "1.0.0-alpha07"
    const val androidxComposeHilt = "1.0.0-alpha02"

    const val mavericks = "2.3.0"
    const val mavericksCompose = "2.1.0-alpha02"

    const val junit = "4.13.2"
}

object Deps {
    const val javaxInject = "javax.inject:javax.inject:1"

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinGradlePlugin}"
    const val kotlinxCoroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinxCoroutinesCore}"

    const val androidMaterial = "com.google.android.material:material:${Versions.androidMaterial}"
    const val androidxCoreKtx = "androidx.core:core-ktx:${Versions.androidCoreKtx}"
    const val androidxAppCompat = "androidx.appcompat:appcompat:${Versions.androidxAppcompat}"

    const val androidxActivityKtx = "androidx.activity:activity-ktx:${Versions.androidxActivityKtx}"
    const val androidxFragmentKtx = "androidx.fragment:fragment-ktx:${Versions.androidxFragmentKtx}"

    const val androidxLifeCycleViewModelKtx =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.androidxLifeCycle}"
    const val androidxLifeCycleRunTimeKtx =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.androidxLifeCycle}"
    const val androidxLifeCycleLiveDateCore =
        "androidx.lifecycle:lifecycle-livedata-core-ktx:${Versions.androidxLifeCycle}"
    const val androidxLifeCycleLiveDataKtx =
        "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.androidxLifeCycle}"

    const val androidxNavigationFragmentKtx =
        "androidx.navigation:navigation-fragment-ktx:${Versions.androidxNavVersion}"
    const val androidxNavigationUi =
        "androidx.navigation:navigation-ui-ktx:${Versions.androidxNavVersion}"
    const val androidxNavigationCompose = "androidx.navigation:navigation-compose:2.4.0-alpha08"

    const val androidHilt = "com.google.dagger:hilt-android:${Versions.androidHilt}"
    const val androidHiltCompiler =
        "com.google.dagger:hilt-android-compiler:${Versions.androidHilt}"
    const val androidxHiltCommon = "androidx.hilt:hilt-common:${Versions.androidxHilt}"
    const val androidxHiltViewModel =
        "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.androidxHiltLifecycle}"
    const val androidxHiltCompiler = "androidx.hilt:hilt-compiler:${Versions.androidxHilt}"

    const val androidxComposeUi = "androidx.compose.ui:ui:${Versions.androidxCompose}"
    const val androidxComposeMaterial =
        "androidx.compose.material:material:${Versions.androidxCompose}"
    const val androidxComposeAnimation =
        "androidx.compose.animation:animation:${Versions.androidxCompose}"
    const val androidxComposeActivity =
        "androidx.activity:activity-compose:${Versions.androidxActivityCompose}"
    const val androidxComposeUiToolingPreview =
        "androidx.compose.ui:ui-tooling:${Versions.androidxCompose}"
    const val androidxComposeLifecycleViewModel =
        "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.androidxComposeLifecycleViewModel}"
    const val androidxComposeHilt =
        "androidx.hilt:hilt-navigation-compose:${Versions.androidxComposeHilt}"

    const val mavericks = "com.airbnb.android:mavericks:${Versions.mavericks}"
    const val mavericksCompose = "com.airbnb.android:mavericks-compose:${Versions.mavericksCompose}"

        const val junit = "junit:junit:${Versions.junit}"
}