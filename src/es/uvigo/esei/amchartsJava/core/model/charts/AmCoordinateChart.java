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
import es.uvigo.esei.amchartsJava.core.model.collections.AmGraphs;
import es.uvigo.esei.amchartsJava.core.model.collections.ValueAxis;

public abstract class AmCoordinateChart extends AmChart implements IJsonDeserializerAmCoordinateChart{
	
	protected String deserializeType;
	private List<String> colors;
	private AmGraphs graphs;
	private List<GuideController> guides;
	private ValueAxis valueAxes;
	//private List<String> idGraphs;
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
	
	public List<GuideController> getGuides(){
		return guides;
	}
	
	public Object getValueAxes(){
		if(valueAxes==null){
			return null;
		}else{
			return valueAxes.getValueAxes();
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
		if(amGraphController instanceof AmGraphStepController){
			addGraphStep((AmGraphStepController)amGraphController);
		}else if(amGraphController instanceof AmGraphXyController){
			addGraphXy((AmGraphXyController)amGraphController);
		}else if(amGraphController instanceof AmGraphCandleController){
			addGraphCandle((AmGraphCandleController)amGraphController);
		}else if (amGraphController instanceof AmGraphOhlcController){
			addGraphOhlc((AmGraphOhlcController)amGraphController);
		}else if(amGraphController instanceof AmGraphSerialController){
			addGraphSerial((AmGraphSerialController)amGraphController);
		}
	}
	
	public void removeGraph(String idGraph){
		if(graphs.getAmGraphSerialIds().contains(idGraph)){
			removeGraphSerial(idGraph);
		}else if(graphs.getAmGraphStepIds().contains(idGraph)){
			removeGraphStep(idGraph);
		}else if(graphs.getAmGraphXyIds().contains(idGraph)){
			removeGraphXy(idGraph);
		}else if(graphs.getAmGraphCandleIds().contains(idGraph)){
			removeGraphCandle(idGraph);
		}else if(graphs.getAmGraphOhlcIds().contains(idGraph)){
			removeGraphOhlc(idGraph);
		}
	}

	private void addGraphSerial(AmGraphSerialController amGraphSerialController) {
		if(graphs==null){
			graphs = new AmGraphs();
		}
		addObserver(amGraphSerialController);
		setChanged();
		notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
		amGraphSerialController.setChart(this);
		graphs.addAmGraphSerial(amGraphSerialController);
		deleteObservers();
		
	}
	
	private void addGraphStep(AmGraphStepController amGraphStepController) {
		if(graphs==null){
			graphs = new AmGraphs();
		}
		
		addObserver(amGraphStepController);
		setChanged();
		notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
		amGraphStepController.setChart(this);
		graphs.addAmGraphStep(amGraphStepController);
		deleteObservers();
	}
	
	private void addGraphXy(AmGraphXyController amGraphXyController) {
		if(graphs==null){
			graphs = new AmGraphs();
		}
		
		addObserver(amGraphXyController);
		setChanged();
		notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
		amGraphXyController.setChart(this);
		graphs.addAmGraphXy(amGraphXyController);
		deleteObservers();
	}
	
	private void addGraphCandle(AmGraphCandleController amGraphCandleController) {
		if(graphs==null){
			graphs = new AmGraphs();
		}
		
		addObserver(amGraphCandleController);
		setChanged();
		notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
		amGraphCandleController.setChart(this);
		graphs.addAmGraphCandle(amGraphCandleController);
		deleteObservers();
	}
	
	private void addGraphOhlc(AmGraphOhlcController amGraphOhlcController) {
		if(graphs==null){
			graphs = new AmGraphs();
		}
		addObserver(amGraphOhlcController);
		setChanged();
		notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
		amGraphOhlcController.setChart(this);
		graphs.addAmGraphOhlc(amGraphOhlcController);
		deleteObservers();
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
			addValueAxisRadarController((ValueAxisRadarChartController)valueAxisController);
		}else{
			addValueAxisController(valueAxisController);
		}
		
		deleteObservers();
		
	}
	
	
	
	private void addValueAxisController(ValueAxisController valueAxisController){
		valueAxes.initValueAxis();
		notifyObservers(valueAxes.sizeValueAxis()+1+valueAxes.getDeleteValueAxis());
		valueAxes.addValueAxis(valueAxisController);
	}
	
	private void addValueAxisRadarController(ValueAxisRadarChartController valueAxisRadarChartController){
		valueAxes.initValueAxisRadar();
		notifyObservers(valueAxes.sizeValueAxisRadar()+1+valueAxes.getDeleteValueAxis());
		valueAxes.addValueAxisRadar(valueAxisRadarChartController);
	}
	
	
	
	public void removeGraphSerial(String idGraphSerial) {
		if(graphs.isNotEmptyAmGraphSerial()){
			graphs.removeAmGraphSerial(idGraphSerial);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			System.gc();
		}
	}
	
	public void removeGraphStep(String idGraphStep) {
		if(graphs.isNotEmptyAmGraphStep()){
			graphs.removeAmGraphStep(idGraphStep);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			System.gc();
		}

	}
	
	public void removeGraphXy(String idGraphXy) {
		if(graphs.isNotEmptyAmGraphXy()){
			graphs.removeAmGraphXy(idGraphXy);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			System.gc();
		}
		
	}
	
	public void removeGraphCandle(String idGraphCandle) {
		if(graphs.isNotEmptyAmGraphCandle()){
			graphs.removeAmGraphCandle(idGraphCandle);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			System.gc();
		}
	}
	
	public void removeGraphOhlc(String idGraphOhlc) {
		if(graphs.isNotEmptyAmGraphOhlc()){
			graphs.removeAmGraphOhlc(idGraphOhlc);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
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
		if(valueAxes.isNotEmptyValueAxis()){
			valueAxes.removeValueAxis(
						Integer.valueOf(idValueAxis.substring(idValueAxis.length() - 1))-1);
			
		}
		if(valueAxes.sizeValueAxis()==0 && valueAxes.sizeValueAxisRadar()==0){
			valueAxes=null;
			System.gc();
		}
		
	}
	
	public void removeValueAxisRadar(String idValueAxisRadar) {
		if(valueAxes.isNotEmptyValueAxisRadarChart()){
			valueAxes.removeValueAxisRadar(
					Integer.valueOf(idValueAxisRadar.substring(idValueAxisRadar.length() - 1))-1);
		
		}
		
		if(valueAxes.sizeValueAxisRadar()==0 && valueAxes.sizeValueAxis()==0){
			valueAxes=null;
			System.gc();
		}
		
	}

	
	public boolean existGraph(String idGraph){
		if(graphs != null){
			return graphs.existGraph(idGraph);
		}else{
			return false;
		}
	}
	
	public boolean existValueAxis(String idValueAxis){
		return valueAxes.existValueAxis(idValueAxis);
	}

	public boolean existGuide(String idGuide) {
		return idGuides.contains(idGuide);
	}
	
	//usado solo para deserializar json
	public void deserializeType(String amchartType){
		deserializeType = amchartType;
	}
	


}
