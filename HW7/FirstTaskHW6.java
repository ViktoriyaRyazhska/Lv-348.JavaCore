package f_seventh_lesson.HW7;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class FirstTaskHW6 {
    public FirstTaskHW6() {
    }

    public static void main(String[] args) {

        Random rand = new Random();
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        for (int i = 0; i < 15; i++) {
            firstSet.add(rand.nextInt(50) - 5);
            secondSet.add(rand.nextInt(50) - 5);
        }
        System.out.println("First set: " + firstSet);
        System.out.println("Second set: " + secondSet);
        System.out.println();
        System.out.println("Union: " + FirstTaskHW6.Union(firstSet, secondSet));
        System.out.println();
        System.out.println("Intersection: " + FirstTaskHW6.Intersection(firstSet, secondSet));

    }

    public static Set<Integer> Union(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set<Integer> result = new HashSet<>();

        result.addAll(firstSet);
        result.addAll(secondSet);

        return result;
    }

    public static Set<Integer> Intersection(Set<Integer> firstSet, Set<Integer> secondSet) {
        Set<Integer> result = new HashSet<>();

        for (Integer element : firstSet) {
            if (secondSet.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }

}


/*Write parameterized methods union(Set set1, Set set2)
 and intersect(Set set1, Set set2),
 realizing the operations of union and intersection of two sets.
 Test the operation of these techniques on two pre-filled sets.
*/