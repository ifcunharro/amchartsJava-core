package es.uvigo.esei.amchartsJava.core.api;



import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.PointPositionConstant.PointPosition;
import es.uvigo.esei.amchartsJava.core.constants.ShowAtConstant.ShowAt;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IAmGraphSerialController extends IAmGraphController {

	public Object isBehindColumns();

	public void setBehindColumns(Boolean behindColumns);

	public Object isClustered();

	public void setClustered(Boolean clustered);

	public Object getColumnWidth();

	public void setColumnWidth(Number columnWidth) throws OutOfRangeException;

	public Object getCornerRadiusTop();

	public void setCornerRadiusTop(String cornerRadiusTop)
			throws CoordException;

	public Object getDashLength();

	public void setDashLength(Number dashLength);

	public Object getDashLengthField();

	public void setDashLengthField(String dashLengthField);

	public Object getFillColors();

	public void setFillColors(ColorsAmCharts fillColors);

	public Object getFillColorsField();

	public void setFillColorsField(String fillColorsField);

	public Object getFixedColumnWidth();

	public void setFixedColumnWidth(Number fixedColumnWidth)
			throws IntegerException;

	public Object getLineColor();

	public void setLineColor(ColorsAmCharts lineColor);

	public Object getLineColorField();

	public void setLineColorField(String lineColorField);

	public Object getLineThickness();

	public void setLineThickness(Number lineThickness) throws IntegerException;

	public Object getNegativeLineAlpha();

	public void setNegativeLineAlpha(Number negativeLineAlpha)
			throws OutOfRangeException;

	public Object getNegativeLineColor();

	public void setNegativeLineColor(ColorsAmCharts negativeLineColor);

	public Object isNewStack();

	public void setNewStack(Boolean newStack);

	public Object getOpenField();

	public void setOpenField(String openField);

	public Object getPointPosition();

	public void setPointPosition(PointPosition pointPosition);

	public Object getShowBalloonAt();

	public void setShowBalloonAt(ShowAt showBalloonAt);

	public Object getTopRadius();

	public void setTopRadius(Number topRadius) throws OutOfRangeException;

	public Object isUseNegativeColorIfDown();

	public void setUseNegativeColorIfDown(Boolean useNegativeColorIfDown);

}