package com.car;

public class Car {
	
	
	private String type;
	private int yearOfProduction;
	private double engineCapacity;
	
	public Car() {
	}
	
	public Car(String type, double engineCapacity, int yearOfProduction) {
		this.type = type;
		this.engineCapacity = engineCapacity;
		this.yearOfProduction = yearOfProduction;
	}

	public Car(String type, double engineCapacity) {
		this.type = type;
		this.engineCapacity = engineCapacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearOfProduction() {
		return yearOfProduction;
	}

	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}

	public double getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
}
