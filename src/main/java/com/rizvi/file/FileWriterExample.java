package com.rizvi.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args)  {
         String fileName = "java-course.txt";

        try {
            FileWriter writer = new FileWriter((fileName));
            writer.write("This is best java training course");
            writer.flush();
            System.out.println(" Message written on file ");
            writer.close();
        } catch (IOException e) {
            System.out.println("No Such file exists"+e.getMessage());
        }
    }
}
