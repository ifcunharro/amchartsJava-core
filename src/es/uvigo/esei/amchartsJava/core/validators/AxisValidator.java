package es.uvigo.esei.amchartsJava.core.validators;

import java.util.List;

import es.uvigo.esei.amchartsJava.core.controllers.axis.AxisBaseController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.CategoryAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.axis.ValueAxisRadarChartController;

/**
 * This class contains methods to cast Axis to concrete axis.
 * @author Iago Fernández Cuñarro
 *
 */
public class AxisValidator {
	
	private AxisValidator(){
		
	}
	
	/**
	 * Cast axis as Object to List of AxisBaseController
	 * @param axis Axis as Object.
	 * @return List of generic axis or null if can't cast.
	 */
	@SuppressWarnings("unchecked")
	public static List<AxisBaseController> castToListValueAxes(Object axis){
		List<?> list;
		if(axis==null){
			return null;
		}
		if(axis.getClass().getSimpleName().endsWith("List")){
			list = (List<?>) axis;
		}else{
			list = null;
		}
		if(list != null){
			if(list.isEmpty()){
				return null;
			}
			String nameClass = list.get(0).getClass().getSimpleName();
			return nameClass
					.endsWith("Controller") 
					&& (
							nameClass
							.startsWith("ValueAxis")
							|| nameClass.startsWith("CategoryAxis")
						)
					?(List<AxisBaseController>)list
					:null;
		}
		return null;
		
	}
	
	/**
	 * Cast AxisBaseController to CategoryAxisController.
	 * @param axis Generic axis.
	 * @return CategoryAxisController CategoryAxis or null if can't cast.
	 */
	public static CategoryAxisController castToCategoryAxis(AxisBaseController axis){
		if(axis != null){
			return axis
				.getClass()
				.getSimpleName()
				.equals("CategoryAxisController")
				? (CategoryAxisController) axis
				: null;
		}
		return null;
	
	}
	
	/**
	 * Cast AxisBaseController to ValueAxisController.
	 * @param axis Generic axis.
	 * @return ValueAxisController ValueAxis or null if can't cast.
	 */
	public static ValueAxisController castToValueAxis(AxisBaseController axis){
		if(axis != null){
			return axis
				.getClass()
				.getSimpleName()
				.equals("ValueAxisController")
				? (ValueAxisController) axis
				: null;
		}
		return null;
	
		
	}
	
	/**
	 * Cast AxisBaseController to ValueAxisRadarChartController.
	 * @param axis Generic axis.
	 * @return ValueAxisRadarChartController ValueAxis to radar chart or null if can't cast.
	 */
	public static ValueAxisRadarChartController castToValueAxisRadarChart(AxisBaseController axis){
		if(axis != null){
			return axis
				.getClass()
				.getSimpleName()
				.equals("ValueAxisRadarChartController")
				? (ValueAxisRadarChartController) axis
				: null;
		}
		return null;
	
		
	}
	
	

}
