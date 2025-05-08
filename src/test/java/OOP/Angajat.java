package OOP;

public class Angajat extends Persoana{

    String firma;
    Integer experienta;
    Integer zileconcediu;

    public Angajat(String nume, String prenume, Integer varsta,String firma, Integer experienta, Integer zileconcediu) {
        super(nume, prenume, varsta);
        this.firma = firma;
        this.experienta = experienta;
        this.zileconcediu =zileconcediu;

    }

    public void infoAngajat(){

        infoPersoana();
        System.out.println("Firma este" + firma);
        System.out.println("Ani experienta"+ experienta);
        System.out.println("Cate zile de concediu are angajatul" + zileconcediu);

    }
}
