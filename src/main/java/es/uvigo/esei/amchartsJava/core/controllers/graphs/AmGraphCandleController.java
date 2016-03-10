package es.uvigo.esei.amchartsJava.core.controllers.graphs;




import es.uvigo.esei.amchartsJava.core.api.graphs.IAmGraphCandleOhlcController;
import es.uvigo.esei.amchartsJava.core.constants.GraphType;

/**
 * This class is a controller for AmGraph of type candlestick
 * @author Iago Fernández Cuñarro
 *
 */
public class AmGraphCandleController extends AmGraphCandleOhlcController implements IAmGraphCandleOhlcController {
	
	
	private static final long serialVersionUID = -6225507455268146232L;

	{
		//used to deserialize from json graph type candlestick
		setType(GraphType.candlestick);
	}
	
	
}
