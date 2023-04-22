/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg7.lab;

/**
 *
 * @author Tay
 */
import java.util.Random;
import java.util.Arrays;
public class Lecture7Lab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Random rand = new Random();
        System.out.println(rand.nextInt());
        
        int id = 44010557; // random seed 
        Random rand2 = new Random(id); 
        System.out.println(rand2.nextInt());*/
        long id = 1112;
        Random rand3 = new Random(id);
        int[] a = new int[256];
        for(int i=0;i<a.length;i++) {
            a[i] = rand3.nextInt(10000);
        }
        System.out.println("ก่อนเรียงค่าในอะเรย์ " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("หลังเรียงค่าในอะเรย์ " + Arrays.toString(a));
    }
}
