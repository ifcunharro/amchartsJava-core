package es.uvigo.esei.amchartsJava.core.exceptions;


/**
 * Custom exception pattern doesn't contain all neccesary fields.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public class MalFormedPatternException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public MalFormedPatternException(final String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public MalFormedPatternException() {
		super();
	}
}
