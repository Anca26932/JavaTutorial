package OOP;

public class Persoana {

//    OOP = Programare orientata obiect
//    Principii:Mostenirea,Incapsularea ,poilimorfism ,abstractizarea
//    Mostenirea este conceptul prin care o clasa (copil) mosteneste o alta clasa (parinte)
//    In java putem mosteni o singura clasa
//    In mom in care o clasa mosteneste o alta clasa, clasa copil trebuie sa apeleze constructorul din parinte
//    in mom in care se aplica mostenirea, copilul are vizibilitate asupra variabilelor/metodelor din parinte
//    constructorul din parinte in copil se apeleaza cu super

//    Incapsulare= procesul prin care tinem departe anumite informatii ca ele sa nu poat afi modificate
//    Facem variabilele/metodele din public in privat
//    Private= access control care restrictioneaza accesul doar in clasa respectiva
//    doar parintele are acces la informatie
//    ca sa extragem /modificam o valaore a unei variabile private ne folosim de metode get/set
//

    private String nume;

    private String prenume;

    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
    public void infoPersoana (){
        System.out.println("Numele este " + nume);
        System.out.println("Prenumele este " + prenume);
        System.out.println("Varsta este" + varsta);

    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
