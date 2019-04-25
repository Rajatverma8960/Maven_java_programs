package com.kritter;

public class Test_singelton {

    private Test_singelton(){};

    private static Test_singelton obj;

    public static Test_singelton getinstance()
    {
        if(obj==null)
        {
            obj=new Test_singelton();
        }
        return obj;
    }

    public static void main(String arg[])
    {
        Test_singelton a1 = Test_singelton.getinstance();
        System.out.println("object one : "+a1.hashCode());

        Test_singelton a2 =Test_singelton.getinstance();
        System.out.println("object two : "+a2.hashCode());
    }
}
