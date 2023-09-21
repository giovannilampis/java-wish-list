package org.occorrenze.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class LambdaContaOccorrenzeCaratteri {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();
        scanner.close();

        // Creo una mappa, per tener traccia delle occorrenze dei caratteri
        Map<Character, Integer> occorrenze = new HashMap<>();

        // Itero attraverso i caratteri della parola inserita dall'utente
        parola.chars().mapToObj(carattere -> (char) carattere).forEach(carattere -> {
            // Aggiungo il carattere alla mappa delle occorrenze
            // Utilizzo il metodo compute della mappa per aggiornare o inizializzare il contatore
            occorrenze.compute(carattere, (key, count) -> (count == null) ? 1 : count + 1);
        });

        // Stampo le occorrenze dei caratteri
        occorrenze.forEach((carattere, count) -> {
            System.out.println(carattere + ":" + count);
        });
	}
}
