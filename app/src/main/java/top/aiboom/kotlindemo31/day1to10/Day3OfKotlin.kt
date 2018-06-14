package top.aiboom.kotlindemo31.day1to10

import android.util.Log


/**
 * Copyright 2018 (C) www.aiboom.top
 *
 * @since  2018/6/14
 * @author Langsky
 *
 * 1.0     Langsky   2018/6/14    Initial Create.
 * -----------------------------------------------------------------------------
 */

data class Rect(val left: Int, val top: Int, val right: Int, val bottom: Int)

fun doSomething(){
    val(l, t, r, b) = Rect(1,2,3,4)
    Log.i("Langsky", "$l, $t, $r, $b")
}