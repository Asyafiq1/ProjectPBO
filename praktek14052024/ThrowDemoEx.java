/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek14052024;

/**
 *
 * @author Syafiq
 */
public class ThrowDemoEx {
     public static void main(String[] args){
        String input = "0,1,2,3,4,5,6,7,8,9,10";
        try{
            if(input.equals("0,1,2,3,4,5,6,7,8,9,10")){
                System.out.println("1,3,5,7,9");
            }else{
                throw new RuntimeException("input minus");
            }
        } catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
