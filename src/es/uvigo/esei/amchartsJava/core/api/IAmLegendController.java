package es.uvigo.esei.amchartsJava.core.api;




import es.uvigo.esei.amchartsJava.core.constants.AlignConstant.Align;
import es.uvigo.esei.amchartsJava.core.constants.LegendPositionConstant.LegendPosition;
import es.uvigo.esei.amchartsJava.core.constants.MarkerTypeConstant.MarkerType;
import es.uvigo.esei.amchartsJava.core.constants.SwitchTypeConstant.SwitchType;
import es.uvigo.esei.amchartsJava.core.constants.ValueAlignConstant.ValueAlign;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for controller of AmLegend. Details of AmLegend and 
 *  their properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmLegendController  {
	
	/**
	 * Get align property.<br>
	 * Default: left
	 * @return String Value of align.
	 */
	abstract String getAlign();

	/**
	 * Set align property.
	 * @param align Value for align.
	 */
	abstract void setAlign(Align align);

	/**
	 * Get autoMargins property.<br>
	 * Default: true
	 * @return Boolean
	 */
	abstract Boolean isAutoMargins();

	/**
	 * Set autoMargins property.
	 * @param autoMargins Enable or disable autoMargins.
	 */
	abstract void setAutoMargins(Boolean autoMargins);

	/**
	 * Get backgroundAlpha property.<br>
	 * Default: 0
	 * @return Object Value for backgroundAlpha is a double number.
	 */
	abstract Object getBackgroundAlpha();

	/**
	 * Set backgroundAlpha property.
	 * @param backgroundAlpha Value for backgroundAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setBackgroundAlpha(Number backgroundAlpha)
			throws OutOfRangeException;

	/**
	 * Get backgroundColor property.<br>
	 * Default: #ffffff
	 * @return String Value for backgroundColor.
	 */
	abstract String getBackgroundColor();

	/**
	 * Set backgroundColor property.
	 * @param backgroundColor Value for backgroundColor.
	 * @throws ColorException Format of color not admitted, format color admitted:#000000
	 */
	abstract void setBackgroundColor(String backgroundColor)
			throws ColorException;

	/**
	 * Get borderAlpha property.<br>
	 * Default: 0
	 * @return Object Value for borderAlpha is a double number.
	 */
	abstract Object getBorderAlpha();

	/**
	 * Set borderAlpha property.
	 * @param borderAlpha Value for borderAlpha.
	 * @throws OutOfRangeException Value out or range admitted: 0.0-1.0.
	 */
	abstract void setBorderAlpha(Number borderAlpha) throws OutOfRangeException;

	/**
	 * Get borderColor property.<br>
	 * Default: #000000
	 * @return String Value for borderColor.
	 */
	abstract String getBorderColor();

	/**
	 * Set borderColor property.
	 * @param borderColor Value for borderColor.
	 * @throws ColorException Color format not admitted, format color admitted:#000000
	 */
	abstract void setBorderColor(String borderColor) throws ColorException;

	/**
	 * Get bottom property.
	 * @return Object Value for bottom is an integer number.
	 */
	abstract Object getBottom();

	/**
	 * Set bottom property.
	 * @param bottom Value for bottom.
	 * @throws IntegerException Value for bottom is not a integer number
	 */
	abstract void setBottom(Number bottom) throws IntegerException;

	/**
	 * Get color property.<br>
	 * Default: #000000
	 * @return String Value for color.
	 */
	abstract String getColor();

	/**
	 * Set color property.
	 * @param color Value for color.
	 * @throws ColorException Color format not admitted, color format admitted:#000000
	 */
	abstract void setColor(String color) throws ColorException;

	/**
	 * Get divId property.
	 * @return String Value for divId.
	 */
	abstract String getDivId();

	/**
	 * Set divId property.
	 * @param divId Value for divId.
	 */
	abstract void setDivId(String divId);

	/**
	 * Get enabled property.<br>
	 * Default: true
	 * @return Boolean
	 */
	abstract Boolean isEnabled();

	/**
	 * Set enabled property.
	 * @param enabled Show or not show legend.
	 */
	abstract void setEnabled(Boolean enabled);

	/**
	 * Get equalWidths property.<br>
	 * Default: true
	 * @return Boolean
	 */
	abstract Boolean isEqualWidths();

	/**
	 * Set equalWidths property.
	 * @param equalWidths Enable or disable equalWidths.
	 */
	abstract void setEqualWidths(Boolean equalWidths);

	/**
	 * Get fontSize property.<br>
	 * Default: 11
	 * @return Object Value for fontSize is an integer number.
	 */
	abstract Object getFontSize();

	/**
	 * Set fontSize property.With improvedVisibility enabled range activated.
	 * @param fontSize Value for fontSize.
	 * @throws OutOfRangeException Value out of range admitted: 10-18.
	 */
	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	/**
	 * Get forceWidth property.<br>
	 * Default false
	 * @return Boolean
	 */
	abstract Boolean isForceWidth();

	/**
	 * Set forceWidth property.
	 * @param forceWidth Enable or disable forceWidth
	 */
	abstract void setForceWidth(Boolean forceWidth);

	/**
	 * Get horizontalGap property.<br>
	 * Default: 0
	 * @return Object Value for horizontalGap is an integer number.
	 */
	abstract Object getHorizontalGap();

	/**
	 * Set horizontalGap property.
	 * @param horizontalGap Value for horizontalGap.
	 * @throws IntegerException Value for horizontalGap is not an integer number.
	 */
	abstract void setHorizontalGap(Number horizontalGap) throws IntegerException;

	/**
	 * Get labelText property.<br>
	 * Default: [[title]]
	 * @return String Value for labelText.
	 */
	abstract String getLabelText();

	/**
	 * Set labelText property.
	 * @param labelText Value for labelText.[[title]] be replaced by graph's title.
	 */
	abstract void setLabelText(String labelText);

	/**
	 * Get labelWidth property
	 * @return Object Value for labelWidth is an integer number.
	 */
	abstract Object getLabelWidth();

	/**
	 * Set labelWidth property.
	 * @param labelWidth Value for labelWidth.
	 * @throws IntegerException Value for labelWidth is not an integer number.
	 */
	abstract void setLabelWidth(Number labelWidth) throws IntegerException;

	/**
	 * Get left property.
	 * @return Object Value for left.
	 */
	abstract Object getLeft();

	/**
	 * Set left property.
	 * @param left Value for left.
	 * @throws IntegerException Value for left is not an integer number.
	 */
	abstract void setLeft(Number left) throws IntegerException;
	
	/**
	 * Get marginBottom property.<br>
	 * Default: 0
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
	 * Default: 20
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
	 * Default: 20
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
	 * Default: 0
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
	 * Get markerBorderAlpha property.
	 * Default: 1
	 * @return Object Value for markerBorderAlpha is a double number.
	 */
	abstract Object getMarkerBorderAlpha();

	/**
	 * Set markerBorderAlpha property.
	 * @param markerBorderAlpha Value for markerBorderAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0. 
	 */
	abstract void setMarkerBorderAlpha(Number markerBorderAlpha)
			throws OutOfRangeException;

	/**
	 * Get markerBorderColor property.
	 * Default: Same color that marker.
	 * @return String Value for markerBorderColor.
	 */
	abstract String getMarkerBorderColor();

	/**
	 * Set markerBorderColor property.
	 * @param markerBorderColor Value for markerBorderColor.
	 * @throws ColorException Color format not admitted, format color admitted:#000000
	 */
	abstract void setMarkerBorderColor(String markerBorderColor)
			throws ColorException;

	/**
	 * Get markerBorderThickness property.
	 * Default: 1
	 * @return Object Value for markerBorderThickness is an integer number.
	 */
	abstract Object getMarkerBorderThickness();

	/**
	 * Set markerBorderThickness property.With improvedVisibility enabled range activated.
	 * @param markerBorderThickness Value for markerBorderThickness.
	 * @throws OutOfRangeException Value out of range admitted: 1-16.
	 */
	abstract void setMarkerBorderThickness(Number markerBorderThickness)
			throws OutOfRangeException;

	/**
	 * Get markerDisabledColor property.<br>
	 * Default: #aab3b3
	 * @return String Value for markerDisabledColor.
	 */
	abstract String getMarkerDisabledColor();

	/**
	 * Set markerDisabledColor property.
	 * @param markerDisabledColor Value for markerDisabledColor.
	 * @throws ColorException Color format not admitted, color format admitted: #000000
	 */
	abstract void setMarkerDisabledColor(String markerDisabledColor)
			throws ColorException;

	/**
	 * Get markerLabelGap property.<br>
	 * Default: 5
	 * @return Object Value for markerLabelGap is an integer number.
	 */
	abstract Object getMarkerLabelGap();

	/**
	 * Set markerLabelGa property.With improvedVisibility enabled range activated.
	 * @param markerLabelGap Value for markerLabelGap.
	 * @throws OutOfRangeException Value out of range admitted: 5-16.
	 */
	abstract void setMarkerLabelGap(Number markerLabelGap)
			throws OutOfRangeException;

	/**
	 * Get markerSize property.
	 * Default: 16
	 * @return Object Value for markerSize is an integer number.
	 */
	abstract Object getMarkerSize();

	/**
	 * Set markerSize property.With improvedVisibility enabled range activated.
	 * @param markerSize Value for markerSize.
	 * @throws OutOfRangeException Value out of range admitted: 1-36.
	 */
	abstract void setMarkerSize(Number markerSize) throws OutOfRangeException;

	/**
	 * Get markerType property.
	 * Default: square
	 * @return String Value for markerType.
	 */
	abstract String getMarkerType();

	/**
	 * Set markerType property.
	 * @param markerType Value for markerType.
	 */
	abstract void setMarkerType(MarkerType markerType);

	/**
	 * Get maxColumns property.
	 * @return Object Value for maxColumns is an integer number.
	 */
	abstract Object getMaxColumns();

	/**
	 * Set maxColumns property.With improvedVisibility enabled range activated.
	 * @param maxColumns Value for maxColumns.
	 * @throws OutOfRangeException Value out of range admitted: 1-5.
	 */
	abstract void setMaxColumns(Number maxColumns) throws OutOfRangeException;

	/**
	 * Get periodValueText property.
	 * @return String Value for periodValueText.
	 */
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