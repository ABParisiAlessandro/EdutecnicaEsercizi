package Esercizio6.control;

import Esercizio6.model.ComplexOP;

public class ComplexOPImpl implements ComplexOP {
    @Override
    public void somma(Complex a, Complex b) {
        float som_re = a.re+b.re;
        float som_im = a.im+b.im;
        System.out.println(som_re+"+("+som_im+")i");
    }

    @Override
    public void differenza(Complex a, Complex b) {
        float dif_re = a.re-b.re;
        float dif_im = a.im-b.im;
        System.out.println(dif_re+"+("+dif_im+")i");
    }

    @Override
    public void rapporto(Complex A, Complex a) {
            float rap_re = ((A.re*a.re)+(A.im*a.im))/((a.re*a.re)+(a.im*a.im));
            float rap_im = ((a.re*A.im)-(A.re*a.im))/((a.re*a.re)+(a.im*a.im));
            System.out.println(rap_re+"+("+rap_im+")i");
    }

    @Override
    public void prodotto(Complex a, Complex b) {
        float prod_re = (a.re*b.re)-(a.im*b.im);
        float prod_im = (a.re*b.im)+(b.re*a.im);
        System.out.println(prod_re+"+("+prod_im+")i");
    }
}
