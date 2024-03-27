package org.experis.bonus;

import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // array degli invitati
        String[] listaInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

        System.out.print("Prego inserire Nome e Cognome: ");
        String nomeInvitato = scan.nextLine();

        // Variabile booleana per tenere traccia se l'invitato è stato trovato
        boolean invitatoTrovato = false;

        // ciclo sull' array degli invitati
        for (String invitato : listaInvitati) {
            if (invitato.equalsIgnoreCase(nomeInvitato)){
                System.out.println("Prego entri: " + nomeInvitato);
                invitatoTrovato = true;
                break;
            }
        }

        if (!invitatoTrovato) {
            System.out.println("Mi dispiace ma non è sulla lista: " + nomeInvitato);
        }

        scan.close();
    }
}
