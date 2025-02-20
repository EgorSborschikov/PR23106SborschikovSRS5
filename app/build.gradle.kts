plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "com.example.pr23106sborschikovsrs5"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.pr23106sborschikovsrs5"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation("com.squareup.retrofit2:retrofit:2.9.0")//подключение библиотеки retrofit
    implementation("com.squareup.retrofit2:converter-gson:2.9.0") //подключение библиотеки retrofit
    implementation("androidx.room:room-runtime:2.3.0")//подключение библиотеки room
    implementation("androidx.room:room-compiler:2.3.0")//подключение библиотеки room
    implementation("org.achartengine:achartengine:1.2.0")//подключение библиотеки AChartEngine
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
    implementation("com.github.bumptech.glide:glide:4.12.0")//подключение библиотеки glide
    //описание назначения библиотек находится в файле по пути: /app/doc/descriptionfile.md
    //скриншоты подключения плагинов находятся в каталоге по пути: /app/doc/pluginspict
    annotationProcessor("com.github.bumptech.glide:compiler:4.12.0")
    implementation(libs.firebase.firestore.ktx)
    implementation(libs.androidx.room.common)
    implementation(libs.androidx.appcompat)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}