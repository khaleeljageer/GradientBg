package com.jskhaleel.gradientsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jskhaleel.gradientbg.GradientBg
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    private var gradientBg: GradientBg? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        gradientBg = GradientBg.Builder().setColorsCount(2, 3).build()

        changeBg()

        fab.setOnClickListener {
            changeBg()
        }
    }

    private fun changeBg() {

        if (gradientBg != null) {
            contentRoot.background = gradientBg!!.generateGradient()
        }
    }
}
