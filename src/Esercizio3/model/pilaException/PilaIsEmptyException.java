package Esercizio3.model.pilaException;

public class PilaIsEmptyException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Pila is Empty";
    }
}
