/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg6;

/**
 *
 * @author Tay
 */
public class Lecture6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0;
        while(i < 10) {
            System.out.println("While Loop" + i);
            i++;
        }
        for(int j=0;j < 10;j++) {
            if(j > 2 && j< 8)break; //ใส่เงื่อนไขให้หยุดการทำงานฟังก์ชัน For Loop
            System.out.println("For Loop" + j);
            
           if(j > 2 && j< 8)continue;
           System.out.println("For Loop" + j);
        }
    }
}
