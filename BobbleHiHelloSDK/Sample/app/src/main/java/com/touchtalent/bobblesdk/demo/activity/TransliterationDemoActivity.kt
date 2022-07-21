package com.touchtalent.bobblesdk.demo.activity

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.touchtalent.bobblesdk.bobble_transliteration.BobbleTransliteratorSdk
import com.touchtalent.bobblesdk.demo.databinding.ActivityTransliterationDemoBinding

class TransliterationDemoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTransliterationDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTransliterationDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val locale = "hi_IN"
        //if language resources is available show BobbleTransliteration view
        if (BobbleTransliteratorSdk.isAvailable(locale)) {
            //set language for translator view
            binding.suggestionStrip.setLanguage("hi_IN")
            //bind edit text for translation
            binding.suggestionStrip.bind(binding.editText)
        } else {
            binding.suggestionStrip.visibility = View.GONE
        }
    }
}