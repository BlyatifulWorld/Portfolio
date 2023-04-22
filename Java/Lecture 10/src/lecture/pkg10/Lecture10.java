package lecture.pkg10;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecture10 {
    static ArrayList<Student> student_list = new ArrayList<Student>();
    
    public static void insertData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Student data in format:");
        System.out.println("id,name,major,gpax");
        String line = sc.nextLine();
        String[] attriubutes = line.split(",");
        String id = attriubutes[0];
        String name = attriubutes[1];
        String major = attriubutes[2];
        double gpax = Double.parseDouble(attriubutes[3]); 
        Student inserted_student = new Student(id, name, major, gpax );
        
        for(int i=0;i<student_list.size();i++){
            Student student = student_list.get(i);
            if(student.equals(inserted_student)){
                System.out.println("มีนักเรียนรหัสนี้แล้วไม่สามารถเพิ่มเข้าไปได้");
                return; 
            }
        }
        
        student_list.add(inserted_student);
        System.out.println("บันทึกข้อมูล " + inserted_student + " เรียบร้อย");
    }
     public static void showData(){
        System.out.println("List of Students");
        System.out.println("----------------------------------");
        for(int i=0;i<student_list.size();i++){
            Student student = student_list.get(i);
            System.out.println(student);
        }
        System.out.println("----------------------------------");
        
    }

    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       String command = "";
       do{
           System.out.println("Please Choose Operation : ");
           System.out.println("Press 1 to insert Student Data ");
           System.out.println("Press 2 to show List of students ");
           System.out.println("Press q to quit ");
           
           command = sc.nextLine();
           
           if(command.equals("1")){
               insertData();
           }else if(command.equals("2")){
               showData();
           } 
       }while(!command.equals("q"));  
    }

}