package serviceinjection.model;

import serviceinjection.service.StudentService;

public class Student {
	//property
	StudentService service;
	String firstName;
	
	public Student(String name) {
		this.firstName = name;
	}
	
	public void setService(StudentService service) {
		this.service = service;
	}
	
	
	public void showStudentMessage() {
		String helloValue = service.showHello();
		System.out.println(helloValue  + this.firstName);
	}
}
