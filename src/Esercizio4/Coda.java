package Esercizio4;

import Esercizio4.codaExceptions.CodaEmptyException;
import Esercizio4.codaExceptions.CodaFullException;

import java.util.ArrayList;

public class Coda {
    int max;
    ArrayList<Integer> lista;
    public Coda(){
        max = 5;
        lista = new ArrayList<Integer>();
    }

    public void add(Integer a) throws CodaFullException {
        if(lista.size()<max){
            lista.add(a);
        }else {
            throw new CodaFullException();
        }
    }

    public void pop() throws CodaEmptyException {
        if(lista.size()>0){
            lista.remove(0);
        }
        else {
            throw new CodaEmptyException();
        }
    }
    public void print(){
        for (int i=0;i<lista.size();i++){
            System.out.print("["+lista.get(i)+"]");
        }
        System.out.println();
    }
}
