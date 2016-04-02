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

/**
 * Model class for AmCoordinateChart
 * @author Iago Fernández Cuñarro
 *
 */
public abstract class AmCoordinateChart extends AmChart{
	
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
	
	/**
	 * Get colors.
	 * @return List of colors.
	 */
	public List<String> getColors(){
		return colors;
	}
	
	//used to deserialize json
	/**
	 * Set colors from json.
	 * @param c List of colors.
	 */
	public void setColors(List<String> c){
		colors = c;
	}
	
	/**
	 * Get graphs.
	 * @return List of AmGraphs.
	 */
	public List<AmGraphController> getGraphs() {
		if(graphs==null){
			return null;
		}else{
			return graphs.getGraphs();
		}
		
	}
	
	/**
	 * Get guides.
	 * @return List of Guides.
	 */
	public List<GuideController> getGuides(){
		if(guides==null){
			return null;
		}else{
			return guides.getGuides();
		}
	}
	
	/**
	 * Get valueAxis.
	 * @return Object List of ValueAxis.
	 */
	public Object getValueAxes(){
		if(valueAxes==null){
			return null;
		}else{
			return valueAxes.getValueAxes();
		}
	}
	
	/**
	 * Change default colors.
	 * @param newColors Value for colors.
	 */
	public void changeColorsDefault(String... newColors){
		colors.clear();
		colors.addAll(Arrays.asList(newColors));
	}
	
	/**
	 * Add a color.
	 * @param color Value for color.
	 */
	public void addColor(String color){
		colors.add(color);
	}
	
	/**
	 * Add a graph to chart.
	 * @param amGraphController Controller for amGraph.
	 * @throws NotSupportedException Graph is not supported by chart.
	 */
	public abstract void addGraph(AmGraphController amGraphController) throws NotSupportedException;
	
	/**
	 * Remove graph from chart.
	 * @param idGraph AmGraph id.
	 */
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

	/**
	 * Add an AmGraph type serial to chart.
	 * @param amGraphSerialController Controller for AmGraph of type serial.
	 */
	protected void addGraphSerial(AmGraphSerialController amGraphSerialController) {
		if(graphs==null){
			graphs = new AmGraphs();
		}
		if(amGraphSerialController.getId()==null){
			synchronized (this) {
				addObserver(amGraphSerialController);
				setChanged();
				notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
				amGraphSerialController.setChart(this);
			}
		}
		graphs.addAmGraphSerial(amGraphSerialController);
		deleteObservers();
		
	}
	
	/**
	 * Add an AmGraph type step to chart.
	 * @param amGraphStepController Controller for AmGraph of type step.
	 */
	protected void addGraphStep(AmGraphStepController amGraphStepController) {
		if(graphs==null){
			graphs = new AmGraphs();
		}
		if(amGraphStepController.getId()==null){
			synchronized (this) {
				addObserver(amGraphStepController);
				setChanged();
				notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
				amGraphStepController.setChart(this);
			}
		}
		graphs.addAmGraphStep(amGraphStepController);
		deleteObservers();
	}
	
	/**
	 * Add an AmGraph type xy to chart.
	 * @param amGraphXyController Controller for AmGraph of type xy.
	 */
	protected void addGraphXy(AmGraphXyController amGraphXyController) {
		if(graphs==null){
			graphs = new AmGraphs();
		}
		if(amGraphXyController.getId()==null){
			synchronized (this) {
				addObserver(amGraphXyController);
				setChanged();
				notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
				amGraphXyController.setChart(this);
			}
		}
		graphs.addAmGraphXy(amGraphXyController);
		deleteObservers();
	}
	
	/**
	 * Add an AmGraph type candle to chart.
	 * @param amGraphCandleController Controller for AmGraph of type candlestick.
	 */
	protected void addGraphCandle(AmGraphCandleController amGraphCandleController) {
		if(graphs==null){
			graphs = new AmGraphs();
		}
		if(amGraphCandleController.getId()==null){
			synchronized (this) {
				addObserver(amGraphCandleController);
				setChanged();
				notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
				amGraphCandleController.setChart(this);
			}
		}
		graphs.addAmGraphCandle(amGraphCandleController);
		deleteObservers();
	}
	
	/**
	 * Add an AmGraph type ohlc to chart.
	 * @param amGraphOhlcController Controller for AmGraph of type ohlc.
	 */
	protected void addGraphOhlc(AmGraphOhlcController amGraphOhlcController) {
		if(graphs==null){
			graphs = new AmGraphs();
		}
		if(amGraphOhlcController.getId()==null){
			synchronized (this) {
				addObserver(amGraphOhlcController);
				setChanged();
				notifyObservers(graphs.sizeAmGraphs()+1+graphs.deleteAmGraphs());
				amGraphOhlcController.setChart(this);
			}
		}
		graphs.addAmGraphOhlc(amGraphOhlcController);
		deleteObservers();
	}
	
