package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

   public static void main(String[] args) {

       citireNote();
       printareValoriWhile();
       printareValoriDoWhile();
       printareValoriFor();

   }

    public static void citireNote() {
        System.out.println("Introduceti nouta ");
        Scanner scanner = new Scanner(System.in);//vreau sa citesc o noua valoare
        int nota = scanner.nextInt();
        while (nota < 0 || nota > 10) {

            System.out.println("Nota " + nota + " trebuie sa fie intre 1 si 10.Te rog introdu o valoare valida");
            nota = scanner.nextInt();
        }
        System.out.println("Nota" + nota + "este inre 1 si 10");
    }

    public static void printareValoriWhile () {
        int valoare = 1;
        while (valoare <= 5);
        {
            System.out.println("Valoarea este " + valoare);
            valoare ++;
        }
        System.out.println("Valoarea dupa parcurgere  " + valoare);
    }
    public static void printareValoriDoWhile () {
       int valoare = 1;
       do{
           System.out.println("Valoarea este:" + valoare);
           valoare++;
       }while (valoare <= 5);
        System.out.println("Valoarea dupa parcurgerea de do-while " + valoare);

    }
    public static void printareValoriFor (){
     //  int valoare = 1;
       for (int valoare = 1; valoare <= 5;valoare++) {
           System.out.println("Valoarea este " + valoare);
           valoare++;
       }
    }
}git