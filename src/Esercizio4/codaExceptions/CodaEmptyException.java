package Esercizio4.codaExceptions;

public class CodaEmptyException extends Exception{
    @Override
    public String getMessage() {
        return "Coda is Empty";
    }
}
