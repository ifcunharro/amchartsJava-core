package es.uvigo.esei.amchartsJava.core.api;


public interface IAmGraphCandleOhlcController extends IAmGraphSerialController {

	public Object getHighField();

	public void setHighField(String highField);

	public Object getLowField();

	public void setLowField(String lowField);

}