package es.uvigo.esei.amchartsJava.core.api.charts;

import java.util.List;

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

	abstract String getAlphaField();

	abstract void setAlphaField(String alphaField);

	abstract String getBaseColor();

	abstract void setBaseColor(String baseColor) throws ColorException;

	abstract String getClassNameField();

	abstract void setClassNameField(String classNameField);

	abstract String getColorField();

	abstract void setColorField(String colorField);

	abstract List<String> getColors();

	abstract void addColor(String color);

	abstract void changeColorsDefault(String... newColors);

	abstract String getDescriptionField();

	abstract void setDescriptionField(String descriptionField);

	abstract List<Number> getGradientRatio();

	abstract void setGradientRatio(Number... gradientRatio);

	abstract Object getGroupedAlpha();

	abstract void setGroupedAlpha(Number groupedAlpha)
			throws OutOfRangeException;

	abstract String getGroupedColor();

	abstract void setGroupedColor(String groupedColor) throws ColorException;

	abstract String getGroupedDescription();

	abstract void setGroupedDescription(String groupedDescription);

	abstract Boolean isGroupedPulled();

	abstract void setGroupedPulled(Boolean groupedPulled);

	abstract String getGroupedTitle();

	abstract void setGroupedTitle(String groupedTitle);

	abstract Object getGroupPercent();

	abstract void setGroupPercent(Number groupPercent) throws IntegerException;

	abstract Object getHideLabelsPercent();

	abstract void setHideLabelsPercent(Number hideLabelsPercent)
			throws IntegerException;

	abstract Object getHoverAlpha();

	abstract void setHoverAlpha(Number hoverAlpha) throws OutOfRangeException;

	abstract String getLabelFunction();

	abstract void setLabelFunction(String labelFunction);

	abstract Boolean isLabelsEnabled();

	abstract void setLabelsEnabled(Boolean labelsEnabled);

	abstract Object getLabelTickAlpha();

	abstract void setLabelTickAlpha(Number labelTickAlpha) throws OutOfRangeException;

	abstract String labelTickColor();

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

	abstract String getOutlineColor();

	abstract void setOutlineColor(String outlineColor) throws ColorException;

	abstract Object getOutlineThickness();

	abstract void setOutlineThickness(Number outlineThickness)
			throws OutOfRangeException;

	abstract String getPatternField();

	abstract void setPatternField(String patternField);

	abstract String getPulledField();

	abstract void setPulledField(String pulledField);

	abstract Object getPullOutDuration();

	abstract void setPullOutDuration(Number pullOutDuration)
			throws OutOfRangeException;

	abstract String getPullOutEffect();

	abstract void setPullOutEffect(Effect pullOutEffect);

	abstract Boolean isPullOutOnlyOne();

	abstract void setPullOutOnlyOne(Boolean pullOutOnlyOne);

	abstract Boolean isSequencedAnimation();

	abstract void setSequencedAnimation(Boolean sequencedAnimation);

	abstract Boolean isShowZeroSlices();

	abstract void setShowZeroSlices(Boolean showZeroSlices);

	abstract Object getStartAlpha();

	abstract void setStartAlpha(Number startAlpha) throws OutOfRangeException;

	abstract Object getStartDuration();

	abstract void setStartDuration(Number startDuration)
			throws OutOfRangeException;

	abstract String getStartEffect();

	abstract void setStartEffect(Effect startEffect);

	abstract String getTitleField();

	abstract void setTitleField(String titleField);

	abstract String getUrlField();

	abstract void setUrlField(String urlField);

	abstract String getUrlTarget();

	abstract void setUrlTarget(UrlTarget urlTarget);

	abstract String getValueField();

	abstract void setValueField(String valueField);

	abstract String getVisibleInLegendField();

	abstract void setVisibleInLegendField(String visibleInLegendField);

}