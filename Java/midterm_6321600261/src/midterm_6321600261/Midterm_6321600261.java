/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm_6321600261;

/**
 *
 * @author 6321600261 นายกรกช หมั่นค้า
 */
import java.util.Scanner;
import java.util.*;
import java.util.stream.IntStream;
public class Midterm_6321600261 {

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
        long id = 6321600261l;
        Random rand3 = new Random(id);
        
        double[] a = new double[120];
        int n = a.length;
        for(int i=0;i<a.length;i++) {
            a[i] = rand3.nextInt(49999);
        }
        double min = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        double max = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
       
        System.out.println("ก่อนเรียงค่าในอะเรย์ \n" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("หลังเรียงค่าในอะเรย์ \n" + Arrays.toString(a));

        System.out.println("ค่าต่ำสุดในอะเรย์ = " + min);
        System.out.println("ค่าสูงสุดในอะเรย์ = " + max);

        System.out.println("มัธยฐาน = " + findMedian(a, n));
        
        Scanner Search = new Scanner(System.in);
        System.out.println("กรุณากรอกเลขที่ต้องการค้นหา");
        int query = Integer.parseInt(Search.nextLine()); 
        boolean isFound = false; 
        for(int i=0;i<a.length;i++){
            if(a[i]==query){ 
                isFound = true; 
                break; 
            }
        }
        int indexOfElement = IntStream.range(0, a.length).
                filter(i -> query == a[i]).
                findFirst().orElse(-1);
        if(isFound)
            System.out.printf("พบตัวเลข %d ในอะเรย์ ลำดับที่ = %d \n" , query, indexOfElement);
        else
            System.out.printf("ไม่พบตัวเลข %d ในอะเรย์ \n" , query);
        
        double total = 0;
        for(int i=0; i<a.length; i++){
        	total = total + a[i];
        }
        double average = total / a.length;
        
        System.out.format("ค่าเฉลี่ยของอะเรย์คือ %.3f \n", average);
        
        double SD = calculateSD(a);
        System.out.format("ส่วนเบี่บงเบนมาตรฐานคือ %.6f ", SD);
    }
}
