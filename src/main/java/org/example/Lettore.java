package org.example;

/**
 * Classe Lettore che legge i brani da un file JSON e li visualizza.
 * Implementa Runnable per poter essere eseguita in un thread separato.
 */
public class Lettore implements Runnable {

    private String musica;
    private GestioneFile gestioneFile;

    /**
     * Costruttore della classe Lettore.
     *
     * @param musica nome del file JSON da leggere
     * @param gestioneFile istanza di GestioneFile per leggere i dati
     */
    public Lettore(String musica, GestioneFile gestioneFile) {
        this.musica = musica;
        this.gestioneFile = gestioneFile;
    }

    /**
     * Metodo run eseguito dal thread.
     * Legge il file usando BufferedReader e Gson e stampa i brani.
     */
    @Override
    public void run() {
        System.out.println("\n--- LETTURA CON BUFFEREDREADER ---");
        gestioneFile.leggiConBufferedReader(musica);
        System.out.println("\n--- LETTURA CON GSON ---");
        for (Brano b : gestioneFile.leggiConGson(musica)) {
            System.out.println(b);
        }
    }
}