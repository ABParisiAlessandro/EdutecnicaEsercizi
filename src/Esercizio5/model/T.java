package Esercizio5.model;

import Esercizio5.controller.Timpl;

public interface T {
    public void inserisci(int ora,int min,int sec);
    public boolean valida(int o,int m,int s);
    public void sommaOrari(Timpl t);
    public void sottraiOrari(Timpl t);

}
