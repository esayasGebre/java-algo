package ja.designpattern.fasade;

public class TravelBookingFacadeImpl  implements TravelPackageFacade{

	@Override
	public void book() {
		
		FlightBooking fb = new FlightBookingImpl();
		fb.book();
		
		HotelBooking hb = new HotelBookingImpl();
		hb.book();
		
		TransferBooking tb = new TransferBookingImpl();
		tb.book();
		
		System.out.println("Travel is booking");
		
	}

}
