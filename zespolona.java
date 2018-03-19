package zes;

public class zespolona {
    private double re = 0;
    private double im = 0;

    public zespolona() {
        re = 0;
        im = 0;
    }

    public zespolona(double xre) {
        re = xre;
        im = 0;
    }

    public zespolona(double xre, double xim) {
        re = xre;
        im = xim;
    }

    public double modul() {
        System.out.println(Math.pow(re, 2) + Math.pow(im, 2));
        return Math.sqrt(Math.pow(re, 2) + Math.pow(im, 2));

    }

    public zespolona odejmij() {
        return new zespolona(re, -im);
    }

    public zespolona dodaj(zespolona b) {
        return new zespolona(re + b.re, im + b.im);
    }

    public zespolona podziel(zespolona b) {
        return new zespolona(re - b.re, im - b.im);
    }

    public zespolona mnoz(double b) {
        return new zespolona(b * re, b * im);
    }

    public void print() {
        if (im == 0)
            System.out.println(String.valueOf(re));
        else if (re == 0)
            System.out.println(String.valueOf(im) + "i");
        else if (im > 0)
            System.out.println(String.valueOf(re) + "+" + String.valueOf(im) + "i");
        else if (im < 0)
            System.out.println(String.valueOf(re) + String.valueOf(im) + "i");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        zespolona obj = (zespolona) o;
        return re == obj.re && im == obj.im;
    }
}
