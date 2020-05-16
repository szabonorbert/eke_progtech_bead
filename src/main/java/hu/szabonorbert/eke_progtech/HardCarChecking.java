package hu.szabonorbert.eke_progtech;

public class HardCarChecking extends CarCheckingTemplate{


    @Override
    protected void openDoor() {
        System.out.println("\t\t> feltépi az ajtót");
    }

    @Override
    protected void gettingIn() {
        System.out.println("\t\t> bepattan a vezetőülésre, az autó nagyot nyekken");
    }

    @Override
    protected void engineTest() {
        car.Wroom();
        car.Wroom();
        car.Wroom();
    }

    @Override
    protected void gettingOut() {
        System.out.println("\t\t> szinte kiesik az autóból");
    }

    @Override
    protected void closeDoor() {
        System.out.println("\t\t> becsapja az ajtót, az autó reccsen");
    }
}
