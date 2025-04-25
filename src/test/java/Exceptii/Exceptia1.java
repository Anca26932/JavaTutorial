package Exceptii;

public class Exceptia1 {
    //exceptiile reprezita situatii care apar in timpul exceptiei unui program care detrmina oprirea acestuia
    //ofera mecanism eficient de identificare si rezolare a eroriilor
    //sunt modelate sub forma de clasa: clasa error, clasa exception, runtime exception, clase personalizate;
    //exceptiile sunt gestionate folosind cuvinte predefinitie in java: try- catch si finally;
    // sunt doua tipuri mare de exceptii :checked si unchecked;
    //erorile checked:sunt exceptii de compilare (nu se poate buildui sau rula proiectul).
    // Exemple: SQLExcpetion,IOException-input output; ClassNotFoundException;
    //erorile unchecked:sunt exceptii de runtime care sunt ignorate in timpul compilarii dar sunt aruncate in timpul executiei programului;
    //exemple de erori unchecked : NullPointerException, ArrayIndexOutOfBound, ArtihmeticException;
    //Throw: este un cuvant cheie care arunca exceptia in mod explicit de la o metoda sau un boc de cod;
    //Throws: este un cuvant cheie care se foloseste odata cu metoda care poate arunca un tip sau mai multe exceptii:


    public static void main(String[] args) throws ExceptieCustom {
//        try{
//            System.out.println(12/0);
//        } catch (ArithmeticException e){
//            System.out.println("Erorr Arithmetic exception thrown "+ e.getMessage());
//        }

        try {
            int[] numbers = new int[10];
            numbers[11] = 5;
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ExceptieCustom("Eroare personalizata!" );
//            System.out.println(e.getMessage());
        } finally {
            System.out.println("Aceasta linie se executa indiferent daca exceptia este prinsa!" );

        }
    }


}
