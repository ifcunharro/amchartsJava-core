package es.uvigo.esei.amchartsJava.core.model.charts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.controllers.axis.AxisBaseController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphCandleController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphOhlcController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphSerialController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphStepController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphXyController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideCategoryAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideValueAxisController;
import es.uvigo.esei.amchartsJava.core.exceptions.NotSupportedException;
import es.uvigo.esei.amchartsJava.core.model.AmChart;
import es.uvigo.esei.amchartsJava.core.model.collections.AmGraphs;
import es.uvigo.esei.amchartsJava.core.model.collections.Guides;
import es.uvigo.esei.amchartsJava.core.model.collections.ValueAxis;

public abstract class AmCoordinateChart extends AmChart implements IJsonDeserializerAmCoordinateChart{
	
	private List<String> colors;
	private AmGraphs graphs;
	private Guides guides;
	private ValueAxis valueAxes;
	

	{
		colors = new ArrayList<String>();
		for(ColorsAmCharts color: ColorsAmCharts.values()){
			colors.add(color.toString());
		}
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
		if(guides==null){
			return null;
		}else{
			return guides.getGuides();
		}
	}
	
	public Object getValueAxes(){
		if(valueAxes==null){
			return null;
		}else{
			return valueAxes.getValueAxes();
		}
	}
	
	public void changeColorsDefault(String... newColors){
		colors.clear();
		colors.addAll(Arrays.asList(newColors));
	}
	
	public void addColor(String color){
		colors.add(color);
	}
	
	public abstract <T extends AmGraphController> void addGraph(T amGraphController) throws NotSupportedException;
	
	
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

	protected void addGraphSerial(AmGraphSerialController amGraphSerialController) {
		if(graphs==null){
			graphs = new AmGraphs();
		}
		if(amGraphSerialController.getId()==null){
			addObserver(amGraphSerialController);
			setChanged();
			notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
		}
		amGraphSerialController.setChart(this);
		graphs.addAmGraphSerial(amGraphSerialController);
		deleteObservers();
		
	}
	
	protected void addGraphStep(AmGraphStepController amGraphStepController) {
		if(graphs==null){
			graphs = new AmGraphs();
		}
		if(amGraphStepController.getId()==null){
			addObserver(amGraphStepController);
			setChanged();
			notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
		}
		amGraphStepController.setChart(this);
		graphs.addAmGraphStep(amGraphStepController);
		deleteObservers();
	}
	
	protected void addGraphXy(AmGraphXyController amGraphXyController) {
		if(graphs==null){
			graphs = new AmGraphs();
		}
		if(amGraphXyController.getId()==null){
			addObserver(amGraphXyController);
			setChanged();
			notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
		}
		amGraphXyController.setChart(this);
		graphs.addAmGraphXy(amGraphXyController);
		deleteObservers();
	}
	
	protected void addGraphCandle(AmGraphCandleController amGraphCandleController) {
		if(graphs==null){
			graphs = new AmGraphs();
		}
		if(amGraphCandleController.getId()==null){
			addObserver(amGraphCandleController);
			setChanged();
			notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
		}
		amGraphCandleController.setChart(this);
		graphs.addAmGraphCandle(amGraphCandleController);
		deleteObservers();
	}
	
	protected void addGraphOhlc(AmGraphOhlcController amGraphOhlcController) {
		if(graphs==null){
			graphs = new AmGraphs();
		}
		if(amGraphOhlcController.getId()==null){
			addObserver(amGraphOhlcController);
			setChanged();
			notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
		}
		amGraphOhlcController.setChart(this);
		graphs.addAmGraphOhlc(amGraphOhlcController);
		deleteObservers();
	}
	
	public abstract <T extends GuideController> void addGuide(T guideController) throws NotSupportedException;
	
	
	protected void addGuideCategoryAxis(GuideCategoryAxisController guideCategoryAxisController){
		if(guides==null){
			guides = new Guides();
		}
		if(guideCategoryAxisController.getId()==null){
			addObserver(guideCategoryAxisController);
			setChanged();
			notifyObservers(guides.sizeGuides()+1+guides.deleteGuides());
		}
		guideCategoryAxisController.setChart(this);
		guides.addGuideCategoryAxis(guideCategoryAxisController);
		deleteObservers();
	}
	
	protected void addGuideRadarChart(GuideRadarChartController guideRadarChartController){
		if(guides==null){
			guides = new Guides();
		}
		if(guideRadarChartController.getId()==null){
			addObserver(guideRadarChartController);
			setChanged();
			notifyObservers(guides.sizeGuides()+1+guides.deleteGuides());
		}
		guideRadarChartController.setChart(this);
		guides.addGuideRadarChart(guideRadarChartController);
		deleteObservers();
	}
	
