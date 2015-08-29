package es.uvigo.esei.amchartsJava.core.api.charts;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.constants.EffectConstant.Effect;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeArrowController;
import es.uvigo.esei.amchartsJava.core.controllers.GaugeAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.PatternController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.MalFormedPatternException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface IAmAngularGaugeController {

	abstract Boolean isAdjustSize();

	abstract void setAdjustSize(Boolean adjustSize);

	abstract List<GaugeArrowController> getArrows();

	abstract List<GaugeAxisController> getAxes();

	abstract Boolean isClockWiseOnly();

	abstract void setClockWiseOnly(Boolean clockWiseOnly);

	abstract Object getFaceAlpha();

	abstract void setFaceAlpha(Number faceAlpha) throws OutOfRangeException;

	abstract Object getFaceBorderAlpha();

	abstract void setFaceBorderAlpha(Number faceBorderAlpha)
			throws OutOfRangeException;

	abstract String getFaceBorderColor();

	abstract void setFaceBorderColor(String faceBorderColor)
			throws ColorException;

	abstract Object getFaceBorderWidth();

	abstract void setFaceBorderWidth(Number faceBorderWidth)
			throws OutOfRangeException;

	abstract String getFaceColor();

	abstract void setFaceColor(String faceColor) throws ColorException;

	abstract PatternController getFacePattern();

	abstract void setFacePattern(PatternController facePattern)
			throws MalFormedPatternException;

	abstract Object getGaugeX();

	abstract void setGaugeX(Number gaugeX) throws IntegerException;

	abstract Object getGaugeY();

	abstract void setGaugeY(Number gaugeY) throws IntegerException;

	abstract Object getMarginBottom();

	abstract void setMarginBottom(Number marginBottom) throws IntegerException;

	abstract Object getMarginLeft();

	abstract void setMarginLeft(Number marginLeft) throws IntegerException;

	abstract Object getMarginRight();

	abstract void setMarginRight(Number marginRight) throws IntegerException;

	abstract Object getMarginTop();

	abstract void setMarginTop(Number marginTop) throws IntegerException;

	abstract Object getMinRadius();

	abstract void setMinRadius(Number minRadius);

	abstract Object getStartDuration();

	abstract void setStartDuration(Number startDuration)
			throws OutOfRangeException;

	abstract String getStartEffect();

	abstract void setStartEffect(Effect startEffect);

	abstract void addArrow(GaugeArrowController arrow);

	abstract void addAxis(GaugeAxisController axis);

	abstract void removeArrow(String idArrow);
	
	abstract void removeAxis(String idAxis);

}