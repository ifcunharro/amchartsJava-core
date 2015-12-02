package es.uvigo.esei.amchartsJava.core.constants;


public final class StepDirectionConstant {
	
	
	private StepDirectionConstant(){
		
	}
	
	private static class InitSingleton{
		private static final StepDirectionConstant INSTANCE = new StepDirectionConstant();
	}
	
	/**
	 * Method to get a instance of this class
	 * 
	 * @return StepDirectionConstant instance of StepDirectionConstant
	 */
	public static StepDirectionConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	
	public enum StepDirection{
		 left, center, right;	 
	}
	
	public StepDirection getLeft(){
		return StepDirection.left;
	}
	
	public StepDirection getRight(){
		return StepDirection.right;
	}
	
	public StepDirection getCenter(){
		return StepDirection.center;
	}
	
	public StepDirection[] getStepDirections(){
		return StepDirection.values();
	}
	

}

