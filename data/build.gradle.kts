plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.data"
    compileSdk = AppConfig.compileSdk
    buildToolsVersion = AppConfig.buildToolsVersion

    defaultConfig {
        minSdk = AppConfig.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

}

dependencies {
    implementation(project(":domain"))
    // AndroidX
    implementation(Libraries.AndroidX.APP_COMPAT)
    implementation(Libraries.AndroidX.MATERIAL)
    implementation(Libraries.AndroidX.CONSTRAINT_LAYOUT)

    // KTX
    implementation(Libraries.KTX.CORE)

    // TEST
    testImplementation(Libraries.Test.JUNIT)

    // AndroidTest
    androidTestImplementation(Libraries.AndroidTest.ESPRESSO_CORE)
    androidTestImplementation(Libraries.AndroidTest.EXT_JUNIT)

    //Hilt 라이브러리
    implementation(Libraries.DI.HILT)
    ksp(Libraries.DI.HILT_COMPILER)

    //log lib
    implementation(Libraries.Log.TIMBER)

    //http 통신 lib
    implementation(Libraries.Http.RETROFIT)
    implementation(Libraries.Http.RETROFIT_CONVERTER_SCALARS)
    implementation(Libraries.Http.RETROFIT_CONVERTER_GSON)

    //okHttp lib
    implementation(Libraries.Http.OKHTTP)
    implementation(Libraries.Http.OKHTTP_LOGGING_INTERCEPTOR)
    implementation(Libraries.Http.OKHTTP_BOM)
}