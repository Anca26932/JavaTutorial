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

//    Polimorfism = procesul prin care definim mai multe implementari pentru o metoda
//    poate fi de doua feluri :dinamic(override) si static(overlamd)
//    polimorfismul dinamic =intr o ierarhie de clase obtinute prin mostenire o metoda poate avea implementari diferite
//    plimorfismul static=posibilitatea prin care o metoda are mai multe implementari prin diferentierea numarului sau tipului de parametrii

//    Abstractizare = reducerea unui element complex la un element mai simplu(reducerea completa a implementarii metodelor, lasand doar numele functilor ,parametrii
//      si tipul returnat
//    abstractizarea se poate obtine princlase abstracte si /sau interfete
//    clasele abstracte sunt utilizate pentru a declara caracteristici comune ale unor subclase
//    o clasa abstracta nu poate fi instantiata
//    Ea poate fi utilizata doar ca si superclasa pentru alte clase care extind clasa abstracta
//    clasa abstracta poate fi definita folosind modificatorul "abstract"
//    o clasa abstracta poate contine atribute si metode pe langa clasa abstracta

//    Interfata ofera raspuns lipsei mostenirii multiple
//    Interfata creeaza un protocol pe care clasele trebuie sa il implementeze
//     Interfata contine toate metodele abstracte(e o clasa pur abstracta)









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

//    Definim prima implementare pentru o metoda (polimorfism dinamic)

    public void mananca(){
        System.out.println("Persoana mananaca cand ii este foame");
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
