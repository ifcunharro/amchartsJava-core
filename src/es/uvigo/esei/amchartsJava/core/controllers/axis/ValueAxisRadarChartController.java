package es.uvigo.esei.amchartsJava.core.controllers.axis;

import com.fasterxml.jackson.annotation.JsonProperty;

import es.uvigo.esei.amchartsJava.core.api.axis.IValueAxisRadarChartController;
import es.uvigo.esei.amchartsJava.core.constants.GridTypesConstant.GridType;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.validators.NumberValidator;

public class ValueAxisRadarChartController extends ValueAxisController implements IValueAxisRadarChartController {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1235487736091161719L;

	public Object getAxisTitleOffset(){
		return axes.getFeature("axisTitleOffset");
	}
	
	public void setAxixTitleOffset(Number axisTitleOffset) throws IntegerException{
		if(NumberValidator.integerValidator(axisTitleOffset)){
			axes.setFeature("axisTitleOffset", axisTitleOffset);
		}
	}
	
	public Object getGridType(){
		return axes.getFeature("gridType");
	}
	
	public void setGridType(GridType gridType){
		axes.setFeature("gridType", gridType.toString());
	}
	
	@JsonProperty(value="radarCategoriesEnabled")
	public Object isRadarCategoriesEnabled(){
		return axes.getFeature("radarCategoriesEnabled");
	}
	
	public void setRadarCategoriesEnabled(Boolean radarCategoriesEnabled){
		axes.setFeature("radarCategoriesEnabled", radarCategoriesEnabled);
	}
	
}
