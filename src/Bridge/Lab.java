package Bridge;

public abstract class Lab {
    protected Teacher teacher;

    public Lab(Teacher teacher) {
        this.teacher = teacher;
    }

    public abstract void getDescription();
}
