package Decorator;

public class DefaultStudent extends StudentDecorator {
    IStudent student;
    public DefaultStudent(IStudent student) {
        super(student);
    }

    public String sdatDefalutLaby() {
        return " Пытается не посыпаться на ловушках джокера.";
    }

    @Override
    public String sdatLaby() {
        return super.sdatLaby() + sdatDefalutLaby();
    }
}
