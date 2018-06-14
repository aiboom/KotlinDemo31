package top.aiboom.kotlindemo31.day1to10;

import java.util.Locale;

/**
 * Copyright 2018 (C) www.aiboom.top
 *
 * @author Langsky
 * <p>
 * 1.0     Langsky   2018/6/14    Initial Create.
 * -----------------------------------------------------------------------------
 * @since 2018/6/14
 */
public class Day2OfJava {
    public static String printString() {
        String lang = "Kotlin";
        return String.format(Locale.getDefault(), "%1$s has %2$d characters", lang, lang.length());
    }
}
