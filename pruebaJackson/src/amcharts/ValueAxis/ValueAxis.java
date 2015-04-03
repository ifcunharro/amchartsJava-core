package amcharts.ValueAxis;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import amcharts.Axis.AxisBase;
import amcharts.ValueAxes.ValueAxes;

@JsonInclude(Include.NON_EMPTY)
public class ValueAxis extends AxisBase{

	public Object getId(){
		return axis.get("id");
	}
	
	public void setId(String id){
		axis.put("id","ValueAxis-"+ValueAxes.getSize()+1);
	}
}
