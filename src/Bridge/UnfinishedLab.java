package Bridge;

public class UnfinishedLab extends Lab {

    protected UnfinishedLab(Teacher teacher) {
        super(teacher);
    }

    @Override
    public void takeLab() {
        System.out.println("Сдается незаконченная лаба (R.I.P.)");
        teacher.askQuestions();
    }
}
