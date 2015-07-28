package es.uvigo.esei.amchartsJava.core.constants;


/**
 * 
 * This class provides values to properties Align, ValueAlign and TextAlign  
 * 
 * @author iago
 *
 */
public final class TextAlignConstant {
	
	
	/**
	 *  Default Contructor
	 */
	private TextAlignConstant(){
		
	}
	
	private static class InitSingleton{
		private static final TextAlignConstant INSTANCE = new TextAlignConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return instance of TextAlignConstant
	 */
	public static TextAlignConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	
	public enum TextAlign{
		left, middle, right;
	}
	
	
	public TextAlign getTextAlignLeft(){
		return TextAlign.left;
	}
	
	public TextAlign getTextAlignMiddle(){
		return TextAlign.middle;
	}
	
	public TextAlign getTextAlignRight(){
		return TextAlign.right;
	}
	
	public TextAlign[] getTextAligns(){
		return TextAlign.values();
	}
	
}

