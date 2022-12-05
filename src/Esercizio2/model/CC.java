package Esercizio2.model;

import Esercizio2.model.CCExceptions.CcNegativeInputException;

public interface CC {
    void deposit(Double money,String from) throws CcNegativeInputException;
    void withdrawal(Double money,String from) throws CcNegativeInputException;
    void movimento();
    void saldo();
}
