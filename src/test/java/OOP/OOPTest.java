package OOP;

import org.testng.annotations.Test;

public class OOPTest {
    @Test
    public void metodaTest(){

        Student Anca = new Student("Mirela","Creta",26,"UTCN",2,true);
        Anca.infoSudent();

        Angajat Mihai = new Angajat("Vasile","Mitrea",34,"Endava",7,26);
        Mihai.infoAngajat();

        Mihai.promovare();
        Mihai.getPrenume();




    }
}
