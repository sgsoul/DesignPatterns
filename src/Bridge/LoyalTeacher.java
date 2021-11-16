package Bridge;

public class LoyalTeacher implements Teacher{
    @Override
    public void askQuestions() {
        System.out.println("Препод не задает ловушек джокера и не валит (зайка)");
    }
}
