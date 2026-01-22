package org.example;

public class Brano {
    private String idBrano;
    private String titolo;
    private String durata;
    private String DataPubblicazione;

    public Brano(String idBrano, String titolo, String durata, String dataPubblicazione) {
        this.idBrano = idBrano;
        this.titolo = titolo;
        this.durata = durata;
        DataPubblicazione = dataPubblicazione;
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
}

