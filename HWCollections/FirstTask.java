import java.util.*;

public class FirstTask {
	
	public void union(Set<Integer> set1, Set<Integer> set2) {
		System.out.println(set1);
		System.out.println(set2);
		Set<Integer> union = new HashSet<Integer>(set1);
		union.addAll(set2);
		System.out.println(union);
	}
	
	public void intersect(Set<Integer> set1, Set<Integer> set2) {
		System.out.println(set1);
		System.out.println(set2);
		Set<Integer> intersect = new HashSet<Integer>(set1);
		intersect.retainAll(set2);
		System.out.println(intersect);
	}
}
