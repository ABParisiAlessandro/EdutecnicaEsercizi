package Esercizio3.controller;

import Esercizio3.model.Pila;
import Esercizio3.model.pilaException.PilaIsEmptyException;
import Esercizio3.model.pilaException.PilaIsFullException;

import java.util.ArrayList;

public class PilaImpl implements Pila {
    private int max;
    int current;
    private ArrayList<Integer> lista;
    public PilaImpl(){
        max = 5;
        lista = new ArrayList<Integer>();
    }
    @Override
    public void add(Integer x) throws PilaIsFullException {
        if(lista.size()>=max){
            throw new PilaIsFullException();
        }
        else{
            lista.add(x);
        }
    }

    @Override
    public void pop() throws PilaIsEmptyException {
        if (lista.size()<=0){
            throw new PilaIsEmptyException();
        }
        else {
            lista.remove(lista.size()-1);
        }
    }

    public void print(){
        for (int i=0;i<lista.size();i++){
            System.out.print("["+lista.get(i)+"]");
        }
        System.out.println();
    }
}
