public class DayOfTheWeek {
	public static void main(String[] args) {
		
		check(7);
		
	}
	
	static void check(int x) {
		switch(x) {
		case 1:
			System.out.println("Понеділок - Monday - Понедельник");
			break;
		case 2:
			System.out.println("Вівторок - Tuesday - Вторник");
			break;
		case 3:
			System.out.println("Середа - Wednesday - Среда");
			break;
		case 4:
			System.out.println("Четвер - Thursday - Четверг");
			break;
		case 5:
			System.out.println("П'ятниця - Friday - Пятница");
			break;
		case 6:
			System.out.println("Субота - Saturday - Суббота");
			break;
		case 7:
			System.out.println("Неділя - Sunday - Воскресенье");
			break;
		default:
			System.out.println("It isn't a day of the week");
		}
	}
}
