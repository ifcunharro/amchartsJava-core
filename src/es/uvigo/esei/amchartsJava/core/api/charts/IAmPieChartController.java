package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.exceptions.CoordException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmSlicedChart;

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
	 * @return Boolean Value for adjustPrecision.
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
	 * @return Object Value for angle is an integer number.
	 */
	abstract Object getAngle();

	/**
	 * Set angle property.
	 * @param angle Value for angle.
	 * @throws OutOfRangeException Value out of range admitted: 0-90.
	 */
	abstract void setAngle(Number angle) throws OutOfRangeException;

	/**
	 * Get balloonText property.<br>
	 * Default: [[title]]: [[percents]]% ([[value]])\n[[description]]
	 * @return String Value for balloonText.
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
	 * @return Object Value for depth3D is an integer number.
	 */
	abstract Object getDepth3D();

	/**
	 * Set depth3D property.With improvedVisibility enabled range activated.
	 * @param depth3D Value for depth3D.
	 * @throws OutOfRangeException Value out of range admitted: 0-50.
	 */
	abstract void setDepth3D(Number depth3D) throws OutOfRangeException;

	/**
	 * Get innerRadius property.<br>
	 * Default: 0.
	 * @return String Value for innerRadius is an integer number or a percent.
	 */
	abstract String getInnerRadius();

	/**
	 * Set innerRadius property.
	 * @param innerRadius Value for innerRadius.
	 * @throws CoordException Value for innerRadius is not an integer number or a percnent.
	 */
	abstract void setInnerRadius(String innerRadius) throws CoordException;

	/**
	 * Get labelRadius property.<br>
	 * Default: 20.
	 * @return Object Value for labelRadius is an integer number,
	 */
	abstract Object getLabelRadius();

	/**
	 * Set labelRadius property.With improvedVisibility enabled range activated.
	 * @param labelRadius Value for labelRadius.
	 * @throws OutOfRangeException Value out of range admitted: 0-40. 
	 */
	abstract void setLabelRadius(Number labelRadius) throws OutOfRangeException;

	/**
	 * Get labelRadiusField property.
	 * @return String Value for labelRadiusField.
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
	 * @return String Value for labelText.
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
	 * @return Object Value for minRadius is an integer number.
	 */
	abstract Object getMinRadius();

	/**
	 * Set minRadius property.
	 * @param minRadius Value for minRadius.
	 * @throws IntegerException Value for minRadius in not an integer number.
	 */
	abstract void setMinRadius(Number minRadius) throws IntegerException;

	/**
	 * Get pieAlpha property.<br>
	 * Default: 1.
	 * @return Object Value for pieAlpha is a double number.
	 */
	abstract Object getPieAlpha();

	/**
	 * Set pieAlpha property.
	 * @param pieAlpha Value for pieAlpha.
	 * @throws OutOfRangeException. Value out of range admitted: 0.0-1.0.
	 */
	abstract void setPieAlpha(Number pieAlpha) throws OutOfRangeException;

	/**
	 * Get pieX property.
	 * @return String Value for pieX is an integer number or a percent.
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
	 * @return String Value for pieY is an integer number or a percent.
	 */
	abstract String getPieY();

	/**
	 * Set pieY property.
	 * @param pieY Value for pieY.
	 * @throws CoorException Value for pieY is not an integer number or a percent.
	 */
	abstract void setPieY(String pieY) throws CoordException;

	/**
	 * Get pullOutRadius property.<br>
	 * Default: 20%.
	 * @return String Value for pullOutRadius is an integer number or a percent.
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
	 * @return String Value for radius is an integer number or a percent.
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
	 * @return Object Value for startAngle is an integer number.
	 */
	abstract Object getStartAngle();

	/**
	 * Set startAngle property.
	 * @param Value for startAngle.
	 * @throws OutOfRangeException Value out of range admitted: 0-360.
	 */
	abstract void setStartAngle(Number startAngle) throws OutOfRangeException;

	/**
	 * Get startRadius property.<br>
	 * Default: 500%.
	 * @return String Value for startRadius is an integer number or a percent.
	 */
	abstract String getStartRadius();

	/**
	 * Set startRadius property.
	 * @param startRadius Value for startRadius.
	 * @throws CoordException Value for startRadius is not an integer number or a percent.
	 */
	abstract void setStartRadius(String startRadius) throws CoordException;

}