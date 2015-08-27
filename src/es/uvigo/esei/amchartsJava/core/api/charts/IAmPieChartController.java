package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmSlicedChart;

public interface IAmPieChartController extends IAmSlicedChartController<AmSlicedChart> {

	public Object isAdjustPrecision();

	public void setAdjustPrecision(Boolean adjustPrecision);

	public Object getAngle();

	public void setAngle(Number angle) throws OutOfRangeException;

	public Object getBalloonText();

	//formarlo con [[]] y htmltags
	public void setBalloonText(String balloonText);

	public Object getDepth3D();

	public void setDepth3D(Number depth3D) throws OutOfRangeException;

	public Object getInnerRadius();

	public void setInnerRadius(String innerRadius) throws CoordException;

	public Object getLabelRadius();

	public void setLabelRadius(Number labelRadius) throws OutOfRangeException;

	public Object getLabelRadiusField();

	public void setLabelRadiusField(String labelRadiusField);

	public Object getLabelText();

	public void setLabelText(String labelText);

	public Object getMinRadius();

	public void setMinRadius(Number minRadius) throws IntegerException;

	public Object getPieAlpha();

	public void setPieAlpha(Number pieAlpha) throws OutOfRangeException;

	public Object getPieX();

	public void setPieX(String pieX) throws CoordException;

	public Object getPieY();

	public void setPieY(String pieY) throws CoordException;

	public Object getPullOutRadius();

	public void setPullOutRadius(String pullOutRadius) throws CoordException;

	public Object getRadius();

	public void setRadius(String radius) throws CoordException;

	public Object getStartAngle();

	public void setStartAngle(Number startAngle) throws OutOfRangeException;

	public Object getStartRadius();

	public void setStartRadius(String startRadius) throws CoordException;

}