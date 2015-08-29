package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

public abstract interface IAmXyChartController extends IAmRectangularChartController<AmRectangularChart> {

	abstract Boolean isHideXScrollbar();

	abstract void setHideXScrollbar(Boolean hideXScrollbar);

	abstract Boolean isHideYScrollbar();

	abstract void setHideYScrollbar(Boolean hideYScrollbar);

	abstract Object getMaxZoomFactor();

	abstract void setMaxZoomFactor(Number maxZoomFactor)
			throws OutOfRangeException;

}