/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek25062024;

/**
 *
 * @author Syafiq
 */
public class Warnet {
    
    private String kodePelanggan;
    private String namaPelanggan;
    private String jenisPelanggan;
    private String tglMasuk;
    private String jamMasuk;
    private String jamKeluar;
    private int lama;
    private double tarif;
    private double diskon;
    private double totalBayar;

    // Getters and Setters
    
    public int calculateLama() {
        // Example calculation, convert the time to minutes or hours as needed
        int masukHour = Integer.parseInt(jamMasuk.split(":")[0]);
        int masukMinute = Integer.parseInt(jamMasuk.split(":")[1]);
        int keluarHour = Integer.parseInt(jamKeluar.split(":")[0]);
        int keluarMinute = Integer.parseInt(jamKeluar.split(":")[1]);

        return (keluarHour * 60 + keluarMinute) - (masukHour * 60 + masukMinute);
    }

    public int calculateTarif() {
        int perHourRate = 5000; // Example rate per hour
        return (calculateLama() / 60) * perHourRate;
    }

    public int calculateDiskon() {
        // Example: 10% discount for VIP
        if (jenisPelanggan.equals("VIP")) {
            return calculateTarif() / 10;
        }
        return 0;
    }

    public int calculateTotalBayar() {
        return calculateTarif() - calculateDiskon();
    }

    public String getKodePelanggan() {
        return kodePelanggan;
    }

    public void setKodePelanggan(String kodePelanggan) {
        this.kodePelanggan = kodePelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getJenisPelanggan() {
        return jenisPelanggan;
    }

    public void setJenisPelanggan(String jenisPelanggan) {
        this.jenisPelanggan = jenisPelanggan;
    }

    public String getTglMasuk() {
        return tglMasuk;
    }

    public void setTglMasuk(String tglMasuk) {
        this.tglMasuk = tglMasuk;
    }

    public String getJamMasuk() {
        return jamMasuk;
    }

    public void setJamMasuk(String jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public String getJamKeluar() {
        return jamKeluar;
    }

    public void setJamKeluar(String jamKeluar) {
        this.jamKeluar = jamKeluar;
    }

    public int getLama() {
        return lama;
    }

    public void setLama(int lama) {
        this.lama = lama;
    }

    public double getTarif() {
        return tarif;
    }

    public void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public double getTotalBayar() {
        return totalBayar;
    }

    public void setTotalBayar(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    public void calculate() {
        // Calculate lama in hours
        String[] jamMasukParts = jamMasuk.split(":");
        String[] jamKeluarParts = jamKeluar.split(":");
        int masukHours = Integer.parseInt(jamMasukParts[0]);
        int masukMinutes = Integer.parseInt(jamMasukParts[1]);
        int keluarHours = Integer.parseInt(jamKeluarParts[0]);
        int keluarMinutes = Integer.parseInt(jamKeluarParts[1]);

        lama = (keluarHours * 60 + keluarMinutes) - (masukHours * 60 + masukMinutes);
        lama = lama / 60; // Convert minutes to hours

        // Calculate discount
        if (jenisPelanggan.equals("VIP") && lama >= 2) {
            diskon = tarif * lama * 0.02;
        } else if (jenisPelanggan.equals("Gold") && lama >= 2) {
            diskon = tarif * lama * 0.05;
        } else {
            diskon = 0;
        }

        // Calculate total bayar
        totalBayar = tarif * lama - diskon;
    }
    
}
