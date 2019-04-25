package com.kritter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_writer {

    public static void main(String args[]) throws IOException
    {
        FileWriter fr = new FileWriter("/home/rajat/IdeaProjects/Maven_java/src/main/java/com/kritter/input.txt");
        BufferedWriter br = new BufferedWriter(fr);
        String s="hello world";

        br.write(s);
        br.close();
        fr.close();
    }
}
