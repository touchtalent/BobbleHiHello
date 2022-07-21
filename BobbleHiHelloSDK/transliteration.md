
# Bobble Transliteration SDK

Bobble Transliteration SDK is an input tool that can be integrated into any Android app to enable typing in regional languages. It can be leveraged to bridge the gap between users who prefer mixed scripts and users who prefer pure regional experience. Currently, only Hindi is supported.

## <a name="setting_up"></a>Setting Up

- Add and initialise BobbleSDK Core in your project. Refer [here](core.md#setup) for steps.

- Add the following dependency in your application module’s build.gradle.
```groovy
implementation 'com.touchtalent.bobblesdk:transliteration'
```

## <a name="apis"></a>Bobble Transliterator APIs

1. Managing languages - Transliteration requires few resources to be downloaded from the internet. Install/uninstall the language as per the requirement.
```kotlin
class SplashActivity : AppCompatActivity {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        // Calling this will cause this languages to install, if not already present
        BobbleTransliteratorSdk.setLanguages("hi_IN")
    }

}

```

2. Start transliterating -
   i. Add ```BobbleTransliteratorView``` inside a XML layout of your Activity/Fragment

```xml
    <com.touchtalent.bobblesdk.bobble_transliteration.BobbleTransliteratorView
    android:id="@+id/transliterationView"
    android:layout_width="match_parent"
    android:layout_height="40dp"
    app:layout_constraintBottom_toTopOf="@+id/editText"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
/>
```
ii. Check if language is active then do the steps iii. & iv
```kotlin
BobbleTransliteratorSdk.isActive("hi_IN")
```
iii. Set languages for the translator
```kotlin
    binding.transliterationView.setLanguage("hi_IN")
```
iv. bind the editText where input will be given to translate
```kotlin
    binding.transliterationView.bind(binding.editText)
```

## <a name="supported_languages"></a>Supported Languages
|Sl no.| Language name | Language locale |
|---| ------------- | ---------- |
|1|Hindi                | hi_IN         |
