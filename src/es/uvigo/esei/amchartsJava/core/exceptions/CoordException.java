package es.uvigo.esei.amchartsJava.core.exceptions;


public class CoordException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public CoordException(String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public CoordException() {
		super();
	}
}
