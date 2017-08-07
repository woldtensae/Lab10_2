package mum.edu.model;

import java.util.List;

import mum.edu.flight.Flight;

public interface StrategyModelInt {
	public static long BASEPRICE = 300;
	public final long FLIGHTCOST = 50000;
	long getRevenue(List<Flight> flights);
}
