package top.aiboom.kotlindemo31.day1to10;

/**
 * Copyright 2018 (C) www.aiboom.top
 *
 * @author Langsky
 * <p>
 * 1.0     Langsky   2018/6/15    Initial Create.
 * -----------------------------------------------------------------------------
 * @since 2018/6/15
 */
public class Day4OfJava {
    public static class Train {
        private Number number;

        public Train(Number number) {
            this.number = number;
        }

        @Override
        public String toString(){
            if(number == null || number == 0)
                return "empty";
            else if(number == 1)
                return "tiny";
            else if(number.intValue() >=2 && number.intValue() <=10)
                return "small";
            else if(number instanceof Integer)
                return "big inty";
            else
                return number.toString();
        }
    }
}
