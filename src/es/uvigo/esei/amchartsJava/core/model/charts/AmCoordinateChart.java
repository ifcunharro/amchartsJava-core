package es.uvigo.esei.amchartsJava.core.model.charts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphCandleController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphOhlcController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphSerialController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphStepController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphXyController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.model.AmChart;
import es.uvigo.esei.amchartsJava.core.model.generics.AmGraphs;
import es.uvigo.esei.amchartsJava.core.model.generics.ValueAxis;

public abstract class AmCoordinateChart extends AmChart implements IJsonDeserializerAmCoordinateChart{
	private String deserializeType;
	private List<String> colors;
	//private List<AmGraphController> graphs;
	private AmGraphs graphs;
	private List<GuideController> guides;
	private ValueAxis valueAxes;
	private List<String> idGraphs;
	private List<String> idGuides;
	private int deleteGuides;
	

	
	
	
	{
		colors = new ArrayList<String>();
		for(ColorsAmCharts color: ColorsAmCharts.values()){
			colors.add(color.toString());
		}
		deleteGuides = 0;
	}
	
	public List<String> getColors(){
		return colors;
	}
	
	//usado para deserializar json
	public void setColors(List<String> c){
		colors = c;
	}
	
	
	public List<AmGraphController> getGraphs() {
		if(graphs==null){
			return null;
		}else{
			return graphs.getGraphs();
		}
		
	}
	
	//usado para deserializar json
	/*public void setGraphs(List<AmGraphSerialController> amGraphs){
		graphs = new AmGraphs();
		graphs.setAmgraphs(amGraphs);
		idGraphs = graphs.getAmGraphsIds();
	}*/
	
	public List<GuideController> getGuides(){
		return guides;
	}
	
	public Object getValueAxes(){
		List<Object> list = new ArrayList<Object>();
		if(valueAxes!=null){
			if(valueAxes.getValueAxis()!=null){
				list.addAll(valueAxes.getValueAxis());
			}
			if(valueAxes.getValueAxisRadar()!=null){
				list.addAll(valueAxes.getValueAxisRadar());
			}
		}
		if(list.size()==0){
			return null;
		}else{
			return list;
		}

	}
	
	//usado para deserializar json
	@SuppressWarnings("unchecked")
	public void setValueAxes(List<ValueAxisRadarChartController> axes){
		valueAxes = new ValueAxis();
		if(deserializeType.equals("serial")){
			valueAxes.initValueAxis();
			valueAxes.setValueAxis((List<ValueAxisController>)(List<?>)axes);
		}else{
			valueAxes.initValueAxisRadar();
			valueAxes.setValueAxisRadar(axes);
		}
		
	}
	
	public void changeColorsDefault(String... newColors){
		colors.clear();
		colors.addAll(Arrays.asList(newColors));
	}
	
	public void addColor(String color){
		colors.add(color);
	}
	
	public <T extends AmGraphController> void addGraph(T amGraphController){
		if(amGraphController instanceof AmGraphSerialController){
			addGraphSerial((AmGraphSerialController)amGraphController);
		}else if(amGraphController instanceof AmGraphStepController){
			addGraphStep((AmGraphStepController)amGraphController);
		}else if(amGraphController instanceof AmGraphXyController){
			addGraphXy((AmGraphXyController)amGraphController);
		}else if(amGraphController instanceof AmGraphCandleController){
			addGraphCandle((AmGraphCandleController)amGraphController);
		}else{
			addGraphOhlc((AmGraphOhlcController)amGraphController);
		}
	}

	private void addGraphSerial(AmGraphSerialController amGraphSerialController) {
		if(graphs==null){
			graphs = new AmGraphs();
			idGraphs = new ArrayList<String>();
		}
		
		addObserver(amGraphSerialController);
		setChanged();
		notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
		amGraphSerialController.setChart(this);
		graphs.addAmGraphSerial(amGraphSerialController);
		deleteObservers();
		idGraphs.add("AmGraph-"+graphs.sizeAmGraphs()+graphs.deleteAmGraphs());
		
	}
	
	private void addGraphStep(AmGraphStepController amGraphStepController) {
		if(graphs==null){
			graphs = new AmGraphs();
			idGraphs = new ArrayList<String>();
		}
		addObserver(amGraphStepController);
		setChanged();
		notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
		amGraphStepController.setChart(this);
		graphs.addAmGraphStep(amGraphStepController);
		deleteObservers();
		idGraphs.add("AmGraph-"+graphs.sizeAmGraphs()+graphs.deleteAmGraphs());
		
	}
	
	private void addGraphXy(AmGraphXyController amGraphXyController) {
		if(graphs==null){
			graphs = new AmGraphs();
			idGraphs = new ArrayList<String>();
		}
		
		addObserver(amGraphXyController);
		setChanged();
		notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
		amGraphXyController.setChart(this);
		graphs.addAmGraphXy(amGraphXyController);
		deleteObservers();
		idGraphs.add("AmGraph-"+graphs.sizeAmGraphs()+graphs.deleteAmGraphs());
		
	}
	
