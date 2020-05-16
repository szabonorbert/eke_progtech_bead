package hu.szabonorbert.eke_progtech;

public class SoftCarChecking extends CarCheckingTemplate{


    @Override
    protected void openDoor() {
        System.out.println("finoman kinyitja az ajtót");
    }

    @Override
    protected void gettingIn() {
        System.out.println("beül a vezetőülésre");
    }

    @Override
    protected void engineTest() {
        car.Wroom();
    }

    @Override
    protected void gettingOut() {
        System.out.println("kiszáll az autóból");
    }

    @Override
    protected void closeDoor() {
        System.out.println("finoman becsukja az ajtót");
    }
}
