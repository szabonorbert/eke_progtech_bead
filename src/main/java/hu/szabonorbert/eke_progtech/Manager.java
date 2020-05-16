package hu.szabonorbert.eke_progtech;

public class Manager extends Person {

    private static Manager uniqueInstance = null;

    private Manager(String name) {
        super(name);
    }

    public static Manager getInstance(){
        if (uniqueInstance == null) uniqueInstance = new Manager("Józsi");
        uniqueInstance.doSomething("előbukkan");
        return uniqueInstance;
    }

    @Override
    public void doSomething(String sentence){
        System.out.println(name  + ", a menedzser " + sentence + ".");
    }
}
