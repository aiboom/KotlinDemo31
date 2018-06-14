package top.aiboom.kotlindemo31.day1to10;

/**
 * Copyright 2018 (C) www.aiboom.top
 *
 * @author Langsky
 * <p>
 * 1.0     Langsky   2018/6/14    Initial Create.
 * -----------------------------------------------------------------------------
 * @since 2018/6/14
 */
public class Day1OfJava {
    public static String getName(Person person){
        String name;
        if (person == null || person.name == null)
            name = "unknown";
        else
            name = person.name;
        return name;
    }

    public static class Person {
        String name;
    }
}
