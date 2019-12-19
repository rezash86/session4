package springlistinjection.model;

import java.util.List;

public class Book {
	List<String> chapters;
	
	
	public Book(List<String> chapters) {
		this.chapters = chapters;
	}
	
	public void showChapters() {
		for (String chapter : chapters) {
			System.out.println(chapter);
		}
	}
}
