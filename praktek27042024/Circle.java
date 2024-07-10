/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek27042024;

/**
 *
 * @author Syafiq
 */
public class Circle extends Shape{
    private int jari;
    
    public Circle(){
        
    }
    
    public int getJari(){
        return jari;
    }
    
    public void setJari(int jari){
        this.jari=jari;
    }
    
    public String getName(){
        return "Circle";
    }
    
    public double getArea(){
        return 3.14 * jari * jari;
    }
    
     public static void main(String[] args){
        Circle circle = new Circle();
        circle.setJari(7);
        System.out.println("Nama    :"+circle.getName());
        System.out.println("Luas    :"+circle.getArea());
    }
    
}
