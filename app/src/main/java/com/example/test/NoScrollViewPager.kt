package com.example.test

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

/**
 * 不可滑动viewpager
 */
class NoScrollViewPager : ViewPager {

    private var isCroll=false
        set(value) {
            field = value
        }

    constructor(context: Context):super(context)
    constructor(context: Context,attrs: AttributeSet?):super(context,attrs)

    override fun onTouchEvent(ev: MotionEvent?): Boolean {
        return if (!isCroll) false else super.onTouchEvent(ev)
    }

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean {
        return if (!isCroll) false else super.onInterceptTouchEvent(ev)
    }
}