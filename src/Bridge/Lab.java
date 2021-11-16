package Bridge;

public abstract class Lab {
    protected Teacher teacher;

    protected Lab(Teacher teacher) {
        this.teacher = teacher;
    }

    public abstract void takeLab();
}
