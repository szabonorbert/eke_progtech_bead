package hu.szabonorbert.eke_progtech;

public class Customer extends Person {
    public Customer(String name) {
        super(name);
    }

    @Override
    public void Do(String sentence){
        System.out.println(name  + ", a vásárló " + sentence + ".");
    }
}
