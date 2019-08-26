package net.antra;

public class StudentNotFoundException extends RuntimeException{//checked exception extends Exception

	public StudentNotFoundException(String str) {
		super(str);
	}
}
