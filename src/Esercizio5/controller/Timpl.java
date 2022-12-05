package Esercizio5.controller;

import Esercizio5.model.T;
import Esercizio5.model.Texception.TWrongAmountException;

public class Timpl implements T {
    private int ora;

    public int getOra() {
        return ora;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    private int min;
    private int sec;

    public Timpl(){
        ora =0;
        min =0;
        sec =0;
    }

    @Override
    public void inserisci(int ora, int min, int sec) {
        int restoOra =0;
        int restoMin =0;
        int restoSec =0;
        if(valida(ora,min,sec)==false){
            throw  new TWrongAmountException();
        }
        this.sec = this.sec + sec;
        restoSec = this.sec/60;
        this.sec = this.sec - (restoSec*60);

        this.min = this.min +min+restoSec;
        restoMin = this.min/60;
        this.min = this.min-(restoMin*60);

        this.ora = this.ora + ora + restoMin;
        restoOra = this.ora/24;
        this.ora = this.ora-(restoOra*24);
    }

    @Override
    public boolean valida(int o,int m,int s) {
        if(o<0 || o >23 || m<0 || m>59 || s<0 || s>59){
            return false;
        }
        return true;
    }

    @Override
    public void sommaOrari(Timpl t) {
        try{
            this.inserisci(t.ora,t.min,t.sec);
        }catch (TWrongAmountException e){
            System.err.println(e.getMessage());
        }

    }

    @Override
    public void sottraiOrari(Timpl t) {
        int restOra =0;
        int restMin =0;
        int restSec =0;

        this.ora = this.ora-t.getOra();
        if(this.ora<0){
            this.ora = Math.abs(this.ora);
            restOra = this.ora/24;
            this.ora = (23*restOra)-(this.ora);
            this.ora = Math.abs(this.ora);
        }
        this.min = this.min+(restOra*60)-t.getMin();
        if (this.min<0){
            this.min = Math.abs(this.min);
            restMin = this.min/60;
            this.min = (60*restMin)-this.min;
            this.min = Math.abs(this.min);
        }
        this.sec = this.sec+(restMin*60)-t.getSec();
        if(this.sec<0){
            this.sec =0;
        }

    }

    public void print(){
        System.out.println(this.ora+":"+this.min+":"+this.sec);
    }
}
