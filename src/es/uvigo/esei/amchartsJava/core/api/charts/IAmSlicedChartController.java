package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.constants.EffectConstant.Effect;
import es.uvigo.esei.amchartsJava.core.constants.UrlTargetConstant.UrlTarget;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.AmChart;
import es.uvigo.esei.amchartsJava.core.model.charts.AmSlicedChart;

public abstract interface IAmSlicedChartController<F extends AmSlicedChart> extends IAmchartController<AmChart> {

	abstract Object getAlpha();

	abstract void setAlpha(Number alpha) throws OutOfRangeException;

	abstract Object getAlphaField();

	abstract void setAlphaField(String alphaField);

	abstract Object getBaseColor();

	abstract void setBaseColor(String baseColor) throws ColorException;

	abstract Object getClassNameField();

	abstract void setClassNameField(String classNameField);

	abstract Object getColorField();

	abstract void setColorField(String colorField);

	abstract Object getColors();

	abstract void addColor(String color);

	abstract void changeColorsDefault(String... newColors);

	abstract Object getDescriptionField();

	abstract void setDescriptionField(String descriptionField);

	abstract Object getGradientRatio();

	abstract void setGradientRatio(Number... gradientRatio);

	abstract Object getGroupedAlpha();

	abstract void setGroupedAlpha(Number groupedAlpha)
			throws OutOfRangeException;

	abstract Object getGroupedColor();

	abstract void setGroupedColor(String groupedColor) throws ColorException;

	abstract Object getGroupedDescription();

	abstract void setGroupedDescription(String groupedDescription);

	abstract Object isGroupedPulled();

	abstract void setGroupedPulled(Boolean groupedPulled);

	abstract Object getGroupedTitle();

	abstract void setGroupedTitle(String groupedTitle);

	abstract Object getGroupPercent();

	abstract void setGroupPercent(Number groupPercent) throws IntegerException;

	abstract Object getHideLabelsPercent();

	abstract void setHideLabelsPercent(Number hideLabelsPercent)
			throws IntegerException;

	abstract Object getHoverAlpha();

	abstract void setHoverAlpha(Number hoverAlpha) throws OutOfRangeException;

	abstract Object getLabelFunction();

	abstract void setLabelFunction(String labelFunction);

	abstract Object getLabelsEnabled();

	abstract void setLabelsEnabled(Boolean labelsEnabled);

	abstract Object getLabelTickAlpha();

	abstract void setLabelTickAlpha(String labelTickAlpha);

	abstract Object labelTickColor();

	abstract void setLabelTickColor(String labelTickColor)
			throws ColorException;

	abstract Object getMarginBottom();

	abstract void setMarginBottom(Number marginBottom) throws IntegerException;

	abstract Object getMarginLeft();

	abstract void setMarginLeft(Number marginLeft) throws IntegerException;

	abstract Object getMarginRight();

	abstract void setMarginRight(Number marginRight) throws IntegerException;

	abstract Object getMarginTop();

	abstract void setMarginTop(Number marginTop) throws IntegerException;

	abstract Object getMaxLabelWidth();

	abstract void setMaxLabelWidth(Number maxLabelWidth)
			throws IntegerException;

	abstract Object getOutlineAlpha();

	abstract void setOutlineAlpha(Number outlineAlpha)
			throws OutOfRangeException;

	abstract Object getOutlineColor();

	abstract void setOutlineColor(String outlineColor) throws ColorException;

	abstract Object getOutlineThickness(Number outlineThickness);

	abstract void setOutlineThickness(Number outlineThickness)
			throws OutOfRangeException;

	abstract Object getPatternField();

	abstract void setPatternField(String patternField);

	abstract Object getPulledField();

	abstract void setPulledField(String pulledField);

	abstract Object getPullOutDuration();

	abstract void setPullOutDuration(Number pullOutDuration)
			throws OutOfRangeException;

	abstract Object getPullOutEffect();

	abstract void setPullOutEffect(Effect pullOutEffect);

	abstract Object isPullOutOnlyOne();

	abstract void setPullOutOnlyOne(Boolean pullOutOnlyOne);

	abstract Object isSequencedAnimation();

	abstract void setSequencedAnimation(Boolean sequencedAnimation);

	abstract Object isShowZeroSlices();

	abstract void setShowZeroSlices(Boolean showZeroSlices);

	abstract Object getStartAlpha();

	abstract void setStartAlpha(Number startAlpha) throws OutOfRangeException;

	abstract Object getStartDuration();

	abstract void setStartDuration(Number startDuration)
			throws OutOfRangeException;

	abstract Object getStartEffect();

	abstract void setStartEffect(Effect startEffect);

	abstract Object getTitleField();

	abstract void setTitleField(String titleField);

	abstract Object getUrlField();

	abstract void setUrlField(String urlField);

	abstract Object getUrlTarget();

	abstract void setUrlTarget(UrlTarget urlTarget);

	abstract Object getValueField();

	abstract void setValueField(String valueField);

	abstract Object getVisibleInLegendField();

	abstract void setVisibleInLegendField(String visibleInLegendField);

}