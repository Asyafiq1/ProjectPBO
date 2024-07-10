/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek02042024;

/**
 *
 * @author Syafiq
 */

import java.util.Scanner;

public class Balok {
    private double pjg;
    private double lbr;
    private double t;
    

    //konstruktor
    public Balok(double pjg, double lbr, double t) {
        this.pjg = pjg;
        this.lbr = lbr;
        this.t = t;
    }

    //method untuk menghitung luas alas
    public double hitungluasAlas() {
        return pjg * lbr;
    }

    //method untuk menghitung luas permukaan
    public double hitungluasPermukaan() {
        return 2 * (pjg * lbr + pjg * t + lbr * t);
    }

    //method untuk menghitung volume
    public double hitungvolumeBalok() {
        return pjg * lbr * t;
    }

      
    //main method untuk uji coba
    public static void main(String[] args) {
        char ulang;
        Scanner input = new Scanner(System.in);
        
        do
        {

        System.out.println("Masukkan panjang balok:");
        double pjg = input.nextDouble();

        System.out.println("Masukkan lebar balok:");
        double lbr = input.nextDouble();

        System.out.println("Masukkan tinggi balok:");
        double t = input.nextDouble();

        Balok balok = new Balok(pjg, lbr, t);

        System.out.println("Program menentukan luas alas, luas permukaan dan volume balok");
        System.out.println("Panjang Balok : " + balok.pjg);
        System.out.println("Lebar Balok : " + balok.lbr);
        System.out.println("Tinggi Balok : " + balok.t);
        System.out.println("Luas Alas Balok : " + balok.hitungluasAlas());
        System.out.println("Luas Permukaan Balok : " + balok.hitungluasPermukaan());
        System.out.println("Volume Balok : " + balok.hitungvolumeBalok());

        System.out.println("ulang proses y/n");
        ulang = input.next().charAt(0);
    }while(ulang=='y'||ulang=='Y');     
}
}
