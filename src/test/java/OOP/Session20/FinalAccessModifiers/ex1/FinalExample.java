package OOP.Session20.FinalAccessModifiers.ex1;

public class FinalExample {
    // final Keyword poate fi aplicat pentru outer class, ineer class, variabile/field si metode
    //nu poate fi aplicata la interfete, construtor, block-uri si enum
    //final class= nu poate fi extinsa/mostenita
    //final method nu poate fi surpascrisa
    //o variabila declarata si initializata-nu poate fi schimbata



    static int a=123;
    static final int ROTI_MASINA =4;

    public static void main(String[] args){
        System.out.println("a= "+a);
        a=a+1;
        a++;
        //ROTI_MASINA=5;
    }
}
