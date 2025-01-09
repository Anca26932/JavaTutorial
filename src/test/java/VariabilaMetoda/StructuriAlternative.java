package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structuri alternative= If -Than-Else ; switch-case

    @Test

    public void metodaTest() {
//        metodaVerificareNumar(7);
//        metodaVerificareNumar(3);
//        metodaVerificareNumar(5);
        metodaVerificareParPozitiv(0);
        metodaVerificareParPozitiv(4);
        metodaVerificareParPozitiv(-5);
        metodaVerificareParPozitiv(-4);

    }

    //verificam un numar mai mare de cat 5

    public void metodaVerificareNumar(int valoare) {

        if (valoare > 5) {

            System.out.println("numarul " + valoare + " este mai mare de cat 5");
        } else if (valoare < 5) {

            System.out.println("numarul " + valoare + " mai mic de cat 5");

        } else {
            System.out.println("numarl " + valoare + " este egal cu 5");

        }
    }

    //Verificam daca un numar e par pozitiv sau par negativ

    public void metodaVerificareParPozitiv(int valoare) {

        if (valoare > 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par pozitiv ");
            } else {
                System.out.println("Numarul " + valoare + " este impar pozitiv");
            }

        } else if (valoare < 0) {
            if (valoare % 2 == 0) {
                System.out.println("Numarul " + valoare + " este par negativ");
            } else {
                System.out.println("Numarul " + valoare + " este impar negativ");
            }

        } else if (valoare == 0) {
            System.out.println("Numarul este 0 ");
        }

    }
}
