package org.experis.cibo;

public class CiboPreferito {

    public static void main(String[] args) {
        String[] cibiPreferiti = {"Orecchiette Salsiccia e Funghi", "Lasagna", "Pizza", "Tiramisù", "Risotto"};
        // definisco l'ultimo cibo dell'array prendendo la lunghezza dell'array - 1
        String ciboUltimo = cibiPreferiti[cibiPreferiti.length - 1];

        // prendo il cibo centrare nell'array dividendo la sua lunghezza per due e prendendomi quell'indice
        int ciboCentrale = cibiPreferiti.length / 2;
        String elementoCentrale = cibiPreferiti[ciboCentrale];

        //stampo i dati
        System.out.println("Lunghezza array: " + cibiPreferiti.length);
        System.out.println("Il mio cibo preferito: " + cibiPreferiti[0]);
        System.out.println("Il mio cibo preferito ma non troppo: " + ciboUltimo);
        System.out.println("Il mio cibo mediano: " + elementoCentrale);
    }
}
