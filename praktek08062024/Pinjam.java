/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek08062024;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Syafiq
 */
public class Pinjam {
    
    private String kodeAnggota;
    private String kodeBuku;
    private String tglPinjam;
    private String tglKembali;
    private Integer terlambat;
    private Integer dendaTotal;
    
    public Pinjam(){
        
    }
    
    public Pinjam(String kodeAnggota, String kodeBuku, String tglPinjam, String tglKembali, Integer terlambat, Integer dendaTotal){
        this.kodeAnggota = kodeAnggota;
        this.kodeBuku = kodeBuku;
        this.tglPinjam = tglPinjam;
        this.tglKembali = tglKembali;
        this.terlambat = terlambat;
        this.dendaTotal = dendaTotal;
        calculateLateAndFine();
    }

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public void setKodeAnggota(String kodeAnggota) {
        this.kodeAnggota = kodeAnggota;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglKembali() {
        return tglKembali;
    }

    public void setTglKembali(String tglKembali) {
        this.tglKembali = tglKembali;
    }

    public Integer getTerlambat() {
        return terlambat;
    }

    public void setTerlambat(Integer terlambat) {
        this.terlambat = terlambat;
    }

    public Integer getDendaTotal() {
        return dendaTotal;
    }

    public void setDendaTotal(Integer dendaTotal) {
        this.dendaTotal = dendaTotal;
    }
    
     private void calculateLateAndFine() {
        SimpleDateFormat sdf = new SimpleDateFormat("d-MMMM-yyyy");
        try {
            Date pinjamDate = sdf.parse(tglPinjam);
            Date kembaliDate = sdf.parse(tglKembali);
            long differenceInMilliseconds = kembaliDate.getTime() - pinjamDate.getTime();
            long differenceInDays = (differenceInMilliseconds / (1000 * 60 * 60 * 24));
            terlambat = (int) differenceInDays;

            int finePerDay = 500;
            dendaTotal = terlambat > 0 ? terlambat * finePerDay : 0;

        } catch (ParseException e) {
            e.printStackTrace();
        }
     }
    
    
    
}
