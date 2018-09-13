
public class MainPerson {

	public static void main(String[] args) {

		Person[] per = new Person[3];
		per[0] = new Student("Student1");
		per[1] = new Teacher("Teacher1");
		per[2] = new Cleaner("Cleaner1");
		
		for (int i = 0; i < per.length; i++) {
			
			per[i].print();
			if(per[i] instanceof Staff) {
				((Staff)per[i]).salary();
			}
			
			
		}
		
	}

}
