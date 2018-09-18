package e_sixth_lesson.HW6.taskOne;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(String name, String feathers, int layEggs) {
        super(name, feathers, layEggs);
    }

    @Override
    public String getDescription() {
        return "I can not fly..";
    }

    @Override
    public boolean fly() {
        return false;
    }
}
