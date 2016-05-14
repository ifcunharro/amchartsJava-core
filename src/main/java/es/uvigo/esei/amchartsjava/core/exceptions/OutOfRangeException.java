package es.uvigo.esei.amchartsjava.core.exceptions;


/**
 * Custom exception for value out of range
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public class OutOfRangeException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public OutOfRangeException(final String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public OutOfRangeException() {
		super();
	}
}
