package es.uvigo.esei.amchartsJava.core.api;




import es.uvigo.esei.amchartsJava.core.constants.AlignConstant.Align;
import es.uvigo.esei.amchartsJava.core.constants.LegendPositionConstant.LegendPosition;
import es.uvigo.esei.amchartsJava.core.constants.MarkerTypeConstant.MarkerType;
import es.uvigo.esei.amchartsJava.core.constants.SwitchTypeConstant.SwitchType;
import es.uvigo.esei.amchartsJava.core.constants.ValueAlignConstant.ValueAlign;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IAmLegendController  {

	public Object getAlign();

	public void setALign(Align align);

	public Object isAutoMargins();

	public void setAutoMargins(Boolean autoMargins);

	public Object getBackgroundAlpha();

	public void setBackgroundAlpha(Number backgroundAlpha)
			throws OutOfRangeException;

	public Object getBackgroundColor();

	public void setBackgroundColor(String backGroundColor)
			throws ColorException;

	public Object getBorderAlpha();

	public void setBorderAlpha(Number borderAlpha) throws OutOfRangeException;

	public Object getBorderColor();

	public void setBorderColor(String borderColor) throws ColorException;

	public Object getBottom();

	public void setBottom(Number bottom) throws IntegerException;

	public Object getColor();

	public void setColor(String color) throws ColorException;

	public Object getDivId();

	public void setDivId(String divId);

	public Object isEnabled();

	public void setEnabled(Boolean enabled);

	public Object isEqualWidths();

	public void setEqualWidths(Boolean equalWidths);

	public Object getFontSize();

	public void setFontSize(Number fontSize) throws OutOfRangeException;

	public Object isForceWidth();

	public void setForceWidth(Boolean forceWidth);

	public Object getHorizontalGap();

	public void setHorizontalGap(Number horizontalGap) throws IntegerException;

	public Object getLabelText();

	//cualquier texto pero si es [[title]] muestra como texto el title del graph
	public void setLabelText(String labelText);

	public Object getLabelWidth();

	public void setLabelWidth(Number labelWidth) throws IntegerException;

	public Object getLeft();

	public void setLeft(Number left) throws IntegerException;

	public Object getMarginBottom();

	public void setMarginBottom(Number marginBottom) throws IntegerException;

	public Object getMarginLeft();

	public void setMarginLeft(Number marginLeft) throws IntegerException;

	public Object getMarginRight();

	public void setMarginRight(Number marginRight) throws IntegerException;

	public Object getMarginTop();

	public void setMarginTop(Number marginTop) throws IntegerException;

	public Object getMarkerBorderAlpha();

	public void setMarkerBorderAlpha(Number markerBorderAlpha)
			throws OutOfRangeException;

	public Object getMarkerBorderColor();

	public void setMarkerBorderColor(String markerBorderColor)
			throws ColorException;

	public Object getMarkerBorderThickness();

	public void setMarkerBorderThickness(Number markerBorderThickness)
			throws OutOfRangeException;

	public Object getMarkerDisabledColor();

	public void setMarkerDisabledColor(String markerDisabledColor)
			throws ColorException;

	public Object getMarkerLabelGap();

	public void setMarkerLabelGap(Number markerLabelGap)
			throws OutOfRangeException;

	public Object getMarkerSize();

	public void setMarkerSize(Number markerSize) throws OutOfRangeException;

	public Object getMarkerType();

	public void setMarkerType(MarkerType markerType);

	public Object getMaxColumns();

	public void setMaxColumns(Number maxColumns) throws OutOfRangeException;

	public Object getPeriodValueText();

	public void setPeriodValueText(String periodValueText);

	public Object getPosition();

	public void setPosition(LegendPosition position);

	public Object isReversedOrder();

	public void setReversedOrder(Boolean reversedOrder);

	public Object getRight();

	public void setRight(Number right) throws IntegerException;

	public Object getRollOverColor();

	public void setRollOverColor(String rollOverColor) throws ColorException;

	public Object getRollOverGraphAlpha();

	public void setRollOverGraphAlpha(Number rollOverGraphAlpha)
			throws OutOfRangeException;

	public Object isShowEntries();

	public void setShowEntries(Boolean showEntries);

	public Object getSpacing();

	public void setSpacing(Number spacing) throws OutOfRangeException;

	public Object isSwitchable();

	public void setSwitchable(Boolean switchable);

	public Object getSwitchColor();

	public void setSwitchColor(String switchcolor) throws ColorException;

	public Object getSwitchType();

	public void setSwitchType(SwitchType switchType);

	public Object isTextClickEnabled();

	public void setTextClickEnabled(Boolean textClickEnabled);

	public Object getTop();

	public void setTop(Number top) throws IntegerException;

	public Object isUseGraphSettings();

	public void setUseGraphSettings(Boolean useGraphSettings);

	public Object isUseMarkerColorForLabels();

	public void setUseMarkerColorForLabels(Boolean useMarkerColorForLabels);

	public Object isUseMarkerColorForValues();

	public void setUseMarkerColorForValues(Boolean useMarkerColorForValues);

	public Object getValueAlign();

	public void setValueAlign(ValueAlign valueAlign);

	public Object getValueFunction();

	public void setValueFunction(String valueFunction);

	public Object getValueText();

	//cualquier texto pero tiene más sentido dejarlo en blanco, usa el valueField
	public void setValueText(String valueText);

	public Object getValueWidth();

	public void setValueWidth(Number valueWidth) throws OutOfRangeException;

	public Object getVerticalGap();

	public void setVerticalGap(Number verticalGap) throws OutOfRangeException;

	public Object getWidth();

	public void setWidth(Number width) throws IntegerException;

}