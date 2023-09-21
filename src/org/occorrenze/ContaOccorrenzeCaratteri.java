package org.occorrenze;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContaOccorrenzeCaratteri {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();
        scanner.close();

        // Creo una mappa, per tener traccia delle occorrenze dei caratteri
        
        Map<Character, Integer> occorrenze = new HashMap<>();

        // Itero attraverso i caratteri della parola inserita dall'utente
        
        for (char carattere : parola.toCharArray()) {
        	
            // Aggiungo il carattere alla mappa delle occorrenze
            // Se il carattere è già presente, si incrementa il contatore, altrimenti lo si inizializza a 1
        	
            occorrenze.put(carattere, occorrenze.getOrDefault(carattere, 0) + 1);
        }

        // Stampo le occorrenze dei caratteri
        
        for (Map.Entry<Character, Integer> entry : occorrenze.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
	}
}
