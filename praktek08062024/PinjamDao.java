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
public class PinjamDao {
    private List<Pinjam> data = new ArrayList();
    
     public PinjamDao(){
        data.add(new Pinjam("A123", "B001", "6-JUNI-2024", "10-JUNI-2024", 0, 0));
        data.add(new Pinjam("A124", "B002", "6-JUNI-2024", "20-JUNI-2024", 7, 35000));      
    }
     
     public void insert(Pinjam pinjam){
        data.add(pinjam);
    }
    
    public void update(int index, Pinjam pinjam){
        data.set(index, pinjam);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Pinjam getPinjam(int index){
        return data.get(index);
    }
    
    public List<Pinjam> getAll(){
        return data;
    }
    
}
