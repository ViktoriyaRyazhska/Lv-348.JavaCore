public class Employee {

	private static double totalSum;

	private String name;
	private int rate;
	private int hours;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int salary() {
		return rate*hours;
	}
	public double bonuses() {
		return rate*hours*0.1;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", rate=" + rate + ", hours=" + hours + "]";
	}
	
	

}
