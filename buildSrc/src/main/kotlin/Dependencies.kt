// Dependencies.kt
object Versions {

    // AndroidX
    const val APP_COMPAT = "1.6.1"
    const val MATERIAL = "1.10.0"
    const val CONSTRAINT_LAYOUT = "2.1.4"
    const val LIFE_CYCLE_KTX = "2.6.2"

    // KTX
    const val CORE = "1.12.0"

    // TEST
    const val JUNIT = "4.13.2"

    // Android Test
    const val ESPRESSO_CORE = "3.5.1"
    const val EXT_JUNIT = "1.1.5"

    // DI
    const val HILT = "2.48"

    //Log
    const val TIMBER = "5.0.1"

    //Http
    const val RETROFIT = "2.9.0"
    const val RETROFIT_CONVERTER_SCALARS = "2.9.0"
    const val RETROFIT_CONVERTER_GSON = "2.9.0"
    const val OKHTTP_BOM = "4.10.0"

}

object Libraries {

    object AndroidX {
        const val APP_COMPAT = "androidx.appcompat:appcompat:${Versions.APP_COMPAT}"
        const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
        const val LIFE_CYCLE_KTX = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFE_CYCLE_KTX}"
    }

    object KTX {
        const val CORE = "androidx.core:core-ktx:${Versions.CORE}"
    }

    object Test {
        const val JUNIT = "junit:junit:${Versions.JUNIT}"
    }

    object AndroidTest {
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_CORE}"
        const val EXT_JUNIT = "androidx.test.ext:junit:${Versions.EXT_JUNIT}"
    }

    object DI {
        const val HILT = "com.google.dagger:hilt-android:${Versions.HILT}"
        const val HILT_COMPILER = "com.google.dagger:hilt-android-compiler:${Versions.HILT}"
    }

    object Log {
        const val TIMBER = "com.jakewharton.timber:timber:${Versions.TIMBER}"
    }

    object Http {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
        const val RETROFIT_CONVERTER_SCALARS = "com.squareup.retrofit2:converter-scalars:${Versions.RETROFIT_CONVERTER_SCALARS}"
        const val RETROFIT_CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT_CONVERTER_GSON}"

        const val OKHTTP = "com.squareup.okhttp3:okhttp"
        const val OKHTTP_BOM = "com.squareup.okhttp3:okhttp-bom:${Versions.OKHTTP_BOM}"
        const val OKHTTP_LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor"
    }

}