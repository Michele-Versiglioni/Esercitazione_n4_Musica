package org.example;

/**
 * Classe Brano che rappresenta un brano con informazioni di base.
 */
public class Brano {

    private String idBrano;
    private String titoloB;
    private String cantante;
    private String durata;
    private int annoPubblicazioneB;
    private long numeroAscolti;
    private int numeroLike;

    /**
     * Costruttore della classe Brano.
     *
     * @param idBrano codice identificativo del brano
     * @param titoloB titolo del brano
     * @param cantante nome del cantante
     * @param durata durata del brano
     * @param annoPubblicazioneB anno di pubblicazione
     * @param numeroAscolti numero di ascolti
     * @param numeroLike numero di like
     */
    public Brano(String idBrano, String titoloB, String cantante, String durata, int annoPubblicazioneB, long numeroAscolti, int numeroLike) {
        this.idBrano = idBrano;
        this.titoloB = titoloB;
        this.cantante = cantante;
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

    public String getCantante() {
        return cantante;
    }

    public Brano setCantante(String cantante) {
        this.cantante = cantante;
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

    /**
     * Restituisce una rappresentazione testuale del brano.
     *
     * @return stringa con tutte le informazioni del brano
     */
    @Override
    public String toString() {
        return "Brano{" +
                "idBrano='" + idBrano + '\'' +
                ", titolo='" + titoloB + '\'' +
                ", cantante='" + cantante + '\'' +
                ", durata='" + durata + '\'' +
                ", dataPubblicazione='" + annoPubblicazioneB + '\'' +
                ", numeroAscolti='" + numeroAscolti + '\'' +
                ", numeroLike='" + numeroLike + '\'' +
                '}';
    }
}
