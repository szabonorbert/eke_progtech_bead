package hu.szabonorbert.eke_progtech;

public class WroomingSport extends WroomingStrategy {

    public WroomingSport(String motorName){super(motorName);}

    @Override
    public void Wroom() {
        System.out.println("\t\t> *motorhang*: WROOOOOM-WRRRRRRROOOOOOOOOOOOOM-bom-bom-bom...");
    }
}