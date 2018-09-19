import java.util.*;
import java.util.Map.Entry;

public class SecondTask {
	
	public void map(Map<String, String> personMap) {
		System.out.println(personMap);
		
		
		Set<String> personSet = new HashSet<String>();
		personSet.addAll(personMap.values());
		
		if(personMap.values().size() == personSet.size()) {
			System.out.println("All names are different");
		} else {
			System.out.println("Map include same names");
		}
		
		//------------------------------------------------------------------------------
		
		Iterator<Entry<String, String>> entryIt = personMap.entrySet().iterator();
		while(entryIt.hasNext()) {
			Entry<String, String> entry = entryIt.next();
			if(entry.getValue() == "Orest") {
				entryIt.remove();
			}
		}
		System.out.println(personMap);
	}
	
}
