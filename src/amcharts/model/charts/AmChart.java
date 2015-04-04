package amcharts.model.charts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import amcharts.model.api.Label.ILabel;

public abstract class AmChart {
	
	protected Map<String,Object> settings;
	protected List<ILabel> labels;
	
	{
		settings = new HashMap<String, Object>();
	}
	
	
	public Object IsAddClassNames(){
		return settings.get("addClassNames");
	}
	
	public void setAddClassNames(Boolean addClassNames){
		settings.put("addClassNames",addClassNames);
	}
	
	public Object getAllLabels(){
		return labels;
	}
	
	public void addLabel(ILabel label){
		labels.add(label);
	}
	
	
	

}
