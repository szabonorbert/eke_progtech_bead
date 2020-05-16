package hu.szabonorbert.eke_progtech;

public class Customer extends Person {
    public Customer(String name, CarCheckingTemplate carCheckingTemplate) {
        super(name, carCheckingTemplate);
    }

    @Override
    public void doSomething(String sentence){
        System.out.println(name  + ", a vásárló " + sentence + ".");
    }
}
