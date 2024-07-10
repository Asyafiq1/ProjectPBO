/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek25062024;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Syafiq
 */
public class WarnetDao {
    private List<Warnet> data = new ArrayList();
    
    public WarnetDao(){
        //data.add(new Warnet("A123", "SITI", "VIP", "10-JUNI-2024", "10:00", "12:00", "02:00"));
        //data.add(new Warnet("A124", "NUR", "GOLD", "20-JUNI-2024", "11:00", "14:00", "03:00",));      
    }
    
     public void insert(Warnet warnet){
        data.add(warnet);
    }
    
    public void update(int index, Warnet warnet){
        data.set(index, warnet);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Warnet getWarnet(int index){
        return data.get(index);
    }
    
    public List<Warnet> getAll(){
        return data;
    }
    
}
