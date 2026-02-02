package org.example;

import java.util.List;

public class Scrittore implements Runnable {

    private String musica;
    private List<Brano> lista;
    private GestioneFile gestioneFile;

    public Scrittore(String musica, List<Brano> lista, GestioneFile gestioneFile) {
        this.musica = musica;
        this.lista = lista;
        this.gestioneFile = gestioneFile;
    }

    @Override
    public void run() {
        gestioneFile.scriviJson(musica, lista);
        System.out.println("File JSON scritto correttamente");
    }
}