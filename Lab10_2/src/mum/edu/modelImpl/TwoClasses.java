package mum.edu.modelImpl;

import java.util.List;

import mum.edu.flight.Flight;
import mum.edu.model.StrategyModelInt;

public class TwoClasses implements StrategyModelInt{

	@Override
	public long getRevenue(List<Flight> flights) {
		long totalTicketSale =0;
		long netProfit=0;
		long revenue = 0;
		for(Flight flight: flights){
			revenue = (long) ((long) (1/3 * (flight.getNumberOfPassengers())) * (1.5*(BASEPRICE)));
		}
		return revenue;
	}
}
