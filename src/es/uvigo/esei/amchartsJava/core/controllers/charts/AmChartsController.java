package es.uvigo.esei.amchartsJava.core.controllers.charts;

import java.io.Serializable;
import java.util.List;

import es.uvigo.esei.amchartsJava.core.constants.lang.I18n;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.model.AmCharts;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

/**
 * 
 * Controller of AmCharts. Details of AmCharts and its properties in AmCharts API.
 * This class save charts created in app.
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public class AmChartsController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AmCharts amcharts;
	
	{
		amcharts = new AmCharts();
	}
	
	/**
	 * Enable baseHref property.<br>
	 * Default: AmCharts.baseHref = false;
	 * @param enabled Enable or disable baseHref.
	 * @return String Value for enabledBaseHref.
	 */
	public String enabledBaseHref(Boolean enabled){
		return "AmCharts.baseHref = "+enabled.toString()+";";
	}
	
	/**
	 * Get bezierX property.<br>
	 * Default: AmCharts.bezierX = 3;
	 * @return String Value for bezierX.
	 */
	public String getBezierX(){
		return (String) amcharts.getFeature("bezierX");
	}
	
	/**
	 * Set bezierX property.
	 * @param bezierX Value for bezierX.
	 * @throws IntegerException Value for bezierX is not an integer number.
	 */
	public void setBezierX(Number bezierX) throws IntegerException{
		if(NumberValidator.integerValidator(bezierX)){
			amcharts.setFeature("bezierX", "AmCharts.bezierX = "+bezierX.toString()+";");
		}
	}
	
	/**
	 * Get bezierY property.<br>
	 * Default: AmCharts.bezierY = 6;
	 * @return String Value for bezierY.
	 */
	public String getBezierY(){
		return (String) amcharts.getFeature("bezierY");
	}
	
	/**
	 * Set bezierY property.
	 * @param bezierY Value for bezierY.
	 * @throws Value for bezierY is not an integer number.
	 */
	public void setBezierY(Number bezierY) throws IntegerException{
		if(NumberValidator.integerValidator(bezierY)){
			amcharts.setFeature("bezierY", "AmCharts.bezierY = "+bezierY.toString()+";");
		}
	}
	
	/**
	 * Get charts property.
	 * @return List<AmChartController> List of charts.
	 */
	@SuppressWarnings("rawtypes")
	public List<AmChartController> getCharts(){
		return amcharts.getCharts();
	}
	
	/**
	 * Add chart to collection amcharts.
	 * @param amchart chart to add.
	 */
	@SuppressWarnings("rawtypes")
	public <E extends AmChartController>void addChart(E amchart){
		amcharts.addChart(amchart);
	}
	
	/**
	 * Get dayNames property.
	 * Default: Dependient of idiom used by app.
	 * Default amcharts: AmCharts.dayNames = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];
	 * @return String Values for dayNames.
	 */
	public String getDayNames(){
		return "AmCharts.dayNames = "+I18n.get("dayNames");
	}
	
	/**
	 * Get monthNames property.
	 * Default: Dependient of idiom used by app.
	 * Default amcharts: AmCharts.monthNames = ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'];
	 * @return String Values for monthNames.
	 */
	public String getMonthNames(){
		return "AmCharts.monthNames = "+I18n.get("monthNames");
	}
	
	/**
	 * Get processDelay property.<br>
	 * Default: AmCharts.processDelay = 0;
	 * @return String Value for proccesDelay.
	 */
	public String getProcessDelay(){
		return (String)amcharts.getFeature("processDelay");
	}
	
	/**
	 * Set proccesDelay property.
	 * @param processDelay Value for processDelay.
	 * @throws IntegerException Value for processDelay is not an integer number.
	 */
	public void setProcessDelay(Number processDelay) throws IntegerException{
		if(NumberValidator.integerValidator(processDelay)){
			amcharts.setFeature("processDelay", "AmCharts.processDelay = "+processDelay.toString()+";");
		}
	}
	
	/**
	 * Get shortDayNames property.<br>
	 * Default: Dependient of idiom used by app.
	 * Default amcharts: AmCharts.shortDayNames = ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'];
	 * @return String Value for shortDayNames.
	 */
	public String getShortDayNames(){
		return "AmCharts.shortDayNames = "+I18n.get("shortDayNames");
	}
	
	/**
	 * Get shortMonthNames property.<br>
	 * Default: Dependient of idiom used by app.
	 * Default amcharts: AmCharts.shortMonthNames = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'];
	 */
	public String getShortMonthNames(){
		return "AmCharts.shortMonthNames = "+I18n.get("shortMonthNames");
	}
	
	/**
	 * Enable useUTC.<br>
	 * Default: AmCharts.useUTC = false;.
	 * @param enabled Value for enabledUseUTC.
	 */
	public String enabledUseUTC(Boolean enabled){
		return "AmCharts.useUTC = "+enabled.toString()+";";
	}
	
	/**
	 * Clear all charts from app.
	 */
	public void clear(){
		amcharts = null;
		System.gc();
	}
	

}
