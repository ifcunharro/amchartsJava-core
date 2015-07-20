package es.uvigo.esei.amchartsJava.model;

import java.util.ArrayList;
import java.util.List;

import es.uvigo.esei.amchartsJava.controllers.AmLegendController;
import es.uvigo.esei.amchartsJava.controllers.LabelController;
import es.uvigo.esei.amchartsJava.controllers.TitleController;

public abstract class AmChart extends IModel {
	protected List<LabelController> labels;
	protected Export export;
	protected AmBalloon amBalloon;
	protected List<Prefix> bigPrefixes;
	protected List<Prefix> smallPrefixes;
	//cambiar por clase y no es map es List<Map>
	//protected DataProvider dataProvider;
	//para filtros svg
	//protected Defs defs;
	protected AmLegendController legend;
	protected List<TitleController> titles;
	
	
	public List<LabelController> getLabels() {
		return labels;
	}

	public void addLabel(LabelController labelController) {
		if(labels==null){
			labels = new ArrayList<LabelController>();
		}
		
		addObserver(labelController);
		setChanged();
		notifyObservers(labels.size()+1);
		labels.add(labelController);
		deleteObservers();
		
	}

	public Export getExport() {
		return export;
	}

	public void createExport() {
		export = new Export();
		
	}

	public AmBalloon getBalloon() {
		return amBalloon;
	}

	public void createBalloon() {
		if(amBalloon==null){
			amBalloon = new AmBalloon();
		}
		
	}

	/*public Object getDataProvider() {
		return dataProvider;
	}
	
	public void addDataToProvider(IData dat){
		dataProvider.addData(dat);
	}*/

	public AmLegendController getLegend() {
		return legend;
	}
	
	public void addLegend(AmLegendController amLegend) {
		legend = amLegend;
		
	}
	
	public List<Prefix> getBigPrefixes(){
		return bigPrefixes;
	}
	
	public void addBigPrefix(Number number, String prefix){
		if(bigPrefixes==null){
			bigPrefixes = new ArrayList<Prefix>();
		}
		bigPrefixes.add(new Prefix(number,prefix));
	}
	
	public List<Prefix> getSmallPrefixes(){
		return bigPrefixes;
	}
	
	public void addSmallPrefix(Number number, String prefix){
		if(smallPrefixes==null){
			smallPrefixes = new ArrayList<Prefix>();
		}
		smallPrefixes.add(new Prefix(number,prefix));
	}
	
	public List<TitleController> getTitles() {
		return titles;
	}

	public void addTitle(TitleController titleController) {
		if(titles==null){
			titles = new ArrayList<TitleController>();
		}
		addObserver(titleController);
		setChanged();
		notifyObservers(titles.size()+1);
		titles.add(titleController);
		deleteObservers();
		
	}

	public void clearLabels() {
		labels = null;
		System.gc();
		
	}

	public void removeLegend() {
		legend = null;
		System.gc();
		
	}


	/*public Object getDefs() {
		return defs;
	}*/

	

}
