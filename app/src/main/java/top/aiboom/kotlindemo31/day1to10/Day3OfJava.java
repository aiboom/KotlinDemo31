package top.aiboom.kotlindemo31.day1to10;

import android.util.Log;

/**
 * Copyright 2018 (C) www.aiboom.top
 *
 * @author Langsky
 * <p>
 * 1.0     Langsky   2018/6/14    Initial Create.
 * -----------------------------------------------------------------------------
 * @since 2018/6/14
 */
public class Day3OfJava {

    public static class Rect {
        public final int left;
        public final int top;
        public final int right;
        public final int bottom;

        public Rect(int l, int t, int r, int b) {
            left = l;
            top = t;
            right = r;
            bottom = b;
        }
    }

    public static void doSomething() {
        Rect rect = new Rect(1,2,3,4);
        int l = rect.left;
        int t = rect.top;
        int r = rect.right;
        int b = rect.bottom;

        Log.e("AiBoom", " "+l+" "+t+" "+" "+r+" "+b );
    }
}
