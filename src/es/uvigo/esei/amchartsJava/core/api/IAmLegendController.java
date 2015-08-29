package es.uvigo.esei.amchartsJava.core.api;




import es.uvigo.esei.amchartsJava.core.constants.AlignConstant.Align;
import es.uvigo.esei.amchartsJava.core.constants.LegendPositionConstant.LegendPosition;
import es.uvigo.esei.amchartsJava.core.constants.MarkerTypeConstant.MarkerType;
import es.uvigo.esei.amchartsJava.core.constants.SwitchTypeConstant.SwitchType;
import es.uvigo.esei.amchartsJava.core.constants.ValueAlignConstant.ValueAlign;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.AmLegend;

public abstract interface IAmLegendController  {
	
	abstract AmLegend getLegend();

	abstract String getAlign();

	abstract void setAlign(Align align);

	abstract Boolean isAutoMargins();

	abstract void setAutoMargins(Boolean autoMargins);

	abstract Object getBackgroundAlpha();

	abstract void setBackgroundAlpha(Number backgroundAlpha)
			throws OutOfRangeException;

	abstract String getBackgroundColor();

	abstract void setBackgroundColor(String backgroundColor)
			throws ColorException;

	abstract Object getBorderAlpha();

	abstract void setBorderAlpha(Number borderAlpha) throws OutOfRangeException;

	abstract String getBorderColor();

	abstract void setBorderColor(String borderColor) throws ColorException;

	abstract Object getBottom();

	abstract void setBottom(Number bottom) throws IntegerException;

	abstract String getColor();

	abstract void setColor(String color) throws ColorException;

	abstract String getDivId();

	abstract void setDivId(String divId);

	abstract Boolean isEnabled();

	abstract void setEnabled(Boolean enabled);

	abstract Boolean isEqualWidths();

	abstract void setEqualWidths(Boolean equalWidths);

	abstract Object getFontSize();

	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	abstract Boolean isForceWidth();

	abstract void setForceWidth(Boolean forceWidth);

	abstract Object getHorizontalGap();

	abstract void setHorizontalGap(Number horizontalGap) throws IntegerException;

	abstract String getLabelText();

	//cualquier texto pero si es [[title]] muestra como texto el title del graph
	abstract void setLabelText(String labelText);

	abstract Object getLabelWidth();

	abstract void setLabelWidth(Number labelWidth) throws IntegerException;

	abstract Object getLeft();

	abstract void setLeft(Number left) throws IntegerException;
	
	abstract Object getMarginBottom();

	abstract void setMarginBottom(Number marginBottom) throws IntegerException;

	abstract Object getMarginLeft();

	abstract void setMarginLeft(Number marginLeft) throws IntegerException;

	abstract Object getMarginRight();

	abstract void setMarginRight(Number marginRight) throws IntegerException;

	abstract Object getMarginTop();

	abstract void setMarginTop(Number marginTop) throws IntegerException;

	abstract Object getMarkerBorderAlpha();

	abstract void setMarkerBorderAlpha(Number markerBorderAlpha)
			throws OutOfRangeException;

	abstract String getMarkerBorderColor();

	abstract void setMarkerBorderColor(String markerBorderColor)
			throws ColorException;

	abstract Object getMarkerBorderThickness();

	abstract void setMarkerBorderThickness(Number markerBorderThickness)
			throws OutOfRangeException;

	abstract String getMarkerDisabledColor();

	abstract void setMarkerDisabledColor(String markerDisabledColor)
			throws ColorException;

	abstract Object getMarkerLabelGap();

	abstract void setMarkerLabelGap(Number markerLabelGap)
			throws OutOfRangeException;

	abstract Object getMarkerSize();

	abstract void setMarkerSize(Number markerSize) throws OutOfRangeException;

	abstract String getMarkerType();

	abstract void setMarkerType(MarkerType markerType);

	abstract Object getMaxColumns();

	abstract void setMaxColumns(Number maxColumns) throws OutOfRangeException;

	abstract String getPeriodValueText();

	abstract void setPeriodValueText(String periodValueText);

	abstract String getPosition();

	abstract void setPosition(LegendPosition position);

	abstract Boolean isReversedOrder();

	abstract void setReversedOrder(Boolean reversedOrder);

	abstract Object getRight();

	abstract void setRight(Number right) throws IntegerException;

	abstract String getRollOverColor();

	abstract void setRollOverColor(String rollOverColor) throws ColorException;

	abstract Object getRollOverGraphAlpha();

	abstract void setRollOverGraphAlpha(Number rollOverGraphAlpha)
			throws OutOfRangeException;

	abstract Boolean isShowEntries();

	abstract void setShowEntries(Boolean showEntries);

	abstract Object getSpacing();

	abstract void setSpacing(Number spacing) throws OutOfRangeException;

	abstract Boolean isSwitchable();

	abstract void setSwitchable(Boolean switchable);

	abstract String getSwitchColor();

	abstract void setSwitchColor(String switchcolor) throws ColorException;

	abstract String getSwitchType();

	abstract void setSwitchType(SwitchType switchType);

	abstract Boolean isTextClickEnabled();

	abstract void setTextClickEnabled(Boolean textClickEnabled);

	abstract Object getTop();

	abstract void setTop(Number top) throws IntegerException;

	abstract Boolean isUseGraphSettings();

	abstract void setUseGraphSettings(Boolean useGraphSettings);

	abstract Boolean isUseMarkerColorForLabels();

	abstract void setUseMarkerColorForLabels(Boolean useMarkerColorForLabels);

	abstract Boolean isUseMarkerColorForValues();

	abstract void setUseMarkerColorForValues(Boolean useMarkerColorForValues);

	abstract String getValueAlign();

	abstract void setValueAlign(ValueAlign valueAlign);

	abstract String getValueFunction();

	abstract void setValueFunction(String valueFunction);

	abstract String getValueText();

	//cualquier texto pero tiene más sentido dejarlo en blanco, usa el valueField
	abstract void setValueText(String valueText);

	abstract Object getValueWidth();

	abstract void setValueWidth(Number valueWidth) throws OutOfRangeException;

	abstract Object getVerticalGap();

	abstract void setVerticalGap(Number verticalGap) throws OutOfRangeException;

	abstract Object getWidth();

	abstract void setWidth(Number width) throws IntegerException;

}