/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ru.cst250assign04;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author upall
 */
public class FileClass {

    public static void main(String[] args) throws IOException {
        
        ArrayList<String> nameArray = new ArrayList();
        int i = 0;
        //String names.txt;
        //String sorted_names = null;

        File myFile = new File("C:\\Users\\upall\\CST250Assignment04\\CST250Assign04\\src\\main\\java\\edu\\ru\\cst250assign04\\names.txt");
        Scanner inputFile = new Scanner(myFile);

        while (inputFile.hasNextLine()) {
            //ArrayList<String> nameArray = new ArrayList<String>();
            //for (int i = 1; i <= nameArray.length; i++){
            nameArray.add(inputFile.nextLine());
            i++;
        }
        inputFile.close();
        for (int index = 0; index < nameArray.size(); index++)
        {
            System.out.println(nameArray.get(index));
            Collections.sort(nameArray);
        }
//            int size = nameArray.length;
        
        PrintWriter outputFile = new PrintWriter("C:\\Users\\upall\\CST250Assignment04\\CST250Assign04\\src\\main\\java\\edu\\ru\\cst250assign04\\sorted_names.txt");
        for (int k = 0; k < nameArray.size(); k++) {
            outputFile.println(nameArray.get(k));
        }
        outputFile.close();
        
    }
    
}
