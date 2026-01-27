package org.example;

public class Brano {
    private String idBrano;
    private String titoloB;
    private String durata;
    private int annoPubblicazioneB;
    private long numeroAscolti;
    private int numeroLike;

    public Brano(String idBrano, String titoloB, String durata, int annoPubblicazioneB, long numeroAscolti, int numeroLike) {
        this.idBrano = idBrano;
        this.titoloB = titoloB;
        this.durata = durata;
        this.annoPubblicazioneB = annoPubblicazioneB;
        this.numeroAscolti = numeroAscolti;
        this.numeroLike = numeroLike;
    }

    public String getIdBrano() {
        return idBrano;
    }

    public Brano setIdBrano(String idBrano) {
        this.idBrano = idBrano;
        return this;
    }

    public String getTitolo() {
        return titoloB;
    }

    public Brano setTitolo(String titoloB) {
        this.titoloB = titoloB;
        return this;
    }

    public String getDurata() {
        return durata;
    }

    public Brano setDurata(String durata) {
        this.durata = durata;
        return this;
    }

    public int getannoPubblicazioneB() {
        return annoPubblicazioneB;
    }

    public Brano setannoPubblicazioneB(int annoPubblicazioneB) {
        this.annoPubblicazioneB = annoPubblicazioneB;
        return this;
    }

    public long getNumeroAscolti() {
        return numeroAscolti;
    }

    public Brano setNumeroAscolti(int numeroAscolti) {
        this.numeroAscolti = numeroAscolti;
        return this;
    }

    public int getNumeroLike() {
        return numeroLike;
    }

    public Brano setNumeroLike(int numeroLike) {
        this.numeroLike = numeroLike;
        return this;
    }
    @Override
    public String toString(){
        return "Brano{" +
                "idBrano='" + idBrano + '\'' +
                ", titolo='" + titoloB + '\'' +
                ", durata='" + durata + '\'' +
                ", dataPubblicazione='" + annoPubblicazioneB + '\'' +
                ", numeroAscolti='" + numeroAscolti +
                ", numeroLike='" + numeroLike +
                '}';
    }
}