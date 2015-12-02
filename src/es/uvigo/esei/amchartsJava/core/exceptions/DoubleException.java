package es.uvigo.esei.amchartsJava.core.exceptions;

/**
 * Custom exception for not double number.
 * @author iagofernandezcunarro
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
	public DoubleException(String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public DoubleException() {
		super();
	}
}
