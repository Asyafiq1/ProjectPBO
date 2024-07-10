/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek08062024;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Syafiq
 */
public class PinjamController {
   private formPinjam form;
    private List<Pinjam> data;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public PinjamController(formPinjam form) {
        this.form = form;
        data = new ArrayList<>();
    }

    public void clearForm() {
        form.getTxtkodeAnggota().setText("");
        form.getTxtkodeBuku().setText("");
        form.getTxtTanggal().setText("");
        form.getTxtKembali().setText("");
        form.getTxtTerlambat().setText("");
        form.getTxtDenda().setText("");
    }

    public void tampil() {
        // Logic to display data in the table
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) form.getTblPinjam().getModel();
        model.setRowCount(0); // Clear the table first
        for (Pinjam p : data) {
            Object[] row = {
                p.getKodeAnggota(),
                p.getKodeBuku(),
                p.getTglPinjam(),
                p.getTglKembali(),
                p.getTerlambat(),
                p.getDendaTotal()
            };
            model.addRow(row);
        }
    }

    public void savePinjam() {
        try {
            String kodeAnggota = form.getTxtkodeAnggota().getText();
            String kodeBuku = form.getTxtkodeBuku().getText();
            String tglPinjam = form.getTxtTanggal().getText();
            String tglKembali = form.getTxtKembali().getText();

            Date pinjamDate = sdf.parse(tglPinjam);
            Date kembaliDate = sdf.parse(tglKembali);
            long differenceInMilliseconds = kembaliDate.getTime() - pinjamDate.getTime();
            int terlambat = (int) (differenceInMilliseconds / (1000 * 60 * 60 * 24));
            int dendaTotal = terlambat > 0 ? terlambat * 500 : 0;

            form.getTxtTerlambat().setText(String.valueOf(terlambat));
            form.getTxtDenda().setText(String.valueOf(dendaTotal));

            Pinjam pinjam = new Pinjam(kodeAnggota, kodeBuku, tglPinjam, tglKembali, terlambat, dendaTotal);
            data.add(pinjam);
            tampil();
            clearForm();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void updatePinjam() {
        // Logic to update pinjam data
        int selectedRow = form.getTblPinjam().getSelectedRow();
        if (selectedRow != -1) {
            try {
                String kodeAnggota = form.getTxtkodeAnggota().getText();
                String kodeBuku = form.getTxtkodeBuku().getText();
                String tglPinjam = form.getTxtTanggal().getText();
                String tglKembali = form.getTxtKembali().getText();

                Date pinjamDate = sdf.parse(tglPinjam);
                Date kembaliDate = sdf.parse(tglKembali);
                long differenceInMilliseconds = kembaliDate.getTime() - pinjamDate.getTime();
                int terlambat = (int) (differenceInMilliseconds / (1000 * 60 * 60 * 24));
                int dendaTotal = terlambat > 0 ? terlambat * 500 : 0;

                form.getTxtTerlambat().setText(String.valueOf(terlambat));
                form.getTxtDenda().setText(String.valueOf(dendaTotal));

                Pinjam pinjam = new Pinjam(kodeAnggota, kodeBuku, tglPinjam, tglKembali, terlambat, dendaTotal);
                data.set(selectedRow, pinjam);
                tampil();
                clearForm();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    public void deletePinjam() {
        // Logic to delete pinjam data
        int selectedRow = form.getTblPinjam().getSelectedRow();
        if (selectedRow != -1) {
            data.remove(selectedRow);
            tampil();
            clearForm();
        }
    }

    public void getPinjam() {
        // Logic to get selected pinjam data
        int selectedRow = form.getTblPinjam().getSelectedRow();
        if (selectedRow != -1) {
            Pinjam pinjam = data.get(selectedRow);
            form.getTxtkodeAnggota().setText(pinjam.getKodeAnggota());
            form.getTxtkodeBuku().setText(pinjam.getKodeBuku());
            form.getTxtTanggal().setText(pinjam.getTglPinjam());
            form.getTxtKembali().setText(pinjam.getTglKembali());
            form.getTxtTerlambat().setText(String.valueOf(pinjam.getTerlambat()));
            form.getTxtDenda().setText(String.valueOf(pinjam.getDendaTotal()));
        }
    } 
    
    
    public void calculateTerlambatAndDenda(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date tglPinjam = sdf.parse(form.getTxtTanggal().getText());
            Date tglKembali = sdf.parse(form.getTxtKembali().getText());

            long diffInMillies = tglKembali.getTime() - tglPinjam.getTime();
            long diff = diffInMillies / (1000 * 60 * 60 * 24);

            int terlambat = (int) Math.max(0, diff - 7); // Assuming a 7-day borrow period
            int dendaTotal = terlambat * 500; // Assuming a fine of 500 per day of delay

            form.getTxtTerlambat().setText(String.valueOf(terlambat));
            form.getTxtDenda().setText(String.valueOf(dendaTotal));
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(form, "Format tanggal salah. Gunakan format dd-MMM-yyyy.");
        }
    }
    }

    
   
    

