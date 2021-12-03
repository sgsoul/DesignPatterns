package Bridge;

public class DefenceLab {
    public static void main(String[] args) {
        Lab[] labs = {
                new DoneLab(new StrictTeacher()),
                new UnfinishedLab(new LoyalTeacher())
        };

        for(Lab lab: labs){
            lab.getDescription();
        }
    }
}