package Esercizio1;

public class Potenza {
    int number;
    int base;
    public Potenza(int number){
        this.number=number;
        base =2;
    }
    public void pow(){
        System.out.println((int)Math.pow(base,number));
    }
    public void cambiobase(int newBase){
        this.base = newBase;
    }
}
