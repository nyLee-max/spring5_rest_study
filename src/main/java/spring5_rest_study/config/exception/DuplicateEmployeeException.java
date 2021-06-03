package spring5_rest_study.config.exception;

public class DuplicateEmployeeException extends RuntimeException {

	public DuplicateEmployeeException(String message) {
		super(message);
	}

	
}
