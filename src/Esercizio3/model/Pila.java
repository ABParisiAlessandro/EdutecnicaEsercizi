package Esercizio3.model;

import Esercizio3.model.pilaException.PilaIsEmptyException;
import Esercizio3.model.pilaException.PilaIsFullException;

public interface Pila {
    void add(Integer x) throws PilaIsFullException;
    void pop() throws  PilaIsEmptyException;
}
