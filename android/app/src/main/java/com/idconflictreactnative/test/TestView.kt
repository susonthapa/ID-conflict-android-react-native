package com.idconflictreactnative.test

import android.content.Context
import android.graphics.Color
import android.widget.FrameLayout
import android.widget.LinearLayout

class TestView(context: Context) : FrameLayout(context) {

    init {
        val testLayout = LinearLayout(context)
            .apply {
                id = generateViewId()
                setBackgroundColor(Color.RED)
            }
        addView(testLayout, LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT))
    }

}