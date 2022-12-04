package Esercizio2;

import Esercizio2.CCExceptions.CcFailedWithdrawException;
import Esercizio2.CCExceptions.CcNegativeInputException;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class CC {
    StringBuilder IBAN;
    String national_sign ;
    String cin_eu;
    String cin_code;
    String abi_code;
    String cab_code;
    String cc_number;

    StringBuilder swift_bic;
    String swift_bank_code;
    String country_code;
    String local_code ;
    String bic_bank_code ;

    Double account_balance;
    Double available_balance;

    ArrayList<String> log;
    public CC(String national_sign, String cin_eu, String cin_code, String abi_code, String cab_code, String cc_number, String swift_bank_code, String country_code, String local_code, String bic_bank_code) {
        this.national_sign = national_sign;
        this.cin_eu = cin_eu;
        this.cin_code = cin_code;
        this.abi_code = abi_code;
        this.cab_code = cab_code;
        this.cc_number = cc_number;
        this.swift_bank_code = swift_bank_code;
        this.country_code = country_code;
        this.local_code = local_code;
        this.bic_bank_code = bic_bank_code;
        IBAN = new StringBuilder();
        IBAN.append(national_sign).append(cin_eu).append(cab_code).append(abi_code).append(cab_code).append(cc_number);
        swift_bic = new StringBuilder();
        swift_bic.append(swift_bank_code).append(country_code).append(local_code).append(bic_bank_code);

        this.account_balance =0.0d;
        this.available_balance = 0.0d;
        log = new ArrayList<String>();
    }

    public void withdrawal(Double money,String from) throws CcNegativeInputException,CcFailedWithdrawException {
        if(money<0){
           throw new CcNegativeInputException();
        }
        if(available_balance<money){
            throw new CcFailedWithdrawException(available_balance,money);
        }

        this.available_balance = this.available_balance-money;
        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.ITALY);

        Calendar cal = Calendar.getInstance();
        StringBuilder tempLog = new StringBuilder();
        tempLog.append(cal.getTime().toString()).append("\n").append("-").append(moneyFormat.format(money)).append("\tFrom:").append(from);
        log.add(tempLog.toString());

        this.account_balance = this.available_balance;
    }
    public void deposit(Double money,String from) throws CcNegativeInputException {
        if(money<0){
            throw new CcNegativeInputException();
        }

        this.available_balance = this.available_balance+money;

        NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.ITALY);

        Calendar cal = Calendar.getInstance();
        StringBuilder tempLog = new StringBuilder();
        tempLog.append(cal.getTime().toString()).append("\n").append("+").append(moneyFormat.format(money)).append("\tFrom:").append(from);
        log.add(tempLog.toString());

        this.account_balance = this.available_balance;
    }

    public void movimento(){
        if(log.size()>0 && log.size()<=5){
            for(int i=0;i<log.size();i++){
                System.out.println(log.get(i));
                System.out.println("-------------------------------------------");
            }
        }
        else if (log.size()==0){
            System.out.println("No moviments registered\n-------------------------------------------");
        }
        else{
            for(int i=log.size()-5;i<log.size();i++){
                System.out.println(log.get(i));
                System.out.println("-------------------------------------------");
            }
        }



    }
    public void saldo(){

        NumberFormat format_t = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println("Account Balance: "+format_t.format(this.account_balance)+"\nAvailable Balance: "+format_t.format(this.available_balance));
        System.out.println("-------------------------------------------");
    }
}
