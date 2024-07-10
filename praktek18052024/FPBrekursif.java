/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek18052024;

/**
 *
 * @author Syafiq
 */
public class FPBrekursif {
    public static int fpbrekursif(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return fpbrekursif(y, x % y);
        }
    }

    public static void main(String[] args) {
        int x = 14;
        int y = 6;
        System.out.println("FPB dari " + x + " dan " + y + " adalah " + fpbrekursif(x, y));
    }
}

    
