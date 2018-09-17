import java.util.Scanner;

public class ThreeFloats {
	
	 private static Scanner input = new Scanner(System.in);
	 private static float num1, num2, num3;
	 public static void main(String[] args) {
		
		
		
		System.out.println("Enter three numbers");
		num1 = Float.parseFloat(input.nextLine());
		num2 = Float.parseFloat(input.nextLine());
		num3 = Float.parseFloat(input.nextLine());
		
		checkForRange(num1);
		checkForRange(num2);
		checkForRange(num3);
	}
	
	public static boolean checkForRange(float num1) {
		if (num1 >= -5 && num1 <= 5) {
			System.out.println("Your number belongs to the range [-5; 5]");
			return true;
		} else {
			System.out.println("Your number doesn't belong to the range [-5; 5]");
			return false;
		}
		
		
	}

}
