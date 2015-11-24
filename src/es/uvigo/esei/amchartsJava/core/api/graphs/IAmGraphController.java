package es.uvigo.esei.amchartsJava.core.api.graphs;



import java.util.Map;

import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.BulletConstant.Bullet;
import es.uvigo.esei.amchartsJava.core.constants.OrientationConstant.Orientation;
import es.uvigo.esei.amchartsJava.core.constants.GraphTypesConstant.GraphType;
import es.uvigo.esei.amchartsJava.core.constants.LabelAnchorConstant.LabelAnchor;
import es.uvigo.esei.amchartsJava.core.constants.LabelPositionConstant.LabelPosition;
import es.uvigo.esei.amchartsJava.core.constants.LegendPeriodValueTextConstant.LegendPeriodValueText;
import es.uvigo.esei.amchartsJava.core.constants.MarkerTypeConstant.MarkerType;
import es.uvigo.esei.amchartsJava.core.constants.TagsTextConstant.TagsText;
import es.uvigo.esei.amchartsJava.core.constants.UrlTargetConstant.UrlTarget;
import es.uvigo.esei.amchartsJava.core.controllers.PatternController;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.MalFormedPatternException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;

/**
 * 
 * Interface for controller of AmGraph. Details of AmGraph and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmGraphController  {
	
	/**
	 * Set chart that use AmGraph.
	 * @param chart own of AmGraph.
	 */
	abstract void setChart(AmCoordinateChart chart);
	
	/**
	 * Get id property.
	 * @return String AmGraph id.
	 */
	abstract String getId();

	/**
	 * Get alphaField property.
	 * @return String Value for alphaField property.
	 */
	abstract String getAlphaField();

	/**
	 * Set alphaField property.
	 * @param alphaField Value for alphaField.
	 */
	abstract void setAlphaField(String alphaField);

	/**
	 * Get animationPlayed property.<br>
	 * Default: false.
	 * @return Boolean Value for animationPlayed.
	 */
	abstract Boolean isAnimationPlayed();

	/**
	 * Set animationPlayed property.
	 * @param animationPlayed Enable or disable animation.
	 */
	abstract void setAnimationPlayed(Boolean animationPlayed);

	/**
	 * Get balloonColor property.
	 * @return String Value for balloonColor.
	 */
	abstract String getBalloonColor();

	/**
	 * Set balloonColor property.
	 * @param balloonColor Value for balloonColor.
	 */
	abstract void setBalloonColor(ColorsAmCharts balloonColor);

	/**
	 * Get balloonFunction property.
	 * @return String Value for balloonFunction.
	 */
	abstract String getBalloonFunction();

	/**
	 * Set balloonFunction property.
	 * @param balloonFunction Value for balloonFunction.
	 */
	abstract void setBalloonFunction(String balloonFunction);
	
	/**
	 * Get balloonText property.<br>
	 * Default: [[value]]
	 * @return String Value for balloonText.
	 */
	abstract String getBalloonText();
	
	/**
	 * Set balloonText property.
	 * @param balloontext Value for ballonText.
	 */
	abstract void setBalloonText(String balloonText);

	/**
	 * Get bullet property.<br>
	 * Default: none.
	 * @return String Value for bullet.
	 */
	abstract String getBullet();

	/**
	 * Set bullet property.
	 * @param Value for bullet.
	 */
	abstract void setBullet(Bullet bullet);

	/**
	 * Get bulletAlpha property.<br>
	 * Default: 1.
	 * @return Object Value for bulletAlpha is a double number.
	 */
	abstract Object getBulletAlpha();

	/**
	 * Set bulletAlpha property.
	 * @param bulletAlpha Value for bulletAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setBulletAlpha(Number bulletAlpha) throws OutOfRangeException;

	/**
	 * Get bulletBorderAlpha property.<br>
	 * Default: 0.
	 * @return Object Value for bulletBorderAlpha is a double number.
	 */
	abstract Object getBulletBorderAlpha();

	/**
	 * Set bulletBorderAlpha property.
	 * @param bulletBorderAlpha Value for bulletBorderAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setBulletBorderAlpha(Number bulletBorderAlpha)
			throws OutOfRangeException;

	/**
	 * Get bulletBorderColor property.
	 * @return String Value for bulletBorderColor.
	 */
	abstract String getBulletBordeColor();

	/**
	 * Set bulletBorderColor property.
	 * @param bulletBorderColor Value for bulletBorderColor.
	 */
	abstract void setBulletBorderColor(ColorsAmCharts bulletBorderColor);

	/**
	 * Get bulletBorderThickness property.<br>
	 * Default: 2.
	 * @return Object Value for bulletBorderThickness is an integer number.
	 */
	abstract Object getBulletBorderThickness();

	/**
	 * Set bulletBorderThickness property.With improvedVisibility enabled, range activated.
	 * @param bulletBorderThickness Value for bulletBorderThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-5.
	 */
	abstract void setBulletBorderThickness(Number bulletBorderThickness)
			throws OutOfRangeException;

	/**
	 * Get bulletColor property.
	 * @return String Value for bulletColor.
	 */
	abstract String getBulletColor();

	/**
	 * Set bulletColor property.
	 * @param bulletColor Value for bulletColor.
	 */
	abstract void setBulletColor(ColorsAmCharts bulletColor);

	/**
	 * Get bulletField property.
	 * @return String Value for bulletField.
	 */
	abstract String getBulletField();

	/**
	 * Set bulletField property.
	 * @param bulletField Value for bulletField.
	 */
	abstract void setBulletField(String bulletField);

	/**
	 * Get bulletOffset property.<br>
	 * Default: 0.
	 * @return Object Value for bulletOffset is an integer number.
	 */
	abstract Object getBulletOffset();

	/**
	 * Set bulletOffset property.With improvedVisibility enabled range activated.
	 * @param bulletOffset Value for bulletOffset.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setBulletOffset(Number bulletOffset) throws OutOfRangeException;

	/**
	 * Get bulletSize property.<br>
	 * Default: 8.
	 * @return Object Value for bulletSize is an integer number.
	 */
	abstract Object getBulletSize();

	/**
	 * Set bulletSize property.With improvedVisibility enabled range activated.
	 * @param bulletSize Value for bulletSize.
	 * @throws OutOfRangeException Value out of range admitted: 5-36
	 */
	abstract void setBulletSize(Number bulletSize) throws OutOfRangeException;

	/**
	 * Get bulletSizeField property.
	 * @return String Value for bulletSizeField.
	 */
	abstract String getBulletSizeField();

	/**
	 * Set bulletSizeField property.
	 * @param bulletSizeField Value for bulletSizeField.
	 */
	abstract void setBulletSizeField(String bulletSizeField);

	/**
	 * Get closeField property.
	 * @return String Value for closeField.
	 */
	abstract String getCloseField();

	/**
	 * Set closeField property.
	 * @param closeField Value for closeField.
	 */
	abstract void setCloseField(String closeField);

	/**
	 * Get color property.
	 * @return String Value for color.
	 */
	abstract String getColor();

	/**
	 * Set color property.
	 * @param color Value for color.
	 */
	abstract void setColor(ColorsAmCharts color);

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
	 * Get cursorBulletAlpha property.<br>
	 * Default: 1.
	 * @return Object Value for cursorBulletAlpha is a double number.
	 */
	abstract Object getCursorBulletAlpha();

	/**
	 * Set cursorBulletAlpha property.
	 * @param cursorBulletAlpha Value for cursorBulletAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setCursorBulletAlpha(Number cursorBulletAlpha)
			throws OutOfRangeException;

	//path to image custom bullet
	/**
	 * Get customBullet property.
	 * @return String Value for customBullet.
	 */
	abstract String getCustomBullet();

	//FALTA VALIDAR PATH
	/**
	 * Set customBullet property.
	 * @param customBullet Value for customBullet.
	 */
	abstract void setCustomBullet(String customBullet);

	/**
	 * Get customBulletField property.
	 * @return String Value for customBulletField.
	 */
	abstract String getCustomBulletField();

	/**
	 * Set customBulletField property.
	 * @param customBulletField Value for customBulletField.
	 */
	abstract void setCustomBulletField(String customBulletField);

	//FALTA VALIDAR PATH
	/**
	 * Get customMarker property.
	 * @return String Value for customMarker.
	 */
	abstract String getCustomMarker();

	/**
	 * Set customMarker property.
	 * @param customMarker Value for customMarker. 
	 */
	abstract void setCustomMarker(String customMarker);

	/**
	 * Get dateFormat property.<br>
	 * Default: MMM DD, YYYY
	 * @return String Value for dateFormat.
	 */
	abstract String getDateFormat();

	//escogido de DateFormatConstant, filtrar a nivel interfaz, 
	// si se usa sin interfaz propia o sin ninguna interfaz no se realiza ningún cambio
	/**
	 * Set dateFormat property.
	 * @param Value for dateFormat.
	 * @see es.uvigo.esei.amchartsJava.core.constants.DateFormatConstant
	 */
	abstract void setDateFormat(String dateFormat);

	/**
	 * Get descriptionField property.
	 * @return String Value for descriptionField.
	 */
	abstract String getDescriptionField();

	/**
	 * Set descriptionField property.
	 * @param descriptionField Value for descriptionField.
	 */
	abstract void setDescriptionField(String descriptionField);

	/**
	 * Get errorField property.
	 * @return String Value for errorField.
	 */
	abstract String getErrorField();

	/**
	 * Set errorField property.
	 * @param errorField Value for errorField.
	 */
	abstract void setErrorField(String errorField);

	/**
	 * Get fillAlphas property.<br>
	 * Default: 0.
	 * @return Object Value for fillAlphas is a double number.
	 */
	abstract Object getFillAlphas();

	/**
	 * Set fillAlphas property.
	 * @param fillAlphas Value for fillAlphas.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setFillAlphas(Number fillAlphas) throws OutOfRangeException;

	/**
	 * Get fillToGraph property.
	 * @return String AmGraph id.
	 */
	abstract String getFillToGraph();

	
	/**
	 * Set fillToGraph property.
	 * @param fillToGraph Graph id of another graph.
	 * @throws ChartException chart doesn't use a graph with id equals to fillToGraph.
	 */
	abstract void setFillToGraph(String fillToGraph) throws ChartException;

	/**
	 * Get fontSize property.
	 * @return Object Value for fontSize is an integer number.
	 */
	abstract Object getFontSize();

	/**
	 * Set fontSize property.With improvedVisibility enabled, range activated.
	 * @param fontSize Value for fontSize.
	 * @throws OutOfRangeException Value out of range admitted: 10-36.
	 */
	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	/**
	 * Get gapPeriod property.<br>
	 * Default: 1.1.
	 * @return Object Value for gapPeriod is a double number.
	 */
	abstract Object getGapPeriod();

	/**
	 * Set gapPeriod property.
	 * @param gapPeriod Value for gapPeriod.
	 * @throws DoubleException Value for gapPeriod is not a double number.
	 */
	abstract void setGapPeriod(Number gapPeriod) throws DoubleException;

	/**
	 * Get gradientOrientation property.<br>
	 * Default: vertical.
	 * @return String Value for gradientOrientation.
	 */
	abstract String getGradientOrientation();

	/**
	 * Set gradientOrientation property.
	 * @param Value for gradientOrientation.
	 */
	abstract void setGradientOrientation(Orientation gradientOrientation);

	/**
	 * Get hidden property.<br>
	 * Default: false.
	 * @return Boolean Value for hidden.
	 */
	abstract Boolean isHidden();

	/**
	 * Set hidden property.
	 * @param hidden Show or hide graph.
	 */
	abstract void setHidden(Boolean hidden);

	/**
	 * Get hideBulletsCount property.<br>
	 * Default: 0.
	 * @return Object Value for hideBulletsCount property is an integer number.
	 */
	abstract Object getHideBulletsCount();

	/**
	 * Set hideBulletsCount property.
	 * @param hideBulletsCount Value for hideBulletsCount.
	 * @throws IntegerException Value for hideBulletsCount is not an integer number.
	 */
	abstract void setHideBulletsCount(Number hideBulletsCount)
			throws IntegerException;

	/**
	 * Get includeInMinMax property.<br>
	 * Default: true.
	 * @return Boolean Value for includeInMinMax.
	 */
	abstract Boolean isIncludeInMinMax();

	/**
	 * Set includeInMinMax property.
	 * @param includeInMinMax Enable or disable includeInMinMax.
	 */
	abstract void setIncludeInMinMax(Boolean includeInMinMax);

	/**
	 * Get labelAnchor property.<br>
	 * Default: auto.
	 * @return String Value for labelAnchor.
	 */
	abstract String getLabelAnchor();

	/**
	 * Set labelAnchor property.
	 * @param labelAnchor Value for labelAnchor.
	 */
	abstract void setLabelAnchor(LabelAnchor labelAnchor);

	/**
	 * Get labelColorField property.
	 * @return String Value for labelColorField.
	 */
	abstract String getLabelColorField();

	/**
	 * Set labelColorField property.
	 * @param labelColorField Value for labelColorField.
	 */
	abstract void setLabelColorField(String labelColorField);

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
	 * Get labelOffset property.<br>
	 * Default: 0.
	 * @return Object Value for labelOffset is an integer number.
	 */
	abstract Object getLabelOffset();

	/**
	 * Set labelOffset property.With improvedVisibility enabled, range activated.
	 * @param labelOffset Value for labelOffset.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setLabelOffset(Number labelOffset) throws OutOfRangeException;

	/**
	 * Get labelPosition property.
	 * @return String Value for labelPosition.
	 */
	abstract String getLabelPosition();

	/**
	 * Set labelPosition property.
	 * @param labelPosition Value for labelPosition.
	 */
	abstract void setLabelPosition(LabelPosition labelPosition);

	/**
	 * Get labelRotation property.
	 * @return Object Value for labelRotation is an integer number.
	 */
	abstract Object getLabelRotation();

	/**
	 * Set labelRotation property.
	 * @param labelRotation Value for labelRotation.
	 * @throws OutOfRangeException Value out of range admitted: 0-360.
	 */
	abstract void setLabelRotation(Number labelRotation)
			throws OutOfRangeException;

	/**
	 * Get labelText property.
	 * @return String Value for labelText.
	 */
	abstract String getLabelText();

	/**
	 * Set labelText property.
	 * @param labelText Value for labelText.
	 */
	abstract void setLabelText(TagsText labelText);

	/**
	 * Get legendAlpha property.
	 * @return Object Value for legendAlpha is a double number.
	 */
	abstract Object getLegendAlpha();

	/**
	 * Set legendAlpha property.
	 * @param legendAlpha Value for legendAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setLegendAlpha(Number legendAlpha) throws OutOfRangeException;

	/**
	 * Get legendColor property.
	 * @return String Value for legendColor.
	 */
	abstract String getLegendColor();

	/**
	 * Set legendColor property.
	 * @param Value for legendColor.
	 */
	abstract void setLegendColor(ColorsAmCharts legendColor);

	/**
	 * Get legendPeriodValueText property.
	 * @return String Value for legendPeriodValueText.
	 */
	abstract String getLegendPeriodValueText();

	/**
	 * Set legendPeriodValueText property.
	 * @param legendPeriodValueText Value for legendPeriodValueText.
	 */
	abstract void setLegendPeriodValueText(
			LegendPeriodValueText legendPeriodValueText);

	/**
	 * Get legendValueText property.
	 * @return String Value for legendValueText.
	 */
	abstract String getLegendValueText();

	/**
	 * Set legendValueText property.
	 * @param Value for legendValueText.
	 */
	abstract void setLegendValueText(TagsText legendValueText);

	/**
	 * Get lineAlpha property.<br>
	 * Default: 1.
	 * @return Object Value for lineAlpha is a double number.
	 */
	abstract Object getLineAlpha();

	/**
	 * Set lineAlpha property.
	 * @param lineAlpha Value for lineAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setLineAlpha(Number lineAlpha) throws OutOfRangeException;

	/**
	 * Get markerType property.
	 * @return String Value for markerType.
	 */
	abstract String getMakerType();

	/**
	 * Set markerType property.
	 * @param markerType Value for markerType.
	 */
	abstract void setMarkerType(MarkerType markerType);

	/**
	 * Get minDistance property.<br>
	 * Default: 1.
	 * @return Object Value for minDistance is an integer number.
	 */
	abstract Object getMinDistance();

	/**
	 * Set minDistance property.With improvedVisibility enabled, range activated.
	 * @param minDistance Value for minDistance.
	 * @throws OutOfRangeException Value out of range admitted: 0-100.
	 */
	abstract void setMinDistance(Number minDistance) throws OutOfRangeException;

	/**
	 * Get negativeBase property.<br>
	 * Default: 0.
	 * @return Object Value for negativeBase is an integer number.
	 */
	abstract Object getNegativeBase();

	/**
	 * Set negativeBase property.
	 * @param negativeBase Value for negativeBase.
	 * @throws IntegerException Value for negativeBase is not an integer number.
	 */
	abstract void setNegativeBase(Number negativeBase) throws IntegerException;

	/**
	 * Get negativeFillAlphas property.
	 * @return Object Value for negativeFillAlphas is a double number.
	 */
	abstract Object getNegativeFillAlphas();

	/**
	 * Set negativeFillAlphas property.
	 * @param negativeFillAlphas Value for negativeFillAlphas.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setNegativeFillAlphas(Number negativeFillAlhas)
			throws OutOfRangeException;

	/**
	 * Get negativeFillColors property.
	 * @return String Value for negativeFillColors.
	 */
	abstract String getNegativeFillColors();

	/**
	 * Set negativeFillColors property.
	 * @param negativeFillColors Value for negativeFillColors.
	 */
	abstract void setNegativeFillColors(ColorsAmCharts negativeFillColors);
	
	/**
	 * Get pattern property.
	 * @return PatterController Controller for pattern.
	 */
	abstract PatternController getPattern();
	
	/**
	 * Set pattern property.
	 * @param pattern Controller for pattern.
	 * @throws MalFormedPatternException Pattern hasn't url, height or width.
	 */
	abstract void setPattern(PatternController pattern) throws MalFormedPatternException;
	
	/**
	 * Get patternField property.
	 * @return String Value for patternField.
	 */
	abstract String getPatternField();
	
	/**
	 * Set patternField property.
	 * @param Value for patternField.
	 */
	abstract void setPatternField(String patternField);

	/**
	 * Get precision property.
	 * @return Object Value for precision is an integer number.
	 */
	abstract Object getPrecision();

	/**
	 * Set precision property.
	 * @param precision Value for precision.
	 * @throws OutOfRangeException Value out of range admitted: -1 to 2.
	 */
	abstract void setPrecision(Number precision) throws OutOfRangeException;

	/**
	 * Get proCandleSticks property.<br>
	 * Default: false.
	 * @return Boolean Value for proCandleSticks.
	 */
	abstract Boolean isProCandleSticks();

	/**
	 * Set proCandleSticks property.
	 * @param proCandleSticks Enable or disable proCandleSticks.
	 */
	abstract void setProCandleSticks(Boolean proCandleSticks);

	/**
	 * Get showAllValueLabels property.<br>
	 * Default: false.
	 * @return Boolean Value for showAllValueLabels.
	 */
	abstract Boolean isShowAllValueLabels();

	/**
	 * Set showAllValueLabels property.
	 * @param showAllValueLabels Show or don't show all valueLabels.
	 */
	abstract void setShowAllValueLabels(Boolean showAllValueLabels);

	/**
	 * Get showBalloon property.<br>
	 * Default: true.
	 * @return Boolean Value for showBalloon.
	 */
	abstract Boolean isShowBalloon();

	/**
	 * Set showBalloon property.
	 * @param showBalloon Show or hide balloon.
	 */
	abstract void setShowBalloon(Boolean showBalloon);

	/**
	 * Get showHandOnHover property.<br>
	 * Default: false.
	 * @return Boolean Value for showHandOnHover.
	 */
	abstract Boolean isShowHandOnHover();

	/**
	 * Set showHandOnHover property.
	 * @param showHandOnHover Show or hide handOnHover.
	 */
	abstract void setShowHandOnHover(Boolean showHandOnHover);

	/**
	 * Get showOnAxis property.<br>
	 * Default: false.
	 * @return Boolean Value for showOnAxis.
	 */
	abstract Boolean isShowOnAxis();

	/**
	 * Set showOnAxis property.
	 * @param showOnAxis Show or hide on axis.
	 */
	abstract void setShowOnAxis(Boolean showOnAxis);

	/**
	 * Get stackable property.<br>
	 * Default: true.
	 * @return Boolean Value for stackable.
	 */
	abstract Boolean isStackable();

	/**
	 * Set stackable property.
	 * @param stackable Enable or disable stackable.
	 */
	abstract void setStackable(Boolean stackable);

	/**
	 * Get switchable property.<br>
	 * Default: true.
	 * @return Boolean Value for switchable.
	 */
	abstract Boolean isSwitchable();

	/**
	 * Set switchable property.
	 * @param switchable Enable or disable switchable.
	 */
	abstract void setSwitchable(Boolean switchable);

	/**
	 * Get title property.
	 * @return String Graph title.
	 */
	abstract String getTitle();

	/**
	 * Set title property.
	 * @param title Value for title.
	 */
	abstract void setTitle(String title);

	/**
	 * Get type property.<br>
	 * Default: line.
	 * @return String Value for type.
	 */
	abstract String getType();

	/**
	 * Set type property.
	 * @param type Value for type.
	 */
	abstract void setType(GraphType type);

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
	 * Get urlTargert property.
	 * @return String Value for urlTarget.
	 */
	abstract String getUrlTarget();

	/**
	 * Set urlTarget property.
	 * @param urlTarget Value for urlTarget.
	 */
	abstract void setUrlTarget(UrlTarget urlTarget);

	/**
	 * Get valueAxis property.
	 * @return String ValueAxis id.
	 */
	abstract String getValueAxis();

	/**
	 * Set valueAxis property.
	 * @param valueAxis ValueAxis id.
	 * @throws ChartException chart that use graph doesn't use a graph with id equals to valueAxi.
	 */
	abstract void setValueAxis(String valueAxis) throws ChartException;

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
	 * Get visibleInLegend property.<br>
	 * Default: true.
	 * @return Boolean Value for visibleInLegend.
	 */
	abstract Boolean isVisibleInLegend();

	/**
	 * Set visibleInLegend property.
	 * @param Show or don't show in legend.
	 */
	abstract void setVisibleInLegend(Boolean visibleInLegend);

	/**
	 * Save a relation between nameFields used by user and nameFields amcharts.
	 * @param graphFields Map with key equals to nameField amcharts and value nameField used by user.
	 */
	abstract void setGraphFields(Map<String,String> graphFields);

	/**
	 * Get graphFields used by user.
	 * @return Map<String,String> Map or relation nameField amcharts- nameField user.
	 */
	abstract Map<String,String> getGraphFields();

}