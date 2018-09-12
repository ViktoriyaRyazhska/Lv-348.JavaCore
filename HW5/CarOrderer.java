public class CarOrderer {
	
	public void orderByYear(Car[] carDigest) {
		
		Car tmp;
		for (int i = 0; i < carDigest.length - 1; i++) {
			for (int j = i + 1; j < carDigest.length; j++) {
				if (carDigest[i].getYear() < carDigest[j].getYear()) {
					tmp = carDigest[i];
					carDigest[i] = carDigest[j];
					carDigest[j] = tmp;
				}
			}
		}
		for (int i = 0; i < carDigest.length; i++) {
			System.out.println(carDigest[i]);
		}
		
	}
	
}
