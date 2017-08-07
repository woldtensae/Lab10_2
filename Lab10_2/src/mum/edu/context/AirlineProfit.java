package mum.edu.context;

import java.util.List;

import mum.edu.flight.Flight;
import mum.edu.model.StrategyModelInt;

public class AirlineProfit {
	StrategyModelInt sm;
	
	public void setStrategy(StrategyModelInt sm){
		this.sm = sm;
	}
	
	public long returnStrategyProfit(List<Flight> flights){
		return sm.getRevenue(flights);
	}
	
}
