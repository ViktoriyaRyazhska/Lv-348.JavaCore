
import java.util.Scanner;
 
public class Circle {
 
  public static void main(String[] args) {
 
    System.out.print("������ ����� ����: ");
 
    Scanner scanner = new Scanner(System.in);
 
    int radius = scanner.nextInt();
 
    System.out.println("�������� ����: " + 2*Math.PI*radius);
    System.out.println("����� ����: " + Math.PI*Math.pow(radius, 2));
 
  }
 
}