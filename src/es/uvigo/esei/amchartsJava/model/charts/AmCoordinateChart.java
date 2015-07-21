package es.uvigo.esei.amchartsJava.model.charts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uvigo.esei.amchartsJava.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.model.AmChart;

public abstract class AmCoordinateChart extends AmChart {
	private List<String> colors;
	private List<AmGraphController> graphs;
	private List<GuideController> guides;
	private List<ValueAxisController> valueAxes;
	private List<String> idGraphs;
	private List<String> idValueAxes;
	private List<String> idGuides;
	private int deleteGraphs;
	private int deleteGuides;
	private int deleteValueAxis;
	
	
	
	{
		colors = new ArrayList<String>();
		for(ColorsAmCharts color: ColorsAmCharts.values()){
			colors.add(color.toString());
		}
		deleteGraphs = 0;
		deleteGuides = 0;
		deleteValueAxis = 0;
	}
	
	public List<String> getColors(){
		return colors;
	}
	
	public void changeColorsDefault(String... newColors){
		colors.clear();
		colors.addAll(Arrays.asList(newColors));
	}
	
	public void addColor(String color){
		colors.add(color);
	}

	public void addGraph(AmGraphController amGraphController) {
		if(graphs==null){
			graphs = new ArrayList<AmGraphController>();
			idGraphs = new ArrayList<String>();
		}
		
		addObserver(amGraphController);
		setChanged();
		notifyObservers(graphs.size()+1+deleteGraphs);
		amGraphController.setChart(this);
		graphs.add(amGraphController);
		deleteObservers();
		idGraphs.add("AmGraph-"+graphs.size()+deleteGraphs);
		
	}
	
	public void addGuide(GuideController guideController) {
		if(guides==null){
			guides = new ArrayList<GuideController>();
			idGuides = new ArrayList<String>();
		}
		
		addObserver(guideController);
		setChanged();
		notifyObservers(graphs.size()+1+deleteGuides);
		guideController.setChart(this);
		guides.add(guideController);
		deleteObservers();
		idGuides.add("Guide-"+guides.size()+deleteGuides);
		
	}
	
	public void addValueAxis(ValueAxisController valueAxisController) {
		if(valueAxes==null){
			valueAxes = new ArrayList<ValueAxisController>();
			idValueAxes = new ArrayList<String>();
		}
		
		addObserver(valueAxisController);
		setChanged();
		notifyObservers(valueAxes.size()+1+deleteValueAxis);
		valueAxisController.setChart(this);
		valueAxes.add(valueAxisController);
		deleteObservers();
		idValueAxes.add("ValueAxis-"+valueAxes.size()+deleteValueAxis);
		
	}
	
	


	public void removeGraph(String idGraph) {
		if(graphs!=null){
			graphs.remove(Integer.valueOf(idGraph.substring(idGraph.length() - 1))-1);
			idGraphs.remove(idGraph);
			deleteGraphs++;
		}
		
	}
	
	public void removeGuide(String idGuide) {
		if(guides!=null){
			guides.remove(Integer.valueOf(idGuide.substring(idGuide.length() - 1))-1);
			idGuides.remove(idGuide);
			deleteGuides++;
		}
		
	}
	
	public void removeValueAxis(String idValueAxis) {
		if(valueAxes!=null){
			valueAxes.remove(Integer.valueOf(idValueAxis.substring(idValueAxis.length() - 1))-1);
			idValueAxes.remove(idValueAxis);
			deleteValueAxis++;
		}
		
	}

	public Object getGraphs() {
		return graphs;
	}
	
	public Object getGuides(){
		return guides;
	}
	
	public Object getValueAxes(){
		return valueAxes;
	}
	
	public boolean existGraph(String idGraph){
		return idGraphs.contains(idGraph);
	}
	
	public boolean existValueAxis(String idValueAxis){
		return idValueAxes.contains(idValueAxis);
	}

	public boolean existGuide(String idGuide) {
		return idGuides.contains(idGuide);
	}

	
}
