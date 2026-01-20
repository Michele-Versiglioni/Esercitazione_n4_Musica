package org.example;

import java.io.FileReader;
import java.io.IOException;

public class Lettore implements Runnable{
    String Musica;

    public Lettore(String nomeFile){
        this.Musica = Musica;
    }

    public void leggi(){
        FileReader fr;
        int i;
        try {
            fr = new FileReader(Musica);
            while ((i=fr.read()) != -1)
                System.out.print((char) i);

            System.out.print("\n\r");
            fr.close();
        } catch (IOException ex) {
            System.err.println("Errore in lettura!");
        }
    }


    public void run(){
        leggi();
    }
}
