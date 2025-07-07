package OOP.Session20.valueVsReferenceType.Ex2;

public class MainRefTest {

    public static void main(String[] args){
        RefTest ref = new RefTest();
        System.out.println(ref.name);

        RefTest ref2= new RefTest();

        if (ref==ref2){
            System.out.println("egale");

        }else {
            System.out.println("nu sunt egale");
        }

    }
}
