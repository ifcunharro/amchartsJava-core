package es.uvigo.esei.amchartsJava.core.controllers.axis;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.axis.IValueAxisRadarChartController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.GridType;
import es.uvigo.esei.amchartsJava.core.constants.PointPositionAxisRadar;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

/**
 * This class is a controller for ValueAxis used in AmRadarChart.
 * @author Iago Fernández Cuñarro
 *
 */
public class ValueAxisRadarChartController extends ValueAxisController implements IValueAxisRadarChartController {

	private static final long serialVersionUID = 1235487736091161719L;
	
	{
		//set to default value amcharts, this property only is used by valueAxis in AmRadarChart,
		//to deserialize from json to this class is added to serialize this class instead of add to json
		//name of class. Json generated of this manner is valid json to amcharts, with name of class is not valid. 
		setRadarCategoriesEnabled(true);
	}

	public Integer getAxisTitleOffset(){
		Object axisTitleOffset = axes.getFeature("axisTitleOffset");
		
		return axisTitleOffset != null ? ((Number)axisTitleOffset).intValue() : null;
	}
	
	public void setAxixTitleOffset(Number axisTitleOffset) throws OutOfRangeException{
		if(AmchartsConstants.IMPROVED_VISIBILITY.equals("true")){
			if(NumberValidator.rangeIntegerValidator(axisTitleOffset, 5, 30)){
				axes.setFeature("axisTitleOffset", axisTitleOffset);
			}
		}else{
			axes.setFeature("axisTitleOffset", axisTitleOffset);
		}
	}
	
	public String getGridType(){
		return (String) axes.getFeature("gridType");
	}
	
	public void setGridType(GridType gridType){
		if(gridType != null){
			axes.setFeature("gridType", gridType.toString());
		}
	}
	
	public String getPointPosition(){
		return (String) axes.getFeature("pointPosition");
	}
	
	public void setPointPosition(PointPositionAxisRadar pointPosition){
		if(pointPosition != null){
			axes.setFeature("pointPosition", pointPosition.toString());
		}
	}
	
	@JsonProperty(value="radarCategoriesEnabled")
	public Boolean isRadarCategoriesEnabled(){
		return (Boolean) axes.getFeature("radarCategoriesEnabled");
	}
	
	public void setRadarCategoriesEnabled(Boolean radarCategoriesEnabled){
		if(radarCategoriesEnabled != null){
			axes.setFeature("radarCategoriesEnabled", radarCategoriesEnabled);
		}
	}
	
}
