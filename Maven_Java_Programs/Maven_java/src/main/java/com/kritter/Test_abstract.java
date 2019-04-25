package com.kritter;

abstract class Intrest{
    int getInterest(){
     return 0;
    };
}

class SBI extends Intrest{
    int getInterest()
    {
        return 8;
    }
}
class Pnb extends Intrest{
    @Override
    int getInterest() {
        return 7;
    }
}
public class Test_abstract{

    public static void  main(String args[])
    {
    SBI obj1 =new SBI();
    obj1.getInterest();
    System.out.println("SBI intrest rates are: "+obj1.getInterest()+"%");
    Pnb obj2 =new Pnb();
    obj2.getInterest();
    System.out.println("Pnb intrest rates are: "+obj2.getInterest()+"%");
    }

}