	private void addGraphCandle(AmGraphCandleController amGraphCandleController) {
		if(graphs==null){
			graphs = new AmGraphs();
			idGraphs = new ArrayList<String>();
		}
		
		addObserver(amGraphCandleController);
		setChanged();
		notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
		amGraphCandleController.setChart(this);
		graphs.addAmGraphCandle(amGraphCandleController);
		deleteObservers();
		idGraphs.add("AmGraph-"+graphs.sizeAmGraphs()+graphs.deleteAmGraphs());
		
	}
	
	private void addGraphOhlc(AmGraphOhlcController amGraphOhlcController) {
		if(graphs==null){
			graphs = new AmGraphs();
			idGraphs = new ArrayList<String>();
		}
		
		addObserver(amGraphOhlcController);
		setChanged();
		notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
		amGraphOhlcController.setChart(this);
		graphs.addAmGraphOhlc(amGraphOhlcController);
		deleteObservers();
		idGraphs.add("AmGraph-"+graphs.sizeAmGraphs()+graphs.deleteAmGraphs());
		
	}
	
	public void addGuide(GuideController guideController) {
		if(guides==null){
			guides = new ArrayList<GuideController>();
			idGuides = new ArrayList<String>();
		}
		
		addObserver(guideController);
		setChanged();
		//notifyObservers(graphs.size()+1+deleteGuides);
		guideController.setChart(this);
		guides.add(guideController);
		deleteObservers();
		idGuides.add("Guide-"+guides.size()+deleteGuides);
		
	}
	
	public <T extends ValueAxisController> void addValueAxis(T valueAxisController) {
		if(valueAxes==null){
			valueAxes = new ValueAxis();
		}
		valueAxisController.setChart(this);
		addObserver(valueAxisController);
		setChanged();
		if(valueAxisController instanceof ValueAxisRadarChartController){
			valueAxes.initValueAxisRadar();
			notifyObservers(valueAxes.sizeValueAxisRadar()+1+valueAxes.getDeleteValueAxis());
			valueAxes.addValueAxisRadar((ValueAxisRadarChartController)valueAxisController);
		}else{
			valueAxes.initValueAxis();
			notifyObservers(valueAxes.sizeValueAxis()+1+valueAxes.getDeleteValueAxis());
			valueAxes.addValueAxis((ValueAxisController)valueAxisController);
		}
		
		deleteObservers();
		
	}
	
	
	
	public void removeGraphSerial(String idGraph) {
		if(graphs!=null){
			graphs.removeAmGraphSerial(Integer.valueOf(idGraph.substring(idGraph.length() - 1))-1);
			idGraphs.remove(idGraph);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			idGraphs=null;
			System.gc();
		}
		
	}
	
	public void removeGraphStep(String idGraph) {
		if(graphs!=null){
			graphs.removeAmGraphStep(Integer.valueOf(idGraph.substring(idGraph.length() - 1))-1);
			idGraphs.remove(idGraph);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			idGraphs=null;
			System.gc();
		}
		
	}
	
	public void removeGraphXy(String idGraph) {
		if(graphs!=null){
			graphs.removeAmGraphXy(Integer.valueOf(idGraph.substring(idGraph.length() - 1))-1);
			idGraphs.remove(idGraph);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			idGraphs=null;
			System.gc();
		}
		
	}
	
	public void removeGraphCandle(String idGraph) {
		if(graphs!=null){
			graphs.removeAmGraphCandle(Integer.valueOf(idGraph.substring(idGraph.length() - 1))-1);
			idGraphs.remove(idGraph);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			idGraphs=null;
			System.gc();
		}
		
	}
	
	public void removeGraphOhlc(String idGraph) {
		if(graphs!=null){
			graphs.removeAmGraphOhlc(Integer.valueOf(idGraph.substring(idGraph.length() - 1))-1);
			idGraphs.remove(idGraph);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			idGraphs=null;
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
			valueAxes.removeValueAxis(
						Integer.valueOf(idValueAxis.substring(idValueAxis.length() - 1))-1);
			
		}
		if(valueAxes.sizeValueAxis()==0 && valueAxes.sizeValueAxisRadar()==0){
			valueAxes=null;
			System.gc();
		}
		
	}
	
	public void removeValueAxisRadar(String idValueAxisRadar) {
		if(valueAxes.getValueAxisRadar()!=null){
			valueAxes.removeValueAxisRadar(
					Integer.valueOf(idValueAxisRadar.substring(idValueAxisRadar.length() - 1))-1);
		
		}
		
		if(valueAxes.sizeValueAxisRadar()==0 && valueAxes.sizeValueAxis()==0){
			valueAxes=null;
			System.gc();
		}
		
	}

	
	public boolean existGraph(String idGraph){
		return idGraphs.contains(idGraph);
	}
	
	public boolean existValueAxis(String idValueAxis){
		return valueAxes.getValueAxisIds().contains(idValueAxis) ||
				valueAxes.getValueAxisRadarIds().contains(idValueAxis);
	}

	public boolean existGuide(String idGuide) {
		return idGuides.contains(idGuide);
	}
	
	//usado solo para deserializar json
	public void deserializeType(String amchartType){
		deserializeType = amchartType;
	}
	


}
