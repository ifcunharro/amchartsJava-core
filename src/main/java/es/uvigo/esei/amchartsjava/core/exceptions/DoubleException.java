package es.uvigo.esei.amchartsjava.core.exceptions;

/**
 * Custom exception for not double number.
 * @author Iago Fernández Cuñarro
 *
 */
public class DoubleException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public DoubleException(final String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public DoubleException() {
		super();
	}
}
