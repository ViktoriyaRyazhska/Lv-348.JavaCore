package e_sixth_lesson.HW6.taskOne;

public class Swallow extends FlyingBird {
    public Swallow(String name, String feathers, int layEggs) {
        super(name, feathers, layEggs);
    }

    @Override
    public String getDescription() {
        super.getDescription();
        return "I`m Swallow!";
    }
}
