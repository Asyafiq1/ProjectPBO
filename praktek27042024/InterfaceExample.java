/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek27042024;

/**
 *
 * @author Syafiq
 */

public class InterfaceExample {
    public static void main(String[] args){
        Relation MyInteger = new MyInteger();
        System.out.println(MyInteger.isGreater(6,4));
        
        Relation MyDouble = new MyDouble();
        System.out.println(MyDouble.isGreater(6.1, 4.9));
        
        Line line1 = new Line(1,5,2,4);
        Line line2 = new Line(2,4,1,3);
        
        Relation line = new Line();
        System.out.println(line.isGreater(line1,line2));
        System.out.println("Line 1  : "+line1.getLength());
        System.out.println("Line 2  : "+line2.getLength());
        
        Luas luas1 = new Luas(8,2);
        Luas luas2 = new Luas(10,2);
        
        
        Relation luas = new Luas();
        System.out.println(luas.isGreater(luas1,luas2));
        System.out.println("Luas 1  : "+luas1.getLuas());
        System.out.println("Luas 2  : "+luas2.getLuas());
        
    }
    
}
