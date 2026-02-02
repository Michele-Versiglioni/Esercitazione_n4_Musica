package org.example;

public class Countdown implements Runnable{
    @Override
    public void run(){
        try {
            for (int i=5; i>0;i--){
                System.out.println("Inizio tra " + i + "...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
