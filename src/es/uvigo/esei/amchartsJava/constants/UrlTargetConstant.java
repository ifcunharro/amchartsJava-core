package es.uvigo.esei.amchartsJava.constants;


public final class UrlTargetConstant {
	
	private UrlTargetConstant(){
		
	}
	
	private static class InitSingleton{
		private static final UrlTargetConstant INSTANCE = new UrlTargetConstant();
	}
	
	public static UrlTargetConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum UrlTarget{
		_blank, _self, _parent, _top;
	}
	
	
	public UrlTarget getBlank(){
		return UrlTarget._blank;
	}
	
	public UrlTarget getSelf(){
		return UrlTarget._self;
	}
	
	public UrlTarget getParent(){
		return UrlTarget._parent;
	}
	
	public UrlTarget getTop(){
		return UrlTarget._top;
	}
	
	public UrlTarget[] values(){
		return UrlTarget.values();
	}
}
