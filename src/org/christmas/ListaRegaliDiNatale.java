package org.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaRegaliDiNatale {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> listaRegali = new ArrayList<>();

        System.out.println("Benvenuto nella lista dei regali di Natale!");

        while (true) {
            System.out.print("Inserisci il nome del regalo da aggiungere alla lista (o 'stop' per terminare): ");
            String regalo = input.nextLine();

            if (regalo.equalsIgnoreCase("stop")) {
                break;
            }

            listaRegali.add(regalo);
            System.out.println("La lunghezza attuale della lista dei regali è: " + listaRegali.size());
        }
        
        System.out.println("Ecco la lista dei tuoi regali di Natale:");

        for (String regalo : listaRegali) {
            System.out.println(regalo);
        }

        input.close();
    }
}
