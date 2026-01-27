package org.example;

public class Brano {
    private String idBrano;
    private String titolo;
    private String durata;
    private String DataPubblicazione;
    private long numeroAscolti;
    private int numeroLike;

    public Brano(String idBrano, String titolo, String durata, String dataPubblicazione, long numeroAscolti, int numeroLike) {
        this.idBrano = idBrano;
        this.titolo = titolo;
        this.durata = durata;
        DataPubblicazione = dataPubblicazione;
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
        return titolo;
    }

    public Brano setTitolo(String titolo) {
        this.titolo = titolo;
        return this;
    }

    public String getDurata() {
        return durata;
    }

    public Brano setDurata(String durata) {
        this.durata = durata;
        return this;
    }

    public String getDataPubblicazione() {
        return DataPubblicazione;
    }

    public Brano setDataPubblicazione(String dataPubblicazione) {
        DataPubblicazione = dataPubblicazione;
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
                ", titolo='" + titolo + '\'' +
                ", durata='" + durata + '\'' +
                ", dataPubblicazione='" + DataPubblicazione + '\'' +
                ", numeroAscolti='" + numeroAscolti + '\'' +
                ", numeroLike='" + numeroLike + '\'' +
                '}';
    }
}