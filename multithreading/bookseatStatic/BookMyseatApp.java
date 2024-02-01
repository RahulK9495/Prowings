package prowings.multithreading.bookseatStatic;

public class BookMyseatApp {

	public static void main(String[] args) {

		Theater theater1 = new Theater();
		Theater theater2 = new Theater();

		MyThreadOne t1 = new MyThreadOne(theater1, 3);
		MyThreadTwo t2 = new MyThreadTwo(theater1, 4);

		t1.setName("Ram");
		t2.setName("Sham");

		t1.start();
		t2.start();

		MyThreadOne t3 = new MyThreadOne(theater2, 1);
		MyThreadTwo t4 = new MyThreadTwo(theater2, 6);

		t3.setName("abhi");
		t4.setName("rahul");

		t3.start();
		t4.start();

	}

}
