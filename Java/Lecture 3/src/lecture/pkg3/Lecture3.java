/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg3;

/**
 *
 * @author Tay
 */
public class Lecture3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //คำนวณพื้้นที่วงกลม   a = 3.14*r*r;
        //input : ข้อมูลนำเข้า
        //ระบุ package
        System.out.println("โปรแกรมวงกลม");
        java.util.Scanner scan = new java.util.Scanner(System.in); //สร้างออบเจคของคลาส Scanner
        double r = scan.nextDouble(); //เรียกคำสั่ง nextDouble จาก ออบเจคของคลาส Scannner
          
        //process : ประมวลผล
        double PI = 3.14; // กำหนดค่า PI เป็น 3.14
        double area =  PI*r*r; // กำหนดให้ area มีค่า PI*r*r;
          
        //output : ข้อมูลส่งออก
        System.out.println(area);
    }
    
}
