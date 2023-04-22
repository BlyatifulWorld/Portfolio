/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg08;

/**
 *
 * @author Tay
 */
import java.util.ArrayList;
public class Lecture08 {
    /*static void First() {
        System.out.println("ID = 001, Name = Tajiro, Major = Engineer, GPAX = 3.12");
    }*/
    public static void main(String[] args) {
        // First(); Glorified Bruteforce 
        Student student1 = new Student(); //สร้างตัวแปร studen1 ชนิดข้อมูล Student ที่เราสร้างมาเองในคลาส Student
        student1.id="001"; //กำหนดค่า id ของ student1 เป็น 001
        student1.name="Tanjiro";
        student1.major="Engineer";
        student1.gpax=3.12;
        
        Student student2 = new Student(); //สร้างตัวแปร studen1 ชนิดข้อมูล Student ที่เราสร้างมาเองในคลาส Student
        student2.id="002";
        student2.name="John"; //กำหนดค่า name ของ student2
        student2.major="Physics";
        student2.gpax=2.7;
        
        Student student3 = new Student(); //สร้างตัวแปร studen1 ชนิดข้อมูล Student ที่เราสร้างมาเองในคลาส Student
        student3.id="003";
        student3.name="Noah";
        student3.major="Art";
        student3.gpax=2.6;
        
        Student student4 = new Student(); //สร้างตัวแปร studen1 ชนิดข้อมูล Student ที่เราสร้างมาเองในคลาส Student
        student4.id="004";
        student4.name="Max";
        student4.major="IT";
        student4.gpax=2.2;
        
        System.out.println();
    }
}
