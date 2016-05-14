package es.uvigo.esei.amchartsjava.core.api.charts;

import es.uvigo.esei.amchartsjava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsjava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsjava.core.model.charts.AmSlicedChart;

/**
 * 
 * Interface for controller of AmPieChart. Details of AmPieChart and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface IAmPieChartController extends IAmSlicedChartController<AmSlicedChart> {

	/**
	 * Get adjustPrecision property.<br>
	 * Default: false.
	 * @return Value of adjustPrecision.
	 */
	abstract Boolean isAdjustPrecision();

	/**
	 * Set adjustPrecision property.
	 * @param adjustPrecision Enable or disable adjustPrecision.
	 */
	abstract void setAdjustPrecision(Boolean adjustPrecision);

	/**
	 * Get angle property.<br>
	 * Default: 0.
	 * @return Value of angle.
	 */
	abstract Integer getAngle();

	/**
	 * Set angle property.
	 * @param angle Value for angle.
	 * @throws OutOfRangeException Value out of range admitted: 0-90.
	 */
	abstract void setAngle(Number angle) throws OutOfRangeException;

	/**
	 * Get balloonText property.<br>
	 * Default: [[title]]: [[percents]]% ([[value]])\n[[description]]
	 * @return Value of balloonText.
	 */
	abstract String getBalloonText();

	/**
	 * Set balloonText property.
	 * @param balloonText Value for balloonText.
	 */
	abstract void setBalloonText(String balloonText);

	/**
	 * Get depth3D property.<br>
	 * Default: 0.
	 * @return Value of depth3D.
	 */
	abstract Integer getDepth3D();

	/**
	 * Set depth3D property.With improvedVisibility enabled range activated.
	 * @param depth3D Value for depth3D.
	 * @throws OutOfRangeException Value out of range admitted: 0-50.
	 */
	abstract void setDepth3D(Number depth3D) throws OutOfRangeException;

	/**
	 * Get innerRadius property.<br>
	 * Default: 0.
	 * @return Value of innerRadius.
	 */
	abstract String getInnerRadius();

	/**
	 * Set innerRadius property.
	 * @param innerRadius Value for innerRadius.
	 * @throws CoordException Value for innerRadius is not an integer number or a percent.
	 */
	abstract void setInnerRadius(String innerRadius) throws CoordException;

	/**
	 * Get labelRadius property.<br>
	 * Default: 20.
	 * @return Value of labelRadius.
	 */
	abstract Integer getLabelRadius();

	/**
	 * Set labelRadius property.With improvedVisibility enabled range activated.
	 * @param labelRadius Value for labelRadius.
	 * @throws OutOfRangeException Value out of range admitted: 0-40. 
	 */
	abstract void setLabelRadius(Number labelRadius) throws OutOfRangeException;

	/**
	 * Get labelRadiusField property.
	 * @return Value of labelRadiusField.
	 */
	abstract String getLabelRadiusField();

	/**
	 * Set labelRadiusField property.
	 * @param labelRadiusField Value for labelRadiusField.
	 */
	abstract void setLabelRadiusField(String labelRadiusField);

	/**
	 * Get labelText property.<br>
	 * Default: [[title]]: [[percents]]%
	 * @return Value of labelText.
	 */
	abstract String getLabelText();

	/**
	 * Set labelText property.
	 * @param labelText Value for labelText.
	 */
	abstract void setLabelText(String labelText);

	/**
	 * Get minRadius property.<br>
	 * Default: 10.
	 * @return Value of minRadius.
	 */
	abstract Integer getMinRadius();

	/**
	 * Set minRadius property.
	 * @param minRadius Value for minRadius.
	 * @throws IntegerException Value for minRadius in not an integer number.
	 */
	abstract void setMinRadius(Number minRadius) throws IntegerException;

	/**
	 * Get pieAlpha property.<br>
	 * Default: 1.
	 * @return Value of pieAlpha.
	 */
	abstract Double getPieAlpha();

	/**
	 * Set pieAlpha property.
	 * @param pieAlpha Value for pieAlpha.
	 * @throws OutOfRangeException Value out of range admitted: 0.0-1.0.
	 */
	abstract void setPieAlpha(Number pieAlpha) throws OutOfRangeException;

	/**
	 * Get pieX property.
	 * @return Value of pieX.
	 */
	abstract String getPieX();

	/**
	 * Set pieX property.
	 * @param pieX Value for pieX.
	 * @throws CoordException Value for piex is not an integer number or a percent. 
	 */
	abstract void setPieX(String pieX) throws CoordException;

	/**
	 * Get pieY property.
	 * @return Value of pieY.
	 */
	abstract String getPieY();

	/**
	 * Set pieY property.
	 * @param pieY Value for pieY.
	 * @throws CoordException Value for pieY is not an integer number or a percent.
	 */
	abstract void setPieY(String pieY) throws CoordException;

	/**
	 * Get pullOutRadius property.<br>
	 * Default: 20%.
	 * @return Value of pullOutRadius.
	 */
	abstract String getPullOutRadius();

	/**
	 * Set pullOutRadius property.
	 * @param pullOutRadius Value for pullOutRadius.
	 * @throws CoordException Value for pullOutRadius is not an integer number or a percent.
	 */
	abstract void setPullOutRadius(String pullOutRadius) throws CoordException;

	/**
	 * Get radius property.
	 * @return Value of radius.
	 */
	abstract String getRadius();

	/**
	 * Set radius property.
	 * @param radius Value for radius.
	 * @throws CoordException Value for radius is not an integer number or a percent.
	 */
	abstract void setRadius(String radius) throws CoordException;

	/**
	 * Get startAngle property.<br>
	 * Default: 90.
	 * @return Value of startAngle.
	 */
	abstract Integer getStartAngle();

	/**
	 * Set startAngle property.
	 * @param startAngle Value for startAngle.
	 * @throws OutOfRangeException Value out of range admitted: 0-360.
	 */
	abstract void setStartAngle(Number startAngle) throws OutOfRangeException;

	/**
	 * Get startRadius property.<br>
	 * Default: 500%.
	 * @return Value of startRadius.
	 */
	abstract String getStartRadius();

	/**
	 * Set startRadius property.
	 * @param startRadius Value for startRadius.
	 * @throws CoordException Value for startRadius is not an integer number or a percent.
	 */
	abstract void setStartRadius(String startRadius) throws CoordException;

}