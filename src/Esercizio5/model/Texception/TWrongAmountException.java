package Esercizio5.model.Texception;

public class TWrongAmountException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Inserimento Errato";
    }
}
