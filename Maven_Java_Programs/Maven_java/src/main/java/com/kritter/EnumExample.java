package com.kritter;
// A Java program to demonstrate working on enum
// in switch case (Filename Test. Java)
import java.util.Arrays;

// An Enum class
enum Season
{
    WINTER(1 , 2, 3), SUMMER(4, 5, 6), SRRING(7, 8, 9), FALL(10, 11, 12);

    private  int val1, val2, val3;
    private Season(int i1, int i2, int i3) {
        this.val1 = i1;
        this.val2 = i2;
        this.val3 = i3;
    }

    public int[] getVal()
    {
        return new int[]{val1, val2, val3};
    }

}

class Test {

    public static void main(String arg[])
    {
        Season s1= Season.FALL;
        System.out.println("ENUM VALUES: "+s1.valueOf("FALL"));
        System.out.println("ORDINAL: "+s1.ordinal());
        System.out.println("VALUE OF:"+ Arrays.toString(Season.values()) );

        int[] s2= Season.FALL.getVal();

        System.out.println("GET VALUE: "+s2[1]);

    }

}
