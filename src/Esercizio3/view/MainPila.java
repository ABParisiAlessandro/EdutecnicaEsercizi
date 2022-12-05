package Esercizio3.view;

import Esercizio3.controller.PilaImpl;
import Esercizio3.model.Pila;
import Esercizio3.model.pilaException.PilaIsEmptyException;
import Esercizio3.model.pilaException.PilaIsFullException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPila {
    public static void main(String[] args) {
        PilaImpl pila = new PilaImpl();
        boolean exit= false;
        do {
            System.out.println("Seleziona operazione:\n[I] inserisci elemento\n[E] elimina elemento\n[Q]Esci");
            Scanner scan = new Scanner(System.in);
            String scelta = scan.nextLine();
            scelta = scelta.toUpperCase();
            switch (scelta){
                case "I":
                    System.out.println("Inserire un intero");
                    try {
                        int x = scan.nextInt();
                        pila.add(x);
                        pila.print();
                    } catch (PilaIsFullException e) {
                        System.err.println(e.getMessage());
                    }catch (InputMismatchException e){
                        System.err.println("INSERIRE UN NUMERO INTERO!");
                    }

                    break;
                case "E":
                    try {
                        pila.pop();
                        pila.print();
                    } catch (PilaIsEmptyException e) {
                        System.err.println(e.getMessage());
                    }

                    break;
                case "Q":
                    System.out.println("Byebye");
                    exit = true;
                    break;
                default:
                    System.out.println("Perfavore selezionare una delle seguenti opzioni...");
                    break;
            }
        }while (exit==false);
    }
}
