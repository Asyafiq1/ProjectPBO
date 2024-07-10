/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek18052024;

/**
 *
 * @author Syafiq
 */
public class FactorialRecursif {
    
  static int factorial(int n) {
 if (n == 1) { /* The base case */
 return 1;
 }
 
 /* Recursive definition; Self-invocation */
 return factorial(n-1)*n;
 }
  
 public static void main(String args[]) {
 int n = 1;
 System.out.println(factorial(n));
 }
}
