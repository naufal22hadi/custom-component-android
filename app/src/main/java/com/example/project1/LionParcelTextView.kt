package com.example.project1

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class LionParcelTextView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet,
    style: Int = 0,
) : AppCompatTextView(ContextThemeWrapper(context, R.style.LionParcelTextViewStyle), attributeSet, style)

class LionParcelButton @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet,
    style: Int = 0,
) : AppCompatButton(ContextThemeWrapper(context, R.style.LionParcelButtonStyle), attributeSet, style)