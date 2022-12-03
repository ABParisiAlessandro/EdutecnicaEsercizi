package Esercizio2;

import Esercizio2.CCExceptions.CcFailedWithdrawException;
import Esercizio2.CCExceptions.CcNegativeInputException;

import java.util.Calendar;

public class Main2 {
    public static void main(String[] args) {
        CC cc1= new CC("IT","60","X","05428","11101","000000123456","A168","BB","CA","187C");
        CC cc2= new CC("UK","60","X","05428","11101","000000123456","A168","BB","CA","187C");
        System.out.println(cc1.IBAN+"\t"+cc1.swift_bic+"\t"+cc1.available_balance+"\t"+cc1.account_balance);
        cc1.saldo();
        try {
            cc1.deposit(120.d,"Ricarica POSTEPAY");
            Thread.sleep(5000);
            //cc1.deposit(130.d,"Bonifico SRL");
            Thread.sleep(1000);
            cc1.deposit(50.d,"REAL JOKER");
           // cc1.withdrawal(100.d,"POS");
            Thread.sleep(1000);
          //  cc1.withdrawal(100.30d,"POS");
            cc1.saldo();
            Thread.sleep(2000);
            cc1.deposit(20.d,"Mancia BROXASJ");
            Thread.sleep(3000);
            cc1.withdrawal(100.d,"POS MCDONALD");
        } catch (CcNegativeInputException e) {
            System.err.println(e.getMessage());
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }catch (CcFailedWithdrawException e){
            System.err.println(e.getMessage());
        }
        cc1.movimento();
        cc1.saldo();

    }
}
