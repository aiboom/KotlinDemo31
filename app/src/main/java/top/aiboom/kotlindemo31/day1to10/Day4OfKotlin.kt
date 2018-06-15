package top.aiboom.kotlindemo31.day1to10

/**
 * Copyright 2018 (C) www.aiboom.top
 *
 * @since  2018/6/15
 * @author Langsky
 *
 * 1.0     Langsky   2018/6/15    Initial Create.
 * -----------------------------------------------------------------------------
 */
class Train(val number:Number?) {
    override fun toString(): String {
        return when(number) {
            null, 0 -> "empty"
            1 -> "tiny"
            in 2..10 -> "small"
            is Int -> "big inty"
            else -> "$number"
        }
    }
}