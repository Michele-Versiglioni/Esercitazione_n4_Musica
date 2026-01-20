package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Scrittore implements Runnable{

    String Musica;

    public Scrittore(String nomeFile){
        this.Musica = Musica;
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
}