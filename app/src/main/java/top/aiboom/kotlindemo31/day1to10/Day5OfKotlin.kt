package top.aiboom.kotlindemo31.day1to10

import android.util.Log

/**
 * Copyright 2018 (C) www.aiboom.top
 *
 * @since  2018/6/15
 * @author Langsky
 *
 * 1.0     Langsky   2018/6/15    Initial Create.
 * -----------------------------------------------------------------------------
 */
fun loopExample1() {
    for(i in 1..100) {
        Log.i("HGL", i.toString())
    }
}

fun loopExample2() {
    for(i in 100 downTo 1) {
        Log.i("HGL", i.toString())
    }
}

fun loopExample3() {
    val array = arrayOf("a", "b", "c")
    for(i in 1 until array.size step 2){
        Log.i("HGL", array[i])
    }
}

fun loopExample4() {
    val array = arrayOf("a", "b", "c")
    for((index, value) in array.withIndex()){
        Log.i("HGL", "$index, $value")
    }

}

fun loopExample5() {
    val map = mapOf(1 to "one", 2 to "two")
    for((key, value) in map){
        Log.i("HGL", "$key-$value")
    }
}
