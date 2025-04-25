package ObiectConstructor;

public class Avion {


    //Constructor= are ca rol sa initializeze variabilele unei clase
    //Recunoastem un constructor dupa numele clasei
    //Intr-o clasa putem n Constructori care se diferentiaza dupa numarul sau tipuri de constructor
    //Exista 2 tipuri de constructori: cu parametrii sau fara parametrii
    //Intr-o clasa avem tot timpul un constructor default(fara parametrii)
    //Constructorul trebuie sa fie public
    //Obiect= instanta unei clase
    //Dintr- o clasa putem sa facem mai multe obiecte
    //Ca sa initializam un obiect n efolosim de cuvantul new
    //Cand se initializeaza un obiect se apeleaza constructorul clasei

    public String tip;
    public String marca;
    public String model;
    public Integer capacitatePasageri;
    public String tipCombustibil;
    public Integer numarBagaje;

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
    }

    public Avion(String tip, String marca, String model, Integer capacitatePasageri, String tipCombustibil, Integer numarBagaje) {
        this.tip = tip;
        this.marca = marca;
        this.model = model;
        this.capacitatePasageri = capacitatePasageri;
        this.tipCombustibil = tipCombustibil;
        this.numarBagaje = numarBagaje;
    }

    public void prezentareAvion (){

        System.out.println("Tipul avionului " + tip);
        System.out.println("Marca avionului " + marca);
        System.out.println("Modelul avioinului este " + model);
        System.out.println("Capacitate Pasageri" + capacitatePasageri);
        System.out.println("Tipul Combustibilului este " + tipCombustibil);
        if (numarBagaje != null){
            System.out.println("Numarul de bagaje este" + numarBagaje);
        } else {
            System.out.println("Avionul nu are bagaje");
        }
    }
}
