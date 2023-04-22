package lecture.pkg10.quiz2;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecture10Quiz2 {

    static ArrayList<Subject> subject_list = new ArrayList<Subject>();
    
    public static void insertData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Subject data in format:");
        System.out.println("id,Subject Name,Credits");
        String line = sc.nextLine();
        String[] attriubutes = line.split(",");
        String id = attriubutes[0];
        String subjectName = attriubutes[1];
        int credits = Integer.parseInt(attriubutes[2]); 
        Subject InsertSubject = new Subject(id, subjectName, credits);
        
        for(int i=0;i<subject_list.size();i++){
            Subject subject = subject_list.get(i);
            if(subject.equals(InsertSubject)){
                System.out.println("มีนักเรียนรหัสนี้แล้วไม่สามารถเพิ่มเข้าไปได้");
                return; 
            }
        }
        
        subject_list.add(InsertSubject);
        System.out.println("บันทึกข้อมูล " + InsertSubject + " เรียบร้อย");
    }
     public static void showData(){
        System.out.println("List of Students");
        System.out.println("----------------------------------");
        for(int i=0;i<subject_list.size();i++){
            Subject subject = subject_list.get(i);
            System.out.println(subject);
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