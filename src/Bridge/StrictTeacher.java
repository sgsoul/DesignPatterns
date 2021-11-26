package Bridge;

public class StrictTeacher implements Teacher {
    @Override
    public void askQuestions(Lab lab) {
        System.out.println("Препод валит пиздец.");
    }
}