	protected void addGuideValueAxis(GuideValueAxisController guideValueAxisController){
		if(guides==null){
			guides = new Guides();
		}
		if(guideValueAxisController.getId()==null){
			addObserver(guideValueAxisController);
			setChanged();
			notifyObservers(guides.sizeGuides()+1+guides.deleteGuides());
		}
		guideValueAxisController.setChart(this);
		guides.addGuideValueAxis(guideValueAxisController);
		deleteObservers();
	}
	
	
	public abstract <T extends AxisBaseController> void addValueAxis(T valueAxisController) throws NotSupportedException;
	
	
	protected void addValueAxisController(ValueAxisController valueAxisController){
		if(valueAxes==null){
			valueAxes = new ValueAxis();
		}
		if(valueAxisController.getId()==null){
			addObserver(valueAxisController);
			setChanged();
			notifyObservers(valueAxes.sizeValueAxis()+1+valueAxes.getDeleteValueAxis());
		}
		
		valueAxisController.setChart(this);
		valueAxes.addValueAxis(valueAxisController);
		deleteObservers();
	}
	
	protected void addValueAxisRadarController(ValueAxisRadarChartController valueAxisRadarChartController){
		if(valueAxes==null){
			valueAxes = new ValueAxis();
		}
		if(valueAxisRadarChartController.getId()==null){
			addObserver(valueAxisRadarChartController);
			setChanged();
			notifyObservers(valueAxes.sizeValueAxisRadar()+1+valueAxes.getDeleteValueAxis());
		}
		
		valueAxisRadarChartController.setChart(this);
		valueAxes.addValueAxis(valueAxisRadarChartController);
		deleteObservers();
	}
	
	
	
	private void removeGraphSerial(String idGraphSerial) {
		if(graphs.isNotEmptyAmGraphSerial()){
			graphs.removeAmGraphSerial(idGraphSerial);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			System.gc();
		}
	}
	
	private void removeGraphStep(String idGraphStep) {
		if(graphs.isNotEmptyAmGraphStep()){
			graphs.removeAmGraphStep(idGraphStep);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			System.gc();
		}

	}
	
	private void removeGraphXy(String idGraphXy) {
		if(graphs.isNotEmptyAmGraphXy()){
			graphs.removeAmGraphXy(idGraphXy);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			System.gc();
		}
		
	}
	
	private void removeGraphCandle(String idGraphCandle) {
		if(graphs.isNotEmptyAmGraphCandle()){
			graphs.removeAmGraphCandle(idGraphCandle);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			System.gc();
		}
	}
	
	private void removeGraphOhlc(String idGraphOhlc) {
		if(graphs.isNotEmptyAmGraphOhlc()){
			graphs.removeAmGraphOhlc(idGraphOhlc);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			System.gc();
		}
		
	}
	
	public void removeGuide(String idGuide) {
		if(guides.getGuideCategoryAxisIds().contains(idGuide)){
			removeGuideCategoryAxis(idGuide);
		}else if(guides.getGuideRadarChartIds().contains(idGuide)){
			removeGuideRadarChart(idGuide);
		}else if(guides.getGuideValueAxisIds().contains(idGuide)){
			removeGuideValueAxis(idGuide);
		}
	}
	
	private void removeGuideCategoryAxis(String idGuideCategoryAxis){
		if(guides.isNotEmptyGuideCategoryAxis()){
			guides.removeGuideCategoryAxis(idGuideCategoryAxis);
		}
		if(guides.sizeGuides()==0){
			guides=null;
			System.gc();
		}
	}
	
	private void removeGuideRadarChart(String idGuideRadarChart){
		if(guides.isNotEmptyGuideRadarChart()){
			guides.removeGuideRadarChart(idGuideRadarChart);
		}
		if(guides.sizeGuides()==0){
			guides=null;
			System.gc();
		}
	}
	
	private void removeGuideValueAxis(String idGuideValueAxis){
		if(guides.isNotEmptyGuideValueAxis()){
			guides.removeGuideValueAxis(idGuideValueAxis);
		}
		if(guides.sizeGuides()==0){
			guides=null;
			System.gc();
		}
	}
		
	
	public void removeValueAxis(String idValueAxis){
		if(valueAxes.getValueAxisIds().contains(idValueAxis)){
			removeValueAxisController(idValueAxis);
		}else if(valueAxes.getValueAxisRadarIds().contains(idValueAxis)){
			removeValueAxisRadarController(idValueAxis);
		}
	}
	
	
	private void removeValueAxisController(String idValueAxis) {
		if(valueAxes.isNotEmptyValueAxis()){
			valueAxes.removeValueAxis(idValueAxis);	
		}
		if(valueAxes.sizeAxis()==0){
			valueAxes=null;
			System.gc();
		}
		
	}
	
	private void removeValueAxisRadarController(String idValueAxisRadar) {
		if(valueAxes.isNotEmptyValueAxisRadarChart()){
			valueAxes.removeValueAxisRadar(idValueAxisRadar);
		}
		if(valueAxes.sizeAxis()==0){
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
		if(valueAxes != null){
			return valueAxes.existValueAxis(idValueAxis);
		}else{
			return false;
		}
	}

	public boolean existGuide(String idGuide) {
		if(guides != null){
			return guides.existGuide(idGuide);
		}else{
			return false;
		}
	}
	
}
