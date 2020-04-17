package com.jskhaleel.gradientbg

import android.graphics.drawable.GradientDrawable

class GradientBg {
    private var minColor: Int = 2
    private var maxColor: Int = 4
    private var orientation: GradientDrawable.Orientation = GradientDrawable.Orientation.LEFT_RIGHT


    class Builder {

        private var gradientBg: GradientBg = GradientBg()

        fun setColorsCount(min: Int, max: Int): Builder {
            gradientBg.setMinMaxColors(min, max)
            return this
        }

        fun setOrientation(orientation: GradientDrawable.Orientation): Builder {
            gradientBg.setOrientation(orientation)
            return this
        }

        fun build(): GradientBg {
            return gradientBg
        }
    }

    private fun setOrientation(orientation: GradientDrawable.Orientation) {
        this.orientation = orientation
    }

    private fun setMinMaxColors(min: Int, max: Int) {
        require(min > 1) { "Minimum value should be greater than zero" }
        require(max > min) { "Maximum value should be greater than $min" }
        this.minColor = min
        this.maxColor = max
    }

    fun generateGradient(): GradientDrawable {
        val colors = Utils.getColors(minColor, maxColor)
        val orientation = Utils.getOrientation()

        val gd = GradientDrawable(orientation, colors)

        gd.gradientType = GradientDrawable.LINEAR_GRADIENT
        gd.gradientRadius = 300f
        gd.cornerRadius = 0f
        return gd
    }
}