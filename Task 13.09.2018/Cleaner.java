
public class Cleaner extends Staff {

	public Cleaner(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private final String TYPE_PERSON = "Cleaner";

	@Override
	public void salary() {
		System.out.println(555);
	}

	@Override
	public void print() {
		System.out.println("I am a" + TYPE_PERSON);

	}

}
