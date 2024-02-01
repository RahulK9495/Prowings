package prowings.multithreading.bookseatStatic;

public class Theater {

	static int totalseat = 10;

	public static synchronized void bookSeats(int seats) {

		{
			if (seats <= totalseat) {
				System.out.println(seats + "  Seats booked successfully by :  " + Thread.currentThread().getName());
				totalseat = totalseat - seats;
				System.out.println("Remaining seats after booking : " + totalseat);
			} else {
				System.out.println("Can Not book : " + seats + "Seats....Available seats are : " + totalseat);
			}
		}
	}
	int i=0;
	int j=0;

}
