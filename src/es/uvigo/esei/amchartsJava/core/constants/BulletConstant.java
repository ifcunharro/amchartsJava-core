package es.uvigo.esei.amchartsJava.core.constants;


public final class BulletConstant {
	
	private BulletConstant(){
		
	}
	
	private static class InitSingleton{
		private static BulletConstant INSTANCE = new BulletConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return BulletConstant instance of BulletConstant
	 */
	public static BulletConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum Bullet{
		none, round, square, triangleUp, triangleDown, triangleLeft, 
		triangleRight, bubble, diamond, xError, yError, custom;	
	}
	
	public Bullet getNone(){
		return Bullet.none;
	}
	
	public Bullet getRound(){
		return Bullet.round;
	}
	
	public Bullet getSquare(){
		return Bullet.square;
	}
	
	public Bullet getTriangleUp(){
		return Bullet.triangleUp;
	}
	
	public Bullet getTriangleDown(){
		return Bullet.triangleDown;
	}
	
	public Bullet getTriangleLeft(){
		return Bullet.triangleLeft;
	}
	
	public Bullet getTriangleRight(){
		return Bullet.triangleRight;
	}
	
	public Bullet getBubble(){
		return Bullet.bubble;
	}
	
	public Bullet getDiamond(){
		return Bullet.diamond;
	}
	
	public Bullet getXError(){
		return Bullet.xError;
	}
	
	public Bullet getYError(){
		return Bullet.yError;
	}
	
	public Bullet getCustom(){
		return Bullet.custom;
	}
	
	public Bullet[] values(){
		return Bullet.values();
	}
	
	
}
