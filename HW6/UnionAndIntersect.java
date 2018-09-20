package homeWork6;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersect {

	public static void main(String[] args) {

		Set<Integer> s1 = createSet1();
		Set<Integer> s2 = createSet2();

		System.out.println("First pre-filled set - " + s1);
		System.out.println("Second pre-filled set - " + s2);

		System.out.println("Union of two sets - " + union(s1, s2));
		System.out.println("Intersect of two sets - " + intersect(s1, s2));
	}

	public static Set<Integer> createSet1() {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(11);
		set1.add(15);
		set1.add(14);
		set1.add(12);
		set1.add(10);
		set1.add(1);
		return set1;
	}

	public static Set<Integer> createSet2() {
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(11);
		set2.add(17);
		set2.add(14);
		set2.add(16);
		set2.add(2);
		return set2;
	}

	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		return union;
	}

	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> intersect = new HashSet<Integer>(set1);
		intersect.retainAll(set2);
		return intersect;
	}

}
