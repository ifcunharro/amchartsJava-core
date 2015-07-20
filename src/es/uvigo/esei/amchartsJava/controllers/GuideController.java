package es.uvigo.esei.amchartsJava.controllers;

import java.util.Observable;
import java.util.Observer;

import com.fasterxml.jackson.annotation.JsonIgnore;

import es.uvigo.esei.amchartsJava.model.Guide;
import es.uvigo.esei.amchartsJava.model.charts.AmCoordinateChart;

public class GuideController implements Observer {
	
	private Guide guide;
	private AmCoordinateChart chart;

	{
		guide = new Guide();
	}
	
	@Override
	public void update(Observable o, Object arg) {
		this.setId("Guide-"+arg.toString());
		
	}
	
	@JsonIgnore
	public void setChart(AmCoordinateChart c) {
		chart = c;
		
	}

	public Object getId(){
		return guide.getFeature("id");
	}
	
	private void setId(String id) {
		guide.setFeature("id", id);
		
	}

	public Object getValueAxis(){
		return guide.getFeature("valueAxis");
	}
	
	public void setValueAxis(String valueAxis) {
		if(chart.existValueAxis(valueAxis)){
			guide.setFeature("valueAxis", valueAxis);
		}	
	}

	
}
