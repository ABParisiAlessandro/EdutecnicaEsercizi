package Esercizio2.view;

import Esercizio2.model.CCExceptions.CcFailedWithdrawException;
import Esercizio2.model.CCExceptions.CcNegativeInputException;
import Esercizio2.controller.CCimpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ATM {
    static String placeholder = "AtmPlaceholder";
    static CCimpl CCimpl1 = new CCimpl("IT","60","X","05428","11101","000000123456","A168","BB","CA","187C");
    public static void main(String[] args) {
        boolean exit = false;
        System.out.println("Welcome!");
        do {
            System.out.println("Select:\n[W] to withdrawl\n[D] to deposit\n[B] to check your balance\n[M] to see your movements\n[Q] to quit");

            Scanner scan = new Scanner(System.in);
            String selection = "Q";
            try {
                selection = scan.nextLine();
                selection = selection.toUpperCase();
            }catch (InputMismatchException e){
                System.err.println(e.getMessage());
            }

            switch (selection){
                case "W":
                    System.out.println("Select the amount to withdrawl");
                    Double money = 0.d;
                    try {
                        money = scan.nextDouble();
                        CCimpl1.withdrawal(money,placeholder);
                        System.out.println("DONE!");
                    }catch (InputMismatchException | CcNegativeInputException | CcFailedWithdrawException e){
                        System.err.println(e.getMessage());
                    }

                    break;
                case "D":
                    System.out.println("Select the amount to deposit");
                    Double deposit = 0.d;
                    try {
                        deposit = scan.nextDouble();
                        CCimpl1.deposit(deposit,placeholder);
                        System.out.println("DONE!");
                    }catch (InputMismatchException | CcNegativeInputException e){
                        System.err.println(e.getMessage());
                    }

                    break;
                case "B":
                    CCimpl1.saldo();
                    break;
                case  "M":
                    CCimpl1.movimento();
                    break;
                case "Q":
                    System.out.println("Thank you and goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Please choose one of this options...");
                    break;
            }

        }while(exit==false);
    }
}
