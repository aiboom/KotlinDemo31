package top.aiboom.kotlindemo31.day1to10;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright 2018 (C) www.aiboom.top
 *
 * @author Langsky
 * <p>
 * 1.0     Langsky   2018/6/15    Initial Create.
 * -----------------------------------------------------------------------------
 * @since 2018/6/15
 */
public class Day5OfJava {

    public static void loopExample1() {
        for(int i=1; i<=100; i++){
            Log.i("HGL", "loopExample1: "+i);
        }
    }

    public static void loopExample2() {
        for(int i=100; i>=1; i--){
            Log.i("HGL", "loopExample2: "+i);
        }
    }

    public static void loopExample3() {
        String[] array = new String[]{"a", "b", "x"};
        for(int i=0; i<array.length; i+=2){
            Log.i("HGL", "loopExample3: "+array[i]);
        }
    }

    public static void loopExample4() {
        String[] array = new String[]{"a", "b", "x"};
        for(int index=0; index<array.length; index++){
            String value = array[index];
            Log.i("HGL", "loopExample4: "+index+" "+value);
        }
    }

    public static void loopExample5() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        Integer[] keySet = new Integer[map.size()];
        map.keySet().toArray(keySet);
        for (Integer key : keySet) {
            String value = map.get(key);
            Log.i("HGL", "loopExample5: "+key+" "+value);
        }
    }


}
