package es.uvigo.esei.amchartsJava.core.exceptions;


/**
 * 
 * Custom exception idiom not supported.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public class LangException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public LangException(final String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public LangException() {
		super();
	}
}
