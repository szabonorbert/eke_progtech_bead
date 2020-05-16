package hu.szabonorbert.eke_progtech;

public class HardCarChecking extends CarCheckingTemplate{

    public HardCarChecking(Car car) {
        super(car);
    }

    @Override
    protected void openDoor() {
        System.out.println("feltépi az ajtót");
    }

    @Override
    protected void gettingIn() {
        System.out.println("bepattan a vezetőülésre, az autó nagyot nyekken");
    }

    @Override
    protected void engineTest() {
        car.Wroom();
        car.Wroom();
        car.Wroom();
    }

    @Override
    protected void gettingOut() {
        System.out.println("szinte kiesik az autóból");
    }

    @Override
    protected void closeDoor() {
        System.out.println("becsapja az ajtót, az autó reccsen");
    }
}
