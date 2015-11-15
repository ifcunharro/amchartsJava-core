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
	 * @throws ColorException Format of color don't admitted, format admitted:#ffffff
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
	 * @throws ColorException Format of color don't admitted, format admitted:#ffffff
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
	 * @throws IntegerException Value for bottom is not an integer number
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
	 * @throws ColorException Format of color don't admitted, format admitted:#ffffff
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
	 * @param enabled Show or don't show legend.
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
	 * @throws ColorException Format of color don't admitted, format admitted:#ffffff
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
	 * @throws ColorException Format of color don't admitted, format admitted: #ffffff
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

	/**
	 * Set periodValueText property.
	 * @param periodValueText Value for periodValueText.
	 */
	abstract void setPeriodValueText(String periodValueText);

	/**
	 * Get position property.<br>
	 * Default: bottom.
	 * @return String Value for position.
	 */
	abstract String getPosition();
	
	/**
	 * Set position property.
	 * @param position Value for position. 
	 */
	abstract void setPosition(LegendPosition position);

	/**
	 * Get reversedOrder property.<br>
	 * Default: false.
	 * @return Boolean Value for reversedOrder.
	 */
	abstract Boolean isReversedOrder();

	/**
	 * Set reversed
	 * @param reversedOrder Enable or disable reversedOrder.
	 */
	abstract void setReversedOrder(Boolean reversedOrder);

	/**
	 * Get right property.
	 * @return Value for right is an integer number.
	 */
	abstract Object getRight();
	
	/**
	 * Set right property.
	 * @param right Value for right.
	 * @throws IntegerException Value for right is not an integer number.
	 */
	abstract void setRight(Number right) throws IntegerException;

	/**
	 * Get rollOverColor property.<br>
	 * Default: #cc0000
	 * @return String Valiue for rollOverColor.
	 */
	abstract String getRollOverColor();

	/**
	 * Set rollOverColor property.
	 * @param rollOverColor Value for rollOverColor.
	 * @throws ColorException Format of color don't admitted, format admitted:#ffffff
	 */
	abstract void setRollOverColor(String rollOverColor) throws ColorException;

	/**
	 * Get rollOverGraphAlpha property.<br>
	 * Default: 1.
	 * @return Object Value for rollOverGraphAlpha is a double number.
	 */
	abstract Object getRollOverGraphAlpha();

	/**
	 * Set rollOverGraphAlpha property.
	 * @param rollOverGraphAlpha Value for rollOverGraphAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setRollOverGraphAlpha(Number rollOverGraphAlpha)
			throws OutOfRangeException;

	/**
	 * Get showEntries property.<br>
	 * Default: true.
	 * @return Boolean Value for showEntries.
	 */
	abstract Boolean isShowEntries();

	/**
	 * Set showEntries property.
	 * @param showEntries Show or don't show entries.
	 */
	abstract void setShowEntries(Boolean showEntries);

	/**
	 * Get spacing property.<br>
	 * Default: 10
	 * @return Object Value for spacing is an integer number.
	 */
	abstract Object getSpacing();
	
	/**
	 * Set spacing property.With improvedVisibility enabled range activated.
	 * @param spacing Value for spacing.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setSpacing(Number spacing) throws OutOfRangeException;

	/**
	 * Get switchable property.<br>
	 * Default: true.
	 * @return Boolean Value for switchable.
	 */
	abstract Boolean isSwitchable();

	/**
	 * Set switchable property.
	 * @param switchable Enable or disable switch.
	 */
	abstract void setSwitchable(Boolean switchable);

	/**
	 * Get switchColor property.<br>
	 * Default: #ffffff
	 * @return String Value for switchColor.
	 */
	abstract String getSwitchColor();

	/**
	 * Set switchColor property.
	 * @param switchColor Value for switchColor.
	 * @throws ColorException Format of color don't admitted, format admitted:#ffffff
	 */
	abstract void setSwitchColor(String switchColor) throws ColorException;

	/**
	 * Get switchType property.<br>
	 * Default: x.
	 * @return String Value for switchType.
	 */
	abstract String getSwitchType();

	/**
	 * Set switchType property.
	 * @param switchType Value for switchType.
	 */
	abstract void setSwitchType(SwitchType switchType);

	/**
	 * Get textClickEnabled property.<br>
	 * Default: false.
	 * @return Boolean Value for textClickEnabled.
	 */
	abstract Boolean isTextClickEnabled();

	/**
	 * Set textClickEnabled property.
	 * @param textClickEnabled Enable or disable textClick.
	 */
	abstract void setTextClickEnabled(Boolean textClickEnabled);

	/**
	 * Get top property.
	 * @return Object Value for top is an integer number.
	 */
	abstract Object getTop();

	/**
	 * Set top property.
	 * @param top Value for top.
	 * @throws IntegerException Value for top is not an integer number.
	 */
	abstract void setTop(Number top) throws IntegerException;

	/**
	 * Get useGraphSettings property.<br>
	 * Default: false.
	 * @return Boolean Value for useGraphSettings.
	 */
	abstract Boolean isUseGraphSettings();

	/**
	 * Set useGraphSettings property.
	 * @param useGraphSettings Enable or disable use of graphSettings.
	 */
	abstract void setUseGraphSettings(Boolean useGraphSettings);

	/**
	 * Get useMarkerColorForLabels property.<br>
	 * Default: false.
	 * @return Boolean Value for useMarkerColorForLabels.
	 */
	abstract Boolean isUseMarkerColorForLabels();

	/**
	 * Set useMarkerColorForLabels property.
	 * @param useMarkerColorForLabels Use or not use markerColor for labels.
	 */
	abstract void setUseMarkerColorForLabels(Boolean useMarkerColorForLabels);

	/**
	 * Get useMarkerColorForValues property.<br>
	 * Default: false.
	 * @return Boolean Value for useMarkerColorForValues.
	 */
	abstract Boolean isUseMarkerColorForValues();

	/**
	 * Set useMarkerColorForValues property.
	 * @param useMarkerColorForValues Use or not use markerColor for values.
	 */
	abstract void setUseMarkerColorForValues(Boolean useMarkerColorForValues);

	/**
	 * Get valueAlign property.<br>
	 * Default: right.
	 * @return String Value for valueAlign.
	 */
	abstract String getValueAlign();

	/**
	 * Set valueAlign property.
	 * @param valueAlign Value for valueAlign.
	 */
	abstract void setValueAlign(ValueAlign valueAlign);

	/**
	 * Get valueFunction property.
	 * @return String Value for valueFunction.
	 */
	abstract String getValueFunction();

	/**
	 * Set valueFunction property.
	 * @param valueFunction Value for valueFunction.
	 */
	abstract void setValueFunction(String valueFunction);

	/**
	 * Get valueText property.<br>
	 * Default: [[value]]
	 * @return String Value for valueText.
	 */
	abstract String getValueText();

	/**
	 * Set valueText property.
	 * @param valueText Value for valueText.
	 */
	abstract void setValueText(String valueText);

	/**
	 * Get valueWidth property.<br>
	 * Default: 50.
	 * @return Object Value for valueWidth is an integer number.
	 */
	abstract Object getValueWidth();

	/**
	 * Set valueWidth property.With improvedVisibility enabled range activated.
	 * @param valueWidth Value for valueWidth.
	 * @throws OutOfRangeException Value out or range admitted: 0-50.
	 */
	abstract void setValueWidth(Number valueWidth) throws OutOfRangeException;

	/**
	 * Get verticalGap property.<br>
	 * Default: 10
	 * @return Object Value for verticalGap is an integer number.
	 */
	abstract Object getVerticalGap();

	/**
	 * Set verticalGap property.With improvedVisibility enabled range activated.
	 * @param verticalGap Value for verticalGap.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setVerticalGap(Number verticalGap) throws OutOfRangeException;

	/**
	 * Get width property.
	 * @return Object Value for width is an integer number.
	 */
	abstract Object getWidth();

	/**
	 * Set width property.
	 * @param width Value for width.
	 * @throws IntegerException Value for width is not an integer number.
	 */
	abstract void setWidth(Number width) throws IntegerException;

}