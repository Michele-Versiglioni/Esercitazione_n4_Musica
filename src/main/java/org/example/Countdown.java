package org.example;

/**
 * Classe Countdown che esegue un conto alla rovescia prima dell'inizio dell'inserimento dati.
 * Implementa Runnable per poter essere eseguita in un thread separato.
 */
public class Countdown implements Runnable {

    /**
     * Metodo run eseguito dal thread.
     * Stampa un conto alla rovescia da 5 a 1 con pausa di 1 secondo tra i numeri.
     */
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Inizio tra " + i + "...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
