package OOP;

public class Angajat extends Persoana{

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
}
