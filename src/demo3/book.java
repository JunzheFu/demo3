package demo3;

public class book {
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


	public int getPages() {
		return pages;
	}


	public void setPages(int pages) {
		this.pages = pages;
	}


	public int getPublicationYear() {
		return publicationYear;
	}


	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	public book(String name, String author, int pages, int publicationYear, String iSBN) {
		super();
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.publicationYear = publicationYear;
		ISBN = iSBN;
	}


	private String name;
    
    private String author;


    private int pages;


    private int publicationYear;


    private String ISBN;
}
