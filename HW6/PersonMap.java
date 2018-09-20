package homeWork6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PersonMap {

	public static void main(String[] args) {

		Map<String, String> person = createMap();

		for (Map.Entry<String, String> entry : person.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println();
		System.out.println("There are people with the same names? - " + checkSameName(person));
		System.out.println();
		System.out.println(removePerson(person));

	}

	public static Map<String, String> createMap() {
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Kovt", "Anna");
		personMap.put("Promtiuk", "Svitlana");
		personMap.put("Lipuch", "Ivanna");
		personMap.put("Vasulushun", "Maksum");
		personMap.put("Prokuda", "Orest");
		personMap.put("Husak", "Oksana");
		personMap.put("Pidmitay", "Ivan");
		personMap.put("Shwarc", "Ludmula");
		personMap.put("Gnatkevich", "Olexandr");
		personMap.put("Galkin", "Maksum");
		return personMap;
	}

	public static boolean checkSameName(Map<String, String> personMap) {
		Set<String> setValues = new HashSet<String>(personMap.values());
		boolean check = false;
		if (setValues.size() == personMap.size()) {
			check = false;
		} else {
			check = true;
		}
		return check;
	}
	
	public static Map<String, String> removePerson(Map<String, String> personMap){
		for (Iterator<Map.Entry<String, String>> i = personMap.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry =  i.next();
			if (entry.getValue().equals("Orest")) {
				i.remove();
			}
		}
		return personMap;
	}

}
