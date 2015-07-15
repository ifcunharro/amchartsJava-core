package es.uvigo.esei.amchartsJava.constants;


public final class LegendPeriodValueTextConstant {
	
	private LegendPeriodValueTextConstant(){
		
	}
	
	private static class InitSingleton{
		private static final LegendPeriodValueTextConstant INSTANCE = new LegendPeriodValueTextConstant();
	}
	
	public static LegendPeriodValueTextConstant getInstance(){
		return InitSingleton.INSTANCE;
	}
	
	public enum LegendPeriodValueText{
		valueopen, valueclose, valuehigh, valuelow, valuesum, valueaverage, valuecount,
		openopen, openclose, openhigh, openlow, opensum, openaverage, opencount,
		closeopen, closeclose, closehigh, closelow, closesum, closeaverage, closecount,
		highopen, highclose, highhigh, highlow, highsum, highaverage, highcount,
		lowopen, lowclose, lowhigh, lowlow, lowsum, lowaverage, lowcount;
	
		
	
		private LegendPeriodValueText(){
			
		}
		
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
	
	public LegendPeriodValueText getValueOpen(){
		return LegendPeriodValueText.valueopen;
	}
	
	public LegendPeriodValueText getValueClose(){
		return LegendPeriodValueText.valueclose;
	}
	
	public LegendPeriodValueText getValueHigh(){
		return LegendPeriodValueText.valuehigh;
	}
	
	public LegendPeriodValueText getValueLow(){
		return LegendPeriodValueText.valuelow;
	}
	
	public LegendPeriodValueText getValueSum(){
		return LegendPeriodValueText.valuesum;
	}
	
	public LegendPeriodValueText getValueAverage(){
		return LegendPeriodValueText.valueaverage;
	}
	
	public LegendPeriodValueText getValueCount(){
		return LegendPeriodValueText.valuecount;
	}
	
	public LegendPeriodValueText getOpenOpen(){
		return LegendPeriodValueText.openopen;
	}
	
	public LegendPeriodValueText getOpenClose(){
		return LegendPeriodValueText.openclose;
	}
	
	public LegendPeriodValueText getOpenHigh(){
		return LegendPeriodValueText.openhigh;
	}
	
	public LegendPeriodValueText getOpenLow(){
		return LegendPeriodValueText.openlow;
	}
	
	public LegendPeriodValueText getOpenSum(){
		return LegendPeriodValueText.opensum;
	}
	
	public LegendPeriodValueText getOpenAverage(){
		return LegendPeriodValueText.openaverage;
	}
	
	public LegendPeriodValueText getOpenCount(){
		return LegendPeriodValueText.opencount;
	}
	
	public LegendPeriodValueText getCloseOpen(){
		return LegendPeriodValueText.closeopen;
	}
	
	public LegendPeriodValueText getCloseClose(){
		return LegendPeriodValueText.closeclose;
	}
	
	public LegendPeriodValueText getCloseHigh(){
		return LegendPeriodValueText.closehigh;
	}
	
	public LegendPeriodValueText getCloseLow(){
		return LegendPeriodValueText.closelow;
	}
	
	public LegendPeriodValueText getCloseSum(){
		return LegendPeriodValueText.closesum;
	}
	
	public LegendPeriodValueText getCloseAverage(){
		return LegendPeriodValueText.closeaverage;
	}
	
	public LegendPeriodValueText getCloseCount(){
		return LegendPeriodValueText.closecount;
	}
	
	public LegendPeriodValueText getHighOpen(){
		return LegendPeriodValueText.highopen;
	}
	
	public LegendPeriodValueText getHighClose(){
		return LegendPeriodValueText.highclose;
	}
	
	public LegendPeriodValueText getHighHigh(){
		return LegendPeriodValueText.highhigh;
	}
	
	public LegendPeriodValueText getHighLow(){
		return LegendPeriodValueText.highlow;
	}
	
	public LegendPeriodValueText getHighSum(){
		return LegendPeriodValueText.highsum;
	}
	
	public LegendPeriodValueText getHighAverage(){
		return LegendPeriodValueText.highaverage;
	}
	
	public LegendPeriodValueText getHighCount(){
		return LegendPeriodValueText.highcount;
	}
	
	public LegendPeriodValueText getLowOpen(){
		return LegendPeriodValueText.lowopen;
	}
	
	public LegendPeriodValueText getLowClose(){
		return LegendPeriodValueText.lowclose;
	}
	
	public LegendPeriodValueText getLowHigh(){
		return LegendPeriodValueText.lowhigh;
	}
	
	public LegendPeriodValueText getLowLow(){
		return LegendPeriodValueText.lowlow;
	}
	
	public LegendPeriodValueText getLowSum(){
		return LegendPeriodValueText.lowsum;
	}
	
	public LegendPeriodValueText getLowAverage(){
		return LegendPeriodValueText.lowaverage;
	}
	
	public LegendPeriodValueText getLowCount(){
		return LegendPeriodValueText.lowcount;
	}
	
	public LegendPeriodValueText[] values(){
		return LegendPeriodValueText.values();
	}
}
