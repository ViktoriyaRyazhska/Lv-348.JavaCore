public class TaskOne {
	
	private float f1 = 4;
	private float f2 = -3;
	private float f3 = 7;
	
	private int i1 = 3;
	private int i2 = 5;
	private int i3 = 7;
	
	public void getRange() {
		if(f1 >= -5 && f1 <= 5) {
			System.out.println("„исло " + f1 + " входить в меж≥ (-5;5)");
		} else {
			System.out.println(f1 + " не входить в дан≥ меж≥");
		}
		if(f2 >= -5 && f2 <= 5) {
			System.out.println("„исло " + f2 + " входить в меж≥ (-5;5)");
		} else {
			System.out.println(f2 + " не входить в дан≥ меж≥");
		}
		if(f3 >= -5 && f3 <= 5) {
			System.out.println("„исло " + f3 + " входить в меж≥ (-5;5)");
		} else {
			System.out.println(f3 + " не входить в дан≥ меж≥");
		}
	}
	
	public void getMaxMin() {
		if(i1 > i2 && i1 > i3) {
			System.out.println(i1 + " Max int");
		} else if(i2 > i1 && i2 > i3) { 
			System.out.println(i2 + " Max int");
		} else if(i3 > i1 && i3 > i2) {
			System.out.println(i3 + " Max int");
		} else {
			System.out.println("„исла равны");
		}
		
		if(i1 < i2 && i1 < i3) {
			System.out.println(i1 + " Min int");
		} else if(i2 < i1 && i2 < i3) { 
			System.out.println(i2 + " Min int");
		} else if(i3 < i1 && i3 < i2) {
			System.out.println(i3 + " Min int");
		} else {
			System.out.println("„исла равны");
		}
	}
	
}
