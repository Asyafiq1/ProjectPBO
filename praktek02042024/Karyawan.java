/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek02042024;

/**
 *
 * @author Syafiq
 */
public class Karyawan {
    private String nama;
    private String nip;
    private int msKerja;
    private double gaji = 2000000; // Gaji pokok sebesar 2 juta
    
    public Karyawan() {
    
}
    public Karyawan(String nama, String nip){
        this.nama = nama;
        this.nip = nip;
    }
    
    public Karyawan(int msKerja){
        this.msKerja = msKerja;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getNip(){
        return nip;
    }
    
    public int getmsKerja(){
        return msKerja;
    }
    
    public double getGaji(){
        return gaji;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public void setmsKerja(int msKerja){
        this.msKerja = msKerja;
    }
    
    public void setGaji(double gaji){
        this.gaji = gaji;
    }
    
    public double hitungTunjangan(){
        double tj;
        if (msKerja <= 5){
            tj = msKerja * 300000;
            return tj;
        } 
        else {
            tj = msKerja * 500000;
            return tj;
        }
    }
    
    public double hitungGajiTotal(){
        double gt;
        gt = gaji + hitungTunjangan();
        return gt;
    }
    
    public void printKaryawan(){
        System.out.println("Nama = " + nama);
        System.out.println("Nip = " + nip);
        System.out.println("Masa Kerja = " + msKerja);
    }
    
    public void printKaryawan(double gaji, double tj, double gt){
    System.out.println("gaji = " + gaji);
    System.out.println("tunjangan = " + tj);
    System.out.println("gaji total = " + gt);
    }
}

