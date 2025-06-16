package exception;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(final String message) {
		super(message);
	}
}
