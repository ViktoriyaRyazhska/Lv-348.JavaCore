import java.util.Scanner;

public class Task5 implements Execute {
    Scanner sc = new Scanner(System.in);
    @Override
    public void exec() {
        getFifth(sc);
    }

    public static boolean getFifth(Scanner sc) {
        System.out.println("Task№5");
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        char[] arr = new char[s.length()];
        arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[arr.length - (i + 1)]) {
                System.out.println("False");
                return false;
            }
        }
        System.out.println("True");
        return true;
    }
}
