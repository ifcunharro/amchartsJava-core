package es.uvigo.esei.amchartsJava.core.constants;


public final class DragIconConstant {
	
	private DragIconConstant(){
		
	}
	
	private static class InitSingleton{
		private static DragIconConstant INSTANCE = new DragIconConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return DragIconConstant instance of DragIconConstant
	 */
	public static DragIconConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum DragIcon{
		dragIcon, dragIconBlack, dragIconH, dragIconHBlack, dragIconRectBig,
		dragIconRectBigBlack, dragIconRectBigBlackH, dragIconRectBigH, dragIconRectSmall, dragIconRectSmallBlack,
		dragIconRectSmallBlackH, dragIconRectSmallH, dragIconRoundBig, dragIconRoundBigBlack,
		dragIconRoundBigBlackH, dragIconRoundBigH, dragIconRoundSmall, dragIconRoundSmallBlack,
		dragIconRoundSmallBlackH, dragIconRoundSmallH;
	}
	
	public DragIcon[] values(){
		return DragIcon.values();	
	}
		
}
