package OOP.Session20.staticEx.ex1;

public class TestAccessModifiers {
    public static void main(String[] args){
        StaticAccessModifiers staticAccessModifiers = new StaticAccessModifiers();
        System.out.println(staticAccessModifiers.name);

        staticAccessModifiers.name = "new endava";
        System.out.println(staticAccessModifiers.name);
        StaticAccessModifiers.name ="new endava";
        StaticAccessModifiers.printMessage();

        StaticAccessModifiers staticAccessModifiers2 = new StaticAccessModifiers();
        System.out.println(staticAccessModifiers2.name);

        staticAccessModifiers.name ="endava 2";
        System.out.println(staticAccessModifiers.name);



    }
}
