package es.uvigo.esei.amchartsJava.exceptions;


public class ColorException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public ColorException(String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public ColorException() {
		super();
	}
}
