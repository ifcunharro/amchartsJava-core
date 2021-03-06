package es.uvigo.esei.amchartsJava.core.api.axis;


import es.uvigo.esei.amchartsJava.core.constants.GridType;
import es.uvigo.esei.amchartsJava.core.constants.PointPositionAxisRadar;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for controller of ValueAxisRadarChart. 
 * ValueAxisRadarChart manage methods of ValueAxis only used for AmRadarChart
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IValueAxisRadarChartController extends IValueAxisController {

	/**
	 * Get axisTitleOffset property.<br>
	 * Default: 10.
	 * @return Value of axisTitleOffset.
	 */
	abstract Integer getAxisTitleOffset();

	/**
	 * Set axisTitleOffset property.With improvedVisibility enabled range activated.
	 * @param axisTitleOffset Value for axisTitleOffset.
	 * @throws OutOfRangeException Value out of range admitted: 5-30.
	 */
	abstract void setAxixTitleOffset(Number axisTitleOffset)
			throws OutOfRangeException;

	/**
	 * Get gridType property.<br>
	 * Default: polygons.
	 * @return Value of gridType.
	 */
	abstract String getGridType();

	/**
	 * Set gridType property.
	 * @param gridType Value for gridType.
	 */
	abstract void setGridType(GridType gridType);
	
	/**
	 * Get pointPosition property.<br>
	 * Default: axis.
	 * @return Value of pointPosition.
	 */
	abstract String getPointPosition();
	
	/**
	 * Set pointPosition property.
	 * @param pointPosition Value for pointPosition.
	 */
	abstract void setPointPosition(PointPositionAxisRadar pointPosition);

	/**
	 * Get radarCategoriesEnabled property.<br>
	 * Default: true.
	 * @return Value of radarCategoriesEnabled.
	 */
	abstract Boolean isRadarCategoriesEnabled();

	/**
	 * Set radarCategoriesEnabled property.
	 * @param radarCategoriesEnabled Enable or disable radar categories.
	 */
	abstract void setRadarCategoriesEnabled(Boolean radarCategoriesEnabled);

}