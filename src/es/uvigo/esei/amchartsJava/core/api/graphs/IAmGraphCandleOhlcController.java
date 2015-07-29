package es.uvigo.esei.amchartsJava.core.api.graphs;

import es.uvigo.esei.amchartsJava.core.constants.ShowAtConstant.ShowAt;


public abstract interface IAmGraphCandleOhlcController extends IAmGraphSerialController {

	abstract Object getHighField();

	abstract void setHighField(String highField);

	abstract Object getLowField();

	abstract void setLowField(String lowField);
	
	abstract Object getShowBulletsAt();
	
	abstract void setShowBulletsAt(ShowAt showBulletsAt);

}