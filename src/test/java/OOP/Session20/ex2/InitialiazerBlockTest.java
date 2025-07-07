package OOP.Session20.ex2;

public class InitialiazerBlockTest {

    private String name = "Anna";

    static{
        System.out.println("setting field");
//        name = "Test";

    }
    public InitialiazerBlockTest(){
        name =" Serena";
        System.out.println("setting constructor");

    }
    public static void main(String[]args){
        InitialiazerBlockTest test = new InitialiazerBlockTest();
        System.out.println(test.name);
    }
}
