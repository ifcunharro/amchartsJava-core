package es.uvigo.esei.amchartsJava.core.exceptions;


public class NotSupportedException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public NotSupportedException(String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public NotSupportedException() {
		super();
	}
}
