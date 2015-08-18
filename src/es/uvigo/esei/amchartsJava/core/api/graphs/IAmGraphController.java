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
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IAmGraphController  {
	
	abstract Object getId();

	abstract Object getAlphaField();

	abstract void setAlphaField(String alphaField);

	abstract Object isAnimationPlayed();

	abstract void setAnimationPlayed(Boolean animationPlayed);

	abstract Object getBalloonColor();

	abstract void setBalloonColor(ColorsAmCharts balloonColor);

	abstract Object getBalloonFunction();

	abstract void setBalloonFunction(String balloonFunction);

	abstract Object getBullet();

	abstract void setBullet(Bullet bullet);

	abstract Object getBulletAlpha();

	abstract void setBulletAlpha(Number bulletAlpha) throws OutOfRangeException;

	abstract Object getBulletBorderAlpha();

	abstract void setBulletBorderAlpha(Number bulletBorderAlpha)
			throws OutOfRangeException;

	abstract Object getBulletBordeColor();

	abstract void setBulletBorderColor(ColorsAmCharts bulletBorderColor);

	abstract Object getBulletBorderThickness();

	abstract void setBulletBorderThickness(Number bulletBorderThickness)
			throws OutOfRangeException;

	abstract Object getBulletColor();

	abstract void setBulletColor(ColorsAmCharts bulletColor);

	abstract Object getBulletField();

	abstract void setBulletField(String bulletField);

	abstract Object getBulletOffset();

	abstract void setBulletOffset(Number bulletOffset) throws OutOfRangeException;

	abstract Object getBulletSize();

	abstract void setBulletSize(Number bulletSize) throws OutOfRangeException;

	abstract Object getBulletSizeField();

	abstract void setBulletSizeField(String bulletSizeField);

	abstract Object getCloseField();

	abstract void setCloseField(String closeField);

	abstract Object getColor();

	abstract void setColor(ColorsAmCharts color);

	abstract Object getColorField();

	abstract void setColorField(String colorField);

	abstract Object getCursorBulletAlpha();

	abstract void setCursorBulletAlpha(Number cursorBulletAlpha)
			throws OutOfRangeException;

	//path to image custom bullet
	abstract Object getCustomBullet();

	//FALTA VALIDAR PATH
	abstract void setCustomBullet(String customBullet);

	abstract Object getCustomBulletField();

	abstract void setCustomBulletField(String customBulletField);

	abstract Object getCustomMarker();

	abstract void setCustomMarker(String customMarker);

	abstract Object getDateFormat();

	//escogido de DateFormatConstant, filtrar a nivel interfaz, 
	// si se usa sin interfaz propia o sin ninguna interfaz no se realiza ningún cambio
	abstract void setDateFormat(String dateFormat);

	abstract Object getDescriptionField();

	abstract void setDescriptionField(String descriptionField);

	abstract Object getErrorField();

	abstract void setErrorField(String errorField);

	abstract Object getFillAlphas();

	abstract void setFillAlphas(Number fillAlphas) throws OutOfRangeException;

	abstract Object getFillToGraph();

	//debe ser el id de otro graph
	abstract void setFillToGraph(String fillToGraph);

	abstract Object getFontSize();

	abstract void setFontSize(Number fontSize) throws OutOfRangeException;

	abstract Object getGapPeriod();

	abstract void setGapPeriod(Number gapPeriod) throws DoubleException;

	abstract Object getGradientOrientation();

	abstract void setGradientOrientation(Orientation gradientOrientation);

	abstract Object isHidden();

	abstract void setHidden(Boolean hidden);

	abstract Object getHideBulletsCount();

	abstract void setHideBulletsCount(Number hideBulletsCount)
			throws IntegerException;

	abstract Object isIncludeInMinMax();

	abstract void setIncludeInMinMax(Boolean includeInMinMax);

	abstract Object getLabelAnchor();

	abstract void setLabelAnchor(LabelAnchor labelAnchor);

	abstract Object getLabelColorField();

	abstract void setLabelColorField(String labelColorField);

	abstract Object getLabelFunction();

	abstract void setLabelFunction(String labelFunction);

	abstract Object getLabelOffset();

	abstract void setLabelOffset(Number labelOffset) throws OutOfRangeException;

	abstract Object getLabelPosition();

	abstract void setLabelPosition(LabelPosition labelPosition);

	abstract Object getLabelRotation();

	abstract void setLabelRotation(Number labelRotation)
			throws OutOfRangeException;

	abstract Object getLabelText();

	abstract void setLabelText(TagsText labelText);

	abstract Object getLegendAlpha();

	abstract void setLegendAlpha(Number legendAlpha) throws OutOfRangeException;

	abstract Object getLegendColor();

	abstract void setLegendColor(ColorsAmCharts legendColor);

	abstract Object getLegendPeriodValueText();

	abstract void setLegendPeriodValueText(
			LegendPeriodValueText legendPeriodValueText);

	abstract Object getLegendValueText();

	abstract void setLegendValueText(TagsText legendValueText);

	abstract Object getLineAlpha();

	abstract void setLineAlpha(Number lineAlpha) throws OutOfRangeException;

	abstract Object getMakerType();

	abstract void setMarkerType(MarkerType markerType);

	abstract Object getMinDistance();

	abstract void setMinDistance(Number minDistance) throws OutOfRangeException;

	abstract Object getNegativeBase();

	abstract void setNegativeBase(Number negativeBase) throws IntegerException;

	abstract Object getNegativeFillAlphas();

	abstract void setNegativeFillAlphas(Number negativeFillAlhas)
			throws OutOfRangeException;

	abstract Object getNegativeFillColors();

	abstract void setNegativeFillColors(ColorsAmCharts negativeFillColors);

	abstract Object getPrecision();

	abstract void setPrecision(Number precision) throws OutOfRangeException;

	abstract Object isProCandleSticks();

	abstract void setProCandleSticks(Boolean proCandleSticks);

	abstract Object isSwowAllValueLabels();

	abstract void setShowAllValueLabels(Boolean showAllValueLabels);

	abstract Object isShowBalloon();

	abstract void setShowBalloon(Boolean showBalloon);

	abstract Object isShowHandOnHover();

	abstract void setShowHandOnHover(Boolean showHandOnHover);

	abstract Object isShowOnAxis();

	abstract void setShowOnAxis(Boolean showOnAxis);

	abstract Object isStackable();

	abstract void setStackable(Boolean stackable);

	abstract Object isSwitchable();

	abstract void setSwitchable(Boolean switchable);

	abstract Object getTitle();

	abstract void setTitle(String title);

	abstract Object getType();

	abstract void setType(GraphType type);

	abstract Object getUrlField();

	abstract void setUrlField(String urlField);

	abstract Object getUrlTarget();

	abstract void setUrlTarget(UrlTarget urlTarget);

	abstract Object getValueAxis();

	abstract void setValueAxis(String valueAxis);

	abstract Object getValueField();

	abstract void setValueField(String valueField);

	abstract Object isVisibleInLegend();

	abstract void setVisibleInLegend(Boolean visibleInLegend);

}