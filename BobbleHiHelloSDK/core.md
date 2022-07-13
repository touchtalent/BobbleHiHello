# BobbleSDK

BobbleSDK is a collection of multiple SDKs which can be used to power conversations with cutting-edge AI technology. BobbleSDK is designed to provide tailored experience to suite requirements of every application. 

## <a name="requirements"></a>System Requirements
- Minimum supported Android SDK level is 23 (Android 6.0)
- System architechture (ABIs) supported are [arm64-v8a, armeabi-v7a]

## Individual Modules

- [Avatar, Stickers, Animated Stickers, Regional GIFs](content.md) - Convert your user's selfies into fun personalised avatars <i>(Bobble Head)</i> which can be used independently as well as with large repository of personalised and expressive content formats(100K+).


### <a name="setup"></a>Setting Up

- Setup Maven in `settings.gradle` (`build.gradle`(project level) for older versions of Android Gradle Plugin)
```groovy
maven {
    url "<mavenReadUrl>" // Credentials for maven repo
    credentials {
        username "<mavenReadUsername>"
        password "<mavenReadPassword>"
    }
}
```
- Make sure that `jcenter()` exists in the repository list, since our libraries depends on libraries hosted on `jcenter()`

- BobbleSDK uses BoM (Bill of Materials) to resolve versions of all modules by specifying a single version. Import the BoM for the BobbleSDK platform by adding following dependency in your application module’s build.gradle. 
```groovy
implementation platform('com.touchtalent.bobblesdk:bom:1.0.1')
```

- Import BobbleSDK Core which acts as base for all modules.
```groovy
implementation 'com.touchtalent.bobblesdk:core'
```

- Initialise BobbleSDK in your Application's ```onCreate()```
```kotlin
class SampleDemoApp : Application() {
    override fun onCreate() {
        super.onCreate()
        BobbleSDK.initialise(this)
    }
}
```
- Provide user Age and Gender details to BobbleSDK
```kotlin
    BobbleSDK.setUserAge(34)
    BobbleSDK.setUserGender(BobbleSDK.Gender.MALE)
```

### <a name="permissions"></a>Required Permissions

The SDK and modules uses few basic permissions, as listed below, for their smooth functioning. 

```java
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
```
Apart from the necessary permissions, the SDK recommends the client app to add following permissions and request it from their users for a customised experience.
```java
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />
<uses-permission android:name="android.permission.READ_CONTACTS" />
```

>P.S - Individual modules may require specific permissions which will be declared in their respective documentation.

