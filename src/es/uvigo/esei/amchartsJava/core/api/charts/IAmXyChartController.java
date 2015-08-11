package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;

public interface IAmXyChartController extends IAmRectangularChartController<AmRectangularChart> {

	public Object isHideXScrollbar();

	public void setHideXScrollbar(Boolean hideXScrollbar);

	public Object isHideYScrollbar();

	public void setHideYScrollbar(Boolean hideYScrollbar);

	public Object getMaxZoomFactor();

	public void setMaxZoomFactor(Number maxZoomFactor)
			throws OutOfRangeException;

}