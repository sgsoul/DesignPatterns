package Decorator;

public class DefenceLab {
    public static void main(String[] args) {
        Student student = new SmartStudent(new DefaultStudent(new Student()));

        System.out.println(student.sdatLaby());
    }
}
