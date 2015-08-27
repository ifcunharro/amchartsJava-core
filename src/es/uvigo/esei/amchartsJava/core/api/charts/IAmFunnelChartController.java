package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.constants.AlignConstant.Align;
import es.uvigo.esei.amchartsJava.core.constants.ValueRepresentsConstant.ValueRepresents;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmSlicedChart;

public interface IAmFunnelChartController extends IAmSlicedChartController<AmSlicedChart> {

	public Object getAngle();

	public void setAngle(Number angle) throws OutOfRangeException;

	public Object getBalloonText();

	public void setBalloonText(String balloonText);

	public Object getBaseWidth();

	public void setBaseWidth(String baseWidth) throws CoordException;

	public Object getDepth3D();

	public void setDepth3D(Number depth3D) throws OutOfRangeException;

	public Object getLabelPosition();

	public void setLabelPosition(Align labelPosition);

	public Object getLabelText();

	public void setLabelText(String labelText);

	public Object getNeckHeight();

	public void setNeckHeight(String neckHeight) throws CoordException;

	public Object getNeckWidth();

	public void setNeckWidth(String neckWidth) throws CoordException;

	public Object getPullDistance();

	public void setPullDistance(String pullDistance) throws CoordException;

	public Object isRotate();

	public void setRotate(Boolean rotate);

	public Object getStartX();

	public void setStartX(Number startX) throws IntegerException;

	public Object getStartY();

	public void setStartY(Number startY) throws IntegerException;

	public Object getValueRepresents();

	public void setValueRepresents(ValueRepresents valueRepresents);

}