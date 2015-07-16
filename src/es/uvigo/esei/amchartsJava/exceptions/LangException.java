package es.uvigo.esei.amchartsJava.exceptions;


public class LangException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor with custom message.
	 * 
	 * @param message
	 *            String, custom message.
	 */
	public LangException(String message) {
		super(message);
	}

	/**
	 * Default constructor.
	 */
	public LangException() {
		super();
	}
}
