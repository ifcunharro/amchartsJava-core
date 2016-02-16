package es.uvigo.esei.amchartsJava.core.api.graphs;



import java.util.Map;

import es.uvigo.esei.amchartsJava.core.constants.ColorsAmCharts;
import es.uvigo.esei.amchartsJava.core.constants.Bullet;
import es.uvigo.esei.amchartsJava.core.constants.Orientation;
import es.uvigo.esei.amchartsJava.core.constants.GraphType;
import es.uvigo.esei.amchartsJava.core.constants.LabelAnchor;
import es.uvigo.esei.amchartsJava.core.constants.LabelPosition;
import es.uvigo.esei.amchartsJava.core.constants.LegendPeriodValueText;
import es.uvigo.esei.amchartsJava.core.constants.MarkerType;
import es.uvigo.esei.amchartsJava.core.constants.PointPositionGraph;
import es.uvigo.esei.amchartsJava.core.constants.ShowAt;
import es.uvigo.esei.amchartsJava.core.constants.TagsText;
import es.uvigo.esei.amchartsJava.core.constants.UrlTarget;
import es.uvigo.esei.amchartsJava.core.controllers.PatternController;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
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
	 * @return AmGraph id.
	 */
	abstract String getId();

	/**
	 * Get alphaField property.
	 * @return Value of alphaField.
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
	 * @return Value of animationPlayed.
	 */
	abstract Boolean isAnimationPlayed();

	/**
	 * Set animationPlayed property.
	 * @param animationPlayed Enable or disable animation.
	 */
	abstract void setAnimationPlayed(Boolean animationPlayed);

	/**
	 * Get balloonColor property.
	 * @return Value of balloonColor.
	 */
	abstract String getBalloonColor();

	/**
	 * Set balloonColor property.
	 * @param balloonColor Value for balloonColor.
	 */
	abstract void setBalloonColor(ColorsAmCharts balloonColor);

	/**
	 * Get balloonFunction property.
	 * @return Value of balloonFunction.
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
	 * @return Value of balloonText.
	 */
	abstract String getBalloonText();
	
	/**
	 * Set balloonText property.
	 * @param balloonText Value for ballonText.
	 */
	abstract void setBalloonText(String balloonText);

	/**
	 * Get bullet property.<br>
	 * Default: none.
	 * @return Value of bullet.
	 */
	abstract String getBullet();

	/**
	 * Set bullet property.
	 * @param bullet Value for bullet.
	 */
	abstract void setBullet(Bullet bullet);

	/**
	 * Get bulletAlpha property.<br>
	 * Default: 1.
	 * @return Value of bulletAlpha.
	 */
	abstract Double getBulletAlpha();

	/**
	 * Set bulletAlpha property.
	 * @param bulletAlpha Value for bulletAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setBulletAlpha(Number bulletAlpha) throws OutOfRangeException;

	/**
	 * Get bulletBorderAlpha property.<br>
	 * Default: 0.
	 * @return Value of bulletBorderAlpha.
	 */
	abstract Double getBulletBorderAlpha();

	/**
	 * Set bulletBorderAlpha property.
	 * @param bulletBorderAlpha Value for bulletBorderAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setBulletBorderAlpha(Number bulletBorderAlpha)
			throws OutOfRangeException;

	/**
	 * Get bulletBorderColor property.
	 * @return Value of bulletBorderColor.
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
	 * @return Value of bulletBorderThickness.
	 */
	abstract Integer getBulletBorderThickness();

	/**
	 * Set bulletBorderThickness property.With improvedVisibility enabled, range activated.
	 * @param bulletBorderThickness Value for bulletBorderThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-5.
	 */
	abstract void setBulletBorderThickness(Number bulletBorderThickness)
			throws OutOfRangeException;

	/**
	 * Get bulletColor property.
	 * @return Value of bulletColor.
	 */
	abstract String getBulletColor();

	/**
	 * Set bulletColor property.
	 * @param bulletColor Value for bulletColor.
	 */
	abstract void setBulletColor(ColorsAmCharts bulletColor);

	/**
	 * Get bulletField property.
	 * @return Value of bulletField.
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
	 * @return Value of bulletOffset.
	 */
	abstract Integer getBulletOffset();

	/**
	 * Set bulletOffset property.With improvedVisibility enabled range activated.
	 * @param bulletOffset Value for bulletOffset.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setBulletOffset(Number bulletOffset) throws OutOfRangeException;

	/**
	 * Get bulletSize property.<br>
	 * Default: 8.
	 * @return Value of bulletSize.
	 */
	abstract Integer getBulletSize();

	/**
	 * Set bulletSize property.With improvedVisibility enabled range activated.
	 * @param bulletSize Value for bulletSize.
	 * @throws OutOfRangeException Value out of range admitted: 5-36
	 */
	abstract void setBulletSize(Number bulletSize) throws OutOfRangeException;

	/**
	 * Get bulletSizeField property.
	 * @return Value of bulletSizeField.
	 */
	abstract String getBulletSizeField();

	/**
	 * Set bulletSizeField property.
	 * @param bulletSizeField Value for bulletSizeField.
	 */
	abstract void setBulletSizeField(String bulletSizeField);

	/**
	 * Get closeField property.
	 * @return Value of closeField.
	 */
	abstract String getCloseField();

	/**
	 * Set closeField property.
	 * @param closeField Value for closeField.
	 */
	abstract void setCloseField(String closeField);

	/**
	 * Get color property.
	 * @return Value of color.
	 */
	abstract String getColor();

	/**
	 * Set color property.
	 * @param color Value for color.
	 */
	abstract void setColor(ColorsAmCharts color);

	/**
	 * Get colorField property.
	 * @return Value of colorField.
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
	 * @return Value of cursorBulletAlpha.
	 */
	abstract Double getCursorBulletAlpha();

	/**
	 * Set cursorBulletAlpha property.
	 * @param cursorBulletAlpha Value for cursorBulletAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setCursorBulletAlpha(Number cursorBulletAlpha)
			throws OutOfRangeException;

	/**
	 * Get customBullet property.
	 * @return Value of customBullet.
	 */
	abstract String getCustomBullet();

	/**
	 * Set customBullet property.
	 * @param customBullet Value for customBullet is name image used as bullet.
	 */
	abstract void setCustomBullet(String customBullet);

	/**
	 * Get customBulletField property.
	 * @return String Value of customBulletField.
	 */
	abstract String getCustomBulletField();

	/**
	 * Set customBulletField property.
	 * @param customBulletField Value for customBulletField.
	 */
	abstract void setCustomBulletField(String customBulletField);

	/**
	 * Get customMarker property.
	 * @return Value of customMarker.
	 */
	abstract String getCustomMarker();

	/**
	 * Set customMarker property.
	 * @param customMarker Value for customMarker is name image used as marker. 
	 */
	abstract void setCustomMarker(String customMarker);

	/**
	 * Get dateFormat property.<br>
	 * Default: MMM DD, YYYY
	 * @return Value of dateFormat.
	 */
	abstract String getDateFormat();

	/**
	 * Set dateFormat property.
	 * @param dateFormat Value for dateFormat.
	 * @see es.uvigo.esei.amchartsJava.core.constants.DateFormatConstant
	 */
	abstract void setDateFormat(String dateFormat);

	/**
	 * Get descriptionField property.
	 * @return Value of descriptionField.
	 */
	abstract String getDescriptionField();

	/**
	 * Set descriptionField property.
	 * @param descriptionField Value for descriptionField.
	 */
	abstract void setDescriptionField(String descriptionField);

	/**
	 * Get errorField property.
	 * @return Value of errorField.
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
	 * @return Value of fillAlphas.
	 */
	abstract Double getFillAlphas();

	/**
	 * Set fillAlphas property.
	 * @param fillAlphas Value for fillAlphas.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setFillAlphas(Number fillAlphas) throws OutOfRangeException;

	/**
	 * Get fillToGraph property.
	 * @return AmGraph id.
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
	 * @return Value of fontSize.
	 */
	abstract Integer getFontSize();

	/**
	 * Set fontSize property.With improvedVisibility enabled, range activated.
	 * @param fontSize Value for fontSize.
	 * @throws OutOfRangeException Value out of range admitted: 10-36.
	 */
	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	/**
	 * Get gapPeriod property.<br>
	 * Default: 1.1.
	 * @return Value of gapPeriod.
	 */
	abstract Double getGapPeriod();

	/**
	 * Set gapPeriod property.
	 * @param gapPeriod Value for gapPeriod.
	 * @throws DoubleException Value for gapPeriod is not a double number.
	 */
	abstract void setGapPeriod(Number gapPeriod) throws DoubleException;

	/**
	 * Get gradientOrientation property.<br>
	 * Default: vertical.
	 * @return Value of gradientOrientation.
	 */
	abstract String getGradientOrientation();

	/**
	 * Set gradientOrientation property.
	 * @param gradientOrientation Value for gradientOrientation.
	 */
	abstract void setGradientOrientation(Orientation gradientOrientation);

	/**
	 * Get hidden property.<br>
	 * Default: false.
	 * @return Value of hidden.
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
	 * @return Value of hideBulletsCount.
	 */
	abstract Integer getHideBulletsCount();

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
	 * @return Value of includeInMinMax.
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
	 * @return Value of labelAnchor.
	 */
	abstract String getLabelAnchor();

	/**
	 * Set labelAnchor property.
	 * @param labelAnchor Value for labelAnchor.
	 */
	abstract void setLabelAnchor(LabelAnchor labelAnchor);

	/**
	 * Get labelColorField property.
	 * @return Value of labelColorField.
	 */
	abstract String getLabelColorField();

	/**
	 * Set labelColorField property.
	 * @param labelColorField Value for labelColorField.
	 */
	abstract void setLabelColorField(String labelColorField);

	/**
	 * Get labelFunction property.
	 * @return Value of labelFunction.
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
	 * @return Value of labelOffset.
	 */
	abstract Integer getLabelOffset();

	/**
	 * Set labelOffset property.With improvedVisibility enabled, range activated.
	 * @param labelOffset Value for labelOffset.
	 * @throws OutOfRangeException Value out of range admitted: 0-10.
	 */
	abstract void setLabelOffset(Number labelOffset) throws OutOfRangeException;

	/**
	 * Get labelPosition property.
	 * @return Value of labelPosition.
	 */
	abstract String getLabelPosition();

	/**
	 * Set labelPosition property.
	 * @param labelPosition Value for labelPosition.
	 */
	abstract void setLabelPosition(LabelPosition labelPosition);

	/**
	 * Get labelRotation property.
	 * @return Value of labelRotation.
	 */
	abstract Integer getLabelRotation();

	/**
	 * Set labelRotation property.
	 * @param labelRotation Value for labelRotation.
	 * @throws OutOfRangeException Value out of range admitted: 0-360.
	 */
	abstract void setLabelRotation(Number labelRotation)
			throws OutOfRangeException;

	/**
	 * Get labelText property.
	 * @return Value of labelText.
	 */
	abstract String getLabelText();

	/**
	 * Set labelText property.
	 * @param labelText Value for labelText.
	 */
	abstract void setLabelText(TagsText labelText);

	/**
	 * Get legendAlpha property.
	 * @return Value of legendAlpha.
	 */
	abstract Double getLegendAlpha();

	/**
	 * Set legendAlpha property.
	 * @param legendAlpha Value for legendAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setLegendAlpha(Number legendAlpha) throws OutOfRangeException;

	/**
	 * Get legendColor property.
	 * @return Value of legendColor.
	 */
	abstract String getLegendColor();

	/**
	 * Set legendColor property.
	 * @param legendColor Value for legendColor.
	 */
	abstract void setLegendColor(ColorsAmCharts legendColor);

	/**
	 * Get legendPeriodValueText property.
	 * @return Value of legendPeriodValueText.
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
	 * @return Value of legendValueText.
	 */
	abstract String getLegendValueText();

	/**
	 * Set legendValueText property.
	 * @param legendValueText Value for legendValueText.
	 */
	abstract void setLegendValueText(TagsText legendValueText);

	/**
	 * Get lineAlpha property.<br>
	 * Default: 1.
	 * @return Value of lineAlpha.
	 */
	abstract Double getLineAlpha();

	/**
	 * Set lineAlpha property.
	 * @param lineAlpha Value for lineAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setLineAlpha(Number lineAlpha) throws OutOfRangeException;

	/**
	 * Get markerType property.
	 * @return Value of markerType.
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
	 * @return Value of minDistance.
	 */
	abstract Integer getMinDistance();

	/**
	 * Set minDistance property.With improvedVisibility enabled, range activated.
	 * @param minDistance Value for minDistance.
	 * @throws OutOfRangeException Value out of range admitted: 0-100.
	 */
	abstract void setMinDistance(Number minDistance) throws OutOfRangeException;

	/**
	 * Get negativeBase property.<br>
	 * Default: 0.
	 * @return Value of negativeBase.
	 */
	abstract Integer getNegativeBase();

	/**
	 * Set negativeBase property.
	 * @param negativeBase Value for negativeBase.
	 * @throws IntegerException Value for negativeBase is not an integer number.
	 */
	abstract void setNegativeBase(Number negativeBase) throws IntegerException;

	/**
	 * Get negativeFillAlphas property.
	 * @return Value of negativeFillAlphas.
	 */
	abstract Double getNegativeFillAlphas();

	/**
	 * Set negativeFillAlphas property.
	 * @param negativeFillAlphas Value for negativeFillAlphas.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setNegativeFillAlphas(Number negativeFillAlphas)
			throws OutOfRangeException;

	/**
	 * Get negativeFillColors property.
	 * @return Value of negativeFillColors.
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
	 * @return Value of patternField.
	 */
	abstract String getPatternField();
	
	/**
	 * Set patternField property.
	 * @param patternField Value for patternField.
	 */
	abstract void setPatternField(String patternField);

	/**
	 * Get precision property.
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
	 * Get proCandleSticks property.<br>
	 * Default: false.
	 * @return Value of proCandleSticks.
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
	 * @return Value of showAllValueLabels.
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
	 * @return Value of showBalloon.
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
	 * @return Value of showHandOnHover.
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
	 * @return Value of showOnAxis.
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
	 * @return Value of stackable.
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
	 * @return Value of switchable.
	 */
	abstract Boolean isSwitchable();

	/**
	 * Set switchable property.
	 * @param switchable Enable or disable switchable.
	 */
	abstract void setSwitchable(Boolean switchable);

	/**
	 * Get title property.
	 * @return Graph title.
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
	 * @return Value of type.
	 */
	abstract String getType();

	/**
	 * Set type property.
	 * @param type Value for type.
	 */
	abstract void setType(GraphType type);

	/**
	 * Get urlField property.
	 * @return Value of urlField.
	 */
	abstract String getUrlField();

	/**
	 * Set urlField property.
	 * @param urlField Value for urlField.
	 */
	abstract void setUrlField(String urlField);

	/**
	 * Get urlTargert property.
	 * @return Value of urlTarget.
	 */
	abstract String getUrlTarget();

	/**
	 * Set urlTarget property.
	 * @param urlTarget Value for urlTarget.
	 */
	abstract void setUrlTarget(UrlTarget urlTarget);

	/**
	 * Get valueAxis property.
	 * @return ValueAxis id.
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
	 * @return Value of valueField.
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
	 * @return Value of visibleInLegend.
	 */
	abstract Boolean isVisibleInLegend();

	/**
	 * Set visibleInLegend property.
	 * @param visibleInLegend Show or don't show in legend.
	 */
	abstract void setVisibleInLegend(Boolean visibleInLegend);

	/**
	 * Save a relation between nameFields used by user and nameFields amcharts.
	 * @param graphFields Map with key equals to nameField amcharts and value nameField used by user.
	 */
	abstract void setGraphFields(Map<String,String> graphFields);

	/**
	 * Get graphFields used by user.
	 * @return Map or relation nameField amcharts- nameField user.
	 */
	abstract Map<String,String> getGraphFields();
	
	/**
	 * Get behindColumns property.<br>
	 * Default: false.
	 * @return Value of behindColumns.
	 */
	abstract Boolean isBehindColumns();

	/**
	 * Set behindColumns property.
	 * @param behindColumns Enable or disable behindColumns.
	 */
	abstract void setBehindColumns(Boolean behindColumns);

	/**
	 * Get clustered property.<br>
	 * Default: true.
	 * @return Value of clustered.
	 */
	abstract Boolean isClustered();

	/**
	 * Set clustered property.
	 * @param clustered Enable or disable clustered.
	 */
	abstract void setClustered(Boolean clustered);

	/**
	 * Get columnWidth property.
	 * @return Value of columnWidth.
	 */
	abstract Double getColumnWidth();

	/**
	 * Set columnWidth property.
	 * @param columnWidth Value for columWidth.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setColumnWidth(Number columnWidth) throws OutOfRangeException;

	/**
	 * Get cornerRadiusTop property.<br>
	 * Default: 0.
	 * @return Value of cornerRadiusTop.
	 */
	abstract String getCornerRadiusTop();

	/**
	 * Set cornerRadiusTop property.
	 * @param cornerRadiusTop Value for cornerRadiusTop.
	 * @throws CoordException Value for cornerRadiusTop is not an integer number or a percent.
	 */
	abstract void setCornerRadiusTop(String cornerRadiusTop)
			throws CoordException;

	/**
	 * Get dashLength property.<br>
	 * Default: 0.
	 * @return Value of dashLength.
	 */
	abstract Double getDashLength();

	/**
	 * Set dashLength property.
	 * @param dashLength Value for dashLength.
	 */
	abstract void setDashLength(Number dashLength);

	/**
	 * Get dashLengthField property.
	 * @return Value of dashLengthField.
	 */
	abstract String getDashLengthField();

	/**
	 * Set dashLengthField property.
	 * @param dashLengthField Value for dashLengthField.
	 */
	abstract void setDashLengthField(String dashLengthField);

	/**
	 * Get fixedColumnWidth property.
	 * @return Value of fixedColumnWidth.
	 */
	abstract Integer getFixedColumnWidth();

	/**
	 * Set fixedColumnWidth property.
	 * @param fixedColumnWidth Value for fixedColumnWidth.
	 * @throws IntegerException Value for fixedColumnWidth is not an integer number.
	 */
	abstract void setFixedColumnWidth(Number fixedColumnWidth)
			throws IntegerException;

	/**
	 * Get lineColor property.
	 * @return Value of lineColor.
	 */
	abstract String getLineColor();

	/**
	 * Set lineColor property.
	 * @param lineColor Value for lineColor.
	 */
	abstract void setLineColor(ColorsAmCharts lineColor);

	/**
	 * Get lineColorField property.
	 * @return Value of lineColorField.
	 */
	abstract String getLineColorField();

	/**
	 * Set lineColorField property.
	 * @param lineColorField Value for lineColorField.
	 */
	abstract void setLineColorField(String lineColorField);

	/**
	 * Get lineThickness property.<br>
	 * Default: 1.
	 * @return Value of lineThickness.
	 */
	abstract Integer getLineThickness();

	/**
	 * Set lineThickness property.With improvedVisibility enabled, range activated.
	 * @param lineThickness Value for lineThickness.
	 * @throws OutOfRangeException Value out of range admitted: 0-12.
	 */
	abstract void setLineThickness(Number lineThickness) throws OutOfRangeException;

	/**
	 * Get negativeLineAlpha property.<br>
	 * Default: 1.
	 * @return Value of negativeLineAlpha.
	 */
	abstract Double getNegativeLineAlpha();

	/**
	 * Set negativeLineAlpha property.
	 * @param negativeLineAlpha Value for negativeLineAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setNegativeLineAlpha(Number negativeLineAlpha)
			throws OutOfRangeException;

	/**
	 * Get negativeLineColor property.
	 * @return Value of negativeLineColor.
	 */
	abstract String getNegativeLineColor();

	/**
	 * Set negativeLineColor property.
	 * @param negativeLineColor Value for negativeLineColor.
	 */
	abstract void setNegativeLineColor(ColorsAmCharts negativeLineColor);

	/**
	 * Get newStack property.<br>
	 * Default: false.
	 * @return Value of newStack.
	 */
	abstract Boolean isNewStack();

	/**
	 * Set newStack property.
	 * @param newStack Enable or disable newStack.
	 */
	abstract void setNewStack(Boolean newStack);

	/**
	 * Get openField property.
	 * @return Value of openField.
	 */
	abstract String getOpenField();

	/**
	 * Set openField property.
	 * @param openField Value for openField.
	 */
	abstract void setOpenField(String openField);

	/**
	 * Get pointPosition property.<br>
	 * Default: middle.
	 * @return Value of pointPosition.
	 */
	abstract String getPointPosition();

	/**
	 * Set pointPosition property.
	 * @param pointPosition Value for pointPosition.
	 */
	abstract void setPointPosition(PointPositionGraph pointPosition);

	/**
	 * Get showBalloonAt property.<br>
	 * Default: close.
	 * @return Value of showBalloonAt.
	 */
	abstract String getShowBalloonAt();

	/**
	 * Set showBalloonAt property.
	 * @param showBalloonAt Value for showBalloonAt.
	 */
	abstract void setShowBalloonAt(ShowAt showBalloonAt);

	/**
	 * Get topRadius property.
	 * @return Value of topRadius.
	 */
	abstract Double getTopRadius();

	/**
	 * Set topRadius property.With improvedVisibility enabled, range activated.
	 * @param topRadius Value for topRadius.
	 * @throws OutOfRangeException Value out of range admitted: 0-2.
	 */
	abstract void setTopRadius(Number topRadius) throws OutOfRangeException;

	/**
	 * Get useNegativeColorIfDown property.<br>
	 * Default: false.
	 * @return Value for useNegativeColorIfDown.
	 */
	abstract Boolean isUseNegativeColorIfDown();

	/**
	 * Set useNegativeColorIfDown property.
	 * @param useNegativeColorIfDown Enable or disable negativeColorIfDown.
	 */
	abstract void setUseNegativeColorIfDown(Boolean useNegativeColorIfDown);

}