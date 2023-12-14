Gradle 구성 : Kotlin DSL + buildSrc 
Base 구조 : CleanArchitecture 기반 Multi Module로 구성(presentation, domain, data) 
DI : Hilt(기존에 주석 프로세서를 사용하기 위해 kapt를 사용하였으나, Hilt 라이브리러에서 ksp 지원이 가능하게 되었으므로 해당 베이스에서는 ksp로 마이그레이션 진행함.)
