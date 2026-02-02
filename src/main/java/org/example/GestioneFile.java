package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe GestioneFile che gestisce la lettura e la scrittura di brani su file JSON.
 */
public class GestioneFile {

    /**
     * Legge un file riga per riga usando BufferedReader e stampa il contenuto.
     *
     * @param musica nome del file da leggere
     */
    public void leggiConBufferedReader(String musica) {
        try (BufferedReader br = new BufferedReader(new FileReader(musica))) {
            String riga;
            while ((riga = br.readLine()) != null) {
                System.out.println(riga);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Legge un file JSON e lo converte in una lista di oggetti Brano usando Gson.
     *
     * @param musica nome del file JSON da leggere
     * @return lista di brani letti dal file
     */
    public List<Brano> leggiConGson(String musica) {
        try (BufferedReader br = new BufferedReader(new FileReader(musica))) {
            Gson gson = new Gson();
            Brano[] brani = gson.fromJson(br, Brano[].class);
            return Arrays.asList(brani);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    /**
     * Scrive una lista di brani su file JSON con formato leggibile.
     *
     * @param musica nome del file JSON su cui scrivere
     * @param lista lista di brani da scrivere
     */
    public void scriviJson(String musica, List<Brano> lista) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(musica))) {
            bw.write(gson.toJson(lista));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
