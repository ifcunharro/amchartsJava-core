package es.uvigo.esei.amchartsJava.core.constants;

public enum GradientAngle {
	EAST(0), WEST(180), NORTH(90), SOUTH(270);
	
	private final Number number;

	private GradientAngle(final Number num){
		number = num;
		
	}
	
	public Number getNumber(){
		return number;
	}
}
