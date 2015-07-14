package es.uvigo.esei.amchartsJava.constants;


public final class CreditsPositionConstant {
	
	private CreditsPositionConstant(){
		
	}
	
	private static class InitSingleton{
		private static final CreditsPositionConstant INSTANCE = new CreditsPositionConstant();
	}
	
	public static CreditsPositionConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum CreditsPosition{
		topleft, topright, bottomleft, bottomright;
	
		
	
		private CreditsPosition(){
			
		}
		
		public String toString(){
			switch(this){
				case topleft: return "top-left";
				case topright: return "top-right";
				case bottomleft: return "bottom-left";
				case bottomright: return "bottom-right";
			}
			return null;
		}
	}
	
	
	
	public CreditsPosition getTopLeft(){
		return CreditsPosition.topleft;
	}
	
	public CreditsPosition getTopRight(){
		return CreditsPosition.topright;
	}
	
	public CreditsPosition getBottomLeft(){
		return CreditsPosition.bottomleft;
	}
	
	public CreditsPosition getBottomRight(){
		return CreditsPosition.bottomright;
	}
	
	public CreditsPosition[] values(){
		return CreditsPosition.values();
	}
}
