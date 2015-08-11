package es.uvigo.esei.amchartsJava.core.model.charts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.model.AmChart;
import es.uvigo.esei.amchartsJava.core.model.generics.ValueAxis;

public abstract class AmCoordinateChart extends AmChart{
	protected String deserializeType;
	private List<String> colors;
	private List<AmGraphController> graphs;
	private List<GuideController> guides;
	//private List<ValueAxisController> valueAxes;
	protected ValueAxis valueAxes;
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
	
	//usado para deserializar json
	public void setColors(List<String> c){
		colors = c;
	}
	
	
	public List<AmGraphController> getGraphs() {
		return graphs;
	}
	
	//usado para deserializar json
	public void setGraphs(List<AmGraphController> graphs){
		if(graphs==null){
			this.graphs = new ArrayList<AmGraphController>();
			this.idGraphs = new ArrayList<String>();
		}
		this.graphs = graphs;
		for(AmGraphController amGraphController: graphs){
			idGraphs.add(amGraphController.getId().toString());
		}
		System.out.println(idGraphs.get(idGraphs.size()-1).substring(idGraphs.size()-2));
	}
	
	public List<GuideController> getGuides(){
		return guides;
	}
	
	public Object getValueAxes(){
		if(valueAxes.getValueAxis()!=null){
			return valueAxes.getValueAxis();
		}else{
			return valueAxes.getValueAxisRadar();
		}
	}
	
	//usado para deserializar json
	@SuppressWarnings("unchecked")
	public void setValueAxes(List<ValueAxisRadarChartController> axes){
		if(deserializeType.equals("serial")){
			valueAxes = new ValueAxis();
			valueAxes.initValueAxis();
			valueAxes.setValueAxis((List<ValueAxisController>)(List<?>)axes);
			

		}else{
			valueAxes = new ValueAxis();
			valueAxes.initValueAxisRadar();
			valueAxes.setValueAxisRadar(axes);
			
		}
		/*for(ValueAxisRadarChartController valueAxis: axes){
			idValueAxes.add(valueAxis.getId().toString());
		}*/
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
			valueAxes = new ValueAxis();
			valueAxes.initValueAxis();
			idValueAxes = new ArrayList<String>();
		}
		
		addObserver(valueAxisController);
		setChanged();
		notifyObservers(valueAxes.sizeValueAxis()+1+deleteValueAxis);
		valueAxisController.setChart(this);
		valueAxes.addValueAxis(valueAxisController);
		deleteObservers();
		idValueAxes.add("ValueAxis-"+valueAxes.sizeValueAxis()+deleteValueAxis);
		
	}
	
	public void addValueAxis(ValueAxisRadarChartController valueAxisRadarChartController) {
		if(valueAxes==null){
			valueAxes = new ValueAxis();
			valueAxes.initValueAxisRadar();;
			idValueAxes = new ArrayList<String>();
		}
		
		addObserver(valueAxisRadarChartController);
		setChanged();
		notifyObservers(valueAxes.sizeValueAxisRadar()+1+deleteValueAxis);
		valueAxisRadarChartController.setChart(this);
		valueAxes.addValueAxisRadar(valueAxisRadarChartController);
		deleteObservers();
		idValueAxes.add("ValueAxis-"+valueAxes.sizeValueAxisRadar()+deleteValueAxis);
		
	}
	
	public void removeGraph(String idGraph) {
		if(graphs!=null){
			graphs.remove(Integer.valueOf(idGraph.substring(idGraph.length() - 1))-1);
			idGraphs.remove(idGraph);
			deleteGraphs++;
		}
		if(graphs.size()==0){
			graphs=null;
			idGraphs=null;
			deleteGraphs=0;
			System.gc();
		}
		
	}
	
	public void removeGuide(String idGuide) {
		if(guides!=null){
			guides.remove(Integer.valueOf(idGuide.substring(idGuide.length() - 1))-1);
			idGuides.remove(idGuide);
			deleteGuides++;
		}
		if(guides.size()==0){
			guides=null;
			idGuides=null;
			deleteGuides=0;
			System.gc();
		}
		
	}
	
	public void removeValueAxis(String idValueAxis) {
		if(valueAxes.getValueAxis()!=null){
			valueAxes.removeValueAxis(Integer.valueOf(idValueAxis.substring(idValueAxis.length() - 1))-1);
			idValueAxes.remove(idValueAxis);
			deleteValueAxis++;
		}
		if(valueAxes.getValueAxis()!=null && valueAxes.sizeValueAxis()==0){
			valueAxes=null;
			idValueAxes=null;
			deleteValueAxis=0;
			System.gc();
		}
		
	}
	
	public void removeValueAxisRadar(String idValueAxisRadar) {
		if(valueAxes.getValueAxisRadar()!=null){
			valueAxes.removeValueAxisRadar(Integer.valueOf(idValueAxisRadar.substring(idValueAxisRadar.length() - 1))-1);
			idValueAxes.remove(idValueAxisRadar);
			deleteValueAxis++;
		}
		if(valueAxes.getValueAxisRadar()!=null &&  valueAxes.sizeValueAxisRadar()==0){
			valueAxes=null;
			idValueAxes=null;
			deleteValueAxis=0;
			System.gc();
		}
		
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
	
	public void deserializeType(String amchartType){
		deserializeType = amchartType;
	}
	


}
