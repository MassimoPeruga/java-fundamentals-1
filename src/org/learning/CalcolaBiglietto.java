package org.learning;

import java.util.Scanner;

public class CalcolaBiglietto {
    /*
     * Esercizio 1: Biglietto del treno
     * Il programma dovrà chiedere all’utente il numero di chilometri che vuole percorrere
     * e l’età del passeggero. Sulla base di queste informazioni dovrà calcolare il prezzo totale
     * del viaggio, secondo queste regole: il prezzo del biglietto è definito in base ai km (0.21 € al km)
     * va applicato uno sconto del 20% per i minorenni va applicato uno sconto del 40% per gli over 65.
     * Il programma va implementato nel metodo main della classe CalcolaBiglietto. Per acquisire l’input
     * dell’utente usate la classe Scanner, come visto stamattina a lezione.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di chilometri che vuoi percorrere: ");
        int km = scanner.nextInt();

        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();

        double prezzoBase = km * 0.21;
        double prezzo;

        if (eta < 18) {
            // Sconto del 20% per i minorenni
            prezzo = prezzoBase * 0.8;
        } else if (eta > 65) {
            // Sconto del 40% per gli over 65
            prezzo = prezzoBase * 0.6;
        } else {
            prezzo = prezzoBase;
        }

        System.out.println("Il prezzo totale del viaggio è: " + prezzo + "€");
    }
}