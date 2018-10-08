package Lesson7.HW7;

import java.util.HashSet;
import java.util.Set;

public class task1 {
	
	public static Set<Integer> Union(Set<Integer> set, Set<Integer> set1) {
		Set<Integer> union = new HashSet<Integer>(set);
		union.addAll(set1);
		return union;
	}

	public static Set<Integer> Retainer(Set<Integer> set, Set<Integer> set1) {
		Set<Integer> retainer = new HashSet<Integer>(set);
		retainer.retainAll(set1);
		return retainer;
	}
	
	
	
	public static Set<Integer> createSet() {
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(25);
		set.add(17);
		set.add(19);
		set.add(20);
		set.add(22);
		return set;
	}

	public static Set<Integer> createSet1() {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(9);
		set1.add(24);
		set1.add(19);
		set1.add(6);
		set1.add(12);
		set1.add(10);
		return set1;
	}
	
	
	public static void main(String[] args) {
	
		Set<Integer> s = createSet();
		Set<Integer> s1 = createSet1();

		System.out.println("Firstset - " + s);
		System.out.println("Secondset - " + s1);

		System.out.println("Union " + Union(s, s1));
		System.out.println("Retained " + Retainer(s, s1));
	}

	}


