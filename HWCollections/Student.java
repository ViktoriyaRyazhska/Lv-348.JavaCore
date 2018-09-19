import java.util.*;

public class Student
{
	
	private String name;
	private int course;
	
	private static NameComparator nameComparator = new NameComparator();
	private static CourseComparator courseComparator = new CourseComparator();
	
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	
	public Student() {

	}

	public String getName() {
		return name;
	}

	public int getCourse() {
		return course;
	}
	
	public static NameComparator getNameComparator() {
		return nameComparator;
	}

	public static CourseComparator getCourseComparator() {
		return courseComparator;
	}

	public static void printStudents(List<Student> students, int course) {
		for(Iterator<Student> it = students.iterator(); it.hasNext();) {
			Student name = it.next();
			
			if(name.getCourse() == course) {
				System.out.println(name.getName());
			}
		}
		
		}
	
	static class NameComparator implements Comparator<Student> {
		public int compare(Student a, Student b) {
			return a.getName().compareTo(b.getName());
		}
	}
	
	static class CourseComparator implements Comparator<Student> {
		public int compare(Student a, Student b) {
			return a.getCourse() - b.getCourse();
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

}
