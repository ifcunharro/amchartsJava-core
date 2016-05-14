package es.uvigo.esei.amchartsjava.core.exceptions;


/**
 * Custom exception for component not supported.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public class NotSupportedException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public NotSupportedException(final String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public NotSupportedException() {
		super();
	}
}
