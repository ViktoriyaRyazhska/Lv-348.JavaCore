import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();

		students.add(new Student(3, "Ivan"));
		students.add(new Student(2, "Oleh"));
		students.add(new Student(4, "Ira"));
		students.add(new Student(1, "Oksana"));
		students.add(new Student(3, "Taras"));

		Student.printStudents(students, 3);
		
		/*
		 * cool feature from java 8 which does't need  creation of 
		 * comparator classes and their fields in Student class
		 * but does it work with Maps?
		 * 
		 * students.sort(Comparator.comparing(Student::getName));
		
		System.out.println(students);
		
		students.sort(Comparator.comparing(Student::getCourse));
		
		System.out.println(students);*/
		
		
		Collections.sort(students, Student.getCourseComparator());
		
		System.out.println(students);
		
		Collections.sort(students, Student.getNameComparator());
		
		System.out.println(students);
	}

}
