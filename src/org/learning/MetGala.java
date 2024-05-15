package org.learning;

import java.util.Scanner;

public class MetGala {
    /*
    Bonus: Met Gala
    State lavorando col servizio di sicurezza del Met Gala 2024 e il vostro compito è di assicurarvi
    che accedano alla festa solo gli invitati presenti sulla lista (in fondo al post).
    Nel programma bisogna:
    - creare e inizializzare l’array contenente i nomi degli invitati
    - chiedere all’utente come si chiama
    - verificare che il nome sia presente nella lista
    - lasciarlo entrare o rispedirlo cortesemente da dove è venuto
    Lista invitati: Jennifer Lopez, Zendaya, Chris Hemsworth, Bad Bunny, Cara Delevingne, Kendall Jenner,
    Uma Thurman, Damiano David, Luca Guadagnino
    */
    public static void main(String[] args) {
        String[] listaInvitati = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String nomeUtente = scanner.nextLine();

        for (String invitato : listaInvitati) {
            if (invitato.equals(nomeUtente)) {
                System.out.println("Benvenuto al Met Gala 2024, " + nomeUtente + "!");
                return;
            }
        }

        System.out.println("Mi dispiace, " + nomeUtente + ", ma il tuo nome non è nella lista degli invitati. Non puoi entrare.");
    }
}