package es.uvigo.esei.amchartsJava.core.api;

import es.uvigo.esei.amchartsJava.core.constants.ShowAtConstant.ShowAt;

public interface IAmGraphCandleController extends IAmGraphSerialController {

	public Object getShowBulletsAt();

	public void setShowBulletsAt(ShowAt showBulletsAt);

}