package es.uvigo.esei.amchartsJava.core.api.axis;

import java.sql.Date;




import es.uvigo.esei.amchartsJava.core.constants.AxisTypeConstant.AxisType;
import es.uvigo.esei.amchartsJava.core.constants.DurationConstant.Duration;
import es.uvigo.esei.amchartsJava.core.constants.PositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.constants.StackTypeConstant.StackType;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;

public interface IValueAxisController extends IAxisBaseController {

	public void setChart(AmCoordinateChart c);

	public Object getBaseValue();

	public void setBaseValue(Number baseValue) throws IntegerException;

	public Object getDuration();

	public void setDuration(Duration duration);

	public Object getId();

	public Object isIncludeGuidesInMinMax();

	public void setIncludeGuidesInMinMax(Boolean includeGuidesInMinMax);

	public Object isIncludeHidden();

	public Object isIntegersOnly();

	public void setIntegersOnly(Boolean integersOnly);

	public Object getLabelFunction();

	public void setLabelFunction(String labelFunction);

	public Object isLogarithmic();

	public void setLogarithmic(Boolean logarithmic);

	public Object getMaximum();

	public void setMaximum(Number maximum) throws DoubleException;

	public Object getMaximumDate();

	public void setMaximunDate(Date maximumDate);

	public Object getMinimum();

	public void setMinimum(Number minimum) throws DoubleException;

	public Object getMinimumDate();

	public void setMinimumDate(Date minimumDate);

	public Object getMinMaxMultiplier();

	public void setMinMaxMultiplier(Number minMaxMultiplier)
			throws DoubleException;

	public Object getPrecision();

	public void setPrecision(Number precision) throws OutOfRangeException;

	public Object isRecalculateToPercents();

	public void setRecalculateToPercents(Boolean recalculateToPercents);

	public Object isReversed();

	public void setReversed(Boolean reversed);

	public Object getStackType();

	public void setStackType(StackType stackType);

	public Object isStrictMinMax();

	public void setStrictMinMax(Boolean strictMinMax);

	public Object getSynchronizationMultiplier();

	public void setSynchronizationMultiplier(Number synchronizationMultiplier)
			throws DoubleException;

	public Object getSynchronizeWith();

	public void setSynchronizedWith(String synchronizedWith);

	public Object getTotalText();

	public void enabledTotalText();

	public Object getTotalTextColor();

	public void setTotalTextColor(String totalTextColor) throws ColorException;

	public Object getTotalTextOffset();

	public void setTotalTextOffset(Number totalTextOffset)
			throws OutOfRangeException;

	public Object getTreatZeroAs();

	public void setTreatZeroAs(Number treatZeroAs) throws IntegerException;

	public Object getType();

	public void setType(AxisType type);

	public Object getUnit();

	public void setUnit(String unit);

	public Object getUnitPosition();

	public void setUnitPosition(Position unitPosition);

	public Object isUsePrefixes();

	public void setUsePrefixes(Boolean usePrefixes);

	public Object isUseScientificNotation();

	public void setUseScientificNotation(Boolean useScientificNotation);
	
}