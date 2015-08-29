package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.constants.AlignConstant.Align;
import es.uvigo.esei.amchartsJava.core.constants.ValueRepresentsConstant.ValueRepresents;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmSlicedChart;

public abstract interface IAmFunnelChartController extends IAmSlicedChartController<AmSlicedChart> {

	abstract Object getAngle();

	abstract void setAngle(Number angle) throws OutOfRangeException;

	abstract String getBalloonText();

	abstract void setBalloonText(String balloonText);

	abstract String getBaseWidth();

	abstract void setBaseWidth(String baseWidth) throws CoordException;

	abstract Object getDepth3D();

	abstract void setDepth3D(Number depth3D) throws OutOfRangeException;

	abstract String getLabelPosition();

	abstract void setLabelPosition(Align labelPosition);

	abstract String getLabelText();

	abstract void setLabelText(String labelText);

	abstract String getNeckHeight();

	abstract void setNeckHeight(String neckHeight) throws CoordException;

	abstract String getNeckWidth();

	abstract void setNeckWidth(String neckWidth) throws CoordException;

	abstract String getPullDistance();

	abstract void setPullDistance(String pullDistance) throws CoordException;

	abstract Boolean isRotate();

	abstract void setRotate(Boolean rotate);

	abstract Object getStartX();

	abstract void setStartX(Number startX) throws IntegerException;

	abstract Object getStartY();

	abstract void setStartY(Number startY) throws IntegerException;

	abstract String getValueRepresents();

	abstract void setValueRepresents(ValueRepresents valueRepresents);

}