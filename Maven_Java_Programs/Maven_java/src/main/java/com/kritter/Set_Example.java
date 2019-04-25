package com.kritter;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Example {
    public static void main(String args[])
    {
        Set set= new HashSet();

        //Adding objects to the set
        set.add(12);
        set.add(15);
        set.add(19);
        set.add(11);
        set.add(10);
        //Display the size of the set
        System.out.println("Length of the set : "+set.size());
        //Display the elements of the set
        System.out.println("Elements of the Set : "+set);

        //Removing the Elements of the set
        set.remove(12);
        set.remove(19);
        //Display the elements of the set
        System.out.println("Elements of the Set : "+set);

        //Sorting the elements of the set
        TreeSet T1 = new TreeSet(set);
        System.out.println("Sorted Set values: "+T1);
    }
}
