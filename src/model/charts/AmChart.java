package model.charts;

import java.util.HashMap;
import java.util.List;

import model.AmBalloon;
import model.AmLegend;
import model.Export;
import model.IModel;
import model.Label;

public abstract class AmChart extends IModel {
	protected List<Label> labels;
	protected Export export;
	protected AmBalloon amBalloon;
	protected String creditsPosition;
	//cambiar por clase y no es map es List<Map>
	//protected DataProvider dataProvider;
	//para filtros svg
	//protected Defs defs;
	protected AmLegend legend;
	
	{
		config = new HashMap<String, Object>();
		//dataProvider = new DataProvider();
	}

	public Object getLabels() {
		return labels;
	}

	public void addLabel(Label label) {
		labels.add(label);
		
	}

	public Object getExport() {
		return export;
	}

	public void createExport() {
		export = new Export();
		
	}

	public Object getBalloon() {
		return amBalloon;
	}

	public void createBalloon() {
		amBalloon = new AmBalloon();
		
	}

	/*public Object getDataProvider() {
		return dataProvider;
	}
	
	public void addDataToProvider(IData dat){
		dataProvider.addData(dat);
	}*/

	public Object getLegend() {
		return legend;
	}
	
	public void addLegend(AmLegend amLegend) {
		legend = amLegend;
		
	}


	/*public Object getDefs() {
		return defs;
	}*/

	

}
