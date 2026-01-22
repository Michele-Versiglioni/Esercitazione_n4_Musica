package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String file = "Musica.json";
        Scrittore s = new Scrittore(file);
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
