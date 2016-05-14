package es.uvigo.esei.amchartsjava.core.controllers.graphs;


import es.uvigo.esei.amchartsjava.core.api.graphs.IAmGraphCandleOhlcController;
import es.uvigo.esei.amchartsjava.core.constants.GraphType;

/**
 * This class is a controller for AmGraph of type ohlc
 * @author Iago Fernández Cuñarro
 *
 */
public class AmGraphOhlcController extends AmGraphCandleOhlcController implements IAmGraphCandleOhlcController {


	private static final long serialVersionUID = -5504560479350694540L;
	
	{
		//used to deseralize from json graphs type ohlc
		setType(GraphType.ohlc);
	}

}
