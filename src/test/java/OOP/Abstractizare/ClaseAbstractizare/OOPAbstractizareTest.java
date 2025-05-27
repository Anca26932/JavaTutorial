package OOP.Abstractizare.ClaseAbstractizare;

import org.testng.annotations.Test;

public class OOPAbstractizareTest {

    @Test
    public void metodaTest() {

        Cerc formaCerc = new Cerc();
        formaCerc.setRaza(5);
        formaCerc.calculeazaAria();



        Patrat formaPatrat = new Patrat();
        formaPatrat.setLatura(7);
        formaPatrat.calculeazaAria();

        FormeGeometrice fg = new FormeGeometrice() {
            @Override
            public void calculeazaAria() {

            }

        };
    }
}
