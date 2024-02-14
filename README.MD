# Compose Multiplatform Application

## MeetUp
This project is tailored for a vibrant MeetUp focusing on Compose multiplatform development.

## Before You Begin!
Before diving into the project, make sure to:

- Validate your system setup with [KDoctor](https://github.com/Kotlin/kdoctor).
- Ensure JDK 17 is installed on your machine.
- Set up a `local.properties` file in the project root directory and specify the path to your Android SDK there.

### Android
To run the application on an Android device/emulator:

- Open the project in Android Studio and execute the imported Android run configuration.

To build the application bundle:

- Run `./gradlew :composeApp:assembleDebug`.
- Locate the `.apk` file at `composeApp/build/outputs/apk/debug/composeApp-debug.apk`.

### iOS
To run the application on an iPhone device/simulator:

- Launch `iosApp/iosApp.xcproject` in Xcode and execute the standard configuration.
- Alternatively, leverage the [Kotlin Multiplatform Mobile plugin](https://plugins.jetbrains.com/plugin/14936-kotlin-multiplatform-mobile) for Android Studio.

This setup ensures a smooth and seamless experience across both Android and iOS
