/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek21052024;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Syafiq
 */
public class LatihanXor {
    
    public static void main(String args[]) throws IOException {
        System.out.println("Nama file yang akan dibaca?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename = br.readLine();
        System.out.println("Membaca file " + filename + "...");

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
            return;  // Exit the method if the file is not found
        }

        try {
            int temp;
            while ((temp = fis.read()) != -1) {
                temp ^= 0x20;  // Apply XOR with 0x20
                char data = (char) temp;
                if (data == ' ') {
                    data = '_';  // Replace space with underscore
                }
                System.out.print(data);
            }
        }  catch (IOException ex) {
            System.out.println("Problem in reading from the file.");
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    System.out.println("Problem in closing the file.");
                }
            }
        }
    }
}

