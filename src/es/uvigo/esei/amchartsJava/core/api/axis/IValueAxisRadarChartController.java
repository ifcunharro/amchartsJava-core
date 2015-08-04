package es.uvigo.esei.amchartsJava.core.api.axis;


import es.uvigo.esei.amchartsJava.core.constants.GridTypesConstant.GridType;
import es.uvigo.esei.amchartsJava.core.constants.PointPositionAxisRadarConstant.PointPositionAxisRadar;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IValueAxisRadarChartController extends IValueAxisController {

	public Object getAxisTitleOffset();

	public void setAxixTitleOffset(Number axisTitleOffset)
			throws OutOfRangeException;

	public Object getGridType();

	public void setGridType(GridType gridType);
	
	public Object getPointPosition();
	
	public void setPointPosition(PointPositionAxisRadar pointPosition);

	public Object isRadarCategoriesEnabled();

	public void setRadarCategoriesEnabled(Boolean radarCategoriesEnabled);

}