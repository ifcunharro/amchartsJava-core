package es.uvigo.esei.amchartsJava.core.constants;



public final class ValueAlignConstant {
	
	
	private ValueAlignConstant(){
		
	}
	
	private static class InitSingleton{
		private static final ValueAlignConstant INSTANCE = new ValueAlignConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return ValueAlignConstant instance of ValueALignConstant
	 */
	public static ValueAlignConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	
	public enum ValueAlign{
		left, right;
	}
	
	
	public ValueAlign getValueLeft(){
		return ValueAlign.left;
	}
	
	public ValueAlign getValueRight(){
		return ValueAlign.right;
	}
	
	
	public ValueAlign[] getValueAligns(){
		return ValueAlign.values();
	}
	
}

