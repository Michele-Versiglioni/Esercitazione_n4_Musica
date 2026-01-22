package org.example;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lettore implements Runnable{
    String Musica;

    public Lettore(String file){
        this.Musica = file;
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
    public void run() {
        leggi();
    }
    public Brano leggiDalFile() throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader("Musica.json"))){
            Gson gson = new Gson();
            String brano;
            brano = gson.toJson(reader);
        }
    }
}
