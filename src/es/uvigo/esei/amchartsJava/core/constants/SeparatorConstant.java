package es.uvigo.esei.amchartsJava.core.constants;

public final class SeparatorConstant {
	
	private static SeparatorConstant instance;
	
	
	private SeparatorConstant(){
		
	}
	
	public static SeparatorConstant getInstance(){
		if(instance==null){
			instance = new SeparatorConstant(); 
		}
		return instance;
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
