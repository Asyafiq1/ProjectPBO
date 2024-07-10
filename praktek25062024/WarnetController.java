/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek25062024;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import praktek04062024.Anggota;

/**
 *
 * @author Syafiq
 */
public class WarnetController {
    private FormWarnet formWarnet;
    private Warnet warnet;
    private WarnetDao warnetDao;  // Declare an instance of WarnetDao
    
    public WarnetController(FormWarnet formWarnet){
        this.formWarnet = formWarnet;
        this.warnetDao = new WarnetDao();  // Initialize the WarnetDao instance
    }
    
    public void clearForm(){
        formWarnet.getTxtKode().setText("");
        formWarnet.getTxtNama().setText("");
        formWarnet.getTxtMasuk().setText("");
        formWarnet.getTxtKeluar().setText("");
        formWarnet.getTxtTanggal().setText("");
        formWarnet.getCbJenis().removeAllItems();
        formWarnet.getCbJenis().addItem("VIP");
        formWarnet.getCbJenis().addItem("Gold");
    }
     
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel) formWarnet.getTblWarnet().getModel();
        tabelModel.setRowCount(0);
        List<Warnet> list = warnetDao.getAll();  // Use the instance to call the method
        for (Warnet a : list){
            Object[] row = {
                a.getKodePelanggan(),
                a.getNamaPelanggan(),
                a.getJenisPelanggan(),
                a.getTglMasuk(),
                a.getJamMasuk(),
                a.getJamKeluar(),
                a.getLama(),
                a.getTarif(),
                a.getDiskon(),
                a.getTotalBayar(),
                a.calculateLama(),
                a.calculateTarif(),
                a.calculateDiskon(),
                a.calculateTotalBayar(),
            };
            tabelModel.addRow(row);
        }
    }
     
    public void saveWarnet(){
        warnet = new Warnet();
        warnet.setKodePelanggan(formWarnet.getTxtKode().getText());
        warnet.setNamaPelanggan(formWarnet.getTxtNama().getText());
        warnet.setJenisPelanggan(formWarnet.getCbJenis().getSelectedItem().toString());
        warnet.setTglMasuk(formWarnet.getTxtTanggal().getText());
        warnet.setJamMasuk(formWarnet.getTxtMasuk().getText());
        warnet.setJamKeluar(formWarnet.getTxtKeluar().getText());
        warnet.setLama(warnet.calculateLama());
        warnet.setTarif(warnet.calculateTarif());
        warnet.setDiskon(warnet.calculateDiskon());
        warnet.setTotalBayar(warnet.calculateTotalBayar());
        warnetDao.insert(warnet);  // Use the instance to call the method
        JOptionPane.showMessageDialog(formWarnet, "Insert OK");
    }
     
    public void updateWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnet.setKodePelanggan(formWarnet.getTxtKode().getText());
        warnet.setNamaPelanggan(formWarnet.getTxtNama().getText());
        warnet.setJenisPelanggan(formWarnet.getCbJenis().getSelectedItem().toString());
        warnet.setTglMasuk(formWarnet.getTxtTanggal().getText());
        warnet.setJamMasuk(formWarnet.getTxtMasuk().getText());
        warnet.setJamKeluar(formWarnet.getTxtKeluar().getText()); 
        warnet.setLama(warnet.calculateLama());
        warnet.setTarif(warnet.calculateTarif());
        warnet.setDiskon(warnet.calculateDiskon());
        warnet.setTotalBayar(warnet.calculateTotalBayar());
        warnetDao.update(index, warnet);  // Use the instance to call the method
        JOptionPane.showMessageDialog(formWarnet, "Update OK");
    }
    
    public void getWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnet = warnetDao.getWarnet(index);  // Use the instance to call the method
        if(warnet != null){
            formWarnet.getTxtKode().setText(warnet.getKodePelanggan());
            formWarnet.getTxtNama().setText(warnet.getNamaPelanggan());
            formWarnet.getTxtTanggal().setText(warnet.getTglMasuk());
            formWarnet.getCbJenis().setSelectedItem(warnet.getJenisPelanggan());
            formWarnet.getTxtKeluar().setText(warnet.getJamKeluar());
            formWarnet.getTxtMasuk().setText(warnet.getJamMasuk());
        }
    }
     
    public void deleteWarnet(){
        int index = formWarnet.getTblWarnet().getSelectedRow();
        warnetDao.delete(index);  // Use the instance to call the method
        JOptionPane.showMessageDialog(formWarnet, "Delete OK");
    }
}
