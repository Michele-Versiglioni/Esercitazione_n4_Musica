package org.example;

import java.util.List;

/**
 * Classe Scrittore che salva una lista di brani su un file JSON.
 * Implementa Runnable per poter essere eseguita in un thread separato.
 */
public class Scrittore implements Runnable {

    private String musica;
    private List<Brano> lista;
    private GestioneFile gestioneFile;

    /**
     * Costruttore della classe Scrittore.
     *
     * @param musica nome del file JSON su cui salvare i brani
     * @param lista lista di brani da scrivere nel file
     * @param gestioneFile istanza di GestioneFile per gestire la scrittura
     */
    public Scrittore(String musica, List<Brano> lista, GestioneFile gestioneFile) {
        this.musica = musica;
        this.lista = lista;
        this.gestioneFile = gestioneFile;
    }

    /**
     * Metodo run eseguito dal thread.
     * Scrive la lista di brani sul file JSON.
     */
    @Override
    public void run() {
        gestioneFile.scriviJson(musica, lista);
        System.out.println("File JSON scritto correttamente");
    }
}
