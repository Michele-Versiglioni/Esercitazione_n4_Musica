package org.example;

public class Lettore implements Runnable {

    private String musica;
    private GestioneFile gestioneFile;

    public Lettore(String musica, GestioneFile gestioneFile) {
        this.musica = musica;
        this.gestioneFile = gestioneFile;
    }

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