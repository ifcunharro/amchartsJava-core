package es.uvigo.esei.amchartsJava.core.model.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphCandleController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphOhlcController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphSerialController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphStepController;
import es.uvigo.esei.amchartsJava.core.controllers.graphs.AmGraphXyController;

/**
 * Collection of AmGraphs.
 * @author Iago Fernández Cuñarro
 *
 */
public class AmGraphs {
	
	private Map<String,Object> amgraphs;
	private Map<String,Integer> positionsAmGraphs;
	private int sizeAmGraphs;
	private int deleteAmGraphs;
	private List<String> idGraphs;
	
	{
		amgraphs = new HashMap<String,Object>();
		positionsAmGraphs = new HashMap<String,Integer>();
		idGraphs = new ArrayList<String>();
		sizeAmGraphs = 0;
		deleteAmGraphs = 0;
	}
	
	/**
	 * Get number of AmGraphs added to chart.
	 * @return Number of AmGraphs.
	 */
	public int sizeAmGraphs(){
		return sizeAmGraphs;
	}
	
	/**
	 * Get number of AmGraphs of chart type serial.
	 * @return Number of AmGraphSerialController.
	 */
	public int sizeAmGraphsSerial(){
		if(isNotEmptyAmGraphSerial()){
			return getAmGraphSerial().size();
		}
		return 0;
	}
	
	/**
	 * Get number of AmGraphs of chart type step.
	 * @return Number of AmGraphStepController.
	 */
	public int sizeAmGraphsStep(){
		if(isNotEmptyAmGraphStep()){
			return getAmGraphStep().size();
		}
		return 0;
	}
	
	/**
	 * Get number of AmGraphs of chart type xy.
	 * @return Number of AmGraphXyController.
	 */
	public int sizeAmGraphsXy(){
		if(isNotEmptyAmGraphXy()){
			return getAmGraphXy().size();
		}
		return 0;
	}
	
	/**
	 * Get number of AmGraphs of chart type candle.
	 * @return Number of AmGraphCandleController.
	 */
	public int sizeAmGraphsCandle(){
		if(isNotEmptyAmGraphCandle()){
			return getAmGraphCandle().size();
		}
		return 0;
	}
	
	/**
	 * Get number of AmGraphs of chart type ohlc.
	 * @return Number of AmGraphOhlcController.
	 */
	public int sizeAmGraphsOhlc(){
		if(isNotEmptyAmGraphOhlc()){
			return getAmGraphOhlc().size();
		}
		return 0;
	}
	
	/**
	 * Get delete AmGraphs.
	 * @return Number of delete AmGraphs.
	 */
	public int deleteAmGraphs(){
		return deleteAmGraphs;
	}
	
	/**
	 * Check exists AmGraph in collection.
	 * @param idGraph AmGraph id.
	 * @return Exists or doesn't exist AmGraph in collection.
	 */
	public boolean existGraph(String idGraph) {
		return getAllGraphsIds().contains(idGraph);
	}
	
	/**
	 * Check exists any AmGraph of chart type serial.
	 * @return List of AmGraphSerialController initialized.
	 */
	public boolean isNotEmptyAmGraphSerial(){
		return getAmGraphSerial()!=null;
	}
	
	/**
	 * Check exists any AmGraph of chart type step.
	 * @return List of AmGraphStepController initialized.
	 */
	public boolean isNotEmptyAmGraphStep(){
		return getAmGraphStep()!=null;
	}
	
	/**
	 * Check exists any AmGraph of chart type xy.
	 * @return List of AmGraphXyController initialized.
	 */
	public boolean isNotEmptyAmGraphXy(){
		return getAmGraphXy()!=null;
	}
	
	/**
	 * Check exists any AmGraph of chart type candle.
	 * @return List of AmGraphCandleController initialized.
	 */
	public boolean isNotEmptyAmGraphCandle(){
		return getAmGraphCandle()!=null;
	}
	
	/**
	 * Check exists any AmGraph of chart type ohlc.
	 * @return List of AmGraphOhlcController initialized.
	 */
	public boolean isNotEmptyAmGraphOhlc(){
		return getAmGraphOhlc()!=null;
	}
	
