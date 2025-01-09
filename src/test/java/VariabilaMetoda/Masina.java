package VariabilaMetoda;

import org.testng.annotations.Test;

public class Masina {


    public String marca;
    public String model;
    public Integer anFabricatie;

    @Test
    public void metodaTest() {
        dateMasina("Audi", "Q7", 2023);  //datele de test pe care vrem sa le folosim
        dateMasina("BMW", "X3", 2020);
        dateMasina("Pegeout", "Model 3008", 2018);

        calculMedie(7.0, 8.0);
        calculMedie(6.7, 5.8);

    }
    //metoda

    public void dateMasina(String param1, String param2, Integer param3) {

        marca = param1;
        model = param2;
        anFabricatie = param3;

        System.out.println("Marca masinii este: " + marca);
        System.out.println("Modelul masinii este: " + model);
        System.out.println("Anul Fabricatiei este: " + anFabricatie);

    }


    //calculam media a doua numere

    public void calculMedie(Double nota1, Double nota2) {
        Double rezultat = (nota1 + nota2) / 2;
        System.out.println("Media celor 2 note este: " + rezultat);

    }
}