	/**
	 * Add a Guide to chart.
	 * @param guideController Controller for Guide
	 * @throws NotSupportedException Guide is not supported by chart.
	 */
	public abstract void addGuide(GuideController guideController) throws NotSupportedException;
	
	/**
	 * Add a Guide to CategoryAxis.
	 * @param guideCategoryAxisController Controller for GuideCategoryAxis.
	 */
	protected void addGuideCategoryAxis(GuideCategoryAxisController guideCategoryAxisController){
		if(guides==null){
			guides = new Guides();
		}
		if(guideCategoryAxisController.getId()==null){
			synchronized (this) {
				addObserver(guideCategoryAxisController);
				setChanged();
				notifyObservers(guides.sizeGuides()+1+guides.deleteGuides());
				guideCategoryAxisController.setChart(this);
			}
		}
		guides.addGuideCategoryAxis(guideCategoryAxisController);
		deleteObservers();
	}
	
	/**
	 * Add a Guide to radarChart.
	 * @param guideRadarChartController Controller for Guide of radarChart.
	 */
	protected void addGuideRadarChart(GuideRadarChartController guideRadarChartController){
		if(guides==null){
			guides = new Guides();
		}
		if(guideRadarChartController.getId()==null){
			synchronized (this) {
				addObserver(guideRadarChartController);
				setChanged();
				notifyObservers(guides.sizeGuides()+1+guides.deleteGuides());
				guideRadarChartController.setChart(this);
			}
		}
		guides.addGuideRadarChart(guideRadarChartController);
		deleteObservers();
	}
	
	/**
	 * Add a Guide to valueAxis.
	 * @param guideValueAxisController Controller for Guide of valueAxis.
	 */
	protected void addGuideValueAxis(GuideValueAxisController guideValueAxisController){
		if(guides==null){
			guides = new Guides();
		}
		if(guideValueAxisController.getId()==null){
			synchronized (this) {
				addObserver(guideValueAxisController);
				setChanged();
				notifyObservers(guides.sizeGuides()+1+guides.deleteGuides());
				guideValueAxisController.setChart(this);
			}
		}
		guides.addGuideValueAxis(guideValueAxisController);
		deleteObservers();
	}
	
	/**
	 * Add a type of valueAxis to chart.
	 * @param valueAxisController Controller for valueAxis.
	 * @throws NotSupportedException ValueAxis is not supported by chart.
	 */
	public abstract void addValueAxis(AxisBaseController valueAxisController) throws NotSupportedException;
	
	/**
	 * Add a valueAxis to chart.
	 * @param valueAxisController Controller for valueAxis.
	 */
	protected void addValueAxisController(ValueAxisController valueAxisController){
		if(valueAxes==null){
			valueAxes = new ValueAxis();
		}
		if(valueAxisController.getId()==null){
			synchronized (this) {
				addObserver(valueAxisController);
				setChanged();
				notifyObservers(valueAxes.sizeValueAxis()+1+valueAxes.getDeleteValueAxis());
				valueAxisController.setChart(this);
			}
		}
		valueAxes.addValueAxis(valueAxisController);
		deleteObservers();
	}
	
	/**
	 * Add a valueAxis to radarChart.
	 * @param valueAxisRadarChartController Controller for valueAxis og radar chart.
	 */
	protected void addValueAxisRadarController(ValueAxisRadarChartController valueAxisRadarChartController){
		
		if(valueAxes==null){
			valueAxes = new ValueAxis();
		}
		if(valueAxisRadarChartController.getId()==null){
			synchronized (this) {
				addObserver(valueAxisRadarChartController);
				setChanged();
				notifyObservers(valueAxes.sizeValueAxisRadar()+1+valueAxes.getDeleteValueAxis());
				valueAxisRadarChartController.setChart(this);
			}
		}
		valueAxes.addValueAxisRadar(valueAxisRadarChartController);
		deleteObservers();
	}
	
	/**
	 * Remove graph from chart type serial.
	 * @param idGraphSerial AmGraph id.
	 */
	private void removeGraphSerial(String idGraphSerial) {
		if(graphs.isNotEmptyAmGraphSerial()){
			graphs.removeAmGraphSerial(idGraphSerial);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			System.gc();
		}
	}
	
	/**
	 * Remove graph from chart type step.
	 * @param idGraphStep AmGraph id.
	 */
	private void removeGraphStep(String idGraphStep) {
		if(graphs.isNotEmptyAmGraphStep()){
			graphs.removeAmGraphStep(idGraphStep);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			System.gc();
		}

	}
	
	/**
	 * Remove graph from chart type xy.
	 * @param idGraphXy AmGraph id.
	 */
	private void removeGraphXy(String idGraphXy) {
		if(graphs.isNotEmptyAmGraphXy()){
			graphs.removeAmGraphXy(idGraphXy);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			System.gc();
		}
		
	}
	
