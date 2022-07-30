package it.epicode.catalogo;

import java.io.File;
import java.io.IOException;

import java.util.HashMap;

import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Catalogo {
	// creo una lista Biblio con book e Magazine e inserisco quelli creati in
	// precedenza
	int i = 0;
	static String c;
	Map<String, BiblioBM> contMap = new HashMap<>();
	private static final Logger log = LoggerFactory.getLogger(Catalogo.class);

	// metodo per aggiungere un elemento a una lista book or magazine (bORm)
	public void add(BiblioBM bORm) {
		i++;
		c = "0" + i;
		bORm.setCodiceISBN(c);
		contMap.put(c, bORm);
		log.info("Ho aggiunto nel catalogo " + bORm);
	}

	public void remove(String isbm) {
		// rimuovo elemento dal contenitore tramite la chiave
		contMap.remove(isbm);
		log.info("========= Ho cancellato l'articolo con il codice =========" + isbm);
		System.out.println(contMap);
	}

	public void searchForIsbm(String Isbm) {
		log.info("=============== Cerco in biblioteca articolo con codice " + Isbm + " ===============");
		System.out.println(contMap.get(Isbm));
	}

	public void searchForYear(Integer year) {
		log.info("=============== Sto cercando un articolo per ANNO DI PUBBLICAZIONE ===============");
		contMap.values().stream()
				// eseguo il filter su stream confrontando parametro del metodo con ogni
				// elemento streammato
				.filter(c -> year.equals(c.getYear()))
				// stampo in console tutto l'oggetto che contiene l'anno passato
				.forEach(c -> System.out.println(c));
	}

	public void searchForAuthor(String name) {
		log.info("=============== Sto cercando un articolo per AUTORE ===============");

		contMap.values().stream()
				// filtro lo stream
				// attributo autore solo nella classe Book.
				.filter(elem -> elem instanceof Book)
				// map casto ogni elemento
				.map(elem -> (Book) elem)
				// filtro in base al nome autore passato al metodo
				.filter(c -> name.equals(c.getAuthor()))
				// Stampo in console
				.forEach(c -> System.out.println(c));
	}

	public void saveOnDisk(String path) {
		log.info("================ Sto salvando su disco ===============");
		// imposto una variabile stringa
		String allLibrary = "";
		// itero il mio contenitore
		for (BiblioBM ele : contMap.values()) {
			// aggiungo alla mia stringa ogni singolo elemento estratto dal contenitore che
			// trasformo in stringa
			allLibrary += ele.toString();
		}
		// FileHandling - va a cercare l'esistenza
		// della cartella e va a comporre un file parametri che passa utente
		File file = new File(path);
		try {// crea e salva il file
			FileUtils.writeStringToFile(file, allLibrary, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readFromDisk(String path) {
		log.info("================ Sto Caricando da disco ===============");
		try {
			// prendo i file dal txt creato. Passo la rotta al metodo. riporta in console
			// il contenuto del file txt
			String readFile = FileUtils.readFileToString(new File(path));
			// stampo in console
			System.out.println(readFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
