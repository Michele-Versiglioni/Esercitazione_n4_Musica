package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe principale dell'applicazione Musica Multithreading.
 * Permette all'utente di inserire brani, salvarli su file JSON e leggerli.
 */
public class Main {

    /**
     * Metodo main.
     * Mostra messaggi di benvenuto, esegue un countdown, gestisce l'inserimento dei brani,
     * avvia il thread scrittore per salvare i dati e il thread lettore per leggerli.
     *
     * @param args argomenti da linea di comando (non usati)
     */
    public static void main(String[] args)  {
        System.out.println("=== BENVENUTO NELL'APP MUSICA ===");
        System.out.println("Salva i tuoi brani preferiti!!");
        System.out.println();

        Thread countdown = new Thread(new Countdown());
        countdown.start();
        try {
            countdown.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);
        List<Brano> ListBrani = new ArrayList<>();

        System.out.println("Quanti brani vuoi inserire?");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nInserisci brano " + (i + 1));

            System.out.print("ID: ");
            String id = sc.nextLine();

            System.out.print("Titolo: ");
            String titolo = sc.nextLine();

            System.out.print("Cantante: ");
            String cantante = sc.nextLine();

            System.out.print("Durata: ");
            String durata = sc.nextLine();

            System.out.print("Anno pubblicazione: ");
            int anno = sc.nextInt();

            System.out.print("Numero ascolti: ");
            long ascolti = sc.nextLong();

            System.out.print("Numero like: ");
            int like = sc.nextInt();
            sc.nextLine();

            ListBrani.add(new Brano(id, titolo, cantante, durata, anno, ascolti, like));
        }

        String file = "Musica.json";
        GestioneFile gf = new GestioneFile();

        Thread scrittore = new Thread(new Scrittore(file, ListBrani, gf));
        Thread lettore = new Thread(new Lettore(file, gf));

        scrittore.start();
        try {
            scrittore.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        lettore.start();
    }
}



