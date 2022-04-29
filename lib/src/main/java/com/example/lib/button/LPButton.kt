package com.example.lib.button

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import androidx.appcompat.widget.AppCompatButton
import com.example.lib.R

class LPButton : AppCompatButton {

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attributeSet: AttributeSet? = null)
    : this(context, attributeSet, R.attr.LPButtonStyle)
    constructor(
        context: Context,
        attributeSet: AttributeSet? = null,
        style: Int
    ) : super(ContextThemeWrapper(context, R.style.LPButtonTheme), attributeSet, style)
}