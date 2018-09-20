package homeWork6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

	private String name;
	private int course;
	
	private static NameComparator nameComparator = new NameComparator();
	private static CourseComparator courseComparator = new CourseComparator();
	
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	
	public static NameComparator getNameComprator() {
		return nameComparator;
	}
	
	public static CourseComparator getCourseComparator() {
		return courseComparator;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCourse() {
		return course;
	}
	
	public void setCourse(int course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student: name - " + name + ", course - " + course;
	}

	public static void printStudents(List<Student> students, Integer course) {
		for(Iterator<Student> it = students.iterator() ; it.hasNext();) {
			Student name = it.next();
			if (name.getCourse() == course) {
				System.out.println(name.getName());
			}
		}
	}
	
	static class NameComparator implements Comparator<Student>{
		public int compare(Student student1, Student student2) {
			return student1.getName().compareTo(student2.getName());
		}
	}
	
	static class CourseComparator implements Comparator<Student>{
		public int compare(Student student1, Student student2) {
			return student1.getCourse() - student2.getCourse();
		}
	}
}
