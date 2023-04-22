/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture.pkg7;

/**
 *
 * @author Tay
 */
import java.util.Scanner;
import java.util.*;
public class Lecture7 {

    /**
     * @param args the command line arguments
     */
    public static double calculateSD(double a[])
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = a.length;

        for(double num : a) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: a) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
    public static double findMedian(double a[], int n)
    {
        Arrays.sort(a);

        if (n % 2 != 0)
            return (double)a[n / 2];
 
        return (double)(a[(n - 1) / 2] + a[n / 2]) / 2.0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        double[] a = {7, 8, 9, -1, 2, 5, -2, 20, 6};
        int n = a.length;
        double SD = calculateSD(a);
        System.out.format("Standard Deviation = %.6f \n", SD);
        System.out.println("Median = " + findMedian(a, n));
        /*max
        int max = a[0];
        for(int i=0;i<a.length;i++) {
            if(a[i]>max) {
                max = a[i];
            }
        }
        //min
        int min = a[0];
        for(int i=0;i<a.length;i++) {
            if(a[i]>min) {
                min = a[i];
            }
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("กรอกเลขที่ต้องการหา");
        int query = Integer.parseInt(scan.nextLine());
        System.out.println("---------------------------------");
        boolean isFound = false;
        for (int i=0;i<a.length;i++) {
            if(a[i]==query) {
                isFound = true;
                System.out.print("พบแล้ว");
                break;
            }
            System.out.println(a[i]);
        
        }*/
    }
}