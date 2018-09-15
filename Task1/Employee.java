public class Employee {
	
	private static double totalSum = 0;

	private String name;
	private int rate;
	private int hours;
	
	
	public Employee(String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	
	public Employee(String name, int rate) {
		this.name = name;
		this.rate = rate;
	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee() {
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
		int a =  this.rate * this.hours;
		totalSum = totalSum + a;
		return a;
	}
	
	public double getBonnus() {
		double b = this.rate * this.hours * 0.1;
		totalSum = totalSum + b;
		return b;
		
	}

	@Override
	public String toString() {
		return "Employee: name - " + name + " salary + bonnus " + (salary() + getBonnus());
	}
	
	public void changeRate(int rate) {
		this.setRate(rate);
	}

	
	
	

}
