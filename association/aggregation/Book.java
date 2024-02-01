package prowings.association.aggregation;

public class Book {

	String name;
	String author;
	String type;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String author, String type) {
		super();
		this.name = name;
		this.author = author;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
