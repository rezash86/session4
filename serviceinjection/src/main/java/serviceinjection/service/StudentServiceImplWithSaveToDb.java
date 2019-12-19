package serviceinjection.service;

public class StudentServiceImplWithSaveToDb implements StudentService {

	@Override
	public String showHello() {
		//comes from db
		//and then it will be saved to a file
		return "Good bye ";
	}

}
