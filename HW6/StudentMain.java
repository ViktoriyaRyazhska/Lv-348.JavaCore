package homeWork6;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		
		List<Student> stud = createStudents();
		
		Student.printStudents(stud, 4);
		
		
		
		stud.sort(Student.getNameComprator());
		for (Student name : stud) {
			System.out.println(name);
		}
		
		stud.sort(Student.getCourseComparator());
		for (Student course : stud) {
			System.out.println(course);
		}
	}
	public static List<Student> createStudents(){
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Anna", 4));
		students.add(new Student("Taras", 5));
		students.add(new Student("Okasana", 3));
		students.add(new Student("Irina", 1));
		students.add(new Student("Stanislav", 4));
		return students;
	}	

}
