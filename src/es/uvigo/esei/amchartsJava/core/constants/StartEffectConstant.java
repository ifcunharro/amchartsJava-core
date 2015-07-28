package es.uvigo.esei.amchartsJava.core.constants;


public final class StartEffectConstant {
	
	private StartEffectConstant(){
		
	}
	
	private static class InitSingleton{
		private static final StartEffectConstant INSTANCE = new StartEffectConstant();
	}
	
	public static StartEffectConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum StartEffect{
		easeOutSine, easeInSine, elastic, bounce;
	
		
		private StartEffect(){
			
		}
		
	}
	
	
	
	public StartEffect getEaseOutSine(){
		return StartEffect.easeOutSine;
	}
	
	public StartEffect getEaseInSine(){
		return StartEffect.easeInSine;
	}
	
	public StartEffect getElastic(){
		return StartEffect.elastic;
	}
	
	public StartEffect getBounce(){
		return StartEffect.bounce;
	}
	
	public StartEffect[] values(){
		return StartEffect.values();
	}
}
