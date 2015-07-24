package es.uvigo.esei.amchartsJava.core.exceptions;


public class OutOfRangeException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public OutOfRangeException(String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public OutOfRangeException() {
		super();
	}
}
