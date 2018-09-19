import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		FirstTask ft = new FirstTask();
		SecondTask st = new SecondTask();
		Random random = new Random();
		
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for(int i = 0; i < 10; i++) {
			set1.add(random.nextInt(30));
			set2.add(random.nextInt(30));
		}
		
		Map<String, String> personMap = new TreeMap<String, String>();
		personMap.put("Zanko", "Orest");
		personMap.put("Koval", "Ivan");
		personMap.put("Zakharko", "Oleg");
		personMap.put("Kovalovsky", "Maksym");
		personMap.put("Vladyka", "Ivan");
		
		ft.intersect(set1, set2);
		System.out.println("=================================================================");
		ft.union(set1, set2);
		System.out.println("=================================================================");
		st.map(personMap);
		System.out.println("=================================================================");
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Ivan", 1));
		students.add(new Student("Vasyl", 3));
		students.add(new Student("Petro", 2));
		students.add(new Student("Iryna", 4));
		students.add(new Student("Evgen", 5));
		
		Student.printStudents(students, 2);
		
		Collections.sort(students, Student.getNameComparator());
		System.out.println(students);
		Collections.sort(students, Student.getCourseComparator());
		System.out.println(students);
	}

}
