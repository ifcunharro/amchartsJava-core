package es.uvigo.esei.amchartsJava.core.constants;

/**
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public final class AlignConstant {
	
	
	private AlignConstant(){
		
	}
	
	private static class InitSingleton{
		private static final AlignConstant INSTANCE = new AlignConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return AlignConstant instance of AlignConstant
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

