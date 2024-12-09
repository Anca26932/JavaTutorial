package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //clasa sablon care defineste prop si comportamentul unei entitiati specifice
    //intr-un fisier java putem avea mai multe clase difeentiate pe baza numelui(nu este un practice bun sa avem mai multe clase cu acelasi nume
    //intr-o clasa putem defini proprietatile si actiunile entitatii
    //variabila =prop unei clase


    //variabilele pot fi de doua tipuri:globale si locale

    //variabilele globale sunt vizibile peste tot in proiect
    //variabilele locale =sunt vizibile doar in locul unde le-am declarat
    //ca sa definim o valabila locala: accescontrol tip variabila nume variabila
    //In mom cand definim o variabila nu este obligatoriu sa ii dam o valoare
    //metoda=actiunea unei clase
    //exista doua tipuri de metode:void si return


    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Adresa;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public Boolean Aidiplomadefacultate;

@Test
    public void PrezentareStudent() {
        Nume = "Alex";
        Prenume = "Briciu";
        Varsta = 41;
        Adresa = "Eroilor 72";
        Inaltime = 1.70;
        Greutate = 68.0f;
        Sex = 'M';
        Aidiplomadefacultate = true;

        //System.out.println(Nume+"  "+Prenume+"  "+Varsta+"  "+Adresa);
        //System.out.println(Inaltime);
        System.out.println("Numele studentului este: "+Nume);
        System.out.println("Prenumele studentului este: "+Prenume);
        System.out.println("Varsta studentului este: "+Varsta);
        System.out.println("Adresa studentului este: "+Adresa);
        System.out.println("Inaltimea studentului este: "+Inaltime);
        System.out.println("Greutatea studentului este: "+Greutate);
        System.out.println("Sexul studentului este: "+Sex);
        System.out.println("Are studentul diploma: "+ Aidiplomadefacultate);


        calculMedie();

    }

    public void calculMedie(){
      Integer nota1=8;
      Integer nota2=6;
      Integer nota3=10;
      Integer medie=(nota1+nota2+nota3)/3;
      System.out.println("Media studentului este: "+medie);



    }

}
