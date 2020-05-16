package hu.szabonorbert.eke_progtech;

public abstract class Person {
    String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){ return name; }
    public void Speak(String sentence){
        System.out.println(name.charAt(0)  + ": " + sentence);
    }
    public abstract void Do(String action);
}