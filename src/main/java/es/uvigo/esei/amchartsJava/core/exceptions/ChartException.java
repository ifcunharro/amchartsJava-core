package es.uvigo.esei.amchartsJava.core.exceptions;


/**
 * Custom exception for chart doesn't contain that component.
 * @author Iago Fernández Cuñarro
 *
 */
public class ChartException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public ChartException(final String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public ChartException() {
		super();
	}
}
