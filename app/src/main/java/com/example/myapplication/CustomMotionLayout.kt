package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.constraintlayout.motion.widget.MotionLayout

class CustomMotionLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int? = 0
) : MotionLayout(context, attrs, defStyleAttr ?: 0) {

    override fun onNestedPreScroll(target: View, dx: Int, dy: Int, consumed: IntArray, type: Int) {
        Log.wtf("onNestedPreScroll", "dy = $dy type = $type")
        if (!target.canScrollVertically(-1))
            super.onNestedPreScroll(target, dx, dy, consumed, type)

    }

    override fun onNestedPreFling(target: View, velocityX: Float, velocityY: Float): Boolean {
        return !target.canScrollVertically(-1)
    }
}