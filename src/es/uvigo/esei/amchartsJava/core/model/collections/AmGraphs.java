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
	private int sizeAmGraphs;
	private int deleteAmGraphs;
	
	{
		amgraphs = new HashMap<String,Object>();
		sizeAmGraphs = 0;
		deleteAmGraphs = 0;
	}
	
	public void initAmGraphSerial(){
		amgraphs.put("AmGraphSerialController", new ArrayList<AmGraphSerialController>());
	}
	
	public void initAmGraphStep(){
		amgraphs.put("AmGraphStepController", new ArrayList<AmGraphStepController>());
	}
	
	public void initAmGraphXy(){
		amgraphs.put("AmGraphXyController", new ArrayList<AmGraphXyController>());
	}
	
	public void initAmGraphCandle(){
		amgraphs.put("AmGraphCandleController", new ArrayList<AmGraphCandleController>());
	}
	
	public void initAmGraphOhlc(){
		amgraphs.put("AmGraphOhlcController", new ArrayList<AmGraphOhlcController>());
	}
	
	@SuppressWarnings("unchecked")
	public List<AmGraphSerialController> getAmGraphSerial(){
		return (List<AmGraphSerialController>) amgraphs.get("AmGraphSerialController");
	}
	
	@SuppressWarnings("unchecked")
	public List<AmGraphStepController> getAmGraphStep(){
		return (List<AmGraphStepController>) amgraphs.get("AmGraphStepController");
	}
	
	@SuppressWarnings("unchecked")
	public List<AmGraphXyController> getAmGraphXy(){
		return (List<AmGraphXyController>) amgraphs.get("AmGraphXyController");
	}
	
	@SuppressWarnings("unchecked")
	public List<AmGraphCandleController> getAmGraphCandle(){
		return (List<AmGraphCandleController>) amgraphs.get("AmGraphCandleController");
	}
	
	@SuppressWarnings("unchecked")
	public List<AmGraphOhlcController> getAmGraphOhlc(){
		return (List<AmGraphOhlcController>) amgraphs.get("AmGraphOhlcController");
	}
	
	public void addAmGraphSerial(AmGraphController am){
		if(getAmGraphSerial()==null){
			initAmGraphSerial();
		}
		this.getAmGraphSerial().add((AmGraphSerialController)am);
		sizeAmGraphs++;
	}
	
	public void addAmGraphStep(AmGraphController am){
		if(getAmGraphStep()==null){
			initAmGraphStep();
		}
		this.getAmGraphStep().add((AmGraphStepController)am);
		sizeAmGraphs++;
	}

	
	public void addAmGraphXy(AmGraphController am){
		if(getAmGraphXy()==null){
			initAmGraphXy();
		}
		this.getAmGraphXy().add((AmGraphXyController)am);
		sizeAmGraphs++;
	}
	
	
	public void addAmGraphCandle(AmGraphController am){
		if(getAmGraphCandle()==null){
			initAmGraphCandle();
		}
		this.getAmGraphCandle().add((AmGraphCandleController)am);
		sizeAmGraphs++;
	}
	
	
	public void addAmGraphOhlc(AmGraphController am){
		if(getAmGraphOhlc()==null){
			initAmGraphOhlc();
		}
		this.getAmGraphOhlc().add((AmGraphOhlcController)am);
		sizeAmGraphs++;
	}
	
	
	
	public void removeAmGraphSerial(int position) {
		this.getAmGraphSerial().remove(position);
		sizeAmGraphs--;
	}
	
	public void removeAmGraphStep(int position) {
		this.getAmGraphStep().remove(position);
		sizeAmGraphs--;
	}
	
	public void removeAmGraphXy(int position) {
		this.getAmGraphXy().remove(position);	
		sizeAmGraphs--;
	}
	
	public void removeAmGraphCandle(int position) {
		this.getAmGraphCandle().remove(position);
		sizeAmGraphs--;
	}
	
	public void removeAmGraphOhlc(int position) {
		this.getAmGraphSerial().remove(position);
		sizeAmGraphs--;
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
	
	public List<String> getAmGraphsIds(){
		List<String> ids = new ArrayList<String>();
		if(isNotEmptyAmGraphSerial()){
			for(AmGraphSerialController serial: getAmGraphSerial()){
				ids.add(serial.getId().toString());
			}
		}
		if(isNotEmptyAmGraphStep()){
			for(AmGraphStepController step: getAmGraphStep()){
				ids.add(step.getId().toString());
			}
		}
		if(isNotEmptyAmGraphXy()){
			for(AmGraphXyController xy: getAmGraphXy()){
				ids.add(xy.getId().toString());
			}
		}
		if(isNotEmptyAmGraphCandle()){
			for(AmGraphCandleController candle: getAmGraphCandle()){
				ids.add(candle.getId().toString());
			}
		}
		if(isNotEmptyAmGraphOhlc()){
			for(AmGraphOhlcController ohlc: getAmGraphOhlc()){
				ids.add(ohlc.getId().toString());
			}
		}
		return ids;
	}
	

	public int sizeAmGraphs(){
		return sizeAmGraphs;
	}
	
	public int deleteAmGraphs(){
		return deleteAmGraphs;
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
	
	


}
