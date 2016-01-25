package es.uvigo.esei.amchartsJava.core.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonRawValue;

import es.uvigo.esei.amchartsJava.core.controllers.AmBalloonController;
import es.uvigo.esei.amchartsJava.core.controllers.AmLegendController;
import es.uvigo.esei.amchartsJava.core.controllers.LabelController;
import es.uvigo.esei.amchartsJava.core.controllers.TitleController;
import es.uvigo.esei.amchartsJava.core.controllers.provider.DataProviderController;

/**
 * Model class for AmChart.
 * @author Iago Fernández Cuñarro
 *
 */
public abstract class AmChart extends IModel {
	protected List<LabelController> labels;
	//guarda todos los fields activados para charts y el nombre asociado
	protected Map<String,String> chartFields;
	protected AmBalloonController balloon;
	protected AmLegendController legend;
	protected List<TitleController> titles;
	protected DataProviderController dataProvider;
	
	/**
	 * Get dataProvider.
	 * @return String DataProvider.
	 */
	public DataProviderController getDataProvider(){
		if(dataProvider != null){
			return dataProvider;
		}else{
			return null;
		}
	}
	
	/**
	 * Set dataProvider.
	 * @param provider Controller for dataProvider.
	 */
	public void setDataProvider(DataProviderController provider){
		dataProvider = provider;
	}
	
	/**
	 * Get labels.
	 * @return List of labels.
	 */
	public List<LabelController> getLabels() {
		return labels;
	}
	
	/**
	 * Add a nameField of chart used by user.
	 * @param nameField nameField amcharts.
	 * @param valueField nameField user.
	 */
	public void addField(String nameField, String valueField){
		if(chartFields == null){
			chartFields = new HashMap<String, String>();
		}
		chartFields.put(nameField, valueField);
	}
	
	/**
	 * Get relation fields user-amcharts to charts.
	 * @return Relation user-amcharts nameFields.
	 */
	public Map<String,String> getChartFields(){
		return chartFields;
	}
	
	/**
	 * Save relation nameFields amcharts-user.
	 * @param fieldKeys Relation amcharts-user nameFields.
	 */
	public void setChartFields(HashMap<String, String> fieldKeys){
		if(chartFields == null){
			chartFields = new HashMap<String, String>();
		}
		chartFields = fieldKeys;
		setupFields();
	}
	
	//used to set nameFields used by user in properties amcharts. Values can be loaded from
	//json file
	private void setupFields() {
		Iterator<String> nameFields = chartFields.keySet().iterator();
		
		while(nameFields.hasNext()){
			switch(nameFields.next()){
				case "openField":
					setFeature("openField",chartFields.get("openField"));
					break;
				case "closeField":
					setFeature("closeField",chartFields.get("closeField"));
					break;
				case "lowField":
					setFeature("lowField",chartFields.get("lowField"));
					break;
				case "highField":
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

	/**
	 * Set allLabels.
	 * @param allLabels List of controllers for labels.
	 */
	public void setAllLabels(List<LabelController> allLabels){
		if(labels==null){
			labels = new ArrayList<LabelController>();
		}
		labels = allLabels;
	}

	/**
	 * Add a label.
	 * @param labelController Controller for label.
	 */
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

	/**
	 * Get export config.
	 * @return String Value for export.
	 */
	@JsonRawValue
	public String getExport() {
		return "AmCharts.exportCFG";
	}

	/**
	 * Get balloon.
	 * @return AmBalloonController Controller for AmBalloon.
	 */
	public AmBalloonController getBalloon() {
		return balloon;
	}

	/**
	 * Add a balloon to chart.
	 * @param amBalloon Controller for AmBalloon.
	 */
	public void addBalloon(AmBalloonController amBalloon) {
			balloon = amBalloon;	
	}

	/*public Object getDataProvider() {
		return dataProvider;
	}
	
	public void addDataToProvider(IData dat){
		dataProvider.addData(dat);
	}*/

	/**
	 * Get legend.
	 * @return AmLegendController Controller for AmLegend.
	 */
	public AmLegendController getLegend() {
		return legend;
	}
	
	/**
	 * Add a legend to chart.
	 * @param amLegend Controller for AmLegend.
	 */
	public void addLegend(AmLegendController amLegend) {
		legend = amLegend;
		
	}
	
	/**
	 * Get titles.
	 * @return List of titles.
	 */
	public List<TitleController> getTitles() {
		return titles;
	}

	/**
	 * Add a title to chart.
	 * @param titleController Controller for Title.
	 */
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
	/**
	 * Set titles from json.
	 * @param t Titles.
	 */
	public void setTitles(List<TitleController> t){
		titles = t;
	}

	/**
	 * Remove all labels from chart.
	 */
	public void clearLabels() {
		labels = null;
		System.gc();
		
	}

	/**
	 * Remove legend from chart.
	 */
	public void removeLegend() {
		legend = null;
		System.gc();
		
	}
	
}
