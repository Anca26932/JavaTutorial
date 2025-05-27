package OOP;

public class Angajat extends Persoana implements AngajatInt{

    private String firma;
    private Integer experienta;
    private Integer zileconcediu;

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

//    suprascriem metoda din parinte(polimorfism dinamic)

    public void mananca(){
        System.out.println("Angajatul mananca cand are pauza de masa");

    }
//    polimorfismul static
    public void marire(){
        System.out.println("Nu avem buget de marire" );

    }
    public void marire(Integer procent){
        System.out.println("Angajatul a primit o marire cu "+ procent + "1%");
    }

    public void marire(String grad){
        System.out.println("Angajatul a primit gradul" + grad);

    }


    public void promovare(){
        System.out.println("Angajatul cu numele" + getNume()+ " a fost promovat");
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public Integer getExperienta() {
        return experienta;
    }

    public void setExperienta(Integer experienta) {
        this.experienta = experienta;
    }

    public Integer getZileconcediu() {
        return zileconcediu;
    }

    public void setZileconcediu(Integer zileconcediu) {
        this.zileconcediu = zileconcediu;
    }

    @Override
    public void mergeLaMunca() {
        System.out.println("Angajatul merge la munca");

    }

    @Override
    public void primesteSalariu() {
        System.out.println("Angajatul primeste salariu");


    }

    @Override
    public void mergeInPauza() {
        System.out.println("Angajatul merge in pauza");

    }

    @Override
    public void prezintaDemisia() {
        System.out.println("Angajatul nu pleaca din firma");
    }
}
