package com.example.zamin.notes.utils

import android.graphics.Color
import android.view.Window

fun statusBarColor(window: Window,text:String)
{
    window.statusBarColor = Color.parseColor("$text")
}