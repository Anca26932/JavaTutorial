package OOP.Session20.valueVsReferenceType;

public class ReferenceType {

    public static void main(String[] args){
        String str1=new String("hello");
        String str2=new String("hello");

        int intreg1=5;
        int intreg2=5;

        if(intreg2==intreg1){
            System.out.println("valorile sunt la fel");
        }else{
            System.out.println("valorile nu sunt la fel");
        }

        System.out.println("-------------------------");
        //la primitive se compara valoarea

        //la referinte se comapara referinta str1 cu str 2

        if(str1==str2){
            System.out.println("valoriile sunt la fel");

        }else {
            System.out.println("valorile nu sunt la fel");

        }
    }
}
