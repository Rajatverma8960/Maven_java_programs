package com.kritter;

class student
{
    String name;
    int Roll_no;
    static String college="Christ University";

    void details(int roll, String name_x)
    {
        this.name= name_x;
        this.Roll_no= roll;
    }

    static {
        college="PUNE University";
    }

    static void change_clg(String clg)
    {
        college=clg;
    }

    void display()
    {
        System.out.println("Name: "+this.name+", Roll No.: "+ this.Roll_no+", Collage: "+college);
    }

}
public class Example_static extends student
{

    public  static  void  main(String args[])
    {
        Example_static obj= new Example_static();
        obj.details(38,"Rajat");
        obj.display();
        Example_static obj2= new Example_static();
        obj2.change_clg("Lucknow University");
        obj2.details(37, "vidit");
        obj2.display();
    }

}
