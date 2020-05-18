package hu.szabonorbert.eke_progtech;

public class WroomingOld extends WroomingStrategy{

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
    public WroomingOld clone(){
        return new WroomingOld();
    }
}
