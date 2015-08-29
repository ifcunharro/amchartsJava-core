package es.uvigo.esei.amchartsJava.core.api.graphs;

import es.uvigo.esei.amchartsJava.core.constants.ShowAtConstant.ShowAt;


public abstract interface IAmGraphCandleOhlcController extends IAmGraphSerialController {

	abstract String getHighField();

	abstract void setHighField(String highField);

	abstract String getLowField();

	abstract void setLowField(String lowField);
	
	abstract String getShowBulletsAt();
	
	abstract void setShowBulletsAt(ShowAt showBulletsAt);

}