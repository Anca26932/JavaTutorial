package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MultimiExercises {

    //Multimi:array, list, map

    @Test
    public void metodaTest (){
        //colegiCurs();
        //colegiCursLista();
        tariOrase();


    }

    //exemplu array

    public void colegiCurs(){
        String[] colegi= new String[6];
        colegi[0] = "Anca";
        colegi[1] = "Cristina";
        colegi[2] = "Mihai";
        colegi[3] = "Alina";
        colegi[4] = "Bogdan";
        colegi[5] = "Alex";

        for (int index = 0; index < colegi.length; index++){
            System.out.println("Numele colegului este :" + colegi[index]);
        }
    }
    //exemplu lista

    public  void colegiCursLista(){
        List<String> colegi = new ArrayList<>();
        colegi.add("Anca");
        colegi.add("Cristina");
        colegi.add("Mihai");
        colegi.add("Alina");
        colegi.add("Bogdan");
        colegi.add("Alex");

        int index = 0;
        while (index < colegi.size()){
            System.out.println("Numele colegului este :" + colegi.get(index));
            index++;

        }
    }

    //exemplu map
    // map- cheie = Valoare

    public void categorieObiecte(){
        HashMap<String,String> obiecte = new HashMap<>();
        obiecte.put("obiet" , "laptop");
        obiecte.put("fruct" , "mar");
        obiecte.put("floare" , "trandafir");
        for (String key: obiecte.keySet()){
            System.out.println("Cheia este: " + key);
            System.out.println("Valoarea este:" + obiecte.get(key));
        }
    }

    public void tariOrase(){
        HashMap<String,List<String>> clasificare = new HashMap<>();
        List<String> oraseRomania = new ArrayList<>();
        oraseRomania.add("Cluj-Napoca");
        oraseRomania.add("Bistrita");
        oraseRomania.add("Alba-iulia");

        List<String> oraseItalia = new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Milano");
        oraseItalia.add("Napoli");

        List<String> oraseSpania = new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Madrid");

        clasificare.put("Romania",oraseRomania);
        clasificare.put("Italia", oraseItalia);
        clasificare.put("Spania" ,oraseSpania);

        for (String key: clasificare.keySet()){
            System.out.println("Tara este: " + key);
            System.out.println("Orasele sunt :" + clasificare.get(key));
        }
    }
}
