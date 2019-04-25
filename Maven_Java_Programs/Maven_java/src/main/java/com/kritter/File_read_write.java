package com.kritter;

import java.io.*;
public class File_read_write {

public static void main(String args[]) throws IOException {
    FileWriter out =null;
    FileReader in= null;

    try {
        out = new FileWriter("/home/rajat/IdeaProjects/Maven_java/src/main/java/com/kritter/output.txt");
        in = new FileReader("/home/rajat/IdeaProjects/Maven_java/src/main/java/com/kritter/input.txt");

         int c;

         while((c= in.read())!= -1)
         {
             //out.write(c);
             System.out.print((char)c);
         }
    }
     catch (Exception e)
     {
         System.out.println("Exception : "+ e);
     }
    finally {
        if(in!=null)
        {
            in.close();
        }
        if(out!=null)
        {
            out.close();
        }
    }
}
}
