package es.uvigo.esei.amchartsJava.core.api.axis;

import java.sql.Date;





import es.uvigo.esei.amchartsJava.core.constants.AxisTypeConstant.AxisType;
import es.uvigo.esei.amchartsJava.core.constants.DurationConstant.Duration;
import es.uvigo.esei.amchartsJava.core.constants.PositionConstant.Position;
import es.uvigo.esei.amchartsJava.core.constants.StackTypeConstant.StackType;
import es.uvigo.esei.amchartsJava.core.exceptions.ChartException;
import es.uvigo.esei.amchartsJava.core.exceptions.ColorException;
import es.uvigo.esei.amchartsJava.core.exceptions.DoubleException;
import es.uvigo.esei.amchartsJava.core.exceptions.IntegerException;
import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmCoordinateChart;

public abstract interface IValueAxisController extends IAxisBaseController {

	abstract void setChart(AmCoordinateChart c);

	abstract Object getBaseValue();

	abstract void setBaseValue(Number baseValue) throws IntegerException;

	abstract String getDuration();

	abstract void setDuration(Duration duration);

	abstract String getId();

	abstract Boolean isIncludeGuidesInMinMax();

	abstract void setIncludeGuidesInMinMax(Boolean includeGuidesInMinMax);

	abstract Boolean isIncludeHidden();
	
	abstract void setIncludeHidden(Boolean includeHidden);

	abstract Boolean isIntegersOnly();

	abstract void setIntegersOnly(Boolean integersOnly);

	abstract String getLabelFunction();

	abstract void setLabelFunction(String labelFunction);

	abstract Boolean isLogarithmic();

	abstract void setLogarithmic(Boolean logarithmic);

	abstract Object getMaximum();

	abstract void setMaximum(Number maximum) throws DoubleException;

	abstract String getMaximumDate();

	abstract void setMaximunDate(Date maximumDate);

	abstract Object getMinimum();

	abstract void setMinimum(Number minimum) throws DoubleException;

	abstract String getMinimumDate();

	abstract void setMinimumDate(Date minimumDate);

	abstract Object getMinMaxMultiplier();

	abstract void setMinMaxMultiplier(Number minMaxMultiplier)
			throws DoubleException;

	abstract Object getPrecision();

	abstract void setPrecision(Number precision) throws OutOfRangeException;

	abstract Boolean isRecalculateToPercents();

	abstract void setRecalculateToPercents(Boolean recalculateToPercents);

	abstract Boolean isReversed();

	abstract void setReversed(Boolean reversed);

	abstract String getStackType();

	abstract void setStackType(StackType stackType);

	abstract Boolean isStrictMinMax();

	abstract void setStrictMinMax(Boolean strictMinMax);

	abstract Object getSynchronizationMultiplier();

	abstract void setSynchronizationMultiplier(Number synchronizationMultiplier)
			throws DoubleException;

	abstract String getSynchronizeWith();

	abstract void setSynchronizeWith(String synchronizeWith) throws ChartException;

	abstract String getTotalText();

	abstract void enabledTotalText();

	abstract String getTotalTextColor();

	abstract void setTotalTextColor(String totalTextColor) throws ColorException;

	abstract Object getTotalTextOffset();

	abstract void setTotalTextOffset(Number totalTextOffset)
			throws OutOfRangeException;

	abstract Object getTreatZeroAs();

	abstract void setTreatZeroAs(Number treatZeroAs) throws IntegerException;

	abstract String getType();

	abstract void setType(AxisType type);

	abstract String getUnit();

	abstract void setUnit(String unit);

	abstract String getUnitPosition();

	abstract void setUnitPosition(Position unitPosition);

	abstract Boolean isUsePrefixes();

	abstract void setUsePrefixes(Boolean usePrefixes);

	abstract Boolean isUseScientificNotation();

	abstract void setUseScientificNotation(Boolean useScientificNotation);
	
}