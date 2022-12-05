package Esercizio4.controller;

import Esercizio4.Coda;
import Esercizio4.codaExceptions.CodaEmptyException;
import Esercizio4.codaExceptions.CodaFullException;
import Esercizio4.codaExceptions.CodaInputException;

import java.util.Scanner;

public class MainCoda {
    static Coda coda = new Coda();
    public static void main(String[] args) {
        boolean exit = false;
        do {
            System.out.println("Seleziona operazione:\n[I] inserisci elemento\n[E] elimina elemento\n[Q]Esci");
            Scanner scan = new Scanner(System.in);
            String select = scan.nextLine();
            select = select.toUpperCase();
            switch (select){
                case "I":
                    try {
                        int intero = scan.nextInt();
                        coda.add(intero);
                        coda.print();
                    }catch (CodaInputException e){
                        System.err.println(e.getMessage());
                    } catch (CodaFullException e) {
                        System.err.println(e.getMessage());
                    }

                    break;
                case "E":
                    try {
                       coda.pop();
                       coda.print();
                    }catch (CodaEmptyException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case "Q":
                    System.out.println("Bye");
                    exit=true;
                    break;
                default:
                    System.out.println("Seleziona una corretta operazione...");
                    break;
            }

        }while (exit==false);
    }
}
