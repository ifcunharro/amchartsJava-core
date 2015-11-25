package es.uvigo.esei.amchartsJava.core.controllers.graphs;

import com.fasterxml.jackson.annotation.JsonSetter;

import es.uvigo.esei.amchartsJava.core.api.graphs.IAmGraphXyController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.config.Config;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

public class AmGraphXyController extends AmGraphSerialChartController 
	implements IAmGraphXyController {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1740784739849045134L;


	{
		setType(AmchartsConstants.GRAPH_TYPES.getLine());
		try {
			setMaxBulletSize(50);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public String getBulletAxis(){
		return (String) amGraph.getFeature("bulletAxis");
	}
	
	public void setBulletAxis(String bulletAxis) throws ChartException{
		if(amchart != null){
			if(amchart.existValueAxis(bulletAxis)){
				amGraph.setFeature("bulletAxis", bulletAxis);
			}
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(getClass().getSimpleName()+I18n.get("ChartException"));
			}
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	@JsonSetter(value="bulletAxis")
	private void setJsonBulletAxis(String bulletAxis){
		amGraph.setFeature("bulletAxis", bulletAxis);	
	}
	
	public String getFillToAxis(){
		return (String) amGraph.getFeature("fillToAxis");
	}
	
	public void setFillToAxis(String fillToAxis) throws ChartException{
		if(amchart != null){
			if(amchart.existValueAxis(fillToAxis)){
				amGraph.setFeature("fillToAxis", fillToAxis);
			}
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(getClass().getSimpleName()+I18n.get("ChartException"));
			}
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	@JsonSetter(value="fillToAxis")
	private void setJsonFillToAxis(String fillToAxis){
		amGraph.setFeature("fillToAxis", fillToAxis);
	}
	
	public Integer getMaxBulletSize(){
		Object maxBulletSize = amGraph.getFeature("maxBulletSize");
		
		return maxBulletSize != null ? ((Number)maxBulletSize).intValue() : null;
	}
	
	public void setMaxBulletSize(Number maxBulletSize) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(maxBulletSize, 50, 100)){
				amGraph.setFeature("maxBulletSize", maxBulletSize);
			}
		}else{
			amGraph.setFeature("maxBulletSize", maxBulletSize);
		}
	}
	
	public Integer getMinBulletSize(){
		Object minBulletSize = amGraph.getFeature("minBulletSize");
		
		return minBulletSize != null ? ((Number)minBulletSize).intValue() : null;
	}
	
	public void setMinBulletSize(Number minBulletSize) throws IntegerException{
		if(NumberValidator.integerValidator(minBulletSize) && minBulletSize.intValue()>=0){
			amGraph.setFeature("minBulletSize", minBulletSize);
		}
	}
	
	public String getXAxis(){
		return (String) amGraph.getFeature("xAxis");
	}
	
	public void setXAxis(String xAxis) throws ChartException{
		if(amchart != null){
			if(amchart.existValueAxis(xAxis)){
				amGraph.setFeature("xAxis", xAxis);
			}
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(getClass().getSimpleName()+I18n.get("ChartException"));
			}
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	@JsonSetter(value="xAxis")
	private void setJsonXAxis(String xAxis){
		amGraph.setFeature("xAxis", xAxis);
	}
	
	public String getXField(){
		return (String) amGraph.getFeature("xField");
	}
	
	public void setXField(String xField){
		amGraph.setFeature("xField", xField);
		amGraph.addGraphField("xField", xField);
	}
	
	public String getYAxis(){
		return (String) amGraph.getFeature("yAxis");
	}
	
	public void setYAxis(String yAxis) throws ChartException{
		if(amchart != null){
			if(amchart.existValueAxis(yAxis)){
				amGraph.setFeature("yAxis", yAxis);
			}
		}else{
			if(Config.getString("log").equals("file")){
				logger.info(getClass().getSimpleName()+I18n.get("ChartException"));
			}
			throw new ChartException(getClass().getSimpleName()+I18n.get("ChartException"));
		}
	}
	
	@JsonSetter(value="yAxis")
	private void setJsonYAxis(String yAxis){
		amGraph.setFeature("yAxis", yAxis);
	}
	
	public String getYField(){
		return (String) amGraph.getFeature("yField");
	}
	
	public void setYField(String yField){
		amGraph.setFeature("yField", yField);
		amGraph.addGraphField("yField", yField);
	}

	
	
}
