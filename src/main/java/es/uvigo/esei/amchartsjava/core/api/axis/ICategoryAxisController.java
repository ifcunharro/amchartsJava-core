package es.uvigo.esei.amchartsjava.core.api.axis;


import es.uvigo.esei.amchartsjava.core.constants.CategoryPosition;
import es.uvigo.esei.amchartsjava.core.constants.Period;
import es.uvigo.esei.amchartsjava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsjava.core.exceptions.OutOfRangeException;

/**
 * 
 * Interface for controller of CategoryAxis. Details of CategoryAxis and 
 *  its properties in AmCharts API
 * 
 * @author Iago Fernández Cuñarro
 *
 */
public abstract interface ICategoryAxisController extends IAxisBaseController {

	/**
	 * Get autoRotateAngle property.
	 * @return Value of autoRotateAngle.
	 */
	abstract Integer getAutoRotateAngle();

	/**
	 * Set autoRotateAngle property.
	 * @param autoRotateAngle Value for autoRotateAngle.
	 * @throws OutOfRangeException Value out of range admitted: -90 to 90.
	 */
	abstract void setAutoRotateAngle(Number autoRotateAngle)
			throws OutOfRangeException;

	/**
	 * Get autoRotateCount property.
	 * @return Value of autoRotateCount.
	 */
	abstract Integer getAutoRotateCount();

	/**
	 * Set autoRotateCount property.
	 * @param autoRotateCount Value for autoRotateCount.
	 * @throws IntegerException Value for autoRotateCount is not an integer number.
	 */
	abstract void setAutoRotateCount(Number autoRotateCount)
			throws IntegerException;

	/**
	 * Get autoWrap property.<br>
	 * Default: false.
	 * @return Value of autoWrap.
	 */
	abstract Boolean isAutoWrap();

	/**
	 * Set autoWrap property.
	 * @param autoWrap Enable or disable autoWrap.
	 */
	abstract void setAutoWrap(Boolean autoWrap);

	/**
	 * Get boldPeriodBeginning property.<br>
	 * Default: true.
	 * @return Value of boldPeriodBeginning.
	 */
	abstract Boolean isBoldPeriodBeginning();

	/**
	 * Set boldPeriodBeginning property.
	 * @param boldPeriodBeginning Enable or disable bold for periodBeginning.
	 */
	abstract void setBoldPeriodBeginning(Boolean boldPeriodBeginning);

	/**
	 * Get categoryFunction property.
	 * @return Value of categoryFunction.
	 */
	abstract String getCategoryFunction();

	/**
	 * Set categoryFunction property.
	 * @param categoryFunction Value for categoryFunction.
	 */
	abstract void setCategoryFunction(String categoryFunction);

	/**
	 * Get centerLabelOnFullPeriod property.<br>
	 * Default: true.
	 * @return Value of centerLabelOnFullPeriod.
	 */
	abstract Boolean isCenterLabelOnFullPeriod();

	/**
	 * Set centerLabelOnFullPeriod property.
	 * @param centerLabelOnFullPeriod Center or don't center label on full period.
	 */
	abstract void setCenterLabelOnFullPeriod(Boolean centerLabelOnFullPeriod);

	/**
	 * Get equalSpacing property.<br>
	 * Default: false.
	 * @return Value of equalSpacing.
	 */
	abstract Boolean isEqualSpacing();

	/**
	 * Set equalSpacing property.
	 * @param equalSpacing Enable or disable equalSpacing.
	 */
	abstract void setEqualSpacing(Boolean equalSpacing);

	/**
	 * Get firstDayOfWeek property.<br>
	 * Default: 1.
	 * @return Value of firstDayOfWeek.
	 */
	abstract Integer getFirstDayOfWeek();

	/**
	 * Set firstDayOfWeek property.
	 * @param firstDayOfWeek Value for firstDayOfWeek.
	 * @throws OutOfRangeException Value out of range admitted: 0-6.
	 */
	abstract void setFirstDayOfWeek(Number firstDayOfWeek)
			throws OutOfRangeException;

	/**
	 * Get forceShowField property.
	 * @return Value of forceShowField.
	 */
	abstract String getForceShowField();

	/**
	 * Set forceShowField property.
	 * @param forceShowField Value for forceShowField.
	 */
	abstract void setForceShowField(String forceShowField);

	/**
	 * Get gridPosition property.<br>
	 * Default: middle.
	 * @return Value of gridPosition.
	 */
	abstract String getGridPosition();

	/**
	 * Set gridPosition property.
	 * @param gridPosition Value for gridPosition.
	 */
	abstract void setGridPosition(CategoryPosition gridPosition);

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
	 * Get markPeriodChange property.<br>
	 * Default: true.
	 * @return Value of markPeriodChange.
	 */
	abstract Boolean isMarkPeriodChange();

	/**
	 * Set markPeriodChange property.
	 * @param markPeriodChange Enable or disable markPeriodChange.
	 */
	abstract void setMarkPeriodChange(Boolean markPeriodChange);

	/**
	 * Get minPeriod property.<br>
	 * Default: DD.
	 * @return Value of minPeriod.
	 */
	abstract String getMinPeriod();

	/**
	 * Set minPeriod property.
	 * @param minPeriod Value for minPeriod.
	 */
	abstract void setMinPeriod(Period minPeriod);

	/**
	 * Get parseDates property.<br>
	 * Default: false.
	 * @return Value of parseDates.
	 */
	abstract Boolean isParseDates();

	/**
	 * Set parseDates property.
	 * @param parseDates Enable or disable parse dates.
	 */
	abstract void setParseDates(Boolean parseDates);

	/**
	 * Get startOnAxis property.<br>
	 * Default: false.
	 * @return Value of startOnAxis.
	 */
	abstract Boolean isStartOnAxis();

	/**
	 * Set startOnAxis property.
	 * @param startOnAxis Start on don't start graph on axis.
	 */
	abstract void setStartOnAxis(Boolean startOnAxis);

	/**
	 * Get tickPosition property.<br>
	 * Default: middle.
	 * @return Value of tickPosition.
	 */
	abstract String getTickPosition();

	/**
	 * Set tickPosition property.
	 * @param tickPosition Value for tickPosition.
	 */
	abstract void setTickPosition(CategoryPosition tickPosition);

	/**
	 * Get twoLineMode property.<br>
	 * Default: false.
	 * @return Value of twoLineMode.
	 */
	abstract Boolean isTwoLineMode();

	/**
	 * Set twoLineMode property.
	 * @param twoLineMode Enable or disable twoLineMode.
	 */
	abstract void setTwoLineMode(Boolean twoLineMode);

}