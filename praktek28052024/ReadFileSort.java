/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek28052024;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Syafiq
 */
public class ReadFileSort {
    
     public static void main(String[] args) throws IOException {
        System.out.println("Nama file yang akan dibaca?");
        String filename;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        filename = br.readLine();
        System.out.println("Membaca File " + filename + "...");
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException ex){
            System.out.println("File not found");
        }
        try{
            char data;
            int temp;
            int temp1;
            do{
                temp = fis.read();
                temp1 = temp;
                temp1 = temp1 ^ 25;
                data = (char) temp1;
                
            if(temp != -1){
                System.out.print(data);
            }
            }while (temp != -1);
            
            }catch (IOException ex){
                    System.out.println("Problem in reading from the file");
                    }
               
    
        }
    
}
