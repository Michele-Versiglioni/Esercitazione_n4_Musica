package org.example;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lettore implements Runnable {

    private String musica;

    public Lettore(String file) {
        this.musica = file;
    }

    public Brano leggiDalFile() throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader(musica))) {
            Gson gson = new Gson();
            return gson.fromJson(reader, Brano.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void run() {
        try {
            Brano b = leggiDalFile();
            if (b != null) {
                System.out.println(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
