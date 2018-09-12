import java.util.Scanner;

public class CarFinder{
	
	private int needYear;
	private int notNeedYear = 0;
	
	public void findCarModel(Car[] carDigest) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the year of issue: ");
		needYear = sc.nextInt();
		for(int i =0; i < carDigest.length; i++) {
			if(carDigest[i].getYear() == needYear) {
				System.out.println(carDigest[i]);
			} else {
				notNeedYear++;
			}
		}
		if(notNeedYear != 0 && notNeedYear == carDigest.length) {
			System.out.println("There are no cars released this year in the database");
		}
	}
		
}
