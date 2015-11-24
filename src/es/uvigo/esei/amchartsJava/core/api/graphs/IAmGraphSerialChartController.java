package es.uvigo.esei.amchartsJava.core.api.graphs;



import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.PointPositionGraphConstant.PointPositionGraph;
import es.uvigo.esei.amchartsJava.core.constants.ShowAtConstant.ShowAt;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for AmGraphSerialChartController. 
 * This interface contains common properties to graphs used by serial, xy and step charts. 
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
	 * @return Object Value for columnWidth is a double number..
	 */
	abstract Object getColumnWidth();

	/**
	 * Set columnWidth property.
	 * @param columnWidth Value for columWidth.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setColumnWidth(Number columnWidth) throws OutOfRangeException;

	abstract String getCornerRadiusTop();

	abstract void setCornerRadiusTop(String cornerRadiusTop)
			throws CoordException;

	abstract Object getDashLength();

	abstract void setDashLength(Number dashLength);

	abstract String getDashLengthField();

	abstract void setDashLengthField(String dashLengthField);

	abstract Object getFixedColumnWidth();

	abstract void setFixedColumnWidth(Number fixedColumnWidth)
			throws IntegerException;

	abstract String getLineColor();

	abstract void setLineColor(ColorsAmCharts lineColor);

	abstract String getLineColorField();

	abstract void setLineColorField(String lineColorField);

	abstract Object getLineThickness();

	abstract void setLineThickness(Number lineThickness) throws OutOfRangeException;

	abstract Object getNegativeLineAlpha();

	abstract void setNegativeLineAlpha(Number negativeLineAlpha)
			throws OutOfRangeException;

	abstract String getNegativeLineColor();

	abstract void setNegativeLineColor(ColorsAmCharts negativeLineColor);

	abstract Boolean isNewStack();

	abstract void setNewStack(Boolean newStack);

	abstract String getOpenField();

	abstract void setOpenField(String openField);

	abstract String getPointPosition();

	abstract void setPointPosition(PointPositionGraph pointPosition);

	abstract String getShowBalloonAt();

	abstract void setShowBalloonAt(ShowAt showBalloonAt);

	abstract Object getTopRadius();

	abstract void setTopRadius(Number topRadius) throws OutOfRangeException;

	abstract Boolean isUseNegativeColorIfDown();

	abstract void setUseNegativeColorIfDown(Boolean useNegativeColorIfDown);

}