/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectSyafiq.ganjilGenap;

/**
 *
 * @author Syafiq
 */
import java.util.Scanner;
public class ganjilGenap {
    public static void main(String[] args){
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat = ");
        a = input.nextInt();
        if(a%2==0)
            System.out.println(a + " merupakan bilangan genap");
        else //a mod 2 = 1
            System.out.println(a + " merupakan bilangan ganjil");
    }
    
}
