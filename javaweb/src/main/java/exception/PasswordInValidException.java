package exception;

public class PasswordInValidException extends CertException{

	public PasswordInValidException() {
		super("密碼無效! ");
	}
	
	public PasswordInValidException(String message) {
		super(message);
	}

}
