package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.constants.EffectConstant.Effect;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeArrowController;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.PatternController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.MalFormedPatternException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IAmAngularGaugeController {

	public Object isAdjustSize();

	public void setAdjustSize(Boolean adjustSize);

	public Object getArrows();

	public Object getAxes();

	public Object isClockWiseOnly();

	public void setClockWiseOnly(Boolean clockWiseOnly);

	public Object getFaceAlpha();

	public void setFaceAlpha(Number faceAlpha) throws OutOfRangeException;

	public Object getFaceBorderAlpha();

	public void setFaceBorderAlpha(Number faceBorderAlpha)
			throws OutOfRangeException;

	public Object getFaceBorderColor();

	public void setFaceBorderColor(String faceBorderColor)
			throws ColorException;

	public Object getFaceBorderWidth();

	public void setFaceBorderWidth(Number faceBorderWidth)
			throws OutOfRangeException;

	public Object getFaceColor();

	public void setFaceColor(String faceColor) throws ColorException;

	public Object getFacePattern();

	public void setFacePattern(PatternController facePattern)
			throws MalFormedPatternException;

	public Object getGaugeX();

	public void setGaugeX(Number gaugeX) throws IntegerException;

	public Object getGaugeY();

	public void setGaugeY(Number gaugeY) throws IntegerException;

	public Object getMarginBottom();

	public void setMarginBottom(Number marginBottom) throws IntegerException;

	public Object getMarginLeft();

	public void setMarginLeft(Number marginLeft) throws IntegerException;

	public Object getMarginRight();

	public void setMarginRight(Number marginRight) throws IntegerException;

	public Object getMarginTop();

	public void setMarginTop(Number marginTop) throws IntegerException;

	public Object getMinRadius();

	public void setMinRadius(Number minRadius);

	public Object getStartDuration();

	public void setStartDuration(Number startDuration)
			throws OutOfRangeException;

	public Object getStartEffect();

	public void setStartEffect(Effect startEffect);

	public void addArrow(GaugeArrowController arrow);

	public void addAxis(GaugeAxisController axis);

	public void removeArrow(String idArrow);

}