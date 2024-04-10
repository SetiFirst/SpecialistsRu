plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("com.google.devtools.ksp") version "1.6.10-1.0.3"
}

android {
    namespace = "com.example.specialistsru"
    compileSdk = 34



    defaultConfig {
        applicationId = "com.example.specialistsru"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true


        addManifestPlaceholders(mapOf(
            "VKIDClientID" to "51894961", // ID вашего приложения (app_id).
            "VKIDClientSecret" to "q6WlaU3y9afxBiTzFxWX", // Ваш защищенный ключ (client_secret).
            "VKIDRedirectHost" to "vk.com", // Обычно используется vk.com.
            "VKIDRedirectScheme" to "vk51894961", // Обычно используется vk{ID приложения}.
        ))

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        isCoreLibraryDesugaringEnabled = true
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
    dependenciesInfo {
        includeInApk = true
        includeInBundle = true
    }
    buildToolsVersion = "34.0.0"
}

dependencies {
    implementation ("com.squareup.picasso:picasso:2.8")
    // Moshi
    implementation("com.squareup.moshi:moshi:1.13.0")
    // Moshi Котлин Кодген
    ksp("com.squareup.moshi:moshi-kotlin-codegen:1.13.0")
    // Конвертер Moshi для Retrofit (если вы используете Retrofit)
    implementation("com.squareup.retrofit2:converter-moshi:2.9.0")
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.4")
    implementation("com.vk.id:vkid:1.3.2")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.vk:android-sdk-core:4.1.0")
    implementation ("com.vk:android-sdk-api:4.1.0")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)
    implementation(libs.androidx.legacy.support.v4)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.fragment.ktx)
    implementation(files("Android/Sdk/vk-android-sdk-master"))
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}