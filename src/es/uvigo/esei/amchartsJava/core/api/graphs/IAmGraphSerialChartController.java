package es.uvigo.esei.amchartsJava.core.api.graphs;



import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.PointPositionGraphConstant.PointPositionGraph;
import es.uvigo.esei.amchartsJava.core.constants.ShowAtConstant.ShowAt;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface IAmGraphSerialChartController extends IAmGraphController {

	abstract Boolean isBehindColumns();

	abstract void setBehindColumns(Boolean behindColumns);

	abstract Boolean isClustered();

	abstract void setClustered(Boolean clustered);

	abstract Object getColumnWidth();

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