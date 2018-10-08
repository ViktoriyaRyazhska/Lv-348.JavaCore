package Lesson7.HW7;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class task2 {

	public static void main(String[] args) {

		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Ivanov", "Petro");
		personMap.put("Smirnov", "Volodymyr");
		personMap.put("Petrenko", "Vasyl");
		personMap.put("Kolodiy", "Oleg");
		personMap.put("Tkachenko", "Volodymyr");
		personMap.put("Kozak", "Orest");
		personMap.put("Omelyan", "Andriy");
		personMap.put("Vasyunets", "Svyatoslav");
		personMap.put("Loza", "Volodymyr");
		personMap.put("Belyukh", "Yuriy");

		for (Iterator<Entry<String, String>> i = personMap.entrySet().iterator(); i.hasNext();) {
			Entry<String, String> entry = i.next();
			if (entry.getValue().equals("Orest")) {
				i.remove();
			}
		}
		for (Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println();
		Set s1=new HashSet<>();
		s1.addAll(personMap.values());
		if (s1.size() == personMap.keySet().size()) {
			System.out.println("different");
		} else {
			System.out.println("the same");
		}

	}
}
