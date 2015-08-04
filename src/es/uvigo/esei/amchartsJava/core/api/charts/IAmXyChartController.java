package es.uvigo.esei.amchartsJava.core.api.charts;

import es.uvigo.esei.amchartsJava.core.exceptions.OutOfRangeException;

public interface IAmXyChartController extends IAmRectangularChartController {

	public Object isHideXScrollbar();

	public void setHideXScrollbar(Boolean hideXScrollbar);

	public Object isHideYScrollbar();

	public void setHideYScrollbar(Boolean hideYScrollbar);

	public Object getMaxZoomFactor();

	public void setMaxZoomFactor(Number maxZoomFactor)
			throws OutOfRangeException;

}