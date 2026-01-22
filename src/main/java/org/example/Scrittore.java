package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Scrittore implements Runnable{

    private String Musica;
    private Object Brano;

    public Scrittore(String file){
        this.Musica = file;
    }

    @Override
    public void run() {
        scrivi();
    }
    public void scrivi(){
        BufferedWriter br=null;

        try {
            br = new BufferedWriter(
                    new FileWriter(Musica));
            br.write("File in output");
            br.write("\n\r");
            br.flush();
        } catch (IOException ex) {
            Logger.getLogger(Scrittore.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            if (br!=null)
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(Scrittore.class.getName()).log(Level.SEVERE, null, ex);
                }

        }
    }
    public void leggiGson(Brano brano){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json= gson.toJson(Brano);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Musica.json"))){
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}