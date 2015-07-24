package es.uvigo.esei.amchartsJava.core.constants;


public final class StackTypeConstant {
	
	private StackTypeConstant(){
		
	}
	
	private static class InitSingleton{
		private static StackTypeConstant INSTANCE = new StackTypeConstant();
	}
	
	public static StackTypeConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum StackType{
		none, regular, onehundredpercent, threed;	
		
		private StackType(){
			
		}
		
		public String toString(){
			switch(this){
				case none: return "none";
				case regular: return "regular";
				case onehundredpercent: return "100%";
				case threed: return "3d";
			}
			return null;
		}
	}
	
	public StackType getNone(){
		return StackType.none;
	}
	
	public StackType getRegular(){
		return StackType.regular;
	}
	
	public StackType getOneHundredPercent(){
		return StackType.onehundredpercent;
	}
	
	public StackType get3d(){
		return StackType.threed;
	}
	
	public StackType[] values(){
		return StackType.values();	
	}
		
}
