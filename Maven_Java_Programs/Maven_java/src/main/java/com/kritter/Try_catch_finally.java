package com.kritter;

public class Try_catch_finally {
    int Total_money;
    int people;

    Try_catch_finally(int m, int p)
    {
        this.Total_money=m;
        this.people=p;
    }

    public void calc()
    {
        try{
            int Money_per_head= this.Total_money/this.people;
            System.out.println("Money Going Per-person: "+Money_per_head+"$");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally, The Finally Block is always going to be executed..");
        }
    }

    public static void main(String arg[])
    {
        Try_catch_finally obj = new Try_catch_finally(1000, 10);
        obj.calc();
    }

}
