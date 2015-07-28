package es.uvigo.esei.amchartsJava.core.constants;

/**
 * 
 * This class provides values to property Align 
 * 
 * @author iago
 *
 */
public final class AlignConstant {
	
	
	/**
	 *  Default Contructor
	 */
	private AlignConstant(){
		
	}
	
	private static class InitSingleton{
		private static final AlignConstant INSTANCE = new AlignConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return instance of AlignConstant
	 */
	public static AlignConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	
	public enum Align{
		 left, center, right;	 
	}
	
	public Align getLeft(){
		return Align.left;
	}
	
	public Align getRight(){
		return Align.right;
	}
	
	public Align getCenter(){
		return Align.center;
	}
	
	public Align[] getAligns(){
		return Align.values();
	}
	
}

