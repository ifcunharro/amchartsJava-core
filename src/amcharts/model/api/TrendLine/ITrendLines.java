package amcharts.model.api.TrendLine;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_EMPTY)
public interface ITrendLines {

	public List<ITrendLine> getTrendLines();
	
	public void addTrendLine(ITrendLine tr);

}