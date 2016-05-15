package es.uvigo.esei.amchartsjava.core.api.charts;

import java.util.HashMap;
import java.util.List;


import java.util.Map;

import es.uvigo.esei.amchartsjava.core.constants.CreditsPosition;
import es.uvigo.esei.amchartsjava.core.constants.Separator;
import es.uvigo.esei.amchartsjava.core.controllers.AmBalloonController;
import es.uvigo.esei.amchartsjava.core.controllers.AmLegendController;
import es.uvigo.esei.amchartsjava.core.controllers.LabelController;
import es.uvigo.esei.amchartsjava.core.controllers.TitleController;
import es.uvigo.esei.amchartsjava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsjava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsjava.core.model.AmChart;

/**
 * 
 * Interface for controller of AmChart. Details of AmChart and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmchartController<E extends AmChart> {

	
	/**
	 * Get name of chartFields used by user.
	 * @return Relation between name of chartFields AmCharts and nameFields used by user.
	 */
	abstract Map<String,String> getChartFields();
	
	/**
	 * Set name of chartFields used by user.
	 * @param map name of chartFields user.
	 */
	abstract void setChartFields(HashMap<String, String> map);
	
	/**
	 * Get export property.
	 * @return Config of export as rawString, always is AmCharts.exportCFG
	 */
	abstract Object getExport();
	
	/**
	 * Get addClassNames property.<br>
	 * Default: false.
	 * @return Value of addClassNames.
	 */
	abstract Boolean IsAddClassNames();

	/**
	 * Set addClassNames property.
	 * @param addClassNames Enable or disable class names.
	 */
	abstract void setAddClassNames(Boolean addClassNames);
	
	/**
	 * Get autoResize property.<br>
	 * Default: true.
	 * @return Value of autoResize.
	 */
	abstract Boolean isAutoResize();
	
	/**
	 * Set autoResize property.
	 * @param autoResize Enable or disable autoResize.
	 */
	abstract void setAutoResize(Boolean autoResize);

	/**
	 * Get backgroundAlpha property.<br>
	 * Default: 0.
	 * @return Value of backgroundAlpha.
	 */
	abstract Double getBackgroundAlpha();

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
	 * @return Value of backgroundColor.
	 */
	abstract String getBackgroundColor();

	/**
	 * Set backgroundColor property.
	 * @param backgroundColor Value for backgroundColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setBackgroundColor(String backgroundColor)
			throws ColorException;

	/**
	 * Get borderAlpha property.<br>
	 * Default: 0.
	 * @return Value of borderAlpha.
	 */
	abstract Double getBorderAlpha();

	/**
	 * Set borderAlpha property.
	 * @param borderAlpha Value for borderAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setBorderAlpha(Number borderAlpha) throws OutOfRangeException;

	/**
	 * Get borderColor property.<br>
	 * Default: #000000
	 * @return Value of borderColor.
	 */
	abstract String getBorderColor();

	/**
	 * Set borderColor property.
	 * @param borderColor Value for borderColor.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setBorderColor(String borderColor) throws ColorException;

	/**
	 * Get classNamePrefix property.<br>
	 * Default: amcharts.
	 * @return Value of classNamePrefix.
	 */
	abstract String getClassNamePrefix();

	/**
	 * Set classNamePrefix property.
	 * @param classNamePrefix Value for classNamePrefix.
	 */
	abstract void setClassNamePrefix(String classNamePrefix);

	/**
	 * Get color property.<br>
	 * Default: #000000.
	 * @return Value of color.
	 */
	abstract String getColor();

	/**
	 * Set color property.
	 * @param color Value for color.
	 * @throws ColorException Format color doesn't admitted, format admitted: #ffffff
	 */
	abstract void setColor(String color) throws ColorException;

	/**
	 * Get creditsPosition property.<br>
	 * Default: top-left.
	 * @return Value of creditsPosition.
	 */
	abstract String getCreditsPosition();

	/**
	 * Set creditsPosition property.
	 * @param creditsPosition Value for creditsPosition.
	 */
	abstract void setCreditsPosition(CreditsPosition creditsPosition);

	/**
	 * Get decimalSeparator property.<br>
	 * Default: .
	 * @return Value of decimalSeparator.
	 */
	abstract String getDecimalSeparator();

	/**
	 * Set decimalSeparator property.
	 * @param decimalSeparator Value for decimalSeparator.
	 */
	abstract void setDecimalSeparator(Separator decimalSeparator);

	/**
	 * Get fontFamily property.<br>
	 * Default: Verdana.
	 * @return Value of fontFamily.
	 */
	abstract String getFontFamily();

	/**
	 * Set fontFamily property.
	 * @param fontFamily Value for fontFamily.
	 */
	abstract void setFontFamily(String fontFamily);

	/**
	 * Get fontSize property.<br>
	 * Default: 11.
	 * @return Value of fontSize.
	 */
	abstract Integer getFontSize();

	/**
	 * Set fontSize property.With improvedVisibility enabled range activated.
	 * @param fontSize Value for fontSize.
	 * @throws OutOfRangeException Value out of range admitted: 10-16.
	 */
	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	/**
	 * Get handDrawn property.<br>
	 * Default: false.
	 * @return Value of handDrawn.
	 */
	abstract Boolean isHandDrawn();

	/**
	 * Set handDrawn property.
	 * @param handDrawn Enable or disable handDrawn.
	 */
	abstract void setHandDrawn(Boolean handDrawn);

	/**
	 * Get handDrawScatter property.<br>
	 * Default: 2.
	 * @return Value of handDrawScatter.
	 */
	abstract Integer getHandDrawScatter();

	/**
	 * Set handDrawScatter property.With improvedVisibility enabled range activated.
	 * @param handDrawScatter Value for handDrawScatter.
	 * @throws OutOfRangeException Value out of range admitted: 2-10.
	 */
	abstract void setHandDrawScatter(Number handDrawScatter)
			throws OutOfRangeException;

	/**
	 * Get handDrawThickness property.<br>
	 * Default: 1.
	 * @return Value of handDrawThickness.
	 */
	abstract Integer getHandDrawThickness();

	/**
	 * Set handDrawThickness property.With improvedVisibility enabled range activated.
	 * @param handDrawThickness Value for handDrawThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-5.
	 */
	abstract void setHandDrawThickness(Number handDrawThickness)
			throws OutOfRangeException;

	/**
	 * Get hideBalloonTime property.<br>
	 * Default: 150.
	 * @return Value of hideBalloonTime.
	 */
	abstract Integer getHideBalloonTime();

	/**
	 * Set hideBalloonTime property.
	 * @param hideBalloonTime Value for hideBalloonTime.
	 * @throws IntegerException Value for hideBalloonTime is not an integer number.
	 */
	abstract void setHideBalloonTime(Number hideBalloonTime)
			throws IntegerException;

	/**
	 * Get panEventsEnabled property.<br>
	 * Default: true.
	 * @return Value of panEventsEnabled.
	 */
	abstract Boolean isPanEventsEnabled();

	/**
	 * Set panEventsEnabled property.
	 * @param panEventsEnabled Enable or disable panEvents.
	 */
	abstract void setPanEventsEnabled(Boolean panEventsEnabled);
	
	/**
	 * Get path property.<br>
	 * Default: ./amcharts/amcharts.
	 * @return Value for path.
	 * @see es.uvigo.esei.amchartsjava.core.constants.paths.AmchartsJavaPaths
	 */
	abstract String getPath();
	
	/**
	 * Set path property.
	 * @param path Value for path.
	 */
	abstract void setPath(String path);

	/**
	 * Get pathToImages property.
	 * @deprecated Since amcharts version 3.14.12 pathToImages is set auto related to path property.
	 * @return Value of pathToImages.
	 */
	abstract String getPathToImages();

	/**
	 * Set pathToImages property.
	 * @deprecated Since amcharts version 3.14.12.
	 * @param pathToImages Value for pathToImages.
	 */
	abstract void setPathToImages(String pathToImages);

	/**
	 * Get percentPrecision property.<br>
	 * Default: 2.
	 * @return Value of percentPrecision.
	 */
	abstract Integer getPercentPrecision();

	/**
	 * Set percentPrecision property.
	 * @param percentPrecision Value for percentPrecision.
	 * @throws OutOfRangeException Value out of range admitted: -1 to 2.
	 */
	abstract void setPercentPrecision(Number percentPrecision)
			throws OutOfRangeException;

	/**
	 * Get precision property.<br>
	 * Default: -1.
	 * @return Value of precision.
	 */
	abstract Integer getPrecision();

	/**
	 * Set precision property.
	 * @param precision Value for precision.
	 * @throws OutOfRangeException Value out of range admitted: -1 to 2.
	 */
	abstract void setPrecision(Number precision) throws OutOfRangeException;

	/**
	 * Get theme property.<br>
	 * Default: none.
	 * @return Value of theme.
	 */
	abstract String getTheme();

	/**
	 * Set theme property.
	 * @param theme Name theme without extension.
	 */
	abstract void setTheme(String theme);

	/**
	 * Get thousandsSeparator property.<br>
	 * Default: ,
	 * @return Value of thousandsSeparator.
	 */
	abstract String getThousandsSeparator();

	/**
	 * Set thousandsSeparator property.
	 * @param thousandsSeparator Value for thousandsSeparator.
	 */
	abstract void setThousandsSeparator(Separator thousandsSeparator);

	/**
	 * Get type property.
	 * @return Value of type.
	 */
	abstract String getType();

	/**
	 * Get usePrefixes property.<br>
	 * Default: false.
	 * @return Value of usePrefixes.
	 */
	abstract Boolean isUsePrefixes();

	/**
	 * Set usePrefixes property.
	 * @param usePrefixes Enable or disable prefixes.
	 */
	abstract void setUsePrefixes(Boolean usePrefixes);

	/**
	 * Get titles property.
	 * @return Controllers for titles.
	 */
	abstract List<TitleController> getTitles();

	/**
	 * Get allLabels property.
	 * @return Controllers for labels.
	 */
	abstract List<LabelController> getAllLabels();

	/**
	 * Get balloon property.
	 * @return AmBalloonController Controller for AmBalloon.
	 */
	abstract AmBalloonController getBalloon();

	/**
	 * Get legend property.
	 * @return AmLegendController Controller for AmLegend.
	 */
	abstract AmLegendController getLegend();

	/**
	 * Add a label to chart.
	 * @param labelController Controller for Label.
	 */
	abstract void addLabel(LabelController labelController);

	/**
	 * Add a legend to chart.
	 * @param amLegendController Controller for AmLegend.
	 */
	abstract void addLegend(AmLegendController amLegendController);

	/**
	 * Add a title to chart.
	 * @param titleController Controller for Title.
	 */
	abstract void addTitle(TitleController titleController);

	/**
	 * Add a balloon to chart.
	 * @param amBalloon Controller for AmBalloon.
	 */
	abstract void addBalloon(AmBalloonController amBalloon);

	/**
	 * Remove all labels from chart.
	 */
	abstract void clearLabels();

	/**
	 * Remove legend from chart.
	 */
	abstract void removeLegend();

}