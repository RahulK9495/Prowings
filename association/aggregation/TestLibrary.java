package prowings.association.aggregation;

public class TestLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1=new Book("two states","chetan bhagat","friction");
		Book b2=new Book("java program","james ghosaling","programming");
		Book b3=new Book("maths","rahul","education");
		
		Library library=new Library();
		library.addBookToLibrary(b1);
		library.addBookToLibrary(b2);
		library.addBookToLibrary(b3);
		library.showBooksinLibrary();
	}

}
