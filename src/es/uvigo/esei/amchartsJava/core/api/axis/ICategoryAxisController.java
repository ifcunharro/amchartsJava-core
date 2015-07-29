package es.uvigo.esei.amchartsJava.core.api.axis;


import es.uvigo.esei.amchartsJava.core.constants.CategoryPositionConstant.CategoryPosition;
import es.uvigo.esei.amchartsJava.core.constants.PeriodConstant.Period;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface ICategoryAxisController extends IAxisBaseController {

	public Object getAutoRotateAngle();

	public void setAutoRotateAngle(Number autoRotateAngle)
			throws OutOfRangeException;

	public Object getAutoRotateCount();

	public void setAutoRotateCount(Number autoRotateCount)
			throws IntegerException;

	public Object isAutoWrap();

	public void setAutoWrap(Boolean autoWrap);

	public Object isBoldPeriodBeginning();

	public void setBoldPeriodBeginning(Boolean boldPeriodBeginning);

	public Object getCategoryFunction();

	public void setCategoryFunction(String categoryFunction);

	public Object isCenterLabelOnFullPeriod();

	public void setCenterLabelOnFullPeriod(Boolean centerLabelOnFullPeriod);

	public Object isEqualSpacing();

	public void setEqualSpacing(Boolean equalSpacing);

	public Object getFirstDayOfWeek();

	public void setFirstDayOfWeek(Number firstDayOfWeek)
			throws OutOfRangeException;

	public Object getForceShowField();

	public void setForceShowField(String forceShowField);

	public Object getGridPosition();

	public void setGridPosition(CategoryPosition gridPosition);

	public Object getLabelColorField();

	public void setLabelColorField(String labelColorField);

	public Object getLabelFunction();

	public void setLabelFunction(String labelFunction);

	public Object isMarkPeriodChange();

	public void setMarkPeriodChange(Boolean markPeriodChange);

	public Object getMinPeriod();

	public void setMinPeriod(Period minPeriod);

	public Object isParseDates();

	public void setParseDates(Boolean parseDates);

	public Object isStartOnAxis();

	public void setStartOnAxis(Boolean startOnAxis);

	public Object getTickPosition();

	public void setTickPosition(CategoryPosition tickPosition);

	public Object isTwoLineMode();

	public void setTwoLineMode(Boolean twoLineMode);

}