package es.uvigo.esei.amchartsjava.core.validators;

import java.util.List;

import es.uvigo.esei.amchartsjava.core.controllers.trendLines.TrendLineSerialChartController;
import es.uvigo.esei.amchartsjava.core.controllers.trendLines.TrendLineXyChartController;

/**
 * This class contains methods to cast TrendLines to concrete trendLine.
 * @author Iago Fernández Cuñarro
 *
 */
public final class TrendLineValidator {
	
	private TrendLineValidator(){
		
	}
	
	/**
	 * Cast trendLines as Object to List of TrendLineSerialChartController.
	 * @param trendLines trendLine as Object.
	 * @return List of generic trendLines or null if can't cast.
	 */
	@SuppressWarnings("unchecked")
	public static List<TrendLineSerialChartController> castToListTrendLines(final Object trendLines){
		List<?> list;
		if(trendLines==null){
			return null;
		}
		if(trendLines.getClass().getSimpleName().endsWith("List")){
			list = (List<?>) trendLines;
		}else{
			list = null;
		}
		if(list != null){
			if(list.isEmpty()){
				return null;
			}
			final String nameClass = list.get(0).getClass().getSimpleName();
			return nameClass
					.endsWith("Controller") 
					&& nameClass
					.startsWith("TrendLine")
					?(List<TrendLineSerialChartController>)list
					:null;
		}
		return null;
		
	}
	
	/**
	 * Cast TrendLineSerialChartController to TrendLineXyChartController.
	 * @param trendLine Generic trendLine.
	 * @return TrendLineXyChartController TrendLine to xy chart or null if can't cast.
	 */
	public static TrendLineXyChartController castToTrendLineXyChart(final TrendLineSerialChartController trendLine){
		if(trendLine != null){
			return trendLine
				.getClass()
				.getSimpleName()
				.equals("TrendLineXyChartController")
				? (TrendLineXyChartController) trendLine
				: null;
		}
		return null;
	
		
	}

}
