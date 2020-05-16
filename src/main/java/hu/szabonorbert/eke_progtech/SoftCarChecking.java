package hu.szabonorbert.eke_progtech;

public class SoftCarChecking extends CarCheckingTemplate{


    @Override
    protected void openDoor() {
        System.out.println("\t\t> finoman kinyitja az ajtót");
    }

    @Override
    protected void gettingIn() {
        System.out.println("\t\t> beül a vezetőülésre");
    }

    @Override
    protected void engineTest() {
        car.Wroom();
    }

    @Override
    protected void gettingOut() {
        System.out.println("\t\t> kiszáll az autóból");
    }

    @Override
    protected void closeDoor() {
        System.out.println("\t\t> finoman becsukja az ajtót");
    }
}
