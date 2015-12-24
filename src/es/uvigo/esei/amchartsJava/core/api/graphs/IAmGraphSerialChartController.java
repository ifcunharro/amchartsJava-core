package es.uvigo.esei.amchartsJava.core.api.graphs;



import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.PointPositionGraph;
import es.uvigo.esei.amchartsJava.core.constants.ShowAt;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for AmGraphSerialChartController. 
 * This interface contains common properties to graphs used by all charts. 
 * Details of AmGraph and its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmGraphSerialChartController extends IAmGraphController {

	/**
	 * Get behindColumns property.<br>
	 * Default: false.
	 * @return Boolean Value for behindColumns.
	 */
	abstract Boolean isBehindColumns();

	/**
	 * Set behindColumns property.
	 * @param behindColumns Enable or disable behindColumns.
	 */
	abstract void setBehindColumns(Boolean behindColumns);

	/**
	 * Get clustered property.<br>
	 * Default: true.
	 * @return Boolean Value for clustered.
	 */
	abstract Boolean isClustered();

	/**
	 * Set clustered property.
	 * @param clustered Enable or disable clustered.
	 */
	abstract void setClustered(Boolean clustered);

	/**
	 * Get columnWidth property.
	 * @return Double Value for columnWidth.
	 */
	abstract Double getColumnWidth();

	/**
	 * Set columnWidth property.
	 * @param columnWidth Value for columWidth.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setColumnWidth(Number columnWidth) throws OutOfRangeException;

	/**
	 * Get cornerRadiusTop property.<br>
	 * Default: 0.
	 * @return String Value for cornerRadiusTop is an integer number or a percent.
	 */
	abstract String getCornerRadiusTop();

	/**
	 * Set cornerRadiusTop property.
	 * @param cornerRadiusTop Value for cornerRadiusTop.
	 * @throws CoordException Value for cornerRadiusTop is not an integer number or a percent.
	 */
	abstract void setCornerRadiusTop(String cornerRadiusTop)
			throws CoordException;

	/**
	 * Get dashLength property.<br>
	 * Default: 0.
	 * @return Double Value for dashLength.
	 */
	abstract Double getDashLength();

	/**
	 * Set dashLength property.
	 * @param dashLength Value for dashLength.
	 */
	abstract void setDashLength(Number dashLength);

	/**
	 * Get dashLengthField property.
	 * @return String Value for dashLengthField.
	 */
	abstract String getDashLengthField();

	/**
	 * Set dashLengthField property.
	 * @param dashLengthField Value for dashLengthField.
	 */
	abstract void setDashLengthField(String dashLengthField);

	/**
	 * Get fixedColumnWidth property.
	 * @return Integer Value for fixedColumnWidth.
	 */
	abstract Integer getFixedColumnWidth();

	/**
	 * Set fixedColumnWidth property.
	 * @param fixedColumnWidth Value for fixedColumnWidth.
	 * @throws IntegerException Value for fixedColumnWidth is not an integer number.
	 */
	abstract void setFixedColumnWidth(Number fixedColumnWidth)
			throws IntegerException;

	/**
	 * Get lineColor property.
	 * @return String Value for lineColor.
	 */
	abstract String getLineColor();

	/**
	 * Set lineColor property.
	 * @param lineColor Value for lineColor.
	 */
	abstract void setLineColor(ColorsAmCharts lineColor);

	/**
	 * Get lineColorField property.
	 * @return String Value for lineColorField.
	 */
	abstract String getLineColorField();

	/**
	 * Set lineColorField property.
	 * @param lineColorField Value for lineColorField.
	 */
	abstract void setLineColorField(String lineColorField);

	/**
	 * Get lineThickness property.<br>
	 * Default: 1.
	 * @return Integer Value for lineThickness.
	 */
	abstract Integer getLineThickness();

	/**
	 * Set lineThickness property.With improvedVisibility enabled, range activated.
	 * @param lineThickness Value for lineThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-12.
	 */
	abstract void setLineThickness(Number lineThickness) throws OutOfRangeException;

	/**
	 * Get negativeLineAlpha property.<br>
	 * Default: 1.
	 * @return Double Value for negativeLineAlpha.
	 */
	abstract Double getNegativeLineAlpha();

	/**
	 * Set negativeLineAlpha property.
	 * @param negativeLineAlpha Value for negativeLineAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setNegativeLineAlpha(Number negativeLineAlpha)
			throws OutOfRangeException;

	/**
	 * Get negativeLineColor property.
	 * @return String Value for negativeLineColor.
	 */
	abstract String getNegativeLineColor();

	/**
	 * Set negativeLineColor property.
	 * @param negativeLineColor Value for negativeLineColor.
	 */
	abstract void setNegativeLineColor(ColorsAmCharts negativeLineColor);

	/**
	 * Get newStack property.<br>
	 * Default: false.
	 * @return Boolean Value for newStack.
	 */
	abstract Boolean isNewStack();

	/**
	 * Set newStack property.
	 * @param newStack Enable or disable newStack.
	 */
	abstract void setNewStack(Boolean newStack);

	/**
	 * Get openField property.
	 * @return String Value for openField.
	 */
	abstract String getOpenField();

	/**
	 * Set openField property.
	 * @param openField Value for openField.
	 */
	abstract void setOpenField(String openField);

	/**
	 * Get pointPosition property.<br>
	 * Default: middle.
	 * @return String Value for pointPosition.
	 */
	abstract String getPointPosition();

	/**
	 * Set pointPosition property.
	 * @param pointPosition Value for pointPosition.
	 */
	abstract void setPointPosition(PointPositionGraph pointPosition);

	/**
	 * Get showBalloonAt property.<br>
	 * Default: close.
	 * @return String Value for showBalloonAt.
	 */
	abstract String getShowBalloonAt();

	/**
	 * Set showBalloonAt property.
	 * @param showBalloonAt Value for showBalloonAt.
	 */
	abstract void setShowBalloonAt(ShowAt showBalloonAt);

	/**
	 * Get topRadius property.
	 * @return Double Value for topRadius.
	 */
	abstract Double getTopRadius();

	/**
	 * Set topRadius property.With improvedVisibility enabled, range activated.
	 * @param topRadius Value for topRadius.
	 * @throws OutOfRangeException Value out of range admitted: 0-2.
	 */
	abstract void setTopRadius(Number topRadius) throws OutOfRangeException;

	/**
	 * Get useNegativeColorIfDown property.<br>
	 * Default: false.
	 * @return Value for useNegativeColorIfDown.
	 */
	abstract Boolean isUseNegativeColorIfDown();

	/**
	 * Set useNegativeColorIfDown property.
	 * @param useNegativeColorIfDown Enable or disable negativeColorIfDown.
	 */
	abstract void setUseNegativeColorIfDown(Boolean useNegativeColorIfDown);

}