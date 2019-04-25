package com.kritter;


import java.util.LinkedList;

public class Linked_list {

    public static void main(String args[])
    {
        // Adding elements to linkedlist
        LinkedList ll =new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add('A');
        ll.add('B');
        ll.add('C');
        ll.addFirst(0);
        ll.addLast(6);
        System.out.println("Linked-List : "+ll);
        // Number of elements in the linkedlist
        System.out.println("Total No. of elements in the linkedlist : "+ll.size());

        // Removing the elements to the linklist
        ll.remove(6);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Removing Elements from the linkedlist : "+ll);
        // Number of elements in the linkedlist
        System.out.println("Total No. of elements in the linkedlist : "+ll.size());

        //Finding the Elements in the linked-list
        if(ll.contains('B'))
        {
            System.out.println("Element is present in the Linked-list");
        }

        //Get the element from the linked-list
        System.out.println("Element present at position 6th : "+ll.get(6));

        //Set the Element on any potition of the linkedlist
        ll.set(2,'J');
        System.out.println("Updated Linked-list: "+ll);

    }
}
