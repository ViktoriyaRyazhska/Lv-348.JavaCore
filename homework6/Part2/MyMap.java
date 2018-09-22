import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {

		Map<String, String> personMap = new HashMap<String, String>();

		personMap.put("Ivanikiv", "Ostap");
		personMap.put("Tkhir", "Taras");
		personMap.put("Zinchuc", "Ostap");
		personMap.put("Kolomiec", "Ira");
		personMap.put("Shewchenco", "Taras");
		personMap.put("Kyzyshun", "Ura");
		personMap.put("Simkiv", "Oksana");
		personMap.put("Semkiv", "Olena");
		personMap.put("Pypkin", "Vasa");
		personMap.put("Koval", "Vitalyi");

		System.out.println(personMap);

		if (SameName(personMap)) {

			System.out.println("We have peoples with the same names! ");

		} else {

			System.out.println("No peoples with the same names.");

		}

		System.out.println(deletePerson(personMap));

	}

	public static Map<String, String> deletePerson(Map<String, String> personMap) {

		for (Iterator<Map.Entry<String, String>> ps = personMap.entrySet().iterator(); ps.hasNext();) {

			Map.Entry<String, String> entry = ps.next();

			if (entry.getValue().equals("Taras")) {

				ps.remove();
			}
		}
		return personMap;
	}
	

	public static boolean SameName(Map<String, String> personMap) {

		Set<String> Check = new HashSet<String>(personMap.values());
		
		return !(Check.size() == personMap.size());

	}

}
