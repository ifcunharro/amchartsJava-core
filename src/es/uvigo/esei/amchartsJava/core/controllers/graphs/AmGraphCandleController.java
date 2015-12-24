package es.uvigo.esei.amchartsJava.core.controllers.graphs;




import es.uvigo.esei.amchartsJava.core.api.graphs.IAmGraphCandleOhlcController;
import es.uvigo.esei.amchartsJava.core.constants.GraphType;

public class AmGraphCandleController extends AmGraphCandleOhlcController implements IAmGraphCandleOhlcController {
	
	
	private static final long serialVersionUID = -6225507455268146232L;

	{
		setType(GraphType.candlestick);
	}
	
	
}
