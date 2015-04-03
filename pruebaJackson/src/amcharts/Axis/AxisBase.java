package amcharts.Axis;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonGetter;

public abstract class AxisBase {
	protected Map<String,Object> axis;
	
	protected AxisBase(){
		axis = new HashMap<String,Object>();
	}
	
	@JsonGetter(value="autoGridCount")
	public Object isAutoGridCount(){
		return axis.get("autoGridCount");
	}
	
	public void setAutoGridCount(Boolean autoGridCount){
		axis.put("autoGridCount", autoGridCount);
	}
	
	public Object getAxisAlpha(){
		return axis.get("axisAlpha");
	}
	
	//valor debe ser entre 0 y 1
	public void setAxisAlpha(Number axisAlpha){
		axis.put("axisAlpha",axisAlpha);
	}
	
	public Object getAxisColor(){
		return axis.get("axisColor");
	}
	
	public void setAxisColor(String axisColor){
		
	}

	public Object getId() {
		return null;
	}

	public void setId(String string) {
		
	}
	

	

	
}
