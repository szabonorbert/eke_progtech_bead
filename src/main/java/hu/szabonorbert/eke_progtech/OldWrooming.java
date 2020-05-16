package hu.szabonorbert.eke_progtech;

public class OldWrooming extends WroomingStrategy{

    @Override
    public void Wroom() {
        System.out.println("\t\t> *motorhang*: kpfh, kpffffffffh, wroooom-bom-bom-bom-kpfh ... PAH");
        System.out.println("\t\t> *kínos csönd*");
    }
    @Override
    public String toString(){
        return "OldWrooming";
    }
    @Override
    public OldWrooming clone(){
        return new OldWrooming();
    }
}
