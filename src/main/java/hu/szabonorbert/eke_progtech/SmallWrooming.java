package hu.szabonorbert.eke_progtech;

public class SmallWrooming extends WroomingStrategy{

    @Override
    public void Wroom() {
        System.out.println("*motorhang*: wroooom-bom-bom-bom-bom...");
    }
    @Override
    public String toString(){
        return "SmallWrooming";
    }
}
