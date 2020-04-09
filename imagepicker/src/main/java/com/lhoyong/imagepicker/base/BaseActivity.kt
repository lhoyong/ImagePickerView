package com.lhoyong.imagepicker.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

internal abstract class BaseActivity(private val layoutRes: Int) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutRes)
    }
}
