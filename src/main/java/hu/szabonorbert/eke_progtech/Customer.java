package hu.szabonorbert.eke_progtech;

public class Customer extends Person {
    public Customer(String name) {
        super(name);
    }

    public void Speak(String sentence){
        System.out.println(name  + " (vásárló): - " + sentence);
    }
}
