package hu.szabonorbert.eke_progtech;

public class WroomingSport extends WroomingStrategy {
    @Override
    public void Wroom() {
        System.out.println("\t\t> *motorhang*: WROOOOOM-WRRRRRRROOOOOOOOOOOOOM-bom-bom-bom...");
    }
    @Override
    public String toString(){
        return "SportWrooming";
    }
    @Override
    public WroomingSport clone(){
        return new WroomingSport();
    }
}
