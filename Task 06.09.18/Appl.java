
public class Appl {

	public static void main(String[] args) {
		
		check("A");

	}

	public static void check(String s) {
		Continents cont;
		switch (s) {
		case "Izrail":
		case "India":
		case "Irak":
			System.out.println(cont = Continents.ASIA);
			break;
		case "Ukrain":
		case "Avstria":
		case "Grusia":
			System.out.println(cont = Continents.EUROPA);
			break;
		}
	}
}
