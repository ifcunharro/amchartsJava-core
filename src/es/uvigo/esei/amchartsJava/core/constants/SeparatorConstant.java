package es.uvigo.esei.amchartsJava.core.constants;

public final class SeparatorConstant {
	
	
	private SeparatorConstant(){
		
	}
	
	private static class InitSingleton{
		private static SeparatorConstant INSTANCE = new SeparatorConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return SeparatorConstant instance of SeparatorConstant
	 */
	public static SeparatorConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum Separator{
		dot, colon;
		
		private Separator(){
			
		}
		
		public String toString(){
			switch(this){
				case dot: return ".";
				case colon: return ",";
			}
			return null;
		}
	}
	
	public Separator getDot(){
		return Separator.dot;
	}
	
	public Separator getColon(){
		return Separator.colon;
	}
	
	public Separator[] values(){
		return Separator.values();
	}
	
	
}
