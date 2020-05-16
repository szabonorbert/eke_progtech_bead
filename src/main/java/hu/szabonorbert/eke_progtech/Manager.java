package hu.szabonorbert.eke_progtech;

public class Manager extends Person {

    private static Manager uniqueInstance = null;

    private Manager(String name) {
        super(name);
    }

    public static Manager getInstance(){
        if (uniqueInstance == null) uniqueInstance = new Manager("Józsi");
        return uniqueInstance;
    }


    public void Speak(String sentence){
        System.out.println(name + " (menedzser): - " + sentence);
    }
}
