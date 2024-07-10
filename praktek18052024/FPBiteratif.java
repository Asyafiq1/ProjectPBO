/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek18052024;

/**
 *
 * @author Syafiq
 */
public class FPBiteratif {
    public static int fpbIteratif(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        int x = 14;
        int y = 6;
        System.out.println("FPB dari " + x + " dan " + y + " adalah " + fpbIteratif(x, y));
    }
}

    

