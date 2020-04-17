package com.jskhaleel.gradientbg

import android.graphics.drawable.GradientDrawable
import kotlin.random.Random

object Utils {

    private val orientationList = listOf(
        GradientDrawable.Orientation.TR_BL,
        GradientDrawable.Orientation.TL_BR,
        GradientDrawable.Orientation.BR_TL,
        GradientDrawable.Orientation.BL_TR
    )

    private val colorList = listOf(
        0xffe91e63, 0xffd81b60, 0xffc2185b, 0xffad1457, 0xff880e4f, 0xffba68c8, 0xffab47bc,
        0xffef5350, 0xfff44336, 0xffe53935, 0xffd32f2f, 0xffc62828, 0xffb71c1c, 0xffec407a,
        0xff9c27b0, 0xff8e24aa, 0xff7b1fa2, 0xff6a1b9a, 0xff4a148c, 0xffff5252, 0xffff1744,
        0xffd50000, 0xffff4081, 0xfff50057, 0xffc51162, 0xffe040fb, 0xffd500f9, 0xffaa00ff,
        0xff9575cd, 0xff7e57c2, 0xff673ab7, 0xff5e35b1, 0xff512da8, 0xff4527a0, 0xff0288d1,
        0xff6200ea, 0xff536dfe, 0xff3d5afe, 0xff304ffe, 0xff448aff, 0xff2979ff, 0xff2962ff,
        0xff311b92, 0xff7986cb, 0xff5c6bc0, 0xff3f51b5, 0xff3949ab, 0xff303f9f, 0xff283593,
        0xffdd2c00, 0xfffff176, 0xffffee58, 0xffffeb3b, 0xfffdd835, 0xffffff00, 0xffffea00,
        0xff1a237e, 0xff1e88e5, 0xff1976d2, 0xff1565c0, 0xff0d47a1, 0xff7c4dff, 0xff651fff,
        0xff1b5e20, 0xff558b2f, 0xff33691e, 0xff827717, 0xfff4511e, 0xffe64a19, 0xffd84315,
        0xff00796b, 0xff00695c, 0xff004d40, 0xff0091ea, 0xff43a047, 0xff388e3c, 0xff2e7d32,
        0xffbf360c, 0xffa1887f, 0xff8d6e63, 0xff795548, 0xff6d4c41, 0xff5d4037, 0xffff3d00,
        0xff0277bd, 0xff01579b, 0xff0097a7, 0xff00838f, 0xff006064, 0xff009688, 0xff00897b,
        0xffffd740, 0xffffc400, 0xffffc107, 0xffffb300, 0xffffa000
    )

    fun getOrientation(): GradientDrawable.Orientation = orientationList.random()

    private fun getColor(): Int = colorList.random().toInt()

    fun getColors(minColor: Int, maxColor: Int): IntArray {
        val size = Random.nextInt(minColor, maxColor)
        val colors = IntArray(size)
        var i = 0
        while (i < size) {
            colors[i] = getColor()
            i = i.inc()
        }
        return colors
    }
}