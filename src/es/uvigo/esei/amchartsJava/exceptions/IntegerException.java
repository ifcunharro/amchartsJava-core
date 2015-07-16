package es.uvigo.esei.amchartsJava.exceptions;


public class IntegerException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public IntegerException(String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public IntegerException() {
		super();
	}
}
