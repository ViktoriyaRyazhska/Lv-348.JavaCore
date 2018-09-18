package e_sixth_lesson.HW6.taskOne;

public abstract class Bird {
    private String feathers;
    private int layEggs;
    private String name;

    public Bird(String name, String feathers, int layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeathers() {
        return feathers;
    }

    public void setFeathers(String feathers) {
        this.feathers = feathers;
    }

    public int getLayEggs() {
        return layEggs;
    }

    public void setLayEggs(int layEggs) {
        this.layEggs = layEggs;
    }

    public abstract boolean fly();
    public abstract String getDescription();

    @Override
    public String toString() {
        return "Bird{" +
                "Name='" + name + '\'' +
                ", layEggs=" + layEggs +
                ", feathers='" + feathers + '\'' +
                '}';
    }
}
