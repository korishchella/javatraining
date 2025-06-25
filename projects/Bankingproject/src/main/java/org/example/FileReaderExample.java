package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

    public class FileReaderExample {

        public static void main(String[] args) {
            String fileName = "output.txt";
            try {
                File myFile = new File(fileName);
                myFile.createNewFile();
                BufferedReader reader = new BufferedReader(new FileReader(myFile.getName()));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.err.println("Error reading from file: " + e.getMessage());
            }
        }
    }

