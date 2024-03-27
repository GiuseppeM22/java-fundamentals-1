package org.experis.treno;
import java.util.Scanner;


public class BigliettoTreno {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //prezzo biglietto al km
        double prezzoAlKm = 0.21;

        //chiedo all'utente i kilometri da percorrere
        System.out.print("Prego inserire Km da percorrere: ");
        int kilometriDaPercorrere = scan.nextInt();

        //chiedo all'utente l'eta
        System.out.print("Quanti anni hai? ");
        int eta = scan.nextInt();

        //definisco il prezzo biglietto base, non scontato
        double prezzoSenzaSconto =  kilometriDaPercorrere * prezzoAlKm;

        //logica calcolo sconto biglietto
        int sconto = 0;
        if (eta < 18){
            sconto = 20 ;

        } else if (eta > 65) {
            sconto = 40 ;
        }

        //somma da sottrarre
        double prezzoScontato = prezzoSenzaSconto * sconto / 100;

        // calcolo prezzo finale
        double prezzoFinale = prezzoSenzaSconto - prezzoScontato;

        System.out.println("I Tuoi Kilometri: " + kilometriDaPercorrere + " Km");
        System.out.println("eta passeggero: " + eta);
        System.out.println("sconto: " + sconto + " %");
        System.out.println("prezzo pieno: " + prezzoSenzaSconto);
        System.out.println("hai diritto ad uno sconto di: " + String.format("%.2f", prezzoScontato) + " €");
        System.out.println("prezzo scontato: " + String.format("%.2f", prezzoFinale) + " €");

        scan.close();
    }
}
