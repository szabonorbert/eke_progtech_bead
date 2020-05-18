package hu.szabonorbert.eke_progtech;

public class WroomingSmall extends WroomingStrategy{

    public WroomingSmall(String motorName){super(motorName);}

    @Override
    public void Wroom() {
        System.out.println("\t\t> *motorhang*: wroooom-bom-bom-bom-bom...");
    }

}
