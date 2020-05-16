package hu.szabonorbert.eke_progtech;

public abstract class Person {
    String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){ return name; }
    abstract void Speak(String sentence);
}