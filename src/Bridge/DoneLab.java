package Bridge;

public class DoneLab extends Lab {

    protected DoneLab(Teacher teacher) {
        super(teacher);
    }

    @Override
    public void takeLab() {
        System.out.println("Сдается готовая лаба");
        teacher.askQuestions();
    }
}
