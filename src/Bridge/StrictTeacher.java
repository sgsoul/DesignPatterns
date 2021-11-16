package Bridge;

public class StrictTeacher implements Teacher {
    @Override
    public void askQuestions() {
        System.out.println("Препод валит пиздец.");
    }
}
