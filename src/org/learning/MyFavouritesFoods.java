package org.learning;

public class MyFavouritesFoods {
    /*
     * Esercizio 2: Miei cibi preferiti
     * Nel programma inizializzate un array (con i metodi visti a lezione) con la classifica
     * dei vostri cibi preferiti (minimo 5, massimo 10 elementi)
     * Poi stampate a video:
     * - la lunghezza della classifica
     * - il vostro cibo top (prima posizione della classifica)
     * - il vostro cibo preferito ma non troppo (ultima posizione della classifica)
     * - il cibo di mezza classifica, cioè che si trova nella posizione mediana
     */
    public static void main(String[] args) {
        String[] cibiPreferiti = {"Pizza", "Pasta", "Torta di mele", "Gelato", "Pollo"};

        int lunghezzaClassifica = cibiPreferiti.length;
        String ciboTop = cibiPreferiti[0];
        String ciboPreferitoMaNonTroppo = cibiPreferiti[lunghezzaClassifica - 1];
        String ciboMediano = cibiPreferiti[lunghezzaClassifica / 2];

        System.out.println("La lunghezza della classifica è: " + lunghezzaClassifica);
        System.out.println("Il mio cibo top è: " + ciboTop);
        System.out.println("Il mio cibo preferito ma non troppo è: " + ciboPreferitoMaNonTroppo);
        System.out.println("Il cibo di mezza classifica è: " + ciboMediano);
    }
}
