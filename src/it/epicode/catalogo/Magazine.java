package it.epicode.catalogo;

public class Magazine extends BiblioBM {
private Periodicity periodicity;

public Magazine(String codiceISBN, String title, int year, int pages, Periodicity periodicity) {
	super(codiceISBN, title, year, pages);
	this.periodicity = periodicity;
}

public Periodicity getPeriodicity() {
	return periodicity;
}

public void setPeriodicity(Periodicity periodicity) {
	this.periodicity = periodicity;
}


@Override
public String toString() {
	//con il super.toString ottengo la stringa di testo dalla superclasse
	return String.format("Magazine [periodicity=%s, %s]", periodicity, super.toString());
}



}
