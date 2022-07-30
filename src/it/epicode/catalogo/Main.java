package it.epicode.catalogo;

public class Main {

	public static void main(String[] args) {
		// creo magazine e Book
		String c = "";
		Magazine ma = new Magazine(c, "Forest", 2000, 10, Periodicity.SETTIMANALE);
		Magazine ma1 = new Magazine(c, "L'erba del vicino", 1900, 20, Periodicity.MENSILE);
		Magazine ma2 = new Magazine(c, "Il gioco degli esperti", 2020, 70, Periodicity.SEMESTRALE);
		Magazine ma3 = new Magazine(c, "Giriamo il mondo", 2002, 18, Periodicity.SETTIMANALE);

		Book b1 = new Book(c, "Aiutate il soldato Ryan", 1505, 300, "Salvo Polpetta", "Comico");
		Book b2 = new Book(c, "Io sono io", 2022, 490, "Gino Merendina", "Thriller");
		Book b3 = new Book(c, "Palo all'ultimo", 1490, 150, "Mario Credente", "Biografia");
		Book b4 = new Book(c, "Sollevato dal re", 300, 200, "Ottaviano Mitico", "Storico");
		Catalogo cat = new Catalogo();
		// utilizzo i metodi
		cat.add(ma);
		cat.add(ma3);
		cat.add(ma1);
		cat.add(ma2);

		cat.add(b4);
		cat.add(b3);
		cat.add(b2);
		cat.add(b1);
		cat.remove("02");

		cat.searchForIsbm("06");
		cat.searchForYear(300);
		cat.searchForAuthor("Mario Credente");

		cat.saveOnDisk("archivio/library.txt");
		cat.readFromDisk("archivio/library.txt");

	}

}
