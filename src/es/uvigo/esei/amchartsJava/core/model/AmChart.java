package es.uvigo.esei.amchartsJava.core.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;








import java.util.Map;

import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import es.uvigo.esei.amchartsJava.core.controllers.AmBalloonController;
import es.uvigo.esei.amchartsJava.core.controllers.AmLegendController;
import es.uvigo.esei.amchartsJava.core.controllers.LabelController;
import es.uvigo.esei.amchartsJava.core.controllers.TitleController;
import es.uvigo.esei.amchartsJava.core.controllers.provider.DataProviderController;


public abstract class AmChart extends IModel {
	protected List<LabelController> labels;
	//guarda todos los fields activados para charts y el nombre asociado
	protected Map<String,String> chartFields;
	protected AmBalloonController balloon;
	protected List<Prefix> bigPrefixes;
	protected List<Prefix> smallPrefixes;
	//cambiar por clase y no es map es List<Map>
	//protected DataProvider dataProvider;
	//para filtros svg
	//protected Defs defs;
	protected AmLegendController legend;
	protected List<TitleController> titles;
	protected DataProviderController dataProvider;
	
	@JsonUnwrapped
	public String getDataProvider(){
		return dataProvider.toString();
	}
	
	public void setDataProvider(DataProviderController provider){
		dataProvider = provider;
	}
	
	
	public List<LabelController> getLabels() {
		return labels;
	}
	
	public void addField(String nameField, String valueField){
		if(chartFields == null){
			chartFields = new HashMap<String, String>();
		}
		chartFields.put(nameField, valueField);
	}
	
	public Map<String,String> getChartFields(){
		return chartFields;
	}
	
	public void setChartFields(HashMap<String, String> fieldKeys){
		if(chartFields == null){
			chartFields = new HashMap<String, String>();
		}
		chartFields = fieldKeys;
		setupFields();
	}
	
	private void setupFields() {
		Iterator<String> nameFields = chartFields.keySet().iterator();
		
		while(nameFields.hasNext()){
			switch(nameFields.next()){
				case "open":
					setFeature("openField",chartFields.get("openField"));
					break;
				case "close":
					setFeature("closeField",chartFields.get("closeField"));
					break;
				case "low":
					setFeature("lowField",chartFields.get("lowField"));
					break;
				case "high":
					setFeature("highField",chartFields.get("highField"));
					break;
				case "labelRadiusField":
					setFeature("labelRadiusField",chartFields.get("labelRadiusField"));
					break;
				case "categoryField":
					setFeature("categoryField",chartFields.get("categoryField"));
					break;
				case "alphaField":
					setFeature("alphaField",chartFields.get("alphaField"));
					break;
				case "classNameField":
					setFeature("classNameField",chartFields.get("classNameField"));
					break;
				case "colorField":
					setFeature("colorField",chartFields.get("colorField"));
					break;
				case "descriptionField":
					setFeature("descriptionField",chartFields.get("descriptionField"));
					break;
				case "patternField":
					setFeature("patterField",chartFields.get("patternField"));
					break;
				case "pulledField":
					setFeature("pulledField",chartFields.get("pulledField"));
					break;
				case "titleField":
					setFeature("titleField",chartFields.get("titleField"));
					break;
				case "urlField":
					setFeature("urlField",chartFields.get("urlField"));
					break;
				case "valueField":
					setFeature("valueField",chartFields.get("valueField"));
					break;
				case "visibleInLegendField":
					setFeature("visibleInLegendField",chartFields.get("visibleInLegendField"));
					break;
			}
		}
		
	}

	public void setAllLabels(List<LabelController> allLabels){
		if(labels==null){
			labels = new ArrayList<LabelController>();
		}
		labels = allLabels;
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

	@JsonRawValue
	public String getExport() {
		return "AmCharts.exportCFG";
	}

	public AmBalloonController getBalloon() {
		return balloon;
	}

	public void addBalloon(AmBalloonController amBalloon) {
			balloon = amBalloon;	
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
	
	//usado para deserializar json
	public void setTitles(List<TitleController> t){
		titles = t;
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
