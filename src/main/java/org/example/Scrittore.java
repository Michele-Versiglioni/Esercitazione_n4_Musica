package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scrittore implements Runnable {

    private String musica;
    private Brano brano;

    public Scrittore(String file) {
        this.musica = file;
    }

    public void setBrano(Brano brano) {
        this.brano = brano;
    }

    @Override
    public void run() {
        scriviJson();
    }

    public void scriviJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(brano);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(musica))) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
