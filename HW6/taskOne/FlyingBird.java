package e_sixth_lesson.HW6.taskOne;

public class FlyingBird extends Bird {

    public FlyingBird(String name, String feathers, int layEggs) {
        super(name, feathers, layEggs);
    }


    @Override
    public String getDescription() {
        return "I can fly!";
    }

    @Override
    public boolean fly() {
        return true;
    }

}
