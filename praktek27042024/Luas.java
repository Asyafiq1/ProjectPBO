/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek27042024;

/**
 *
 * @author Syafiq
 */
public class Luas implements Relation{
    private int pjg;
    private int lbr;
    
    public Luas(){
        
    }
    
    public Luas(int pjg, int lbr){
        this.pjg=pjg;
        this.lbr=lbr;
    }
    
    public int getLuas(){
        int luas = pjg * lbr;
        return luas;
    }
    
    public boolean isGreater(Object a, Object b){
        double aLuas = ((Luas)a).getLuas();
        double bLuas = ((Luas)b).getLuas();
        return (aLuas > bLuas);
    }
    
    public boolean isLess(Object a, Object b){
        double aLuas = ((Luas)a).getLuas();
        double bLuas = ((Luas)b).getLuas();
        return (aLuas < bLuas);
    }
    
    public boolean isEqual(Object a, Object b){
        double aLuas = ((Luas)a).getLuas();
        double bLuas = ((Luas)b).getLuas();
        return (aLuas == bLuas);
    }
    
}
