package Esercizio5.view;

import Esercizio5.controller.Timpl;
import Esercizio5.model.T;
import Esercizio5.model.Texception.TWrongAmountException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainT {
    public static void main(String[] args) {
        Timpl orolog = new Timpl();
        System.out.println("<OROLOGIO 1>");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Inserisci secondi:");
            int sec = scan.nextInt();
            System.out.println("Inserisci minuti:");
            int min = scan.nextInt();
            System.out.println("Inserisci ora:");
            int ora = scan.nextInt();
            orolog.inserisci(ora,min,sec);
        }catch (InputMismatchException e){
            System.err.println("Errore di input");
        }catch (TWrongAmountException e){
            System.err.println(e.getMessage());
        }
        Timpl orolog2 = new Timpl();
        System.out.println("<OROLOGIO 2>");
        try {
            System.out.println("Inserisci secondi:");
            int sec = scan.nextInt();
            System.out.println("Inserisci minuti:");
            int min = scan.nextInt();
            System.out.println("Inserisci ora:");
            int ora = scan.nextInt();
            orolog2.inserisci(ora,min,sec);
        }catch (InputMismatchException e){
            System.err.println("Errore di input");
        }catch (TWrongAmountException e){
            System.err.println(e.getMessage());
        }
        System.out.print("Orologio 1: ");
        orolog.print();
        System.out.print("Orologio 2: ");
        orolog2.print();

        orolog.sommaOrari(orolog2);
        orolog.print();
        orolog.sottraiOrari(orolog2);
        orolog.print();

    }


}
