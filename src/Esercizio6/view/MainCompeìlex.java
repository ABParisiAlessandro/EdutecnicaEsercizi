package Esercizio6.view;

import Esercizio6.control.Complex;
import Esercizio6.control.ComplexOPImpl;
import Esercizio6.model.ComplexOP;

public class MainCompeìlex {
    public static void main(String[] args) {
        Complex C1 = new Complex(3,3);
        Complex C2 = new Complex(2,-3);
        ComplexOP op = new ComplexOPImpl();
        System.out.println("SOMMA:");
        op.somma(C1,C2);
        System.out.println("DIFFERENZA:");
        op.differenza(C1,C2);
        System.out.println("PRODOTTO:");
        op.prodotto(C1,C2);
        System.out.println("RAPPORTO:");
        op.rapporto(C1,C2);
    }
}
