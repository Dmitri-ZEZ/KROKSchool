package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static int howWordsInFile(String pathFile) {
        int i = 0;

        try (Scanner scanner = new Scanner(new FileReader(pathFile))) {
            while (scanner.hasNext()) {
                scanner.next();
                i++;
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        }
        return i;
    }

    public static boolean parametrCheck(String[] parametr){
        try{
            if(parametr.length == 0){
                throw new IllegalArgumentException("Parameter input error, parameter is empty!");
            }
            else{
                return true;
            }
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }

    public static void main(String[] args){
        if(parametrCheck(args)){
            System.out.println(howWordsInFile(args[0]));
        }
    }
}
