package springbeanscop.model;

public class Shape {
	String name;
	
	public void onInit() {
		System.out.println("I am created... hello");
	}
	
	public void destruct() {
		System.out.println("I am dead... bye");
	}
	
	public void showMessage() {
		System.out.println("I am a shape");
	}
}
