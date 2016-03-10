package es.uvigo.esei.amchartsJava.core.constants;

public enum LegendPeriodValueText {
	valueopen, valueclose, valuehigh, valuelow, valuesum, valueaverage, valuecount,
	openopen, openclose, openhigh, openlow, opensum, openaverage, opencount,
	closeopen, closeclose, closehigh, closelow, closesum, closeaverage, closecount,
	highopen, highclose, highhigh, highlow, highsum, highaverage, highcount,
	lowopen, lowclose, lowhigh, lowlow, lowsum, lowaverage, lowcount;

	public String toString(){
		switch(this){
			case valueopen: 
				return "[[value.open]]";
			case valueclose: 
				return "[[value.close]]";
			case valuehigh: 
				return "[[value.high]]";
			case valuelow: 
				return "[[value.low]]";
			case valuesum: 
				return "[[value.sum]]";
			case valueaverage: 
				return "[[value.average]]";
			case valuecount: 
				return "[[value.count]]";
			case openopen: 
				return "[[open.open]]";
			case openclose: 
				return "[[open.close]]";
			case openhigh: 
				return "[[open.high]]";
			case openlow: 
				return "[[open.low]]";
			case opensum: 
				return "[[open.sum]]";
			case openaverage: 
				return "[[open.average]]";
			case opencount: 
				return "[[open.count]]";
			case closeopen: 
				return "[[close.open]]";
			case closeclose: 
				return "[[close.close]]";
			case closehigh: 
				return "[[close.high]]";
			case closelow: 
				return "[[close.low]]";
			case closesum: 
				return "[[close.sum]]";
			case closeaverage: 
				return "[[close.average]]";
			case closecount: 
				return "[[close.count]]";
			case highopen: 
				return "[[high.open]]";
			case highclose: 
				return "[[high.close]]";
			case highhigh: 
				return "[[high.high]]";
			case highlow: 
				return "[[high.low]]";
			case highsum: 
				return "[[high.sum]]";
			case highaverage: 
				return "[[high.average]]";
			case highcount: 
				return "[[high.count]]";
			case lowopen:
				return "[[low.open]]";
			case lowclose:
				return "[[low.close]]";
			case lowhigh:
				return "[[low.high]]";
			case lowlow:
				return "[[low.low]]";
			case lowsum:
				return "[[low.sum]]";
			case lowaverage:
				return "[[low.average]]";
			case lowcount:
				return "[[low.count]]";
							
		}
		return null;
	}

}
