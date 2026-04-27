package com.rizvi.file.challenge;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter complete file name \n");
        String fileName = input.next();
        try(FileReader reader = new FileReader(fileName)) {
            int read;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
        }catch(FileNotFoundException fnf){
            System.out.printf(" %S File not Found => %s", fileName, fnf.getMessage());
        }catch(IOException io){
            System.out.printf("Exception occurred  %s", io.getMessage());
        }
    }
}
