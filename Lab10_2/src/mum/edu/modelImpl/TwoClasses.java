package mum.edu.modelImpl;

import java.util.List;

import mum.edu.flight.Flight;
import mum.edu.model.StrategyModelInt;

public class TwoClasses implements StrategyModelInt{

	@Override
	public long getRevenue(List<Flight> flights) {
		long totalTicketSale =0;
		long netProfit=0;
		long totalNetProfit = 0;
		for(Flight flight: flights){
			totalTicketSale = (long) ((long) (1/3 * (flight.getNumberOfPassengers())) * (1.5*(BASEPRICE)));
			netProfit = totalTicketSale - FLIGHTCOST;
			totalNetProfit += netProfit;
			totalTicketSale = 0; netProfit =0;
		}
		return totalNetProfit;
	}
}
