
public class Student extends Person {
	
	public Student(String name) {
		super(name);
	}

	private final String TYPE_PERSON = "Student";

	@Override
	public void print() {

		System.out.println("I'm " + TYPE_PERSON);
		
	}

}
