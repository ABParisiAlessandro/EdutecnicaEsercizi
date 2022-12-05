package Esercizio3.model.pilaException;

public class PilaIsFullException extends  RuntimeException{
    @Override
    public String getMessage() {
        return "Pila is Full";
    }
}
