package es.uvigo.esei.amchartsjava.core.exceptions;


/**
 * Custom exception for not integer number.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public class IntegerException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public IntegerException(final String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public IntegerException() {
		super();
	}
}
