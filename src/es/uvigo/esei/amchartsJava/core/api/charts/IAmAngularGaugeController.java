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
import es.uvigo.esei.amchartsJava.core.model.AmChart;

/**
 * 
 * Interface for controller of AmAngularGauge. Details of AmAngularGauge and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmAngularGaugeController extends IAmchartController<AmChart>{

	/**
	 * Get adjustSize property.<br>
	 * Default: true.
	 * @return Boolean Value for adjustSize.
	 */
	abstract Boolean isAdjustSize();

	/**
	 * Set adjustSize property.
	 * @param adjustSize Enable or disable adjustSize.
	 */
	abstract void setAdjustSize(Boolean adjustSize);

	/**
	 * Get arrows of AmAngularGauge.
	 * @return List<GaugeArrowController> Controllers of gauge arrows .
	 */
	abstract List<GaugeArrowController> getArrows();

	/**
	 * Get axes of AmAngularGauge.
	 * @return List<GaugeAxisController> Controllers of gauge gaugeAxis.
	 */
	abstract List<GaugeAxisController> getAxes();

	/**
	 * Get clockWiseOnly property.<br>
	 * Default: false.
	 * @return Boolean Value for clockWiseOnly.
	 */
	abstract Boolean isClockWiseOnly();

	/**
	 * Set clockWiseOnly property.
	 * @param clockWiseOnly Enable or disable clockWiseOnly.
	 */
	abstract void setClockWiseOnly(Boolean clockWiseOnly);

	/**
	 * Get faceAlpha property.<br>
	 * Default: 0.
	 * @return Object Value for faceAlpha is a double number.
	 */
	abstract Object getFaceAlpha();

	/**
	 * Set faceAlpha property.
	 * @param faceAlpha Value for faceAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setFaceAlpha(Number faceAlpha) throws OutOfRangeException;

	/**
	 * Get faceBorderAlpha property.<br>
	 * Default: 0.
	 * @return Object Value for faceBorderAlpha is a double number.
	 */
	abstract Object getFaceBorderAlpha();

	/**
	 * Set faceBorderAlpha property.
	 * @param faceBorderAlpha Value for faceBorderAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setFaceBorderAlpha(Number faceBorderAlpha)
			throws OutOfRangeException;

	/**
	 * Get faceBorderColor property.<br>
	 * Default: #555555
	 * @return String Value for faceBorderColor.
	 */
	abstract String getFaceBorderColor();

	/**
	 * Set faceBorderColor property.
	 * @param faceBorderColor Value for faceBorderColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setFaceBorderColor(String faceBorderColor)
			throws ColorException;

	/**
	 * Get faceBorderWidth property.<br>
	 * Default: 1.
	 * @return Object Value for faceBorderWidth is an integer number.
	 */
	abstract Object getFaceBorderWidth();

	/**
	 * Set faceBorderWidth property.With improvedVisibility enabled range activated.
	 * @param faceBorderWidth Value for faceBorderWidth.
	 * @throws OutOfRangeException Value out of range admitted: 0-5.
	 */
	abstract void setFaceBorderWidth(Number faceBorderWidth)
			throws OutOfRangeException;

	/**
	 * Get faceColor property.<br>
	 * Default: #fafafa
	 * @return String Value for faceColor.
	 */
	abstract String getFaceColor();

	/**
	 * Set faceColor property.
	 * @param faceColor Value for faceColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setFaceColor(String faceColor) throws ColorException;

	/**
	 * Get facePattern property.
	 * @return PatternController Controller for pattern.
	 */
	abstract PatternController getFacePattern();

	/**
	 * Set facePattern property.
	 * @param facePattern Value for facePattern.
	 * @throws MalFormedPatternException Pattern hasn't url, width or height.
	 */
	abstract void setFacePattern(PatternController facePattern)
			throws MalFormedPatternException;

	/**
	 * Get gaugeX property.
	 * @return Object Value for gaugeX is an integer number.
	 */
	abstract Object getGaugeX();

	/**
	 * Set gaugeX property.
	 * @param gaugeX Value for gaugeX.
	 * @throws IntegerException Value for gaugeX is not an integer number.
	 */
	abstract void setGaugeX(Number gaugeX) throws IntegerException;

	/**
	 * Get gaugeY property.
	 * @return Object Value for gaugeY property is an integer number.
	 */
	abstract Object getGaugeY();

	/**
	 * Set gaugeY property.
	 * @param gaugeY Value for gaugeY.
	 * @throws IntegerException Value for gaugeY is not an integer number.
	 */
	abstract void setGaugeY(Number gaugeY) throws IntegerException;

	/**
	 * Get marginBottom property.<br>
	 * Default: 10.
	 * @return Object Value for marginBottom is an integer number.
	 */
	abstract Object getMarginBottom();

	/**
	 * Set marginBottom property.
	 * @param marginBottom Value for marginBottom.
	 * @throws IntegerException Value for marginBottom is not an integer number.
	 */
	abstract void setMarginBottom(Number marginBottom) throws IntegerException;

	/**
	 * Get marginLeft property.<br>
	 * Default: 10.
	 * @return Object Value for marginLeft is an integer number.
	 */
	abstract Object getMarginLeft();

	/**
	 * Set marginLeft property.
	 * @param marginLeft Value for marginLeft.
	 * @throws IntegerException Value for marginLeft is not an integer number.
	 */
	abstract void setMarginLeft(Number marginLeft) throws IntegerException;

	/**
	 * Get marginRight property.<br>
	 * Default: 10.
	 * @return Object Value for marginRight is an integer number.
	 */
	abstract Object getMarginRight();

	/**
	 * Set marginRight property.
	 * @param marginRight Value for marginRight.
	 * @throws IntegerException Value for marginRight is not an integer number.
	 */
	abstract void setMarginRight(Number marginRight) throws IntegerException;

	/**
	 * Get marginTop property.<br>
	 * Default: 10.
	 * @return Object Value for marginTop is an integer number.
	 */
	abstract Object getMarginTop();

	/**
	 * Set marginTop property.
	 * @param marginTop Value for marginTop.
	 * @throws IntegerException Value for marginTop is not an integer number.
	 */
	abstract void setMarginTop(Number marginTop) throws IntegerException;

	/**
	 * Get minRadius property.<br>
	 * Default: 10.
	 * @return Object Value for minRadius.
	 */
	abstract Object getMinRadius();

	/**
	 * Set minRadius property.
	 * @param minRadius Value for minRadius.
	 */
	abstract void setMinRadius(Number minRadius);

	/**
	 * Get startDuration property.<br>
	 * Default: 1.
	 * @return Object Value for startDuration is an integer number.
	 */
	abstract Object getStartDuration();

	/**
	 * Set startDuration property.With improvedVisibility enabled range activated.
	 * @param startDuration Value for startDuration.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setStartDuration(Number startDuration)
			throws OutOfRangeException;

	/**
	 * Get startEffect property.<br>
	 * Default: easeInSine.
	 * @return String Value for startEffect.
	 */
	abstract String getStartEffect();

	/**
	 * Set startEffect property.
	 * @param startEffect Value for startEffect.
	 */
	abstract void setStartEffect(Effect startEffect);

	/**
	 * Add an arrow to AmAngularGauge.
	 * @param arrow Controller for GaugeArrow.
	 */
	abstract void addArrow(GaugeArrowController arrow);

	/**
	 * Add an axis to AmAngularGauge.
	 * @param axis Controller for GaugeAxis.
	 */
	abstract void addAxis(GaugeAxisController axis);

	/**
	 * Remove an arrow of AmAngularGauge
	 * @param idArrow GaugeArrow id.
	 */
	abstract void removeArrow(String idArrow);
	
	/**
	 * Remove an axis of AmAngularGauge.
	 * @param idAxis GaugeAxis id.
	 */
	abstract void removeAxis(String idAxis);

}