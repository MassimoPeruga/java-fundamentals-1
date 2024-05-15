package org.learning;

import java.util.Scanner;

public class CharSequence {
    /*
        Data una stringa e un carattere scelto dall'utente, calcolare la
        lunghezza della sequenza più lunga di quel carattere all'interno della
        stringa. Stampare sia la lunghezza trovata, che la posizione (l'indice
        del primo carattere della sequenza) all'interno della stringa.
        ESEMPIO:
        stringa: aaabaabbbbaaaabab  carattere: 'a'    lunghezza massima: 4  indice: 10
        Se esistono due sequenze con la stessa lunghezza massima, restituire i dati relativi all'ultima
        all'interno della stringa (quella con indice di inizio più alto)
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una stringa di caratteri: ");
        String inputString = scanner.nextLine();

        System.out.println("Inserisci un carattere presente nella stringa inserita: ");
        char userChar = scanner.next().charAt(0);

        int maxLength = 0;
        int index = -1;
        int currentLength = 0;
        int currentIndex = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == userChar) {
                if (currentLength == 0) {
                    currentIndex = i;
                }
                currentLength++;
                if (currentLength >= maxLength) {
                    maxLength = currentLength;
                    index = currentIndex;
                }
            } else {
                currentLength = 0;
            }
        }

        System.out.println("Sequenza più lunga presente: " + maxLength);
        System.out.println("Posizione: " + index);
    }
}