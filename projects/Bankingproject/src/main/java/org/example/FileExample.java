package org.example;

import java.io.File;
import java.io.IOException;

    public class FileExample {
        public static void main(String[] args) {
            String fileName = "myFile.txt"; // The name of the file to work with

            try {
                // 1. Create a File object
                File myFile = new File(fileName);

                // 2. Check if the file exists and create it if not
                if (myFile.exists()) {
                    System.out.println("File already exists: " + myFile.getName());
                } else {
                    if (myFile.createNewFile()) {
                        System.out.println("File created: " + myFile.getName());
                    } else {
                        System.out.println("Failed to create the file.");
                    }
                }

                // 3. Get file information
                System.out.println("Absolute path: " + myFile.getAbsolutePath());
                System.out.println("File size (bytes): " + myFile.length());
                System.out.println("Is readable: " + myFile.canRead());
                System.out.println("Is writable: " + myFile.canWrite());

            } catch (IOException e) {
                System.out.println("An error occurred during file operation.");
                e.printStackTrace();
            }
        }
    }


