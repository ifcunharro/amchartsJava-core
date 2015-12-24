package es.uvigo.esei.amchartsJava.core.controllers.graphs;


import es.uvigo.esei.amchartsJava.core.api.graphs.IAmGraphCandleOhlcController;
import es.uvigo.esei.amchartsJava.core.constants.GraphType;

public class AmGraphOhlcController extends AmGraphCandleOhlcController implements IAmGraphCandleOhlcController {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5504560479350694540L;
	
	{
		setType(GraphType.ohlc);
	}

}
