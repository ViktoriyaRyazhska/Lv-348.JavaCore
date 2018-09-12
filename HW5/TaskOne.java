import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskOne {
	
	private int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private String needMonth;
	
	public void getMonthNum() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Введіть назву місяця щоб дізнатися кількість днів у ньому:");
		needMonth = br.readLine();
		
		switch(needMonth.toLowerCase()) {
		case "січень":
			System.out.println("У цьому місяці: " + monthDay[0] + " день");
			break;
		case "лютий":
			System.out.println("У цьому місяці: " + monthDay[1] + " днів");
			break;
		case "березень":
			System.out.println("У цьому місяці: " + monthDay[2] + " день");
			break;
		case "квітень":
			System.out.println("У цьому місяці: " + monthDay[3] + " днів");
			break;
		case "травень":
			System.out.println("У цьому місяці: " + monthDay[4] + " день");
			break;
		case "червень":
			System.out.println("У цьому місяці: " + monthDay[5] + " днів");
			break;
		case "липень":
			System.out.println("У цьому місяці: " + monthDay[6] + " день");
			break;
		case "серпень":
			System.out.println("У цьому місяці: " + monthDay[7] + " день");
			break;
		case "вересень":
			System.out.println("У цьому місяці: " + monthDay[8] + " днів");
			break;
		case "жовтень":
			System.out.println("У цьому місяці: " + monthDay[9] + " день");
			break;
		case "листопад":
			System.out.println("У цьому місяці: " + monthDay[10] + " днів");
			break;
		case "грудень":
			System.out.println("У цьому місяці: " + monthDay[11] + " день");
			break;
		default:
			System.out.println("Такого місяця не існує!");
			break;
		}
		
		
	}

}
