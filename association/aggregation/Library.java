package prowings.association.aggregation;

public class Library {

	String name;
	Book book;
	Book[] books; 
	
	
	
	
	public void addBookToLibrary(Book book)
	{
		int count=0;
		books=new Book[5];
		
		for(int i=0;i<books.length;i++)
		{
			if(books[i]==null)
			{
				books[i]=book;
				break;
			}
			
			count++;
		}
		System.out.println("Book added successfully!!!!");	
	}
	
	public Book[] showBooksinLibrary()
	{
		
		for(Book b:books)
		{
			System.out.println("Book name is "+b.getName()+ " and author name is "+b.getAuthor());
			break;
		}
		return books;
		
	}
}
