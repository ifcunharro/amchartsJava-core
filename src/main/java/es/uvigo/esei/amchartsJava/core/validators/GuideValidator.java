package es.uvigo.esei.amchartsJava.core.validators;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideCategoryAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideValueAxisController;

/**
 * This class contains methods to cast guides to concrete guide.
 * @author Iago Fernández Cuñarro
 *
 */
public class GuideValidator {
	
	private GuideValidator(){
		
	}
	
	/**
	 * Cast guides as Object to List of GuideController
	 * @param guides Guides as Object.
	 * @return List of generic guides or null if can't cast.
	 */
	@SuppressWarnings("unchecked")
	public static List<GuideController> castToListGuides(Object guides){
		List<?> list;
		if (guides == null) {
			return null;
		}
		if (guides.getClass().getSimpleName().endsWith("List")) {
			list = (List<?>) guides;
		} else {
			list = null;
		}
		if (list != null) {
			if(list.isEmpty()){
				return null;
			}
			String nameClass = list.get(0).getClass().getSimpleName();
			return nameClass
					.endsWith("Controller")
					&& nameClass
					.startsWith("Guide") 
					? (List<GuideController>) list
					: null;
		}
		return null;
			
		
	}
	
	/**
	 * Cast GuideController to GuideCategoryAxisController.
	 * @param guide Generic guide.
	 * @return GuideCategoryAxisController Guide to categoryAxis or null if can't cast.
	 */
	public static GuideCategoryAxisController castToGuideCategoryAxis(GuideController guide){
		if(guide != null){
			return guide
				.getClass()
				.getSimpleName()
				.equals("GuideCategoryAxisController")
				? (GuideCategoryAxisController) guide
				: null;
		}
		return null;
	
	}
	
	/**
	 * Cast GuideController to GuideRadarChartController.
	 * @param guide Generic guide.
	 * @return GuideRadarChartController Guide to radar chart or null if can't cast.
	 */
	public static GuideRadarChartController castToGuideRadarChart(GuideController guide){
		if(guide != null){
			return guide
				.getClass()
				.getSimpleName()
				.equals("GuideRadarChartController")
				? (GuideRadarChartController) guide
				: null;
		}
		return null;
	
	}
	
	/**
	 * Cast GuideController to GuideValueAxisController.
	 * @param guide Generic guide.
	 * @return GuideValueAxisController Guide to valueAxis or null if can't cast.
	 */
	public static GuideValueAxisController castToGuideValueAxis(GuideController guide){
		if(guide != null){
			return guide
				.getClass()
				.getSimpleName()
				.equals("GuideValueAxisController")
				? (GuideValueAxisController) guide
				: null;
		}
		return null;
	
	}

}
