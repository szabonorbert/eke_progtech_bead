package hu.szabonorbert.eke_progtech;

public class Manager extends Person {
    public Manager(String name) {
        super(name);
    }
    public void Speak(String sentence){
        System.out.println(name + " (menedzser): - " + sentence);
    }
}
