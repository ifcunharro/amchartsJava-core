package es.uvigo.esei.amchartsJava.core.api.graphs;



import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.PointPositionConstant.PointPosition;
import es.uvigo.esei.amchartsJava.core.constants.ShowAtConstant.ShowAt;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface IAmGraphSerialChartController extends IAmGraphController {

	abstract Object isBehindColumns();

	abstract void setBehindColumns(Boolean behindColumns);

	abstract Object isClustered();

	abstract void setClustered(Boolean clustered);

	abstract Object getColumnWidth();

	abstract void setColumnWidth(Number columnWidth) throws OutOfRangeException;

	abstract Object getCornerRadiusTop();

	abstract void setCornerRadiusTop(String cornerRadiusTop)
			throws CoordException;

	abstract Object getDashLength();

	abstract void setDashLength(Number dashLength);

	abstract Object getDashLengthField();

	abstract void setDashLengthField(String dashLengthField);

	abstract Object getFixedColumnWidth();

	abstract void setFixedColumnWidth(Number fixedColumnWidth)
			throws IntegerException;

	abstract Object getLineColor();

	abstract void setLineColor(ColorsAmCharts lineColor);

	abstract Object getLineColorField();

	abstract void setLineColorField(String lineColorField);

	abstract Object getLineThickness();

	abstract void setLineThickness(Number lineThickness) throws OutOfRangeException;

	abstract Object getNegativeLineAlpha();

	abstract void setNegativeLineAlpha(Number negativeLineAlpha)
			throws OutOfRangeException;

	abstract Object getNegativeLineColor();

	abstract void setNegativeLineColor(ColorsAmCharts negativeLineColor);

	abstract Object isNewStack();

	abstract void setNewStack(Boolean newStack);

	abstract Object getOpenField();

	abstract void setOpenField(String openField);

	abstract Object getPointPosition();

	abstract void setPointPosition(PointPosition pointPosition);

	abstract Object getShowBalloonAt();

	abstract void setShowBalloonAt(ShowAt showBalloonAt);

	abstract Object getTopRadius();

	abstract void setTopRadius(Number topRadius) throws OutOfRangeException;

	abstract Object isUseNegativeColorIfDown();

	abstract void setUseNegativeColorIfDown(Boolean useNegativeColorIfDown);

}