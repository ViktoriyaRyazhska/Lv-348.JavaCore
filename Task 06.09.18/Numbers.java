public class Numbers {

	public static void main(String[] args) {
		int a = 4;
		int b = 87;
		int c = 98;
		
		
		check(a);
		check(b);
		check(c);
		
	}
	
	static void check(int r) {
		
		
		if(r % 2 == 0) {
			System.out.println("Variable <a> isn't odd - " + r);
		}else {
			System.out.println("Variable <a> is odd ");
		}
		
		
	}

}
