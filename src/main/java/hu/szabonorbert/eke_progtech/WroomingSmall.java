package hu.szabonorbert.eke_progtech;

public class WroomingSmall extends WroomingStrategy{

    @Override
    public void Wroom() {
        System.out.println("\t\t> *motorhang*: wroooom-bom-bom-bom-bom...");
    }
    @Override
    public String toString(){
        return "SmallWrooming";
    }
    @Override
    public WroomingSmall clone(){
        return new WroomingSmall();
    }
}
