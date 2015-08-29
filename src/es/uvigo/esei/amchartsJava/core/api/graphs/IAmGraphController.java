package es.uvigo.esei.amchartsJava.core.api.graphs;



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

public interface IAmGraphController  {
	
	abstract void setChart(AmCoordinateChart chart);
	
	abstract String getId();

	abstract String getAlphaField();

	abstract void setAlphaField(String alphaField);

	abstract Boolean isAnimationPlayed();

	abstract void setAnimationPlayed(Boolean animationPlayed);

	abstract String getBalloonColor();

	abstract void setBalloonColor(ColorsAmCharts balloonColor);

	abstract String getBalloonFunction();

	abstract void setBalloonFunction(String balloonFunction);

	abstract String getBullet();

	abstract void setBullet(Bullet bullet);

	abstract Object getBulletAlpha();

	abstract void setBulletAlpha(Number bulletAlpha) throws OutOfRangeException;

	abstract Object getBulletBorderAlpha();

	abstract void setBulletBorderAlpha(Number bulletBorderAlpha)
			throws OutOfRangeException;

	abstract String getBulletBordeColor();

	abstract void setBulletBorderColor(ColorsAmCharts bulletBorderColor);

	abstract Object getBulletBorderThickness();

	abstract void setBulletBorderThickness(Number bulletBorderThickness)
			throws OutOfRangeException;

	abstract String getBulletColor();

	abstract void setBulletColor(ColorsAmCharts bulletColor);

	abstract String getBulletField();

	abstract void setBulletField(String bulletField);

	abstract Object getBulletOffset();

	abstract void setBulletOffset(Number bulletOffset) throws OutOfRangeException;

	abstract Object getBulletSize();

	abstract void setBulletSize(Number bulletSize) throws OutOfRangeException;

	abstract String getBulletSizeField();

	abstract void setBulletSizeField(String bulletSizeField);

	abstract String getCloseField();

	abstract void setCloseField(String closeField);

	abstract String getColor();

	abstract void setColor(ColorsAmCharts color);

	abstract String getColorField();

	abstract void setColorField(String colorField);

	abstract Object getCursorBulletAlpha();

	abstract void setCursorBulletAlpha(Number cursorBulletAlpha)
			throws OutOfRangeException;

	//path to image custom bullet
	abstract String getCustomBullet();

	//FALTA VALIDAR PATH
	abstract void setCustomBullet(String customBullet);

	abstract String getCustomBulletField();

	abstract void setCustomBulletField(String customBulletField);

	abstract String getCustomMarker();

	abstract void setCustomMarker(String customMarker);

	abstract String getDateFormat();

	//escogido de DateFormatConstant, filtrar a nivel interfaz, 
	// si se usa sin interfaz propia o sin ninguna interfaz no se realiza ningún cambio
	abstract void setDateFormat(String dateFormat);

	abstract String getDescriptionField();

	abstract void setDescriptionField(String descriptionField);

	abstract String getErrorField();

	abstract void setErrorField(String errorField);

	abstract Object getFillAlphas();

	abstract void setFillAlphas(Number fillAlphas) throws OutOfRangeException;

	abstract String getFillToGraph();

	//debe ser el id de otro graph
	abstract void setFillToGraph(String fillToGraph) throws ChartException;

	abstract Object getFontSize();

	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	abstract Object getGapPeriod();

	abstract void setGapPeriod(Number gapPeriod) throws DoubleException;

	abstract String getGradientOrientation();

	abstract void setGradientOrientation(Orientation gradientOrientation);

	abstract Boolean isHidden();

	abstract void setHidden(Boolean hidden);

	abstract Object getHideBulletsCount();

	abstract void setHideBulletsCount(Number hideBulletsCount)
			throws IntegerException;

	abstract Boolean isIncludeInMinMax();

	abstract void setIncludeInMinMax(Boolean includeInMinMax);

	abstract String getLabelAnchor();

	abstract void setLabelAnchor(LabelAnchor labelAnchor);

	abstract String getLabelColorField();

	abstract void setLabelColorField(String labelColorField);

	abstract String getLabelFunction();

	abstract void setLabelFunction(String labelFunction);

	abstract Object getLabelOffset();

	abstract void setLabelOffset(Number labelOffset) throws OutOfRangeException;

	abstract String getLabelPosition();

	abstract void setLabelPosition(LabelPosition labelPosition);

	abstract Object getLabelRotation();

	abstract void setLabelRotation(Number labelRotation)
			throws OutOfRangeException;

	abstract String getLabelText();

	abstract void setLabelText(TagsText labelText);

	abstract Object getLegendAlpha();

	abstract void setLegendAlpha(Number legendAlpha) throws OutOfRangeException;

	abstract String getLegendColor();

	abstract void setLegendColor(ColorsAmCharts legendColor);

	abstract String getLegendPeriodValueText();

	abstract void setLegendPeriodValueText(
			LegendPeriodValueText legendPeriodValueText);

	abstract String getLegendValueText();

	abstract void setLegendValueText(TagsText legendValueText);

	abstract Object getLineAlpha();

	abstract void setLineAlpha(Number lineAlpha) throws OutOfRangeException;

	abstract String getMakerType();

	abstract void setMarkerType(MarkerType markerType);

	abstract Object getMinDistance();

	abstract void setMinDistance(Number minDistance) throws OutOfRangeException;

	abstract Object getNegativeBase();

	abstract void setNegativeBase(Number negativeBase) throws IntegerException;

	abstract Object getNegativeFillAlphas();

	abstract void setNegativeFillAlphas(Number negativeFillAlhas)
			throws OutOfRangeException;

	abstract String getNegativeFillColors();

	abstract void setNegativeFillColors(ColorsAmCharts negativeFillColors);
	
	abstract PatternController getPattern();
	
	abstract void setPattern(PatternController pattern) throws MalFormedPatternException;
	
	abstract String getPatternField();
	
	abstract void setPatternField(String patternField);

	abstract Object getPrecision();

	abstract void setPrecision(Number precision) throws OutOfRangeException;

	abstract Boolean isProCandleSticks();

	abstract void setProCandleSticks(Boolean proCandleSticks);

	abstract Boolean isShowAllValueLabels();

	abstract void setShowAllValueLabels(Boolean showAllValueLabels);

	abstract Boolean isShowBalloon();

	abstract void setShowBalloon(Boolean showBalloon);

	abstract Boolean isShowHandOnHover();

	abstract void setShowHandOnHover(Boolean showHandOnHover);

	abstract Boolean isShowOnAxis();

	abstract void setShowOnAxis(Boolean showOnAxis);

	abstract Boolean isStackable();

	abstract void setStackable(Boolean stackable);

	abstract Boolean isSwitchable();

	abstract void setSwitchable(Boolean switchable);

	abstract String getTitle();

	abstract void setTitle(String title);

	abstract String getType();

	abstract void setType(GraphType type);

	abstract String getUrlField();

	abstract void setUrlField(String urlField);

	abstract String getUrlTarget();

	abstract void setUrlTarget(UrlTarget urlTarget);

	abstract String getValueAxis();

	abstract void setValueAxis(String valueAxis) throws ChartException;

	abstract String getValueField();

	abstract void setValueField(String valueField);

	abstract Boolean isVisibleInLegend();

	abstract void setVisibleInLegend(Boolean visibleInLegend);

}