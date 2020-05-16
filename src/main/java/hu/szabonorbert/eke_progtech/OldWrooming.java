package hu.szabonorbert.eke_progtech;

public class OldWrooming extends WroomingStrategy{

    @Override
    public void Wroom() {
        System.out.println("*motorhang*: kpfh, kpffffffffh, wroooom-bom-bom-bom-kpfh ... PAH");
        System.out.println("*kínos csönd*");
    }
    @Override
    public String toString(){
        return "OldWrooming";
    }
}
