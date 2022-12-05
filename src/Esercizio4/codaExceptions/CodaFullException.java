package Esercizio4.codaExceptions;

public class CodaFullException extends Exception{
    @Override
    public String getMessage() {
        return "The List is full";
    }
}
