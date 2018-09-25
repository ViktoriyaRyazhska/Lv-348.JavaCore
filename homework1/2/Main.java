
public class Main {

	public static void main(String[] args) {
		try {

			Plant[] pl = new Plant[3];

			pl[0] = new Plant(5, "red", "rose");
			pl[1] = new Plant(20, "blue", "violet");
			pl[2] = new Plant(10, "white", "chamomile");

			for (int i = 0; i < pl.length; i++) {

				System.out.println(pl[i]);
			}

		} catch (ColorException | TypeException e) {

			System.err.println(e.getMessage() + "\n");

			e.printStackTrace();
		}
	}

}
