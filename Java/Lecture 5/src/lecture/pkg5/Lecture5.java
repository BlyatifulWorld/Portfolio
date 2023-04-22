/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg5;
import java.util.Scanner;

/**
 *
 * @author Tay
 */
public class Lecture5 {

    /**
     * @param args the command line arguments
     */
    static void plus(){
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("กรุณากรอกตัวเลขแรก : ");
        int a = scan.nextInt();
        System.out.println("กรุณากรอกตัวเลขที่สอง : ");
        int b = scan.nextInt();
        double c = a + b;
        System.out.printf("%d + %d = %f \n", a, b, c);
    }
    
    static void minus(){
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("กรุณากรอกตัวเลขแรก : ");
        int a = scan.nextInt();
        System.out.println("กรุณากรอกตัวเลขที่สอง : ");
        int b = scan.nextInt();
        double c = a - b;
        System.out.printf("%d - %d = %f \n", a, b, c);
    }
    
    static void multiply(){
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("กรุณากรอกตัวเลขแรก : ");
        int a = scan.nextInt();
        System.out.println("กรุณากรอกตัวเลขที่สอง : ");
        int b = scan.nextInt();
        double c = a * b;
        System.out.printf("%d * %d = %f \n", a, b, c);
    }
    
    static void divide(){
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("กรุณากรอกตัวเลขแรก : ");
        int a = scan.nextInt();
        System.out.println("กรุณากรอกตัวเลขที่สอง : ");
        int b = scan.nextInt();
        double c = (a*1.0) / b;
        System.out.printf("%d / %d = %f \n", a, b, c);
    }
    

    static String calculator() {
        System.out.println("Calculator Program");
        System.out.println("หากต้องการ + : พิมพ์ + แล้ว Enter");
        System.out.println("หากต้องการ - : พิมพ์ - แล้ว Enter");
        System.out.println("หากต้องการ * : พิมพ์ * แล้ว Enter");
        System.out.println("หากต้องการ / : พิมพ์ / แล้ว Enter");
        System.out.println("หากต้องการกดออก : พิมพ์ q แล้ว Enter");
        System.out.println("หากพิมพ์คำสั่งอื่นจะไม่สามารถคำนวนได้");
        Scanner beam = new Scanner(System.in);
        String operator = beam.nextLine();
        switch (operator) {
            case "+": plus(); break;
            case "-": minus(); break;
            case "*": multiply(); break;
            case "/": divide(); break;
            case "q": System.out.println("จบการทำงาน ปิดโปรแกรม"); break;
            default: System.out.println("ใช้เฉพาะคำสั่งที่ใช้งานได้"); break;
        }
        return operator;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String command = "";
        while (!command.equals("q")) {
            command = calculator();
        }
    }
}
