/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg4.Lab;

/**
 *
 * @author Tay
 */
import java.util.Scanner;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Scanner thing = new Scanner(System.in); 
        System.out.print("Enter Your Thing = ");
        
        String x = thing.nextLine();

        switch(x) {
            case "+" :
                System.out.println("Plus");
                break;
            case "-" :
                System.out.println("Minus");
                break;
            default :
                System.out.println("Default");
                break;
        }*/
        int a = 10;
        int b =9;
        double c = 0;
        Scanner cream = new Scanner(System.in);
        String operator = cream.nextLine();
        System.out.println("Please enter operator + - * /");
        if(null == operator){
            System.out.println("Can only use + - * /");
        } else switch (operator) {
            case "+":
                c = a+b;
                System.out.println("Plus");
                break;
            case "-":
                c = a-b;
                System.out.println("Minus");
                break;
            case "*":
                c = a*b;
                System.out.println("Multiply");
                break;
            case "/":
                c = a/b;
                System.out.println("Divide");
                break;
            default:
                System.out.println("Can only use + - * /");
                break;
        }
    }
}
