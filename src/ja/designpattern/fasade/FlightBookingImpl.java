package ja.designpattern.fasade;

public class FlightBookingImpl implements FlightBooking{

	@Override
	public void book() {
		System.out.println("Flight is booking");
		
	}

}
