/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek02042024;

/**
 *
 * @author Syafiq
 */
public class Balokk {
    private int pjg;
    private int lbr;
    private int t;
    
public Balokk() {
    
}

public Balokk(int pjg){
    this.pjg = pjg;
}

public Balokk(int pjg, int lbr, int t){
    this.pjg = pjg;
    this.lbr = lbr;
    this.t = t;
}

public int getPanjang(){
    return pjg;
}

public int getLebar(){
    return lbr;
}

public int getTinggi(){
    return t;
}

public void setPanjang(int pjg){
    this.pjg = pjg;
}

public void setLebar(int lbr){
    this.lbr = lbr;
}

public void setTinggi(int t){
    this.t = t;
}

public int hitungLuasAlas(){
    return pjg * lbr;
}

public int hitungLuasPermukaan(){
    int lp;
    lp = 2*(pjg*lbr)+(pjg*t)+(lbr*t);
    return lp;
}

public int hitungVolume(){
    int vol;
    vol= pjg*lbr*t;
    return vol;
}

public int hitungVolume(int la){
   return la*t; 
}

public void printBalokk(){
    System.out.println("Panjang = " + pjg);
    System.out.println("Lebar = " + lbr);
    System.out.println("Tinggi = " + t);
}

public void printBalokk(int la, int lp, int vol){
    System.out.println("luas alas = " + la);
    System.out.println("luas permukaan = " + lp);
    System.out.println("volume = " + vol);
}


}