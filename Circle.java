
import java.util.Scanner;
 
public class Circle {
 
  public static void main(String[] args) {
 
    System.out.print("Введіть радіус кола: ");
 
    Scanner scanner = new Scanner(System.in);
 
    int radius = scanner.nextInt();
 
    System.out.println("Периметр кола: " + 2*Math.PI*radius);
    System.out.println("Площа кола: " + Math.PI*Math.pow(radius, 2));
 
  }
 
}