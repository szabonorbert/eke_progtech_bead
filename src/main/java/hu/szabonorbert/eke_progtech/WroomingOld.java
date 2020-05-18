package hu.szabonorbert.eke_progtech;

public class WroomingOld extends WroomingStrategy{

    public WroomingOld(String motorName){super(motorName);}

    @Override
    public void Wroom() {
        System.out.println("\t\t> *motorhang*: kpfh, kpffffffffh, wroooom-bom-bom-bom-kpfh ... PAH");
        System.out.println("\t\t> *kínos csönd*");
    }

}
