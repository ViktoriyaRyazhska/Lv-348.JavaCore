package Lesson7.HW7.Students;

import java.util.Comparator;

class KursComparator implements Comparator {
	  public int compare(Object o1, Object o2) {
	    return ((Stud)o1).getKurs() - ((Stud)o2).getKurs();
	  }
	}