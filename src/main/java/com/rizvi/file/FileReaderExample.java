package com.rizvi.file;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "DrainedQueue.txt";

        try(FileReader reader = new FileReader(fileName)){
            int read = 0;
           do{
              read = reader.read();
               System.out.print((char)read);
           }while(read != -1);
            reader.close();
            System.out.println();
            System.out.println("   File Read from the location");

        }catch(IOException io){
            System.out.printf("File unable to read %s" ,io.getMessage());

        }

    }
}