	/**
	 * Get AmGraph ids.
	 * @return List of AmGraph ids.
	 */
	public List<String> getAllGraphsIds(){
		return idGraphs;
	}
	
	/**
	 * Get AmGraph ids of chart type serial. 
	 * @return AmGraph ids.
	 */
	public List<String> getAmGraphSerialIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyAmGraphSerial()){
			for(AmGraphSerialController serial: getAmGraphSerial()){
				ids.add(serial.getId());
			}
		}
		return ids;
	}
	
	/**
	 * Get AmGraph ids of chart type step. 
	 * @return AmGraph ids.
	 */
	public List<String> getAmGraphStepIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyAmGraphStep()){
			for(AmGraphStepController step: getAmGraphStep()){
				ids.add(step.getId());
			}
		}
		return ids;
	}
	
	/**
	 * Get AmGraph ids of chart type xy. 
	 * @return AmGraph ids.
	 */
	public List<String> getAmGraphXyIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyAmGraphXy()){
			for(AmGraphXyController xy: getAmGraphXy()){
				ids.add(xy.getId());
			}
		}
		return ids;
	}
	
	/**
	 * Get AmGraph ids of chart type candle. 
	 * @return AmGraph ids.
	 */
	public List<String> getAmGraphCandleIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyAmGraphCandle()){
			for(AmGraphCandleController candle: getAmGraphCandle()){
				ids.add(candle.getId());
			}
		}
		return ids;
	}
	
	/**
	 * Get AmGraph ids of chart type ohlc. 
	 * @return AmGraph ids.
	 */
	public List<String> getAmGraphOhlcIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyAmGraphOhlc()){
			for(AmGraphOhlcController ohlc: getAmGraphOhlc()){
				ids.add(ohlc.getId());
			}
		}
		return ids;
	}
	
	/**
	 * Get AmGraphs.
	 * @return List of AmGraphs.
	 */
	public List<AmGraphController> getGraphs(){
		List<AmGraphController> amgraphControllers = new ArrayList<AmGraphController>();
		if(isNotEmptyAmGraphSerial()){
			for(AmGraphController am: getAmGraphSerial()){
				amgraphControllers.add(am);
			}
		}
		if(isNotEmptyAmGraphStep()){
			for(AmGraphController am: getAmGraphStep()){
				amgraphControllers.add(am);
			}
		}
		if(isNotEmptyAmGraphXy()){
			for(AmGraphController am: getAmGraphXy()){
				amgraphControllers.add(am);
			}
			
		}
		if(isNotEmptyAmGraphCandle()){
			for(AmGraphController am: getAmGraphCandle()){
				amgraphControllers.add(am);
			}
		}
		if(isNotEmptyAmGraphOhlc()){
			for(AmGraphController am: getAmGraphOhlc()){
				amgraphControllers.add(am);
			}
		}
		return amgraphControllers;
	}
	
	/**
	 * Add a AmGraphSerial to collection.
	 * @param amGraphSerialController Controller for AmGraph or type serial.
	 */
	public void addAmGraphSerial(AmGraphSerialController amGraphSerialController){
		if(getAmGraphSerial()==null){
			initAmGraphSerial();
		}
		this.getAmGraphSerial().add(amGraphSerialController);
		String idGraph = amGraphSerialController.getId();
		idGraphs.add(idGraph);
		positionsAmGraphs.put(idGraph, sizeAmGraphsSerial()-1);
		sizeAmGraphs++;
	}
	
	/**
	 * Add a AmGraphStep to collection.
	 * @param amGraphStepController Controller for AmGraph or type step.
	 */
	public void addAmGraphStep(AmGraphStepController amGraphStepController){
		if(getAmGraphStep()==null){
			initAmGraphStep();
		}
		this.getAmGraphStep().add(amGraphStepController);
		String idGraph = amGraphStepController.getId();
		idGraphs.add(idGraph);
		positionsAmGraphs.put(idGraph, sizeAmGraphsStep()-1);
		sizeAmGraphs++;
	}

	/**
	 * Add a AmGraphXy to collection.
	 * @param amGraphXyController Controller for AmGraph or type xy.
	 */
	public void addAmGraphXy(AmGraphXyController amGraphXyController){
		if(getAmGraphXy()==null){
			initAmGraphXy();
		}
		this.getAmGraphXy().add(amGraphXyController);
		String idGraph = amGraphXyController.getId();
		idGraphs.add(idGraph);
		positionsAmGraphs.put(idGraph, sizeAmGraphsXy()-1);
		sizeAmGraphs++;
	}
	
	/**
	 * Add a AmGraphCandle to collection.
	 * @param amGraphCandleController Controller for AmGraph or type candle.
	 */
	public void addAmGraphCandle(AmGraphCandleController amGraphCandleController){
		if(getAmGraphCandle()==null){
			initAmGraphCandle();
		}
		this.getAmGraphCandle().add(amGraphCandleController);
		String idGraph = amGraphCandleController.getId();
		idGraphs.add(idGraph);
		positionsAmGraphs.put(idGraph, sizeAmGraphsCandle()-1);
		sizeAmGraphs++;
	}
	
	/**
	 * Add a AmGraphOhlc to collection.
	 * @param amGraphOhlcController Controller for AmGraph or type ohlc.
	 */
	public void addAmGraphOhlc(AmGraphOhlcController amGraphOhlcController){
		if(getAmGraphOhlc()==null){
			initAmGraphOhlc();
		}
		this.getAmGraphOhlc().add(amGraphOhlcController);
		String idGraph = amGraphOhlcController.getId();
		idGraphs.add(idGraph);
		positionsAmGraphs.put(idGraph, sizeAmGraphsOhlc()-1);
		sizeAmGraphs++;
		
	}
	
	/**
	 * Remove an AmGraph of chart type serial.
	 * @param idGraphSerial AmGraph id.
	 */
	public void removeAmGraphSerial(String idGraphSerial) {
		Integer position = positionsAmGraphs.get(idGraphSerial);
		if(position != null){
			this.getAmGraphSerial().remove(position);
			if(sizeAmGraphsSerial()==0){
				deleteAmGraphSerial();
			}
			sizeAmGraphs--;
			deleteAmGraphs++;
			idGraphs.remove(idGraphSerial);
			positionsAmGraphs.remove(idGraphSerial);
		}
		
	}
	
	/**
	 * Remove an AmGraph of chart type step.
	 * @param idGraphStep AmGraph id.
	 */
	public void removeAmGraphStep(String idGraphStep) {
		Integer position = positionsAmGraphs.get(idGraphStep);
		if(position != null){
			this.getAmGraphStep().remove(position);
			if(sizeAmGraphsStep()==0){
				deleteAmGraphStep();
			}
			sizeAmGraphs--;
			deleteAmGraphs++;
			idGraphs.remove(idGraphStep);
			positionsAmGraphs.remove(idGraphStep);
		}
	}
	
	/**
	 * Remove an AmGraph of chart type xy.
	 * @param idGraphXy AmGraph id.
	 */
	public void removeAmGraphXy(String idGraphXy) {
		Integer position = positionsAmGraphs.get(idGraphXy);
		if(position != null){
			this.getAmGraphXy().remove(position);
			if(sizeAmGraphsXy()==0){
				deleteAmGraphXy();
			}
			sizeAmGraphs--;
			deleteAmGraphs++;
			idGraphs.remove(idGraphXy);
			positionsAmGraphs.remove(idGraphXy);
		}
		
	}
	
	/**
	 * Remove an AmGraph of chart type candle.
	 * @param idGraphCandle AmGraph id.
	 */
	public void removeAmGraphCandle(String idGraphCandle) {
		Integer position = positionsAmGraphs.get(idGraphCandle);
		if(position != null){
			this.getAmGraphCandle().remove(position);
			if(sizeAmGraphsCandle()==0){
				deleteAmGraphCandle();
			}
			sizeAmGraphs--;
			deleteAmGraphs++;
			idGraphs.remove(idGraphCandle);
			positionsAmGraphs.remove(idGraphCandle);
		}
	}
	
	/**
	 * Remove an AmGraph of chart type ohlc.
	 * @param idGraphOhlc AmGraph id.
	 */
	public void removeAmGraphOhlc(String idGraphOhlc) {
		Integer position = positionsAmGraphs.get(idGraphOhlc);
		if(position != null){
			this.getAmGraphOhlc().remove(position);
			if(sizeAmGraphsOhlc()==0){
				deleteAmGraphOhlc();
			}
			sizeAmGraphs--;
			deleteAmGraphs++;
			idGraphs.remove(idGraphOhlc);
			positionsAmGraphs.remove(idGraphOhlc);
		}
	}
	
	/**
	 * Initialize list of AmGraphSerialController.
	 */
	private void initAmGraphSerial(){
		amgraphs.put("AmGraphSerialController", new ArrayList<AmGraphSerialController>());
	}
	
	/**
	 * Initialize list of AmGraphStepController.
	 */
	private void initAmGraphStep(){
		amgraphs.put("AmGraphStepController", new ArrayList<AmGraphStepController>());
	}
	
	/**
	 * Initialize list of AmGraphXyController.
	 */
	private void initAmGraphXy(){
		amgraphs.put("AmGraphXyController", new ArrayList<AmGraphXyController>());
	}
	
	/**
	 * Initialize list of AmGraphCandleController.
	 */
	private void initAmGraphCandle(){
		amgraphs.put("AmGraphCandleController", new ArrayList<AmGraphCandleController>());
	}
	
	/**
	 * Initialize list of AmGraphOhlcController.
	 */
	private void initAmGraphOhlc(){
		amgraphs.put("AmGraphOhlcController", new ArrayList<AmGraphOhlcController>());
	}
	
	/**
	 * Remove list of AmGraphSerialController.
	 */
	private void deleteAmGraphSerial(){
		amgraphs.remove("AmGraphSerialController");
	}
	
	/**
	 * Remove list of AmGraphStepController.
	 */
	private void deleteAmGraphStep(){
		amgraphs.remove("AmGraphStepController");
	}
	
	/**
	 * Remove list of AmGraphXyController.
	 */
	private void deleteAmGraphXy(){
		amgraphs.remove("AmGraphXyController");
	}
	
	/**
	 * Remove list of AmGraphCandleController.
	 */
	private void deleteAmGraphCandle(){
		amgraphs.remove("AmGraphCandleController");
	}
	
	/**
	 * Remove list of AmGraphOhlcController.
	 */
	private void deleteAmGraphOhlc(){
		amgraphs.remove("AmGraphOhlcController");
	}
	
	/**
	 * Get list of AmGraphSerialController.
	 * @return List<AmGraphSerialController>
	 */
	@SuppressWarnings("unchecked")
	private List<AmGraphSerialController> getAmGraphSerial(){
		return (List<AmGraphSerialController>) amgraphs.get("AmGraphSerialController");
	}
	
	/**
	 * Get list of AmGraphStepController.
	 * @return List<AmGraphStepController>
	 */
	@SuppressWarnings("unchecked")
	private List<AmGraphStepController> getAmGraphStep(){
		return (List<AmGraphStepController>) amgraphs.get("AmGraphStepController");
	}
	
	/**
	 * Get list of AmGraphXyController.
	 * @return List<AmGraphXyController>
	 */
	@SuppressWarnings("unchecked")
	private List<AmGraphXyController> getAmGraphXy(){
		return (List<AmGraphXyController>) amgraphs.get("AmGraphXyController");
	}
	
	/**
	 * Get list of AmGraphCandleController.
	 * @return List<AmGraphCandleController>
	 */
	@SuppressWarnings("unchecked")
	private List<AmGraphCandleController> getAmGraphCandle(){
		return (List<AmGraphCandleController>) amgraphs.get("AmGraphCandleController");
	}
	
	/**
	 * Get list of AmGraphOhlcController.
	 * @return List<AmGraphOhlcController>
	 */
	@SuppressWarnings("unchecked")
	private List<AmGraphOhlcController> getAmGraphOhlc(){
		return (List<AmGraphOhlcController>) amgraphs.get("AmGraphOhlcController");
	}

}
