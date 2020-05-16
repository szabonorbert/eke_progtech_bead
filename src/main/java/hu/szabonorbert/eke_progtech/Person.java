package hu.szabonorbert.eke_progtech;

public abstract class Person {
    String name;
    CarCheckingTemplate carCheckingTemplate;
    public Person(String name, CarCheckingTemplate carCheckingTemplate){
        this.name = name;
        this.carCheckingTemplate = carCheckingTemplate;
    }
    public String getName(){ return name; }
    public void saySomething(String sentence){
        System.out.println(name.charAt(0)  + ": - " + sentence);
    }
    public abstract void doSomething(String action);
}