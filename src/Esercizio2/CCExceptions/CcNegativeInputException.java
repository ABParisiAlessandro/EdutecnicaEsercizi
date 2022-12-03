package Esercizio2.CCExceptions;

public class CcNegativeInputException extends Exception{
    @Override
    public String getMessage() {
        return "Negative currency can't be select";
    }
}
