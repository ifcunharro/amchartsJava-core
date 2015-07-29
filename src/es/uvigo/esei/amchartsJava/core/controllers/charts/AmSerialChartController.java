package es.uvigo.esei.amchartsJava.core.controllers.charts;

import es.uvigo.esei.amchartsJava.core.api.charts.IAmRectangularChartController;
import es.uvigo.esei.amchartsJava.core.model.charts.AmRectangularChart;
import es.uvigo.esei.amchartsJava.core.model.charts.AmSerialChart;

public class AmSerialChartController extends AmRectangularChartController<AmSerialChart> 
				implements IAmRectangularChartController<AmRectangularChart> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4770522225786632974L;

	public AmSerialChartController() {
		super(new AmSerialChart());
		
	}

	
	

	

}
