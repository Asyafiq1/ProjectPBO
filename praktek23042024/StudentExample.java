/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktek23042024;

/**
 *
 * @author Syafiq
 */
public class StudentExample {
    
    public static void main(String[] args){
        Person ref;
        Student ayu = new Student(); 
        ayu.setName("ayu");
        ayu.setAddress("Padang");
        Employee budi = new Employee();
        budi.setName("budi");
        budi.setAddress("Bukittinggi");
        
        ref = ayu;
        System.out.println("nama siswa  :"+ref.getName());
        System.out.println("Alamat  :"+ref.getAddress());
        
        ref = budi;
        System.out.println("nama karyawan   :"+ref.getName());
        System.out.println("Alamat  :"+ref.getAddress());  
        
        printInformation(ayu);
        printInformation(budi); 
    }
    
    public static void printInformation(Person p){
        if(p instanceof Student){
            System.out.println("Nama Siswa :"+p.getName());
            System.out.println("Alamat :"+p.getAddress());
    }
        if(p instanceof Employee){
            System.out.println("Nama karyawan :"+p.getName());
            System.out.println("Alamat :"+p.getAddress());
    }    
    }
   
    
}
