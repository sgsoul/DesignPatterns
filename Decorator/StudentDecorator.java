package Decorator;

public class StudentDecorator implements IStudent {
    IStudent student;

    public StudentDecorator(IStudent student) {
        this.student = student;
    }

    @Override
    public String sdatLaby() {
        return student.sdatLaby();
    }
}
