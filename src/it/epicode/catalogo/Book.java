package it.epicode.catalogo;

public class Book extends BiblioBM {
	private String author;
	private String genre;

	public Book(String codiceISBN, String title, int year, int pages, String author, String genre) {
		super(codiceISBN, title, year, pages);
		this.author = author;
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return String.format(
				"Book [author=%s, genre=%s, CodiceISBN: %s, Title: %s, Year: %s, Pages: %s]",
				author, genre, getCodiceISBN(), getTitle(), getYear(), getPages());
	}

	
}
