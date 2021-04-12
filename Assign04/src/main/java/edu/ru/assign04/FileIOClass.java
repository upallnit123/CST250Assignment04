/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ru.assign04;

import java.io.File;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author upall
 */
public class FileIOClass {
    
    public static void main(String[] args) throws IOException {
        //String nameArray[] = null;
        //String names.txt;
        //String sorted_names = null;
        
        File myFile = new File("names.txt");
        Scanner inputFile = new Scanner(myFile); 
        PrintWriter outputFile = new PrintWriter("sorted_names.txt"); 
            while (inputFile.hasNext()) {
                //ArrayList<String> nameArray = new ArrayList<String>();
                String[] nameArray = new String[100];
                for (int i = 1; i <= nameArray.length; i++){
                    String line = inputFile.nextLine();
                    nameArray[i] = line;
                    System.out.println(nameArray[i]);
                }   
            }
            
//            Arrays.sort(nameArray[]);
//            for (String nameArray1 : nameArray) {
//                outputFile.println("sorted_names.txt");
//            }
    }
    
}