	/**
	 * Remove graph from chart type candlestick.
	 * @param idGraphCandle AmGraph id.
	 */
	private void removeGraphCandle(String idGraphCandle) {
		if(graphs.isNotEmptyAmGraphCandle()){
			graphs.removeAmGraphCandle(idGraphCandle);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			System.gc();
		}
	}
	
	/**
	 * Remove graph from chart type ohlc.
	 * @param idGraphOhlc AmGraph id.
	 */
	private void removeGraphOhlc(String idGraphOhlc) {
		if(graphs.isNotEmptyAmGraphOhlc()){
			graphs.removeAmGraphOhlc(idGraphOhlc);
		}
		if(graphs.sizeAmGraphs()==0){
			graphs=null;
			System.gc();
		}
		
	}
	
	/**
	 * Remove Guide from chart.
	 * @param idGuide Guide id.
	 */
	public void removeGuide(String idGuide) {
		if(guides.getGuideCategoryAxisIds().contains(idGuide)){
			removeGuideCategoryAxis(idGuide);
		}else if(guides.getGuideRadarChartIds().contains(idGuide)){
			removeGuideRadarChart(idGuide);
		}else if(guides.getGuideValueAxisIds().contains(idGuide)){
			removeGuideValueAxis(idGuide);
		}
	}
	
	/**
	 * Remove Guide to categoryAxis
	 * @param idGuideCategoryAxis Guide id.
	 */
	private void removeGuideCategoryAxis(String idGuideCategoryAxis){
		if(guides.isNotEmptyGuideCategoryAxis()){
			guides.removeGuideCategoryAxis(idGuideCategoryAxis);
		}
		if(guides.sizeGuides()==0){
			guides=null;
			System.gc();
		}
	}
	
	/**
	 * Remove Guide to radar chart.
	 * @param idGuideRadarChart Guide id.
	 */
	private void removeGuideRadarChart(String idGuideRadarChart){
		if(guides.isNotEmptyGuideRadarChart()){
			guides.removeGuideRadarChart(idGuideRadarChart);
		}
		if(guides.sizeGuides()==0){
			guides=null;
			System.gc();
		}
	}
	
	/**
	 * Remove Guide to valueAxis. 
	 * @param idGuideValueAxis Guide id.
	 */
	private void removeGuideValueAxis(String idGuideValueAxis){
		if(guides.isNotEmptyGuideValueAxis()){
			guides.removeGuideValueAxis(idGuideValueAxis);
		}
		if(guides.sizeGuides()==0){
			guides=null;
			System.gc();
		}
	}
	
	/**
	 * Remove ValueAxis.
	 * @param idValueAxis ValueAxis id.
	 */
	public void removeValueAxis(String idValueAxis){
		if(valueAxes.getValueAxisIds().contains(idValueAxis)){
			removeValueAxisController(idValueAxis);
		}else if(valueAxes.getValueAxisRadarIds().contains(idValueAxis)){
			removeValueAxisRadarController(idValueAxis);
		}
	}
	
	/**
	 * Remove valueAxis from chart not radar chart.
	 * @param idValueAxis ValueAxis id.
	 */
	private void removeValueAxisController(String idValueAxis) {
		if(valueAxes.isNotEmptyValueAxis()){
			valueAxes.removeValueAxis(idValueAxis);	
		}
		if(valueAxes.sizeAxis()==0){
			valueAxes=null;
			System.gc();
		}
		
	}
	
	/**
	 * Remove valueAxis from radar chart.
	 * @param idValueAxisRadar ValueAxis id.
	 */
	private void removeValueAxisRadarController(String idValueAxisRadar) {
		if(valueAxes.isNotEmptyValueAxisRadarChart()){
			valueAxes.removeValueAxisRadar(idValueAxisRadar);
		}
		if(valueAxes.sizeAxis()==0){
			valueAxes=null;
			System.gc();
		}
	}

	/**
	 * Check exists AmGraph.
	 * @param idGraph AmGraph id.
	 * @return Exists or doesn't exist AmGraph.
	 */
	public boolean existGraph(String idGraph){
		if(graphs != null){
			return graphs.existGraph(idGraph);
		}else{
			return false;
		}
	}
	
	/**
	 * Check exists ValueAxis.
	 * @param idValueAxis ValueAxis id.
	 * @return Exists or doesn't exist ValueAxis.
	 */
	public boolean existValueAxis(String idValueAxis){
		if(valueAxes != null){
			return valueAxes.existValueAxis(idValueAxis);
		}else{
			return false;
		}
	}

	/**
	 * Check exists Guide.
	 * @param idGuide Guide id.
	 * @return Exists or doesn't exist Guide.
	 */
	public boolean existGuide(String idGuide) {
		if(guides != null){
			return guides.existGuide(idGuide);
		}else{
			return false;
		}
	}
	
}
