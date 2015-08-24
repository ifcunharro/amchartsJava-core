package es.uvigo.esei.amchartsJava.core.constants;


public final class EffectConstant {
	
	private EffectConstant(){
		
	}
	
	private static class InitSingleton{
		private static final EffectConstant INSTANCE = new EffectConstant();
	}
	
	public static EffectConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum Effect{
		easeOutSine, easeInSine, elastic, bounce;
	
		
		private Effect(){
			
		}
		
	}
	
	
	
	public Effect getEaseOutSine(){
		return Effect.easeOutSine;
	}
	
	public Effect getEaseInSine(){
		return Effect.easeInSine;
	}
	
	public Effect getElastic(){
		return Effect.elastic;
	}
	
	public Effect getBounce(){
		return Effect.bounce;
	}
	
	public Effect[] values(){
		return Effect.values();
	}
}
