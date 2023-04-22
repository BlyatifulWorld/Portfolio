/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg4;

/**
 *
 * @author Tay
 */
import java.util.Scanner;
public class Lecture4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //If
        //If-Else
        //If-Else If-If
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your score = ");
        //รับค่า score
        int score = sc.nextInt();
        
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
           
        System.out.printf("Grade = %s \n", grade);
    }
    
}
