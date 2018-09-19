package f_seventh_lesson.HW7;


import java.util.*;

public class SecondTaskHW6 {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap();
        String[] firstNames = {"Vitalii", "Andrew", "Viktoriya", "Oleg", "Roman", "Kostya", "Elizabeth",
                "Kosty", "Dima", "Nataliya"};
        String[] lastNames = {"Yurchenko", "Gerus", "Tumchyk", "Maven", "Ols",
                "Kot", "Delenko", "Malaz", "Kolt", "Kravchuk"};

        for (int i = 0; i < firstNames.length; i++) {
            personMap.put(lastNames[i], firstNames[i]);
        }
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Is same names? " + SecondTaskHW6.isSameNames(personMap));
        SecondTaskHW6.getMapWithoutName(personMap,"Dima");
        System.out.println(personMap);
    }

    public static boolean isSameNames(Map<String, String> personMap) {
        Set<String> personSet = new HashSet<>();
        personSet.addAll(personMap.values());

        if (personMap.values().size() == personSet.size()) {
            return false;
        }
        return true;
    }

    public static Map<String, String> getMapWithoutName(Map<String, String> personMap, String name) {
        for (Iterator it = personMap.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getValue() == name) {
                it.remove();
            }
        }
        return personMap;
    }


}
/*Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
Output the entities of the map on the screen.
There are at less two persons with the same firstName among these 10 people?
Remove from the map person whose firstName is ”Orest” (or other). Print result.
*/