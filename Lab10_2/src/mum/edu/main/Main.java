package mum.edu.main;

import java.util.ArrayList;
import java.util.List;

import mum.edu.context.AirlineProfit;
import mum.edu.flight.Flight;
import mum.edu.modelImpl.SinglePrice;

public class Main {
	public static void main(String[] str){
		List<Flight> flights = new ArrayList<Flight>();
		flights.add(new Flight(250));
		flights.add( new Flight(200));
		flights.add( new Flight(247));
		
		AirlineProfit ap = new AirlineProfit();
		ap.setStrategy(new SinglePrice());
		System.out.println(ap.returnStrategyProfit(flights));
	}
}
