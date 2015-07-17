package es.uvigo.esei.amchartsJava.constants;

/**
 * 
 * This class provides values to properties Align and ValueAlign  
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
	
	public enum ValueAlign{
		left, right;
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
	
	public ValueAlign getValueLeft(){
		return ValueAlign.left;
	}
	
	public ValueAlign getValueRight(){
		return ValueAlign.right;
	}
	
	/**
	 *  Method to get all type of Aligns supported by {@link es.uvigo.esei.amchartsJava.model.Label Label} 
	 *  and {@link es.uvigo.esei.amchartsJava.model.Legend Legend}
	 *  
	 * @return text alignment 
	 */
	public Align[] getAligns(){
		return Align.values();
	}
	
	/**
	 * Method to get all type of valueAligns supported by {@see es.uvigo.esei.amchartsJava.model.Legend}
	 * 
	 * @return alignments of value text 
	 */
	public ValueAlign[] getValueAligns(){
		return ValueAlign.values();
	}
	
	
	
}

