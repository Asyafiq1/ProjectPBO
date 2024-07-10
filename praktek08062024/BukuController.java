/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek08062024;

/**
 *
 * @author Syafiq
 */

import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;

public class BukuController {
    private formBuku formBuku;
    private Buku buku;
    private BukuDao bukuDao;
    
    public BukuController(formBuku formBuku){
        this.formBuku = formBuku;
        bukuDao = new BukuDao();
    }
     
    public void clearForm(){
        formBuku.getTxtKodeBuku().setText("");
        formBuku.getTxtJudul().setText("");
        formBuku.getTxtPengarang().setText("");
        formBuku.getTxtPenerbit().setText("");
        formBuku.getTxtTahunTerbit().setText("");
    }
    
    public void tampil(){
        DefaultTableModel tabelModel =(DefaultTableModel)
                formBuku.getTblBuku().getModel();
        tabelModel.setRowCount(0);
        List<Buku> list = bukuDao.getAll();
        for (Buku a : list){
            Object[] row = {
                a.getKodeBuku(),
                a.getJudul(),
                a.getPengarang(),
                a.getPenerbit(),
                a.getTahunTerbit(),
            };
            tabelModel.addRow(row);
        }
    }
    
    public void saveBuku(){
        buku = new Buku();
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudul(formBuku.getTxtJudul().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        buku.setTahunTerbit(Integer.valueOf(formBuku.getTxtTahunTerbit().getText()));
        bukuDao.insert(buku);
        JOptionPane.showMessageDialog(formBuku, "Insert OK");
    }
    
    public void updateBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        buku.setKodeBuku(formBuku.getTxtKodeBuku().getText());
        buku.setJudul(formBuku.getTxtJudul().getText());
        buku.setPengarang(formBuku.getTxtPengarang().getText());
        buku.setPenerbit(formBuku.getTxtPenerbit().getText());
        buku.setTahunTerbit(Integer.valueOf(formBuku.getTxtTahunTerbit().getText()));
        bukuDao.update(index, buku);
        JOptionPane.showMessageDialog(formBuku, "Update OK");
    }
    
     public void getBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        buku = bukuDao.getBuku(index);
        if(buku!=null){
            formBuku.getTxtKodeBuku().setText(buku.getKodeBuku());
            formBuku.getTxtJudul().setText(buku.getJudul());
            formBuku.getTxtPengarang().setText(buku.getPengarang());
            formBuku.getTxtPenerbit().setText(buku.getPenerbit());
            formBuku.getTxtTahunTerbit().setText(Integer.toString(buku.getTahunTerbit()));
        }
    }
     
     public void deleteBuku(){
        int index = formBuku.getTblBuku().getSelectedRow();
        bukuDao.delete(index);
        JOptionPane.showMessageDialog(formBuku, "Delete OK");
    }
    
}
