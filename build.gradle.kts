buildscript {
    repositories {
        mavenCentral()
        google()
    }
    dependencies {
        classpath(ClassPath.androidGradle)
        classpath(ClassPath.kotlinGradlePlugin)
        classpath(ClassPath.androidHiltGradlePlugin)
    }
}

allprojects {
    repositories {
        mavenCentral()
        google()
    }
}

tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}