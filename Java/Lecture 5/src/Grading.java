/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tay
 */
import java.util.Scanner; 
public class Grading {
    public static void main(String[] args){
        String command = "";
        java.util.Scanner scan = new java.util.Scanner(System.in);

        while (!command.equals("q")) {
            System.out.println("กรุณากรอกคะแนน");
             //logic การตัดเกรดที่นี่
            int score = scan.nextInt();
            String grade = "";

            if (score >= 80) {
                grade = "A";
            } else if (score >= 70) {
                grade = "B";
            } else if (score >= 60) {
                grade = "C";
            } else if (score >= 50) {
                grade = "D";
            } else {
                grade = "F";
            }
            System.out.printf("Grade = %s \n", grade);
            
            System.out.println("ต้องการทำงานต่อหรือไม่ ?");
            System.out.println("ต้องการทำงานต่อ กด enter ");
            System.out.println("หากต้องการกดออก พิมพ์ q แล้ว enter");
            scan.nextLine();//จัดการกับ key enter (hotfix)
            command = scan.nextLine();
        }
    }
}
/* String command = ""; FAILED CODE
        Scanner seem = new Scanner(System.in);
        System.out.println("ต้องการกรอกคะแนนต่อหรือไม่");
        System.out.println("หากต้องการกรอกคะแนนต่อ กด q Enter");
        System.out.println("หากไม่ต้องการกรอกคะแนนต่อ กด e แล้ว Enter");
        
        String question = seem.nextLine();
        if (question == "q") {
            System.out.println("กรุณากรอกคะแนน");
            int score = seem.nextInt();
            
            String grade = "";
            if(score >= 80 && score < 100) {
                grade = "A";
                } else if (score >= 70) {
                grade = "B";
                } else if (score >= 60) {
                grade = "C";
                } else if (score >= 50) {
                grade = "D";
                } else {
                grade = "F";
            } 
            System.out.printf("คะแนน = %d เกรด = %s \n", score, grade);
        } else if (question == "e") {
            System.out.println("จบการทำงาน");
        } */
