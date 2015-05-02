package model.charts;

import java.util.ArrayList;
import java.util.List;

import model.AmBalloon;
import model.AmLegend;
import model.Export;
import model.IModel;
import model.Label;
import model.Prefix;
import model.Title;

public abstract class AmChart extends IModel {
	protected List<Label> labels;
	protected Export export;
	protected AmBalloon amBalloon;
	protected List<Prefix> bigPrefixes;
	protected List<Prefix> smallPrefixes;
	//cambiar por clase y no es map es List<Map>
	//protected DataProvider dataProvider;
	//para filtros svg
	//protected Defs defs;
	protected AmLegend legend;
	protected List<Title> titles;
	
	public List<Label> getLabels() {
		return labels;
	}

	public void addLabel(Label label) {
		if(labels==null){
			labels = new ArrayList<Label>();
		}
		labels.add(label);
		
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
		amBalloon = new AmBalloon();
		
	}

	/*public Object getDataProvider() {
		return dataProvider;
	}
	
	public void addDataToProvider(IData dat){
		dataProvider.addData(dat);
	}*/

	public AmLegend getLegend() {
		return legend;
	}
	
	public void addLegend(AmLegend amLegend) {
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
	
	public List<Title> getTitles() {
		return titles;
	}

	public void addTitle(Title title) {
		if(titles==null){
			titles = new ArrayList<Title>();
		}
		titles.add(title);
		
	}


	/*public Object getDefs() {
		return defs;
	}*/

	

}
