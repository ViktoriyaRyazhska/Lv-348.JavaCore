import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {

	private int course;

	private String name;

	private static NameComparator nameComparator = new NameComparator();

	private static CourseComparator courseComparator = new CourseComparator();

	public Student(int course, String name) {

		this.name = name;
		this.course = course;

	}

	public Student() {

	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Comparator<Student> getNameComparator() {

		return nameComparator;
	}

	public static Comparator<Student> getCourseComparator() {

		return courseComparator;
	}

	public static void printStudents(List<Student> students, int course) {

		for (Iterator<Student> it = students.iterator(); it.hasNext();) {

			Student name = it.next();

			if (name.getCourse() == course) {

				System.out.println(name.getName());
			}
		}

	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", name=" + name + "]";
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

}
