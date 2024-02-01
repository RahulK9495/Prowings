package prowings.multithreading;

public class Theater {
	
	int totalseat = 10;
	
	public synchronized void bookSeats( int seats)
	{
		
		System.out.println("hiiii   "+Thread.currentThread().getName());
		System.out.println("hiiii   "+Thread.currentThread().getName());
		System.out.println("hiiii   "+Thread.currentThread().getName());

		{
			if (seats <= totalseat )
			{
				System.out.println(seats + "Seats booked successfully by :  "+Thread.currentThread().getName());
				totalseat=totalseat-seats;
				System.out.println("Remaining seats after booking : "+totalseat);
			}
			else
			{
				System.out.println("Can Not book : "+seats +"Seats....Available seats are : "+totalseat );
			}
		}
		System.out.println("hello : "+ Thread.currentThread().getName());
		System.out.println("hello : "+ Thread.currentThread().getName());
		System.out.println("hello : "+ Thread.currentThread().getName());
	}

}
