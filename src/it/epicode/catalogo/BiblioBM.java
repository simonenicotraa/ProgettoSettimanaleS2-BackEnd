package it.epicode.catalogo;

import java.util.Objects;

public abstract class BiblioBM {
	private String codiceISBN;
	private String title;
	private int year;
	private int pages;

	public String getCodiceISBN() {
		return codiceISBN;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public int getPages() {
		return pages;
	}

	public void setCodiceISBN(String codiceISBN) {
		this.codiceISBN = codiceISBN;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	//==============================Costruttori===================================
	public BiblioBM(String codiceISBN, String title, int year, int pages) {
		
		this.codiceISBN = codiceISBN;
		this.title = title;
		this.year = year;
		this.pages = pages;
	}

	public BiblioBM() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(codiceISBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BiblioBM other = (BiblioBM) obj;
		return Objects.equals(codiceISBN, other.codiceISBN);
	}

	@Override
	public String toString() {
		return String.format("Catalogo [codiceISBN= %s, title=%s, year=%s, pages=%s]", codiceISBN, title,
				year, pages);
	}

}
