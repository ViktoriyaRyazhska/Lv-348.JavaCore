package Lesson7.HW7.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Stud> student = new ArrayList<Stud>();
		
		student.add(new Stud ("Vasya", 5));
		student.add(new Stud ("Volodya", 4));
		student.add(new Stud ("Anna", 2));
		student.add(new Stud ("Olya", 4));
		student.add(new Stud ("Vasyl", 3));
		
		System.out.println(student);

		student.sort(new NameComparator());
        for (Stud stud : student) {
            System.out.println(stud);
        }
        
	 student.sort(new KursComparator());
        for (Stud stud : student) {
            System.out.println(student);
        }

	    }   

	}

