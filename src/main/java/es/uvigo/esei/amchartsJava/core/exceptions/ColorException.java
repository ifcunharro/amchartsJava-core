package es.uvigo.esei.amchartsJava.core.exceptions;


/**
 * Custom exception for format color error.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public class ColorException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public ColorException(final String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public ColorException() {
		super();
	}
}
