package amcharts.ValueAxes;


import java.util.ArrayList;
import java.util.List;

import amcharts.Axis.AxisBase;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public class ValueAxes implements IValueAxes{
	//trendLines es un list para ayudar al parseo Json
	private List<AxisBase> valueAxes;
	private static int size;
	
	
	public ValueAxes() {
		valueAxes = new ArrayList<AxisBase>();	
	}
	
	
	
	public List<AxisBase> getValueAxes() {
		return valueAxes;
	}

	@JsonIgnore
	public static int getSize(){
		return size;
	}
	
	
	public void addValueAxe(AxisBase valueAxe) {
		
		valueAxes.add(valueAxe);
		size++;
	}

}
