# Musica Multithreading in Java

## Descrizione del progetto
Questo programma permette di gestire brani musicali tramite un’applicazione Java multithreading.
L’utente può inserire più brani da tastiera, salvarli su un file JSON ("Musica.json") e leggerli contemporaneamente.
Il programma utilizza thread separati per la scrittura (produttore) e la lettura (consumatore), includendo un countdown iniziale prima dell’inizio dell’inserimento dati.

## Funzionalità principali

1. **Gestione dei brani**
   - Ogni brano ha ID, titolo, durata, anno di pubblicazione, numero di ascolti e numero di like.
   - Possibilità di inserire più brani da tastiera in una lista dinamica.

2. **Gestione file**
   - Scrittura dei brani su file JSON con formato leggibile.
   - Lettura dei brani dal file JSON tramite Gson.
   - Lettura riga per riga con BufferedReader.

3. **Multithreading**
   - Thread produttore per scrivere i dati.
   - Thread consumatore per leggere e visualizzare i dati.
   - Countdown iniziale prima dell’inizio dell’inserimento dati.

4. **Interattività**
   - L’utente inserisce numero di brani, ID, titolo, durata, anno di pubblicazione, numero di ascolti e like.
   - I dati vengono salvati su file e subito letti e visualizzati.

## Esecuzione

1. Messaggio di benvenuto e countdown di 5 secondi.
2. Inserimento dei dati dei brani da tastiera.
3. Salvataggio automatico su "Musica.json".
4. Visualizzazione dei brani letti dal file sia riga per riga sia come oggetti "Brano".

## Crediti
Per svolgere questo progetto, in particolare le classi GestioneFile, Scrittore e Lettore ho preso spunto dal progetto ScriviLeggiJson fatto dal professore Amendola Francesco
Il progetto scolastico Musica è stato svolto da me (studente del 5 AINF) presso l'ITTS A. Volta di Perugia, grazie anche ai materiali forniti e all’aiuto dei professori **Ciuchetti Monica** e **Amendola Francesco**.
