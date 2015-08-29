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
	
	public int sizeAmGraphs(){
		return sizeAmGraphs;
	}
	
	public int sizeAmGraphsSerial(){
		if(isNotEmptyAmGraphSerial()){
			return getAmGraphSerial().size();
		}
		return 0;
	}
	
	public int sizeAmGraphsStep(){
		if(isNotEmptyAmGraphStep()){
			return getAmGraphStep().size();
		}
		return 0;
	}
	
	public int sizeAmGraphsXy(){
		if(isNotEmptyAmGraphXy()){
			return getAmGraphXy().size();
		}
		return 0;
	}
	
	public int sizeAmGraphsCandle(){
		if(isNotEmptyAmGraphCandle()){
			return getAmGraphCandle().size();
		}
		return 0;
	}
	
	public int sizeAmGraphsOhlc(){
		if(isNotEmptyAmGraphOhlc()){
			return getAmGraphOhlc().size();
		}
		return 0;
	}
	
	public int deleteAmGraphs(){
		return deleteAmGraphs;
	}
	
	public boolean existGraph(String idGraph) {
		return getAllGraphsIds().contains(idGraph);
	}
	
	public boolean isNotEmptyAmGraphSerial(){
		return getAmGraphSerial()!=null;
	}
	
	public boolean isNotEmptyAmGraphStep(){
		return getAmGraphStep()!=null;
	}
	
	public boolean isNotEmptyAmGraphXy(){
		return getAmGraphXy()!=null;
	}
	
	public boolean isNotEmptyAmGraphCandle(){
		return getAmGraphCandle()!=null;
	}
	
	public boolean isNotEmptyAmGraphOhlc(){
		return getAmGraphOhlc()!=null;
	}
	
	public List<String> getAllGraphsIds(){
		return idGraphs;
	}
	
	
	public List<String> getAmGraphSerialIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyAmGraphSerial()){
			for(AmGraphSerialController serial: getAmGraphSerial()){
				ids.add(serial.getId());
			}
		}
		return ids;
	}
	
	public List<String> getAmGraphStepIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyAmGraphStep()){
			for(AmGraphStepController step: getAmGraphStep()){
				ids.add(step.getId());
			}
		}
		return ids;
	}
	
	public List<String> getAmGraphXyIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyAmGraphXy()){
			for(AmGraphXyController xy: getAmGraphXy()){
				ids.add(xy.getId());
			}
		}
		return ids;
	}
	
	public List<String> getAmGraphCandleIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyAmGraphCandle()){
			for(AmGraphCandleController candle: getAmGraphCandle()){
				ids.add(candle.getId());
			}
		}
		return ids;
	}
	
	public List<String> getAmGraphOhlcIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyAmGraphOhlc()){
			for(AmGraphOhlcController ohlc: getAmGraphOhlc()){
				ids.add(ohlc.getId());
			}
		}
		return ids;
	}
	
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
	
	public void removeAmGraphSerial(String idGraphSerial) {
		int position = positionsAmGraphs.get(idGraphSerial);
		this.getAmGraphSerial().remove(position);
		if(sizeAmGraphsSerial()==0){
			deleteAmGraphSerial();
		}
		sizeAmGraphs--;
		deleteAmGraphs++;
		idGraphs.remove(idGraphSerial);
		positionsAmGraphs.remove(idGraphSerial);
		
	}
	
	public void removeAmGraphStep(String idGraphStep) {
		int position = positionsAmGraphs.get(idGraphStep);
		this.getAmGraphStep().remove(position);
		if(sizeAmGraphsStep()==0){
			deleteAmGraphStep();
		}
		sizeAmGraphs--;
		deleteAmGraphs++;
		idGraphs.remove(idGraphStep);
		positionsAmGraphs.remove(idGraphStep);
	}
	
	public void removeAmGraphXy(String idGraphXy) {
		int position = positionsAmGraphs.get(idGraphXy);
		this.getAmGraphXy().remove(position);
		if(sizeAmGraphsXy()==0){
			deleteAmGraphXy();
		}
		sizeAmGraphs--;
		deleteAmGraphs++;
		idGraphs.remove(idGraphXy);
		positionsAmGraphs.remove(idGraphXy);
		
	}
	
	public void removeAmGraphCandle(String idGraphCandle) {
		int position = positionsAmGraphs.get(idGraphCandle);
		this.getAmGraphCandle().remove(position);
		if(sizeAmGraphsCandle()==0){
			deleteAmGraphCandle();
		}
		sizeAmGraphs--;
		deleteAmGraphs++;
		idGraphs.remove(idGraphCandle);
		positionsAmGraphs.remove(idGraphCandle);
	}
	
	public void removeAmGraphOhlc(String idGraphOhlc) {
		int position = positionsAmGraphs.get(idGraphOhlc);
		this.getAmGraphOhlc().remove(position);
		if(sizeAmGraphsOhlc()==0){
			deleteAmGraphOhlc();
		}
		sizeAmGraphs--;
		deleteAmGraphs++;
		idGraphs.remove(idGraphOhlc);
		positionsAmGraphs.remove(idGraphOhlc);
	}
	
	private void initAmGraphSerial(){
		amgraphs.put("AmGraphSerialController", new ArrayList<AmGraphSerialController>());
	}
	
	private void initAmGraphStep(){
		amgraphs.put("AmGraphStepController", new ArrayList<AmGraphStepController>());
	}
	
	private void initAmGraphXy(){
		amgraphs.put("AmGraphXyController", new ArrayList<AmGraphXyController>());
	}
	
	private void initAmGraphCandle(){
		amgraphs.put("AmGraphCandleController", new ArrayList<AmGraphCandleController>());
	}
	
	private void initAmGraphOhlc(){
		amgraphs.put("AmGraphOhlcController", new ArrayList<AmGraphOhlcController>());
	}
	
	private void deleteAmGraphSerial(){
		amgraphs.remove("AmGraphSerialController");
	}
	
	private void deleteAmGraphStep(){
		amgraphs.remove("AmGraphStepController");
	}
	
	private void deleteAmGraphXy(){
		amgraphs.remove("AmGraphXyController");
	}
	
	private void deleteAmGraphCandle(){
		amgraphs.remove("AmGraphCandleController");
	}
	
	private void deleteAmGraphOhlc(){
		amgraphs.remove("AmGraphOhlcController");
	}
	
	@SuppressWarnings("unchecked")
	private List<AmGraphSerialController> getAmGraphSerial(){
		return (List<AmGraphSerialController>) amgraphs.get("AmGraphSerialController");
	}
	
	@SuppressWarnings("unchecked")
	private List<AmGraphStepController> getAmGraphStep(){
		return (List<AmGraphStepController>) amgraphs.get("AmGraphStepController");
	}
	
	@SuppressWarnings("unchecked")
	private List<AmGraphXyController> getAmGraphXy(){
		return (List<AmGraphXyController>) amgraphs.get("AmGraphXyController");
	}
	
	@SuppressWarnings("unchecked")
	private List<AmGraphCandleController> getAmGraphCandle(){
		return (List<AmGraphCandleController>) amgraphs.get("AmGraphCandleController");
	}
	
	@SuppressWarnings("unchecked")
	private List<AmGraphOhlcController> getAmGraphOhlc(){
		return (List<AmGraphOhlcController>) amgraphs.get("AmGraphOhlcController");
	}

}
