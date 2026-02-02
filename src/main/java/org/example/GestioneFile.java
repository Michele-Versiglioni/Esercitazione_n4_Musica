package org.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class GestioneFile {
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
    public List<Brano> leggiConGson(String musica) {
        try (BufferedReader br = new BufferedReader(new FileReader(musica))) {
            Gson gson = new Gson();
            Brano[] brani = gson.fromJson(br,Brano[].class);
            return Arrays.asList(brani);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
    public void scriviJson(String musica, List <Brano> lista) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(musica))) {
            bw.write(gson.toJson(lista));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
