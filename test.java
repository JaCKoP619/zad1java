package zes;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class test {


    @Test
    void modul () {
        assertEquals(new zespolona(3, 4).modul(), 5);
        assertEquals(new  zespolona(3, 5).modul(), new zespolona(5, 3).modul());
        assertEquals(new zespolona(3, 5).modul(), new zespolona(3, -5).modul());
        assertEquals(new zespolona(3, 5).modul(), new zespolona(-3, 5).modul());
    }

    @Test
    void odejmij() {
        assertEquals(new zespolona(3, 4).odejmij(), new zespolona(3, -4));
        assertEquals(new zespolona(3, -4).odejmij(), new zespolona(3, 4));
        assertEquals(new zespolona(0, 0).odejmij(), new zespolona(0, 0));
    }

    @Test
    void dodaj() {
        assertEquals(new zespolona(10, 10).dodaj(new zespolona(3, 5)),
                new zespolona(13, 15));
        assertEquals(new zespolona(-10, -10).dodaj(new zespolona(5, 15)), new zespolona(-5, 5));
        assertEquals(new zespolona(10, 10).dodaj(new zespolona(-5, -15)), new zespolona(5, -5));
    }

    @Test
    void podziel() {
        assertEquals(new zespolona(10, 10)
                        .podziel(new zespolona(3, 5)),
                new zespolona(7, 5));

        assertEquals(new zespolona(-10, -10)
                        .podziel(new zespolona(5, 15)),
                new zespolona(-15, -25));

        assertEquals(new zespolona(10, 10)
                        .podziel(new zespolona(-5, -15)),
                new zespolona(15, 25));
    }

    @Test
    void mnoz() {
        assertEquals(new zespolona(1, 1).mnoz(2), new zespolona(2, 2));
        assertEquals(new zespolona(1, 1).mnoz(-2), new zespolona(-2, -2));
        assertEquals(new zespolona(1, 1).mnoz(0), new zespolona(0, 0));
    }

    @Test
    void print() {
        new zespolona(1, 1).print();
        new zespolona(1, -1).print();
        new zespolona(1).print();
        new zespolona(-1).print();
        new zespolona(0, 1).print();
        new zespolona(0, -1).print();
        new zespolona(0, 0).print();

    }
}