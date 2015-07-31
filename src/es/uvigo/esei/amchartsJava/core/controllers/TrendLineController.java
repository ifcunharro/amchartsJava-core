package es.uvigo.esei.amchartsJava.core.controllers;

import java.util.Observable;
import java.util.Observer;

import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.TrendLine;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

public abstract class TrendLineController implements Observer {
	
	private TrendLine trendLine;
	
	{
		trendLine = new TrendLine();
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.setId("TrendLine-"+arg.toString());	
	}
	
	private void setId(String id) {
		trendLine.setFeature("id", id);
			
	}




	public Object getDashLength(){
		return trendLine.getFeature("dashLength");
	}
	
	public void setDashLength(Number dashLength) throws OutOfRangeException{
		if(NumberValidator.rangeIntegerValidator(dashLength, 0, 16)){
			trendLine.setFeature("dashLength", dashLength);
		}
	}

}
