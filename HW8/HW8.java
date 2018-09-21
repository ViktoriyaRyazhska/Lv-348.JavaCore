package g_eights_lesson;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HW8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String currency;
        getFirstTask(sc);
        System.out.println(getSecondTask(sc));

        System.out.print("Enter curreny: ");
        currency = sc.nextLine();
        System.out.println(getUScurrency(currency));
    }

    public static void getFirstTask(Scanner sc) {
        String sentence = new String();
        String arr[] = new String[5];
        StringBuilder sb = new StringBuilder();
        String temp = "";
        int index = 0;

        System.out.print("Enter sentence of five words: ");
        sentence = sc.nextLine();

        arr = sentence.split(" ");
        sb.append(arr[1]);
        sb.reverse();
        arr[1] = sb.toString();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > temp.length()) {
                temp = arr[i];
                index = i;
            }
        }
        System.out.printf("The longest word is: %s %n", temp);
        System.out.printf("The index of it is : %d %n", index);
        System.out.printf("The second word(reverse): %s %n", arr[1]);
    }

    public static String getSecondTask(Scanner sc) {
        String sentence;
        System.out.print("Enter a sentence: ");
        sentence = sc.nextLine();

        StringBuffer sb = new StringBuffer(sentence);
        char[] arr = new char[sb.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sb.charAt(i);
        }
        int countDelete = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == arr[i + 1]) && (arr[i] == ' ')) {
                sb.delete(i - countDelete, i - countDelete + 1);
                countDelete++;
            }
        }
        sentence = sb.toString();
        return sentence;
    }

    public static boolean getUScurrency(String currency) {
        Pattern p = Pattern.compile("\\$([0-9]*)(\\.[0-9]{2})");
        Matcher m = p.matcher(currency);
        return m.matches();
    }
}
/*Implement a pattern for US currency: the first symbol "$",
then any number of digits, dot and two digits after the dot.
Enter the text from the console that contains several occurrences of US currency.
Display all occurrences on the screen.
 */

