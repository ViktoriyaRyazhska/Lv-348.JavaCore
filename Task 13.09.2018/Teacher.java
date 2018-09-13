
public class Teacher extends Staff {

	public Teacher(String name) {
		super(name);
	}

	private final String TYPE_PERSON = "Teacher";

	@Override
	public void salary() {
		System.out.println(777);

	}

	@Override
	public void print() {
		System.out.println("I am a" + TYPE_PERSON);
	}

}
