package es.uvigo.esei.amchartsJava.core.api.axis;


import es.uvigo.esei.amchartsJava.core.constants.CategoryPositionConstant.CategoryPosition;
import es.uvigo.esei.amchartsJava.core.constants.PeriodConstant.Period;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public abstract interface ICategoryAxisController extends IAxisBaseController {

	abstract Object getAutoRotateAngle();

	abstract void setAutoRotateAngle(Number autoRotateAngle)
			throws OutOfRangeException;

	abstract Object getAutoRotateCount();

	abstract void setAutoRotateCount(Number autoRotateCount)
			throws IntegerException;

	abstract Boolean isAutoWrap();

	abstract void setAutoWrap(Boolean autoWrap);

	abstract Boolean isBoldPeriodBeginning();

	abstract void setBoldPeriodBeginning(Boolean boldPeriodBeginning);

	abstract String getCategoryFunction();

	abstract void setCategoryFunction(String categoryFunction);

	abstract Boolean isCenterLabelOnFullPeriod();

	abstract void setCenterLabelOnFullPeriod(Boolean centerLabelOnFullPeriod);

	abstract Boolean isEqualSpacing();

	abstract void setEqualSpacing(Boolean equalSpacing);

	abstract Object getFirstDayOfWeek();

	abstract void setFirstDayOfWeek(Number firstDayOfWeek)
			throws OutOfRangeException;

	abstract String getForceShowField();

	abstract void setForceShowField(String forceShowField);

	abstract String getGridPosition();

	abstract void setGridPosition(CategoryPosition gridPosition);

	abstract String getLabelColorField();

	abstract void setLabelColorField(String labelColorField);

	abstract String getLabelFunction();

	abstract void setLabelFunction(String labelFunction);

	abstract Boolean isMarkPeriodChange();

	abstract void setMarkPeriodChange(Boolean markPeriodChange);

	abstract String getMinPeriod();

	abstract void setMinPeriod(Period minPeriod);

	abstract Boolean isParseDates();

	abstract void setParseDates(Boolean parseDates);

	abstract Boolean isStartOnAxis();

	abstract void setStartOnAxis(Boolean startOnAxis);

	abstract String getTickPosition();

	abstract void setTickPosition(CategoryPosition tickPosition);

	abstract Boolean isTwoLineMode();

	abstract void setTwoLineMode(Boolean twoLineMode);

}