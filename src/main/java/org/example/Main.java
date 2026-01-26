package org.example;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Brano b1 = new Brano("BR34004", "7 years", "3.01", "12/05/2014");
        String file = "Musica.json";

        Scrittore s = new Scrittore(file);
        s.setBrano(b1);

        Lettore l = new Lettore(file);

        Thread ts = new Thread(s);
        Thread tl = new Thread(l);

        ts.start();
        try {
            ts.join(); // aspetta che lo scrittore finisca
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        tl.start();
    }
}

