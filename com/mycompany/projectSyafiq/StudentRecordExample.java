/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectSyafiq;

/**
 *
 * @author Syafiq
 */
public class StudentRecordExample extends StudentRecord {
    public static void main(String[] args){
        StudentRecord student1 = new StudentRecord();
        student1.setName("Ali");
        student1.setAddress("Padang");
        student1.setAge(20);
        student1.setMathGrade(90);
        student1.setEnglishGrade(70);
        student1.setScienceGrade(80);
        
        System.out.println("Nama                ="+student1.getName());
        System.out.println("Alamat              ="+student1.getAddress());
        System.out.println("Umur                ="+student1.getAge());
        System.out.println("Matematika          ="+student1.getMathGrade());
        System.out.println("B. Inggris          ="+student1.getEnglishGrade());
        System.out.println("Ilmu Pengetahuan    ="+student1.getScienceGrade());
        System.out.println("Rata-Rata           ="+student1.getAverage());
        
        System.out.println("Bnayak Siswa        ="+StudentRecord.getStudentCount());
        
        System.out.println("==================");
        student1.print(student1.getName());
        System.out.println("==================");
        student1.print(student1.getEnglishGrade(), student1.getMathGrade(), student1.getScienceGrade());
        
        StudentRecord annaRecord = new StudentRecord("anna");
        StudentRecord aliRecord = new StudentRecord("ali","padang");
        StudentRecord deniRecord = new StudentRecord(90,80,60);
        
        annaRecord.print(annaRecord.getName());
        aliRecord.print(aliRecord.getName());
        deniRecord.print(deniRecord.getEnglishGrade(), deniRecord.getMathGrade(), deniRecord.getScienceGrade());
                
        System.out.println("Banyak Siswa        ="+StudentRecord.getStudentCount());
        
       
    }
    }
    

