package amcharts.model.Constants;

import java.util.ArrayList;
import java.util.List;


public final class AlignConstant {
	
	private static AlignConstant instance;
	private List<String> aligns;
	private List<String> valueAligns;
	
	
	private AlignConstant(){
		
	}
	
	public static AlignConstant getInstance(){
		if(instance==null){
			instance = new AlignConstant();
		}
		return instance;
	}
	
	public enum Align{
		 left, center, right;	 
	}
	
	public enum ValueAlign{
		left, right;
	}
	
	public Align getLeft(){
		return Align.left;
	}
	
	public Align getRight(){
		return Align.right;
	}
	
	public Align getCenter(){
		return Align.center;
	}
	
	public ValueAlign getValueLeft(){
		return ValueAlign.left;
	}
	
	public ValueAlign getValueRight(){
		return ValueAlign.right;
	}
	
	public List<String> getAligns(){
		if(aligns==null){
			aligns = new ArrayList<String>();
			for(Align unit: Align.values()){
				aligns.add(unit.toString());
			}
		}
		return aligns;
	}
	
	public List<String> getValueAligns(){
		if(valueAligns==null){
			valueAligns = new ArrayList<String>();
			for(Align align: Align.values()){
				valueAligns.add(align.toString());
			}
		}
		return valueAligns;
	}
	
	
	
}

