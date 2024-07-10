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

public class BalokkExample {
    public static void main(String[] args){
        int pjg,lbr,t,la;
        Scanner input = new Scanner(System.in);
        //balok1 --> kons 1
        System.out.println("---balok 1---");
        Balokk b1 = new Balokk();
        System.out.print("Panjang = "); pjg = input.nextInt();
        b1.setPanjang(pjg);
        System.out.print("Lebar = "); lbr = input.nextInt();
        b1.setLebar(lbr);
        System.out.print("Tinggi = "); t = input.nextInt();
        b1.setTinggi(t);
        la = b1.hitungLuasAlas();
        b1.printBalokk(la, b1.hitungLuasPermukaan(), b1.hitungVolume());
        
        //balok2 --> kons 2
        System.out.println("---balok 2---");
        Balokk b2 = new Balokk(10);
        b2.setLebar(4);
        b2.setTinggi(5);
        b2.printBalokk();
        b2.printBalokk(b2.hitungLuasAlas(), b2.hitungLuasPermukaan(), b2.hitungVolume(b2.hitungLuasAlas()));
        
        //balok3 --> kons 3
        System.out.println("---balok 3---");
        System.out.print("Panjang = "); pjg = input.nextInt();
        System.out.print("Lebar = "); lbr = input.nextInt();
        System.out.print("Tinggi = "); t = input.nextInt();
        Balokk b3 = new Balokk(pjg,lbr,t);
        la = b3.hitungLuasAlas();
        b3.printBalokk(la, b3.hitungLuasPermukaan(), b3.hitungVolume(la));
    }
    
}
