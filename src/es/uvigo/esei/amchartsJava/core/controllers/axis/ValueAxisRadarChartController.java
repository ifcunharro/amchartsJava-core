package es.uvigo.esei.amchartsJava.core.controllers.axis;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.axis.IValueAxisRadarChartController;
import es.uvigo.esei.amchartsJava.core.constants.AmchartsConstants;
import es.uvigo.esei.amchartsJava.core.constants.GridTypesConstant.GridType;
import es.uvigo.esei.amchartsJava.core.constants.PointPositionAxisRadarConstant.PointPositionAxisRadar;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

public class ValueAxisRadarChartController extends ValueAxisController implements IValueAxisRadarChartController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1235487736091161719L;
	
	{
		//value only in radar, used by serialize to json and evit add field type to json.
		setRadarCategoriesEnabled(true);
	}

	public Object getAxisTitleOffset(){
		return axes.getFeature("axisTitleOffset");
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
		axes.setFeature("gridType", gridType.toString());
	}
	
	public String getPointPosition(){
		return (String) axes.getFeature("pointPosition");
	}
	
	public void setPointPosition(PointPositionAxisRadar pointPosition){
		axes.setFeature("pointPosition", pointPosition.toString());
	}
	
	@JsonProperty(value="radarCategoriesEnabled")
	public Boolean isRadarCategoriesEnabled(){
		return (Boolean) axes.getFeature("radarCategoriesEnabled");
	}
	
	public void setRadarCategoriesEnabled(Boolean radarCategoriesEnabled){
		axes.setFeature("radarCategoriesEnabled", radarCategoriesEnabled);
	}
	
}
