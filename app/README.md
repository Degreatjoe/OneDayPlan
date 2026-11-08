# OneDay Plan - App Module (`:app`)

This module contains the main Android application for **OneDay Plan**, built using modern Android development standards.

## Tech Stack & Libraries

- **UI Framework**: [Jetpack Compose](https://developer.android.com/jetpack/compose) with Material 3 (`OneDayPlanTheme`)
- **Dependency Injection**: [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) (`2.60.1`)
- **Annotation Processing**: [KSP](https://kotlinlang.org/docs/ksp-overview.html)
- **Serialization**: [Kotlinx Serialization](https://kotlinlang.org/docs/serialization.html)
- **Language**: Kotlin

## Build & Environment Setup

- **Android Gradle Plugin (AGP)**: `9.2.1`
- **Compile SDK**: `36`
- **Target SDK**: `36`
- **Min SDK**: `26`

## Commands

- **Build Debug APK**:
  ```bash
  ./gradlew :app:assembleDebug
  ```

- **Run Unit Tests**:
  ```bash
  ./gradlew :app:testDebugUnitTest
  ```
