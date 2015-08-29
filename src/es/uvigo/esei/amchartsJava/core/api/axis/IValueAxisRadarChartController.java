package es.uvigo.esei.amchartsJava.core.api.axis;


import es.uvigo.esei.amchartsJava.core.constants.GridTypesConstant.GridType;
import es.uvigo.esei.amchartsJava.core.constants.PointPositionAxisRadarConstant.PointPositionAxisRadar;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface IValueAxisRadarChartController extends IValueAxisController {

	abstract Object getAxisTitleOffset();

	abstract void setAxixTitleOffset(Number axisTitleOffset)
			throws OutOfRangeException;

	abstract String getGridType();

	abstract void setGridType(GridType gridType);
	
	abstract String getPointPosition();
	
	abstract void setPointPosition(PointPositionAxisRadar pointPosition);

	abstract Boolean isRadarCategoriesEnabled();

	abstract void setRadarCategoriesEnabled(Boolean radarCategoriesEnabled);

}