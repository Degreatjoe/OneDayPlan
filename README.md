# OneDay Plan

**OneDay Plan** is an Android application developed using modern Android architecture, Jetpack Compose, and Hilt.

## Project Structure

```
onedayplan/
├── app/                  # Main application module
│   ├── src/              # Source code (main, androidTest, test)
│   └── build.gradle.kts  # App-level build configuration
├── gradle/
│   └── libs.versions.toml# Version Catalog for dependencies and plugins
├── build.gradle.kts      # Root build script
├── settings.gradle.kts   # Gradle settings and project inclusions
└── README.md             # Project documentation
```

## Tech Stack & Architecture

- **Language**: [Kotlin](https://kotlinlang.org/) `2.2.10`
- **UI Framework**: [Jetpack Compose](https://developer.android.com/jetpack/compose) with Material 3
- **Dependency Injection**: [Dagger Hilt](https://developer.android.com/training/dependency-injection/hilt-android) `2.60.1`
- **Annotation Processing**: [KSP (Kotlin Symbol Processing)](https://kotlinlang.org/docs/ksp-overview.html) `2.3.10`
- **Serialization**: [Kotlinx Serialization](https://kotlinlang.org/docs/serialization.html)
- **Build System**: Gradle with Version Catalog (`libs.versions.toml`) & AGP `9.2.1`

## Environment & Requirements

- **Android Studio**: Ladybug / ME / Iguana or newer recommended
- **JDK Target**: Java 17+
- **Min SDK**: 26 (Android 8.0)
- **Target / Compile SDK**: 36

## Getting Started

### Building the Project

Assemble the debug APK:
```bash
./gradlew assembleDebug
```

### Running Tests

Run unit tests across modules:
```bash
./gradlew test
```

Run Android instrumentation tests:
```bash
./gradlew connectedAndroidTest
```
