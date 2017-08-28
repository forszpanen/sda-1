package oop.inheritance;

/**
 * Created by RENT on 2017-07-25.
 */
public class StudentProgram {
    public static void main(String[] args) {
        Student studentUAM = new Student();
        Student studentPP = new Student();
        Student studentUEP = new Student();
        Student studentAWF = new Student();


        System.out.println(Student.liczbaStudentow);
        //analogicznie jak
        System.out.println(Math.pow(2, 3));
    }
}
