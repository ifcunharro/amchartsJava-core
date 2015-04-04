package amcharts.model.api.Axis;

import java.util.HashMap;
import java.util.Map;

import amcharts.model.Constants.DurationUnits;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class ValueAxis extends AxisBase{
	

	@JsonInclude(Include.NON_NULL)
	private Map<String,String> durationUnits;
	
	{
		durationUnits = new HashMap<String,String>();
		for(DurationUnits unit: DurationUnits.values()){
			durationUnits.put(unit.toString(), null);
		}

	}
	
	//solo lectura
	public Object getBaseCoord(){
		return axis.get("baseCoord");
	}
	
	public Object getBaseValue(){
		return axis.get("baseValue");
	}
	
	public void setBaseValue(Number baseValue){
		axis.put("baseValue", baseValue);
	}
	
	public Object getDuration(){
		return axis.get("duration");
	}
	
	public void setDuration(String duration){
		axis.put("duration",duration);
	}
	
	public Object getDurationUnits(){
		return durationUnits;
	}
	
	//comprobar que key solo recibe valores DD,hh,mm,ss
	public void setDurationUnits(String key,String value){
		durationUnits.put(key, value);
	}
	
	public Object IsIncludeGuidesInMinMax(){
		return axis.get("includeGuidesInMinMax");
	}
	
	public void setIncludeGuideInMinMax(Boolean includeGuideInMinMax){
		axis.put("includeGuideInMinMax", includeGuideInMinMax);
	}
	
	public Object IsIncludeHidden(){
		return axis.get("includeHidden");
	}
	
	public void setIncludeHidden(Boolean includeHidden){
		axis.put("includeHidden",includeHidden);
	}
	
	public Object IsIntegerOnly(){
		return axis.get("isIntegersOnly");
	}
	
	public void setIntegerOnly(Boolean integersOnly){
		axis.put("integersOnly", integersOnly);
	}
	
	public Object getLabelFunction(){
		return axis.get("labelFunction");
	}
	
	public void setLabelFunction(String labelFunction){
		axis.put("labelFunction", labelFunction);
	}
	
	
	public Object getId(){
		return axis.get("id");
	}
	
	public void setId(String id){
		axis.put("id","ValueAxis-"+(ValueAxes.getSize()+1));
	}
	
}
