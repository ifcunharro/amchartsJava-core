package es.uvigo.esei.amchartsJava.core.validators;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideCategoryAxisController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideRadarChartController;
import es.uvigo.esei.amchartsJava.core.controllers.guides.GuideValueAxisController;

public class GuideValidatorTest {
	
	@Test
	public void castToListGuides_can_revert_object_to_list_of_GuideController(){
		List<GuideController> list = new ArrayList<>();
		
		GuideCategoryAxisController guideCat = new GuideCategoryAxisController();
		GuideValueAxisController guideAxis = new GuideValueAxisController();
		GuideRadarChartController guideRadar = new GuideRadarChartController();
		list.add(guideCat);
		list.add(guideAxis);
		list.add(guideRadar);
		
		Object listObject = (Object) list;
		
		List<GuideController> listRecovery = GuideValidator.castToListGuides(listObject);
		
		assertTrue(listRecovery != null);
		assertEquals(3,(Object)listRecovery.size());
	}
	
	@Test
	public void castToListGuides_must_return_null_if_object_is_not_list_of_GuideController(){
		Object noListGuides = 9; 
		
		List<GuideController> listRecovery = GuideValidator.castToListGuides(noListGuides);
		
		assertNull(listRecovery);
	}
	
	@Test
	public void castToGuideCategoryAxis_can_cast_GuideController_to_GuideCategoryAxis_if_is_GuideCategoryAxis(){
		GuideController guideCat = new GuideCategoryAxisController();
		
		GuideCategoryAxisController guideCatCast = GuideValidator.castToGuideCategoryAxis(guideCat);
		
		assertTrue(guideCatCast != null);
	}
	
	@Test
	public void castToGuideCategoryAxis_return_null_if_GuideController_is_not_GuideCategoryAxis(){
		GuideController guideAxis = new GuideValueAxisController();
		
		GuideCategoryAxisController guideCatCast = GuideValidator.castToGuideCategoryAxis(guideAxis);
		
		assertNull(guideCatCast);
	}
	
	@Test
	public void castToGuideRadarChart_can_cast_GuideController_to_GuideRadarChart_if_is_GuideRadarChart(){
		GuideController guideRadar = new GuideRadarChartController();
		
		GuideRadarChartController guideRadarCast = GuideValidator.castToGuideRadarChart(guideRadar);
		
		assertTrue(guideRadarCast != null);
	}
	
	@Test
	public void castToGuideRadarChart_return_null_if_GuideController_is_not_GuideRadarChart(){
		GuideController guideAxis = new GuideValueAxisController();
		
		GuideRadarChartController guideRadarCast = GuideValidator.castToGuideRadarChart(guideAxis);
		
		assertNull(guideRadarCast);
	}
	
	@Test
	public void castToGuideValueAxis_can_cast_GuideController_to_GuideValueAxis_if_is_GuideValueAxis(){
		GuideController guideAxis = new GuideValueAxisController();
		
		GuideValueAxisController guideAxisCast = GuideValidator.castToGuideValueAxis(guideAxis);
		
		assertTrue(guideAxisCast != null);
	}
	
	@Test
	public void castToGuideValueAxis_return_null_if_GuideController_is_not_GuideValueAxis(){
		GuideController guideRadar = new GuideRadarChartController();
		
		GuideValueAxisController guideAxisCast = GuideValidator.castToGuideValueAxis(guideRadar);
		
		assertNull(guideAxisCast);
	}

}
