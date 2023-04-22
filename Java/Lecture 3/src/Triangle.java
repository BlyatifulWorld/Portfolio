
public class Triangle {
    public static void main(String[] args) {
        System.out.println("โปรแกรมสามเหลี่ยม");
        java.util.Scanner scan = new java.util.Scanner(System.in); //สร้างออบเจคของคลาส Scanner
        double h = scan.nextDouble(); //เรียกคำสั่ง nextDouble จาก ออบเจคของคลาส Scannner
        double w = scan.nextDouble();
        
        double area = 0.5*h*w;
        
        System.out.println(area);
        
        double y = 5*6+3/2-8%3;
        System.out.println(y);
    }
}
