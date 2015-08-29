package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmSlicedChart;

public abstract interface IAmPieChartController extends IAmSlicedChartController<AmSlicedChart> {

	abstract Boolean isAdjustPrecision();

	abstract void setAdjustPrecision(Boolean adjustPrecision);

	abstract Object getAngle();

	abstract void setAngle(Number angle) throws OutOfRangeException;

	abstract String getBalloonText();

	//formarlo con [[]] y htmltags
	abstract void setBalloonText(String balloonText);

	abstract Object getDepth3D();

	abstract void setDepth3D(Number depth3D) throws OutOfRangeException;

	abstract String getInnerRadius();

	abstract void setInnerRadius(String innerRadius) throws CoordException;

	abstract Object getLabelRadius();

	abstract void setLabelRadius(Number labelRadius) throws OutOfRangeException;

	abstract String getLabelRadiusField();

	abstract void setLabelRadiusField(String labelRadiusField);

	abstract String getLabelText();

	abstract void setLabelText(String labelText);

	abstract Object getMinRadius();

	abstract void setMinRadius(Number minRadius) throws IntegerException;

	abstract Object getPieAlpha();

	abstract void setPieAlpha(Number pieAlpha) throws OutOfRangeException;

	abstract String getPieX();

	abstract void setPieX(String pieX) throws CoordException;

	abstract String getPieY();

	abstract void setPieY(String pieY) throws CoordException;

	abstract String getPullOutRadius();

	abstract void setPullOutRadius(String pullOutRadius) throws CoordException;

	abstract String getRadius();

	abstract void setRadius(String radius) throws CoordException;

	abstract Object getStartAngle();

	abstract void setStartAngle(Number startAngle) throws OutOfRangeException;

	abstract String getStartRadius();

	abstract void setStartRadius(String startRadius) throws CoordException;

}