package Decorator;

public class DefenceLab {
    public static void main(String[] args) {
        IStudent student;
        student = new SmartStudent(new DefaultStudent(new Student()));

        System.out.println(student.sdatLaby());
    }
}
