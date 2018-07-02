import java.util.ArrayList;

public class SeatHold {
	private static int numSeatHolds = 0;
	private int seatHoldId;
	private String customerEmail;
	private ArrayList<Seat> seats;
	
	public SeatHold(int numSeats, String customerEmail) {
		this.seatHoldId = numSeatHolds + 1;
		numSeatHolds++;
		this.customerEmail = customerEmail;
		
		seats = new ArrayList<Seat>(numSeats);
	}
	
	public void addSeat(Seat seat) {
		this.seats.add(seat);
	}
	
	public int getSeatHoldId() { return this.seatHoldId; }
	
	public String getSeatHoldCustomerEmail() { return this.customerEmail; }
	
	public ArrayList<Seat> getSeats() { return this.seats; }
}