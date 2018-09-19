package f_seventh_lesson.HW7;

import java.util.*;

public class Student {
    private String name;
    private int course;
    private static getOrderByName getOName = new getOrderByName();
    private static getOrderByCourse getOCourse = new getOrderByCourse();

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

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(List<Student> students, int course) {
        Student person;
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            person = it.next();
            if (person.getCourse() == course) {
                System.out.println("Name: " + person.getName() + ", Course: " + person.getCourse());
            }
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Vitalii", 2));
        students.add(new Student("Artem", 2));
        students.add(new Student("Olga", 3));
        students.add(new Student("Viktoriya", 1));
        students.add(new Student("Rihanna", 3));

        System.out.println(students);
        printStudents(students, 2);
        Collections.sort(students, Student.getOCourse);
        System.out.println(students);
        Collections.sort(students, Student.getOName);
        System.out.println(students);

    }

    public static class getOrderByName implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.getName().compareTo(b.getName());
        }
    }

    public static class getOrderByCourse implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.getCourse() - b.getCourse();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}' + "\n";
    }
}
/*Write class Student that provides information about the name of the student and his course. Class Student should consists of
properties for access to these fields
constructor with parameters
method printStudents (List students, Integer course), which receives a list of students and the course number and prints to the console the names of the students from the list, which are taught in this course (use an iterator)
methods to compare students by name and by course
In the main() method
    declare List students and add to the list five different students
    display the list of students ordered by name
    display the list of students ordered by course.
*/
