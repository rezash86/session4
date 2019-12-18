package springprojectsample;

public class Student {

	private String stdNo;
	private String name;
	
	private Car car;

	public Student() {

	}
	
	public void setCar(Car car) {
		this.car = car;
	}

	public Student(String stdName) {
		this.name = stdName;
	}
	
	public Student(Car car) {
		this.car = car;
	}

	public String getStdNo() {
		return stdNo;
	}

	public void setStdNo(String stdNo) {
		this.stdNo = stdNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showMessage() {
		System.out.println("My name is " + 
				this.name + " my stdNo is " + this.stdNo);
	}
	
	
	public void showStudentCar() {
		System.out.println(this.car);
	}
}
