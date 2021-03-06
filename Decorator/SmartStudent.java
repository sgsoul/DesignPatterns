package Decorator;

public class SmartStudent extends StudentDecorator {
    IStudent student;
    public SmartStudent(IStudent student) {
        super(student);
    }

    public String sdatCoolLaby() {
        return "Лаба - 10/10, шедевр русского айти комьюнити. (Студент получает 12 баллов автоматом)";
    }

    @Override
    public String sdatLaby() {
        return super.sdatLaby() + sdatCoolLaby();
    }
}
