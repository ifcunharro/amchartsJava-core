package es.uvigo.esei.amchartsJava.core.api.charts;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.constants.EffectConstant.Effect;
import es.uvigo.esei.amchartsJava.core.constants.UrlTargetConstant.UrlTarget;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.AmChart;
import es.uvigo.esei.amchartsJava.core.model.charts.AmSlicedChart;

/**
 * 
 * Interface for controller of AmSlicedChart. Details of AmSlicedChart and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmSlicedChartController<F extends AmSlicedChart> extends IAmchartController<AmChart> {

	/**
	 * Get alpha property.<br>
	 * Default: 1.
	 * @return Double Value for alpha.
	 */
	abstract Double getAlpha();

	/**
	 * Set alpha property.
	 * @param alpha Value for alpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setAlpha(Number alpha) throws OutOfRangeException;

	/**
	 * Get alphaField property.
	 * @return String Value for alphaField.
	 */
	abstract String getAlphaField();

	/**
	 * Set alphaField property.
	 * @param alphaField Value for alphaField.
	 */
	abstract void setAlphaField(String alphaField);

	/**
	 * Get baseColor property.
	 * @return String Value for baseColor.
	 */
	abstract String getBaseColor();

	/**
	 * Set baseColor property.
	 * @param baseColor Value for baseColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setBaseColor(String baseColor) throws ColorException;

	/**
	 * Get classNameField property.
	 * @return String Value for classNameField.
	 */
	abstract String getClassNameField();

	/**
	 * Set classNameField property.
	 * @param classNameField Value for classNameField.
	 */
	abstract void setClassNameField(String classNameField);

	/**
	 * Get colorField property.
	 * @return String Value for colorField.
	 */
	abstract String getColorField();

	/**
	 * Set colorField property.
	 * @param colorField Value for colorField.
	 */
	abstract void setColorField(String colorField);

	/**
	 * Get colors property.
	 * @return List<String> List of colors.
	 */
	abstract List<String> getColors();

	/**
	 * Add a color to chart.
	 * @param color Value for color.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void addColor(String color) throws ColorException;

	/**
	 * Changes default colors.
	 * @param newColors Values for colors.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void changeColorsDefault(String... newColors) throws ColorException;

	/**
	 * Get descriptionField property.
	 * @retun String Value for descriptionField.
	 */
	abstract String getDescriptionField();

	/**
	 * Set descriptionField property.
	 * @param descriptionField Value for descriptionField.
	 */
	abstract void setDescriptionField(String descriptionField);

	/**
	 * Get gradientRatio property.
	 * @return List<Number> List of gradients, a gradient is an integer number.
	 */
	abstract List<Number> getGradientRatio();

	/**
	 * Set gradientRatio property.
	 * @param Values for gradientRatio.
	 */
	abstract void setGradientRatio(Number... gradientRatio);

	/**
	 * Get groupedAlpha property.<br>
	 * Default: 1.
	 * @return Double Value for groupedAlpha.
	 */
	abstract Double getGroupedAlpha();

	/**
	 * Set groupedAlpha property.
	 * @param groupedAlpha Value for groupedAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setGroupedAlpha(Number groupedAlpha)
			throws OutOfRangeException;

	/**
	 * Get groupedColor property.
	 * @return String Value for groupedColor.
	 */
	abstract String getGroupedColor();

	/**
	 * Set groupedColor property.
	 * @param groupedColor Value for groupedColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setGroupedColor(String groupedColor) throws ColorException;

	/**
	 * Get groupedDescription property.
	 * @return String Value for groupedDescription.
	 */
	abstract String getGroupedDescription();

	/**
	 * Set groupedDescription property.
	 * @param groupedDescription Value for groupedDescription.
	 */
	abstract void setGroupedDescription(String groupedDescription);

	/**
	 * Get groupedPulled property.<br>
	 * Default: false.
	 * @return Boolean Value for groupedPulled.
	 */
	abstract Boolean isGroupedPulled();

	/**
	 * Set groupedPulled property.
	 * @param groupedPulled Enable or disable groupedPulled.
	 */
	abstract void setGroupedPulled(Boolean groupedPulled);

	/**
	 * Get groupedTitle property.<br>
	 * Default: Other.
	 * @return String Value for groupedTitle.
	 */
	abstract String getGroupedTitle();

	/**
	 * Set groupedTitle property.
	 * @param groupedTitle Value for groupedTitle.
	 */
	abstract void setGroupedTitle(String groupedTitle);

	/**
	 * Get groupPercent property.<br>
	 * Default: 0.
	 * @return Integer Value for groupPercent.
	 */
	abstract Integer getGroupPercent();

	/**
	 * Set groupPercent property.
	 * @param groupPercent Value for groupPercent.
	 * @throws IntegerException Value for groupPercent is not an integer number.
	 */
	abstract void setGroupPercent(Number groupPercent) throws IntegerException;

	/**
	 * Get hideLabelsPercent property.<br>
	 * Default: 0.
	 * @return Integer Value for hideLabelsPercent.
	 */
	abstract Integer getHideLabelsPercent();

	/**
	 * Set hideLabelsPercent property.
	 * @param hideLabelsPercent Value for hideLabelsPercent.
	 * @throws IntegerException Value for hideLabelsPercent is not an integer number.
	 */
	abstract void setHideLabelsPercent(Number hideLabelsPercent)
			throws IntegerException;

	/**
	 * Get hoverAlpha property.<br>
	 * Default: 1.
	 * @return Double Value for hoverAlpha.
	 */
	abstract Double getHoverAlpha();

	/**
	 * Set hoverAlpha property.
	 * @param hoverAlpha Value for hoverAlpha.
	 * @throws OutOfRangeException Value out of range admitted, format admitted: #ffffff
	 */
	abstract void setHoverAlpha(Number hoverAlpha) throws OutOfRangeException;

	/**
	 * Get labelFunction property.
	 * @return String Value for labelFunction.
	 */
	abstract String getLabelFunction();

	/**
	 * Set labelFunction property.
	 * @param labelFunction Value for labelFunction.
	 */
	abstract void setLabelFunction(String labelFunction);

	/**
	 * Get labelsEnabled property.<br>
	 * Default: true.
	 * @return Boolean Value for labelsEnabled.
	 */
	abstract Boolean isLabelsEnabled();

	/**
	 * Set labelsEnabled property.
	 * @param Enable or disable labels.
	 */
	abstract void setLabelsEnabled(Boolean labelsEnabled);

	/**
	 * Get labelTickAlpha property.<br>
	 * Default: 0.2.
	 * @return Double Value for labelTickAlpha.
	 */
	abstract Double getLabelTickAlpha();

	/**
	 * Set labelTickAlpha property.
	 * @param labelTickAlpha property.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setLabelTickAlpha(Number labelTickAlpha) throws OutOfRangeException;

	/**
	 * Get labelTickColor property.<br>
	 * Default: #000000.
	 * @return String Value for labelTickColor.
	 */
	abstract String getLabelTickColor();

	/**
	 * Set labelTickColor property.
	 * @param labelTickColor Value for labelTickColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setLabelTickColor(String labelTickColor)
			throws ColorException;

	/**
	 * Get marginBottom property.<br>
	 * Default: 10.
	 * @return Integer Value for marginBottom.
	 */
	abstract Integer getMarginBottom();

	/**
	 * Set marginBottom property.
	 * @param marginBottom Value for marginBottom.
	 * @throws IntegerException Value for marginBottom is not an integer number.
	 */
	abstract void setMarginBottom(Number marginBottom) throws IntegerException;

	/**
	 * Get marginLeft property.<br>
	 * Default: 0.
	 * @return Integer Value for marginLeft.
	 */
	abstract Integer getMarginLeft();

	/**
	 * Set marginLeft property.
	 * @param marginLeft Value for marginleft.
	 * @throws IntegerException Value for marginleft is not an integer number.
	 */
	abstract void setMarginLeft(Number marginLeft) throws IntegerException;

	/**
	 * Get marginRight property.<br>
	 * Default: 0.
	 * @return Integer Value for marginRight.
	 */
	abstract Integer getMarginRight();

	/**
	 * Set marginRight property.
	 * @param marginRight Value for marginRight.
	 * @throws IntegerException Value for marginRight is not an integer number.
	 */
	abstract void setMarginRight(Number marginRight) throws IntegerException;

	/**
	 * Get marginTop property.<br>
	 * Default: 10.
	 * @return Integer Value for marginTop.
	 */
	abstract Integer getMarginTop();

	/**
	 * Set marginTop property.
	 * @param marginTop Value for marginTop
	 * @throws IntegerException Value for marginTop is not an integer number.
	 */
	abstract void setMarginTop(Number marginTop) throws IntegerException;

	/**
	 * Get maxLabelWidth property.<br>
	 * Default: 200.
	 * @return Integer Value for maxLabelWidth.
	 */
	abstract Integer getMaxLabelWidth();

	/**
	 * Set makLabelWidth property.
	 * @param Value for maxLabelWidth.
	 * @throws IntegerException Value for maxLabelWidth is not an integer number.
	 */
	abstract void setMaxLabelWidth(Number maxLabelWidth)
			throws IntegerException;

	/**
	 * Get outlineAlpha property.<br>
	 * Default: 0.
	 * @return Double Value for outlineAlpha.
	 */
	abstract Double getOutlineAlpha();

	/**
	 * Set outlineAlpha property.
	 * @param outlineAlpha Value for outlineAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setOutlineAlpha(Number outlineAlpha)
			throws OutOfRangeException;

	/**
	 * Get outlineColor property.<br>
	 * Default: #ffffff
	 * @return String Value for outlineColor.
	 */
	abstract String getOutlineColor();

	/**
	 * Set outlineColor property.
	 * @param outlineColor Value for outlineColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setOutlineColor(String outlineColor) throws ColorException;

	/**
	 * Get outlineThickness property.<br>
	 * Default: 1.
	 * @return Integer Value for outlineThickness.
	 */
	abstract Integer getOutlineThickness();

	/**
	 * Set outlineThickness property.With improvedVisibility enabled range activated.
	 * @param outlineThickness Value for outlineThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-16.
	 */
	abstract void setOutlineThickness(Number outlineThickness)
			throws OutOfRangeException;

	/**
	 * Get patternField property.
	 * @return String Value for patternField.
	 */
	abstract String getPatternField();

	/**
	 * Set patternField property.
	 * @param patternField Value for patternField.
	 */
	abstract void setPatternField(String patternField);

	/**
	 * Get pulledField property.
	 * @return String Value for pulledField.
	 */
	abstract String getPulledField();

	/**
	 * Set pulledField property.
	 * @param pulledField Value for pulledField.
	 */
	abstract void setPulledField(String pulledField);

	/**
	 * Get pullOutDuration property.<br>
	 * Default: 1.
	 * @return Integer Value for pullOutDuration.
	 */
	abstract Integer getPullOutDuration();

	/**
	 * Set pullOutDuration property.With improvedVisibility enabled range activated.
	 * @param pullOutDuration Value for pullOutDuration.
	 * @throws OutOfRangeException Value out of range admitted: 0-5.
	 */
	abstract void setPullOutDuration(Number pullOutDuration)
			throws OutOfRangeException;

	/**
	 * Get pullOutEffect property.<br>
	 * Default: bounce.
	 * @return String Value for pullOutEffect.
	 */
	abstract String getPullOutEffect();

	/**
	 * Set pullOutEffect property.
	 * @param pullOutEffect Value for pullOutEffect.
	 */
	abstract void setPullOutEffect(Effect pullOutEffect);

	/**
	 * Get pullOutOnlyOne property.<br>
	 * Default: false.
	 * @return Boolean Value for pullOutOnlyOne.
	 */
	abstract Boolean isPullOutOnlyOne();

	/**
	 * Set pullOutOnlyOne property.
	 * @param pullOutOnlyOne Enable or disable pullOutOnlyOne.
	 */
	abstract void setPullOutOnlyOne(Boolean pullOutOnlyOne);

	/**
	 * Get sequencedAnimation property.<br>
	 * Default: true.
	 * @return Boolean Value for sequencedAnimation.
	 */
	abstract Boolean isSequencedAnimation();

	/**
	 * Set sequencedAnimation property.
	 * @param sequencedAnimation Enable or disable sequencedAnimation.
	 */
	abstract void setSequencedAnimation(Boolean sequencedAnimation);

	/**
	 * Get showZeroSlices property.<br>
	 * Default: false.
	 * @return Boolean Value for showZeroSlices.
	 */
	abstract Boolean isShowZeroSlices();

	/**
	 * Set showZeroSlices property.
	 * @param showZeroSlices Show or don't show zeroSlices.
	 */
	abstract void setShowZeroSlices(Boolean showZeroSlices);

	/**
	 * Get startAlpha property.<br>
	 * Default: 0.
	 * @return Double Value for startAlpha.
	 */
	abstract Double getStartAlpha();

	/**
	 * Set startAlpha property.
	 * @param startAlpha Value for startAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setStartAlpha(Number startAlpha) throws OutOfRangeException;

	/**
	 * Get startDuration property.<br>
	 * Default: 1.
	 * @return Integer Value for startDuration.
	 */
	abstract Integer getStartDuration();

	/**
	 * Set startDuration property.With improvedVisibility enabled range activated.
	 * @param startDuration Value for startDuration.
	 * @throws OutOfRangeException Value out of range admitted: 1-5.
	 */
	abstract void setStartDuration(Number startDuration)
			throws OutOfRangeException;

	/**
	 * Get startEffect property.<br>
	 * Default: bounce.
	 * @return String Value for startEffect.
	 */
	abstract String getStartEffect();

	/**
	 * Set startEffect property.
	 * @param startEffect Value for startEffect.
	 */
	abstract void setStartEffect(Effect startEffect);

	/**
	 * Get titleField property.
	 * @return String Value for titleField.
	 */
	abstract String getTitleField();

	/**
	 * Set titleField property.
	 * @param titleField Value for titleField.
	 */
	abstract void setTitleField(String titleField);

	/**
	 * Get urlField property.
	 * @return String Value for urlField.
	 */
	abstract String getUrlField();

	/**
	 * Set urlField property.
	 * @param urlField Value for urlField.
	 */
	abstract void setUrlField(String urlField);

	/**
	 * Get urlTarger property.<br>
	 * Default: _self.
	 * @return String Value for urlTarget.
	 */
	abstract String getUrlTarget();

	/**
	 * Set urlTarget property.
	 * @param urlTarget Value for urlTarget.
	 */
	abstract void setUrlTarget(UrlTarget urlTarget);

	/**
	 * Get valueField property.
	 * @return String Value for valueField.
	 */
	abstract String getValueField();

	/**
	 * Set valueField property.
	 * @param valueField Value for valueField.
	 */
	abstract void setValueField(String valueField);

	/**
	 * Get visibleInLegendField property.
	 * @return String Value for visibleInLegendField.
	 */
	abstract String getVisibleInLegendField();

	/**
	 * Set visibleInLegendField property.
	 * @param visibleInLegendField Value for visibleInLegendField.
	 */
	abstract void setVisibleInLegendField(String visibleInLegendField);

}