package springprojectsample;

public class Car {
	String make;
	String model;
	
	public Car() {
		
	}
	
	
	
	public void setMake(String make) {
		this.make = make;
	}



	public void setModel(String model) {
		this.model = model;
	}



	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + "]";
	}
	
	
}
