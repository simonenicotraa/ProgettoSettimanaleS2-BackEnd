# ProgettoSettimanaleS2-BackEnd
Progetto Catalogo Bibliografico
Tramite creazione classi, gestire un [catalogo bibliotecario] formato da 
[libri] e [riviste], entrambi con i seguenti attributi:
(BiblioBM)
- Codice univoco ISBN;
- Titolo;
- Anno Pubblicazione;
- Numero Pagine;

 i [libri] hanno questi attributi esclusivi:
 (Book)
- Autore;
- Genere;

le [riviste] hanno:
(Magazine)
- Periodicita' [SETTIMANALE, MENSILE, SEMESTRALE]

Archivio deve permettere le seguenti operazioni: 
(Catalogo)
- Aggiunta di un Elemento;    
- Rimozione di un Elemento dato un codice ISBN;  
- Ricerca per ISBN;
- Ricerca per anno pubblicazione;
- Ricerca per Autore;
- Salvataggio su disco dell'archivio;
- Caricamento dal disco dell'archivio;


