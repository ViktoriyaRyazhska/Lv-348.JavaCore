package e_sixth_lesson.HW6.taskOne;

public class Main {
    public static void main(String[] arg) {
        Bird[] birds = {
                new Eagle("King", "Grey and Black", 13),
                new Swallow("Karin", "White", 11),
                new Penguin("Meruem", "Yellow", 15),
                new Chicken("Dark", "Brown", 12)
        };

        for (Bird e : birds) {
            System.out.println(e.getDescription());
            System.out.println(e);
            if (e.fly()) {
                System.out.println(e.getName() + " can fly.");
                System.out.println();

            } else {
                System.out.println(e.getName() + " can not fly.");
                System.out.println();
            }
        }
    }
}
