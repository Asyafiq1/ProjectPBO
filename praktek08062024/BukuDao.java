/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek08062024;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Syafiq
 */
public class BukuDao {
    private List<Buku> data = new ArrayList();
    
    public BukuDao(){
        data.add(new Buku("B001", "Ali sang pengembara", "Steffani. R", "PT. Indonusa", 2012));
        data.add(new Buku("B002", "Ani putri kecil ayah", "Aliyaa. H", "PT. Satudua", 2015));        
    }
    
     public void insert(Buku buku){
        data.add(buku);
    }
    
    public void update(int index, Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku> getAll(){
        return data;
    }
}
