package com.kritter;

import org.apache.log4j.BasicConfigurator;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class Buffer_reader {
public static void main(String arg[]) throws IOException
{

    Logger logger = Logger.getLogger(String.valueOf(Buffer_reader.class));

    BasicConfigurator.configure();
    logger.info("Start Reading the File....");
    FileReader in =new FileReader("/home/rajat/IdeaProjects/Maven_java/src/main/java/com/kritter/input.txt");
    logger.info("Fetchig all the data from the file...");
    logger.info("interting all the data into buffer....");
    BufferedReader br = new BufferedReader(in);
    logger.info("Writting all the data from the buffer to the output Screen");

    int i;
    while ((i=br.read())!=-1)
    {
        System.out.print((char)i);
    }

    logger.info("Closing the FileReader connection");
    in.close();
    logger.info("Closing the BufferReader Connection");
    br.close();
}
}
