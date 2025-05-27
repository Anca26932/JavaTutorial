package OOP;

public class Student extends Persoana implements StudentInt {
    private String facultate;
    private  Integer an;
    private Boolean bursa;


    public Student(String nume, String prenume, Integer varsta, String facultate,Integer an ,Boolean bursa) {
        super(nume, prenume, varsta);
        this.facultate = facultate;
        this.an = an;
        this.bursa =bursa;
    }

    public void infoSudent(){
        infoPersoana();
        System.out.println("Facultatea este" + facultate);
        System.out.println("Anul este" + an);
        System.out.println("Are bursa? "+ bursa);

    }
    public void absolvire(){
        System.out.println("Studentul cu numele" + getNume() +"si prenumele"+ getPrenume()+ "a absolvit");

    }
    public void mananca(){
        System.out.println("Studentul mananca cand vrea el ");
        super.mananca();

    }

    public String getFacultate() {
        return facultate;
    }

    public Integer getAn() {
        return an;
    }

    public Boolean getBursa() {
        return bursa;
    }

    public void setBursa(Boolean bursa) {
        this.bursa = bursa;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    @Override
    public void mergeLaCurs() {
        System.out.println("Studentul merge la curs");

    }

    @Override
    public void sustineExamene() {
        System.out.println("Studentul are sesiune");

    }

    @Override
    public void mergeLaCafea() {
        System.out.println("Studentul este silitor");

    }
}
