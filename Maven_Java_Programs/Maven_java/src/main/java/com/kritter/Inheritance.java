package com.kritter;

class Human{
    float avg_Humanheight= (float) 5.8;
}
class Male extends Human{
    float avg_Maleheight= (float) 5.4;
}
class Child extends Male{
    float avg_Childheight= (float) 4.2;
}

public class Inheritance extends Child {

    public static void main(String args[])
    {
        Inheritance p1 =new Inheritance();
        System.out.println("Average height of Human:"+p1.avg_Humanheight);
        System.out.println("Average height of Male:"+p1.avg_Maleheight);
        System.out.println("Average height of child:"+p1.avg_Childheight);
    }
}
