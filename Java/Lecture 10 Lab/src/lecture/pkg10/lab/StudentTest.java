package lecture.pkg10.lab;

import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) {
        int numberOfstudents = 10;
        
        Student john = new Student("001", "John", "Art", 3.19);
        Student tanjiro = new Student("002", "Tanjiro", "Enigneer", 2.76);
        Student inosuke = new Student("003", "Inosuke", "Science", 2.9);
        Student zenitsu = new Student("004", "Zenitsu", "IT", 1.5);
        Student noah = new Student("005", "Noah", "IT", 3.05);
        Student tyrone = new Student("006", "Tyone", "IT", 2.05);
        Student hamand = new Student("007", "Hamand", "IT", 3.11);
        Student rudy = new Student("008", "Rudy", "IT", 3.45);
        Student fritz = new Student("009", "Fritz", "IT", 3.44);
        Student eris = new Student("010", "Eris", "Sport", 3.26);
        
        Student[] student_array = new Student[10];
        student_array[0] = john;
        student_array[1] = tanjiro;
        student_array[2] = inosuke;
        student_array[3] = zenitsu;
        student_array[4] = noah;
        student_array[5] = tyrone;
        student_array[6] = hamand;
        student_array[7] = rudy;
        student_array[8] = fritz;
        student_array[9] = eris;

        Arrays.sort(student_array);
        System.out.println("หลังเรียงค่าใน array");
        for(Student s : student_array){
            System.out.println(s);
        }
    }
}
