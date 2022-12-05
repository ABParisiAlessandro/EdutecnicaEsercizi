package Esercizio4.codaExceptions;

import java.util.InputMismatchException;

public class CodaInputException extends InputMismatchException {
    @Override
    public String getMessage() {
        return "Perfavore inserire un numero intero";
    }
}
