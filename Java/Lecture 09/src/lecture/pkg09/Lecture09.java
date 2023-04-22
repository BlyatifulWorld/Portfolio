package lecture.pkg09;

public class Lecture09 {
  
    public static void main(String[] args) {
        Student tanjiro = new Student();
        tanjiro.setId("001");
        tanjiro.setName("Tanjiro");
        tanjiro.setMajor("Enjineer");
        tanjiro.setGpax(3.12);
        
        Student john = new Student();
        john.setId("002");
        john.setName("John");
        john.setMajor("Physics");
        john.setGpax(2.7);
        
        Student noah = new Student();
        noah.setId("003");
        noah.setName("Noah");
        noah.setMajor("Art");
        noah.setGpax(2.6);
        
        Student tay = new Student();
        tay.setId("004");
        tay.setName("Tay");
        tay.setMajor("IT");
        tay.setGpax(3.33);
        
        System.out.println("Tanjiro id = " + tanjiro.getId()); 
        System.out.println("John id = " + john.getId()); 
        System.out.println("Noah id = " + noah.getId()); 
        System.out.println("Tay id = " + tay.getId()); 
    }
    
 }
    