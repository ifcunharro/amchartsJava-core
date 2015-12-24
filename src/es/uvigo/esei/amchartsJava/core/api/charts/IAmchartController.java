package es.uvigo.esei.amchartsJava.core.api.charts;

import java.util.HashMap;
import java.util.List;










import java.util.Map;

import es.uvigo.esei.amchartsJava.core.constants.ChartType;
import es.uvigo.esei.amchartsJava.core.constants.CreditsPosition;
import es.uvigo.esei.amchartsJava.core.constants.Separator;
import es.uvigo.esei.amchartsJava.core.constants.lang.Idioms;
import es.uvigo.esei.amchartsJava.core.controllers.AmBalloonController;
import es.uvigo.esei.amchartsJava.core.controllers.AmLegendController;
import es.uvigo.esei.amchartsJava.core.controllers.LabelController;
import es.uvigo.esei.amchartsJava.core.controllers.TitleController;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.AmChart;

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
	 * @return Object Config of export as rawString, always is AmCharts.exportCFG
	 */
	abstract Object getExport();
	
	/**
	 * Get addClassNames property.<br>
	 * Default: false.
	 * @return Boolean Value for addClassNames.
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
	 * @return Boolean Value for autoResize.
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
	 * @return Double Value for backgroundAlpha.
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
	 * @return String Value for backgroundColor.
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
	 * @return Double Value for borderAlpha.
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
	 * @return String Value for borderColor.
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
	 * @return String Value for classNamePrefix.
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
	 * @return String Value for color.
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
	 * @return String Value for creditsPosition.
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
	 * @return String Value for decimalSeparator.
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
	 * @return String Value for fontFamily.
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
	 * @return Integer Value for fontSize.
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
	 * @return Boolean Value for handDrawn.
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
	 * @return Integer Value for handDrawScatter.
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
	 * @return Value for handDrawThickness.
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
	 * @return Integer Value for hideBalloonTime.
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
	 * Get language property.
	 * @return String Value for language.
	 */
	abstract String getLanguage();

	/**
	 * Set language property.
	 * @param language Value for language.
	 */
	abstract void setLanguage(Idioms language);

	/**
	 * Get panEventsEnabled property.<br>
	 * Default: true.
	 * @return Boolean Value for panEventsEnabled.
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
	 * @return String Value for path.
	 * @see es.uvigo.esei.amchartsJava.core.constants.paths
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
	 * @return String Value for pathToImages.
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
	 * @return Integer Value for percentPrecision.
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
	 * @return Integer Value for precision.
	 */
	abstract Integer getPrecision();

	/**
	 * Set precision property.
	 * @param precision Value for precision.
	 * @throws OutOfRangeException Value out of range admitted: -1 to 2.
	 */
	abstract void setPrecision(Number precision) throws OutOfRangeException;

	//nombre file js in folder themes sin extension,
	//se puede crear el tuyo propio
	/**
	 * Get theme property.<br>
	 * Default: none.
	 * @return String Value for theme.
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
	 * @return String Value for thousandsSeparator.
	 */
	abstract String getThousandsSeparator();

	/**
	 * Set thousandsSeparator property.
	 * @param thousandsSeparator Value for thousandsSeparator.
	 */
	abstract void setThousandsSeparator(Separator thousandsSeparator);

	/**
	 * Get type property.
	 * @return String Value for type.
	 */
	abstract String getType();

	/**
	 * Set type property.
	 * @param type Value for type.
	 */
	abstract void setType(ChartType type);

	/**
	 * Get usePrefixes property.<br>
	 * Default: false.
	 * @return Boolean Value for usePrefixes.
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
	 * @return AmBalloonController Controller fo AmBalloon.
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