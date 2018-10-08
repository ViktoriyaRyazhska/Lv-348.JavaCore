package Lesson7.HW7.Students;

import java.util.Comparator;

class NameComparator implements Comparator<Stud> {
	  public int compare(Stud o1, Stud o2) {
	    return o1.getName().compareTo(o2.getName());
	  }
	}


	