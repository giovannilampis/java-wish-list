package org.ciclare.interi;

public class CiclaNumeriInteri {
	// L'array di interi da ciclare
    private int[] elementi;
    // Indice per tener traccia dell'elemento corrente
    private int indiceCorrente;

    public CiclaNumeriInteri(int[] arrayDiInteri) {
    	// Verifica se l'array è vuoto o nullo
        if (arrayDiInteri == null || arrayDiInteri.length == 0) {
            throw new IllegalArgumentException("L'array è vuoto o nullo");
        }
        // Inizializza l'array
        this.elementi = arrayDiInteri;
        // Inizializza l'indice a 0 (primo elemento)
        this.indiceCorrente = 0;
    }

    public int getElementoSuccessivo() {
    	// Verifica se ci sono ancora elementi
        if (!hasAncoraElementi()) {
            throw new IllegalStateException("Nessun elemento rimasto");
        }

        // Ottiene l'elemento corrente
        int elementoSuccessivo = elementi[indiceCorrente];
        // Incrementa l'indice circolarmente
        indiceCorrente = (indiceCorrente + 1) % elementi.length;
        // Restituisce l'elemento corrente
        return elementoSuccessivo;
    }

    public boolean hasAncoraElementi() {
    	// Verifica se ci sono ancora elementi da restituire (l'indice è inferiore alla lunghezza dell'array)
        return indiceCorrente < elementi.length;
    }

    public static void main(String[] args) {
    	// Esempio di array di interi
        int[] arrayDiInteri = {91, 82, 73, 64, 55};
        CiclaNumeriInteri ciclatore = new CiclaNumeriInteri(arrayDiInteri);

        for (int i = 0; i < arrayDiInteri.length; i++) {
        	// Ottiene l'elemento successivo
            int elemento = ciclatore.getElementoSuccessivo();
         // Stampa l'elemento successivo
            System.out.println("Elemento successivo: " + elemento);
        }
    }
}




