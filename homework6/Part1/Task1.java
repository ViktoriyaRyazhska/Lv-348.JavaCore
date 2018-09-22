
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

	public static Set<Integer> intersectSet(Set<Integer> IntSet1, Set<Integer> IntSet2) {
		
		Set<Integer> MainSet = new TreeSet<Integer>(IntSet1);
		
		MainSet.retainAll(IntSet2);
		
		return MainSet;
	}

	public static Set<Integer> SetUnion(Set<Integer> IntSet1, Set<Integer> IntSet2) {
		
		Set<Integer> SetUnion = new TreeSet<Integer>(IntSet1);
		
		SetUnion.addAll(IntSet2);
		
		return SetUnion;
	}

	public static Set<Integer> createSet1() {
		
		Set<Integer> IntSet1 = new TreeSet<Integer>();
		
		IntSet1.add(2);
		IntSet1.add(3);
		IntSet1.add(8);
		IntSet1.add(10);
		IntSet1.add(11);
		IntSet1.add(16);
		IntSet1.add(7);
		IntSet1.add(5);
		IntSet1.add(42);
		return IntSet1;
	}

	public static Set<Integer> createSet2() {
		
		Set<Integer> IntSet2 = new TreeSet<Integer>();
		
		IntSet2.add(5);
		IntSet2.add(51);
		IntSet2.add(44);
		IntSet2.add(6);
		IntSet2.add(12);
		IntSet2.add(15);
		IntSet2.add(66);
		IntSet2.add(234);
		return IntSet2;
	}

	public static void main(String[] args) {

		Set<Integer> newSet = createSet1();
		Set<Integer> newSet1 = createSet2();

		System.out.println("First set  =  " + newSet);
		System.out.println();
		System.out.println("Second set  =  " + newSet1);
		System.out.println();

		System.out.println("Sets Union = " + SetUnion(newSet, newSet1));
		System.out.println();
		System.out.println(" Sets Intersect = " + intersectSet(newSet, newSet1));
	}

}
