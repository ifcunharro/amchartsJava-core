package es.uvigo.esei.amchartsJava.core.controllers.charts;

import java.io.Serializable;
import java.util.List;

import es.uvigo.esei.amchartsJava.core.api.charts.IAmChartsController;
import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.model.AmCharts;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

/**
 * This class is a controller for AmCharts.
 * @author Iago Fernández Cuñarro
 *
 */
public class AmChartsController implements Serializable, IAmChartsController {

	private static final long serialVersionUID = 1L;
	private AmCharts amcharts;
	
	{
		amcharts = new AmCharts();
	}
	
	public String enabledBaseHref(Boolean enabled){
		if(enabled != null){
			return "AmCharts.baseHref = "+enabled.toString()+";";
		}else{
			return null;
		}
	}
	
	public String getBezierX(){
		return (String) amcharts.getFeature("bezierX");
	}
	
	public void setBezierX(Number bezierX) throws IntegerException{
		if(NumberValidator.integerValidator(bezierX)){
			amcharts.setFeature("bezierX", "AmCharts.bezierX = "+bezierX.toString()+";");
		}
	}
	
	public String getBezierY(){
		return (String) amcharts.getFeature("bezierY");
	}
	
	public void setBezierY(Number bezierY) throws IntegerException{
		if(NumberValidator.integerValidator(bezierY)){
			amcharts.setFeature("bezierY", "AmCharts.bezierY = "+bezierY.toString()+";");
		}
	}
	
	@SuppressWarnings("rawtypes")
	public List<AmChartController> getCharts(){
		return amcharts.getCharts();
	}
	
	@SuppressWarnings("rawtypes")
	public <E extends AmChartController> void addChart(E amchart){
		amcharts.addChart(amchart);
	}
	
	public String getDayNames(){
		return "AmCharts.dayNames = "+I18n.get("dayNames");
	}
	
	public String getMonthNames(){
		return "AmCharts.monthNames = "+I18n.get("monthNames");
	}
	
	public String getProcessDelay(){
		return (String)amcharts.getFeature("processDelay");
	}
	
	public void setProcessDelay(Number processDelay) throws IntegerException{
		if(NumberValidator.integerValidator(processDelay)){
			amcharts.setFeature("processDelay", "AmCharts.processDelay = "+processDelay.toString()+";");
		}
	}
	
	public String getShortDayNames(){
		return "AmCharts.shortDayNames = "+I18n.get("shortDayNames");
	}
	
	public String getShortMonthNames(){
		return "AmCharts.shortMonthNames = "+I18n.get("shortMonthNames");
	}
	
	public String enabledUseUTC(Boolean enabled){
		if(enabled != null){
			return "AmCharts.useUTC = "+enabled.toString()+";";
		}else{
			return null;
		}
	}
	
	public void clear(){
		amcharts.clear();
	}
	

}
