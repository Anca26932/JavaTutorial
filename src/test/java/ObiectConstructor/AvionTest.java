package ObiectConstructor;

import org.testng.annotations.Test;

public class AvionTest {

    @Test

    public void metodaTest(){

        Avion avion1 = new Avion("Pasageri","Boeing",
                "B-127",260,"Kerosen");
        avion1.prezentareAvion();

        Avion avion2 = new Avion("Pasageri", "Boeing" ,"A-217" , 300,"green");
        avion2.prezentareAvion();

        Avion avion3 = new Avion("Pasageri" ,"Boeing","A-200",300 , "Kerosen",400);


    }




}
