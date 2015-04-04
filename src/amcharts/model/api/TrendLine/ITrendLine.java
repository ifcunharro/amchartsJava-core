package amcharts.model.api.TrendLine;

import java.util.Map;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public abstract class ITrendLine {
	//trendLines es un map para ayudar al parseo Json
	protected Map<String,Object> trendLine;
	
	//falta implementar valueAxis
	//private ValueAxis valueAxis;

	
	protected ITrendLine(){
		trendLine = new HashMap<String,Object>();
	}

	
	public final Object getDashLength() {
		return trendLine.get("dashLength");
	}

	
	public final void setDashLength(Number dashLength) {
		trendLine.put("dashLength",dashLength);
	}
	
	public final Object getId(){
		return trendLine.get("id");
	}
	
	
	public final void setId(String id) {
		trendLine.put("id",id);
		
	}
	

	public final Object getLineColor() {
		return trendLine.get("lineColor");
	}

	public final void setLineColor(String lineColor) {
		trendLine.put("lineColor", lineColor);
	}

	public final Object getFinalCategory() {
		return trendLine.get("finalCategory");
	}

	public final void setFinalCategory(String finalCategory) {
		trendLine.put("finalCategory",finalCategory);
	}

	public final Object getFinalDate() {
		return trendLine.get("finalDate");
	}

	public final void setFinalDate(String finalDate) {
		trendLine.put("finalDate", finalDate);
	}

	public final Object getFinalValue() {
		return trendLine.get("finalValue");
	}

	public final void setFinalValue(Number finalValue) {
		trendLine.put("finalValue", finalValue);
	}

	public final Object getInitialCategory() {
		return trendLine.get("initialCategory");
	}

	public final void setInitialCategory(String initialCategory) {
		trendLine.put("initialCategory", initialCategory);
	}

	public final Object getInitialDate() {
		return trendLine.get("initialDate");
	}

	public final void setInitialDate(String initialDate) {
		trendLine.put("initialDate", initialDate);
	}

	public final Object getInitialValue() {
		return trendLine.get("initialValue");
	}

	public final void setInitialValue(Number initialValue) {
		trendLine.put("initialValue", initialValue);
	}

	public final Object getLineAlpha() {
		return trendLine.get("lineAlpha");
	}

	public final void setLineAlpha(Number lineAlpha) {
		trendLine.put("lineAlpha", lineAlpha);
	}

	public final Object getLineThickness() {
		return trendLine.get("lineThickness");
	}

	public final void setLineThickness(Integer lineThickness) {
		trendLine.put("lineThickness", lineThickness);
	}
	
	public Object getValueAxis(){
		return trendLine.get("valueAxis");
	}
	
	public void setValueAxis(String idValueAxis){
		trendLine.put("valueAxis", idValueAxis);
	}
	
}
