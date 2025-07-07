package OOP.Session20.synchronizedEx;

public class Counter {
    //synchronized este folosit pentru thread saftey
    //synchronized poate fi aplicat la metode si blocks
    int count;

    synchronized void increment(){
        count++;
    }
}
