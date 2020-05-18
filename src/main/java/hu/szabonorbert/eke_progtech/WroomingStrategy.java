package hu.szabonorbert.eke_progtech;

public abstract class WroomingStrategy {
    private String motorName;
    public WroomingStrategy(String motorName){this.motorName = motorName;}
    public abstract void Wroom();
    public String toString(){return motorName;}
}
